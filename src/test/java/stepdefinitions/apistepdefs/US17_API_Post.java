package stepdefinitions.apistepdefs;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.US17_TestItemsPojo;
import utilities.ConfigReader;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US17_API_Post {
    US17_TestItemsPojo testItemsPojo = new US17_TestItemsPojo();
    US17_TestItemsPojo expectedData;
    Response response;
    US17_TestItemsPojo actualData;

    @Given("US17 admin send a post request to created test items' data")
    public void us17_admin_send_a_post_request_to_created_test_items_data() {

        expectedData = new US17_TestItemsPojo("admin", "98", "56", "iron", 7896, "potasium", 100);

    }

    @Given("US17 admin deserializes the created test items' data to java")
    public void us17_admin_deserializes_the_created_test_items_data_to_java() {
        response = given().body(expectedData).contentType(ContentType.JSON).headers("Authorization", "Bearer " + ConfigReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON, "Accept", ContentType.JSON).post(ConfigReader.getProperty("test_items_endpoint"));


    }

    @Then("US17 admin saves the test items' data to correspondent files and validates")
    public void us17_admin_saves_the_test_items_data_to_correspondent_files_and_validates() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        actualData = mapper.readValue(response.asString(), US17_TestItemsPojo.class);

        assertEquals(testItemsPojo.getName(), actualData.getName());
        assertEquals(testItemsPojo.getDefaultValMax(), actualData.getDefaultValMax());
        assertEquals(testItemsPojo.getGetDefaultValMin(), actualData.getGetDefaultValMin());
        assertEquals(testItemsPojo.getDescription(), actualData.getDescription());
        assertEquals(testItemsPojo.getPrice(), actualData.getPrice());
        //  response.then().statusCode(201);

    }
}
