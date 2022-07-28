package stepdefinitions.apistepdefs;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.US17_TestItemsPojo;
import utilities.ConfigReader;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertTrue;
import static utilities.TxtWriter.saveAPITestItemData;


public class US_17_APIStepDefs_01 {

    Response response;

    US17_TestItemsPojo [] testItemsPojos;


    @Given("US17 admin send a get request for test items' data")
    public void us17_admin_send_a_get_request_for_test_items_data() {
// ConfigReader.getProperty("testItem_token")
        response = given().contentType("json").headers("Authorization", "Bearer " +ConfigReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON, "Accept", ContentType.JSON).when().get("https://medunna.com/api/c-test-items?=size=800");
        //  response.prettyPrint();

    }

    @Given("US17 admin deserializes the test items' data to java")
    public void us17_admin_deserializes_the_test_items_data_to_java() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        testItemsPojos =objectMapper.readValue(response.asString(),US17_TestItemsPojo[].class);
/*
        System.out.println("size of the actual elements :"+testItemsPojos.length);
        boolean flag=false;
        for (int i=0;i<testItemsPojos.length; i++){
            if("Sodium".contains(testItemsPojos[i].getName())){
                flag=true;
            }
        }
        assertTrue(flag);
*/
    }
    @Then("US17 admin saves the test items data to correspondent files and validates")
    public void us17_admin_saves_the_test_items_data_to_correspondent_files_and_validates() {

        saveAPITestItemData(testItemsPojos);
        Assert.assertEquals(200,response.getStatusCode());
        //Assert.assertTrue(testItemsPojos[11].getName() == "cccs");


    }

}

