package stepdefinitions.apistepdefs;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.US_07_AppointmentPojo;
import utilities.ConfigReader;

import java.io.IOException;
import java.text.ParseException;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class US_07_ApiStepDef {
    US_07_AppointmentPojo[] appointmentActualData;
    Response response;

    @Given("US07 user sends a get request for appointment data")
    public void US07_user_sends_a_get_request_for_appointment_data() {
        response = given().headers("Authorization","Bearer " + generateToken(),
                "Content-Type",
                ContentType.JSON,"Accept",ContentType.JSON).when().get("https://medunna.com/api/appointments/patient/101349");
        //response.prettyPrint();
    }
    @Given("US07 user deserializes the data to java")
    public void US07_user_deserializes_the_data_to_java() throws IOException, ParseException {
        ObjectMapper obj = new ObjectMapper();
        appointmentActualData = obj.readValue(response.asString(),US_07_AppointmentPojo[].class);

        for (int i = 0; i < appointmentActualData.length; i++) {
            System.out.println("Appointment id : " + appointmentActualData[i].getId());

        }


    }
    @Then("US07 user saves the appointment data to correspondent file and validates")
    public void US07_user_saves_the_appointment_data_to_correspondent_file_and_validates() {
        Assert.assertEquals(200,response.getStatusCode());
        //Assert.assertTrue(appointmentActualData[0].getId() == 113605);
        //Assert.assertTrue(appointmentActualData[3].getId() == 111789);
        //Assert.assertTrue(appointmentActualData[5].getId() == 110701);




    }
}
