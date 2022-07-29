package stepdefinitions.apistepdefs;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.Appointment;
import utilities.ConfigReader;

import static io.restassured.RestAssured.given;
import static utilities.TxtWriter.saveAPIPatientData;

public class US_05_APIStepDefs {
    Response response;
    Appointment [] appointments;


    @Given("user sends get request for patients' appointment data")
    public void user_sends_get_request_for_patients_appointment_data() {
        response = given().headers(
                "Authorization",
                "Bearer " + ConfigReader.getProperty("api_token_rahima"),
                "Content - Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON
        ).when().get(ConfigReader.getProperty("patient_appoint_api_url"));
        response.prettyPrint();

    }
    @Then("user deserializes the patients' data to Java")
    public void user_deserializes_the_patients_data_to_java() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        appointments = objectMapper.readValue(response.asString(), Appointment[].class);

    }
    @Then("user saves the patients' data to correspondent files and validates")
    public void user_saves_the_patients_data_to_correspondent_files_and_validates() {
        saveAPIPatientData(appointments);
    }



}
