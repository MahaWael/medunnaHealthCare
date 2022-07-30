package stepdefinitions.apistepdefs;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.Patient_02;
import utilities.ConfigReader;
import utilities.TxtWriter;

import java.io.IOException;

import static io.restassured.RestAssured.given;



public class US_15_APIStepDefs {

    Response response;
    Patient_02[] patient02;
/*
    @Given("admin sends a get request for appointment data")
    public void admin_sends_a_get_request_for_appointment_data() {

    }

    @Given("admin deserializes the appointment data to java")
    public void admin_deserializes_the_appointment_data_to_java() throws IOException {

        ObjectMapper obj = new ObjectMapper();
        patients = obj.readValue(response.asString(), Patient[].class);

        for (int i = 0;i<patients.length;i++){
            System.out.println(patients[i]);
        }

    }
    @Then("admin saves the appointment data to correspondent files and validates")
    public void admin_saves_the_appointment_data_to_correspondent_files_and_validates() {
        saveAPIPatientData(patients);
    }

 */

    @Given("admin sends a get request for patient data")
    public void admin_sends_a_get_request_for_patient_data() {
        response = given().headers(

                "Authorization",
                "Bearer " + ConfigReader.getProperty("api_token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",

                ContentType.JSON
        ).when().get(ConfigReader.getProperty("patient_api_url"));
        //response.prettyPrint();
    }

    @Given("admin deserializes the patient data to java")
    public void admin_deserializes_the_patient_data_to_java() throws IOException {
        ObjectMapper obj = new ObjectMapper();
        patient02 = obj.readValue(response.asString(), Patient_02[].class);
/*
        for (int i = 0;i<patients.length;i++){
            System.out.println(patients[i]);
        }

 */
    }

    @Then("admin saves the patient data to correspondent files and validates")
    public void admin_saves_the_patient_data_to_correspondent_files_and_validates() {
        TxtWriter.savePatientApiData(patient02);
        boolean flag = false;
        for (int i = 0; i < patient02.length; i++){
            if ("Jenny".contains(patient02[i].getName())){
                flag = true;
            }
        }
        Assert.assertTrue(flag);
    }

}
