package stepdefinitions.apistepdefs;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.Appointment;
import utilities.ConfigReader;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class US_10_APIStepDefs {

    Response response;
    Appointment[] appointments;


    @Given("doctor sends a get request for appointment data")
    public void doctor_sends_a_get_request_for_appointment_data() {
        //In here we bring all data from api in json format
        response = given().headers(

                "Authorization",
                "Bearer " + ConfigReader.getProperty("api_token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",

                ContentType.JSON
        ).when().get(ConfigReader.getProperty("appointment_api_url"));
        //response.prettyPrint();
    }

    @Given("doctor deserializes the appointment data to java")
    public void doctor_deserializes_the_appointment_data_to_java() throws IOException {
        ObjectMapper obj = new ObjectMapper();
        appointments = obj.readValue(response.asString(), Appointment[].class);


        System.out.println("size of the actual element: " + appointments.length);

        for (int i = 0; i < appointments.length; i++) {
            System.out.println(appointments[i]);
        }


    }

    @Then("doctor saves the appointment data to correspondent files and validates")
    public void doctor_saves_the_appointment_data_to_correspondent_files_and_validates() {

        boolean flag = false;
        for (int i = 0; i < appointments.length; i++) {
            if ("05/07/22 14:02".contains(appointments[i].getDate())) {
                flag = true;
            }

        }

    }
}
