package stepdefinitions.apistepdefs;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.US09_PatientPojo;
import utilities.ConfigReader;
import static io.restassured.RestAssured.given;
import static utilities.TxtWriter.savePatientApiData;

public class US_09_APIStepDefs {
    US09_PatientPojo[] us09patient;
    Response response;

    @Given("user sends a get request for patient data")
    public void user_sends_a_get_request_for_patient_data() {
        response = given().contentType("json").headers("Authorization", "Bearer " + ConfigReader.getProperty("api_token_shen"),
                "Content-Type",
                ContentType.JSON, "Accept", ContentType.JSON).get("https://medunna.com/api/patients?=size=3000");
        response.prettyPrint();
    }

    @Given("user deserializes the patient data  to java")
    public void user_deserializes_the_patient_data_to_java() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        us09patient = objectMapper.readValue(response.asString(), US09_PatientPojo[].class);

        long actualTotalUs09Patient= us09patient.length;
        System.out.println(actualTotalUs09Patient);
        Assert.assertEquals(3000,actualTotalUs09Patient );
    }
    @Then("user saves the patient data to correspondent files and validates")
    public void user_saves_the_patient_data_to_correspondent_files_and_validates () {
        savePatientApiData(us09patient);
    }
}
