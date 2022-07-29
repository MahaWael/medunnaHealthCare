package stepdefinitions.apistepdefs;

import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utilities.Authentication;

import static io.restassured.RestAssured.given;


public class US_28_APIStepDefs {
    Response response;
    @Given("user reads country API data on {string}")
    public void user_reads_country_api_data_on(String url) {
        response = given().headers("Authorization", "Bearer " + Authentication.generateToken(),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).when().get(url).then().extract().response();
        response.prettyPrint();

    }




    @Given("user creates a country on API endpoint {string} and using {string} {string}")
    public void user_creates_a_country_on_api_endpoint_and_using(String url, String type, String country) {
        response = given().headers("Authorization", "Bearer " + Authentication.generateToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON).when().
                body("{\""+type+"\":\"" +country+ "\"}")
                .post(url).then().contentType(ContentType.JSON)
                .extract().response();

    }

    @Given("user edits a country on API endpoint {string} and using {string} {string}")
    public void user_edits_a_country_on_api_endpoint_and_using(String endpoint, String id, String name) {
        response = given().headers("Authorization", "Bearer " + Authentication.generateToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON).when().
                body("{\"id\": " +id+",\"name\": \"" +name+ "\"}")
                .put(endpoint).then().contentType(ContentType.JSON)
                .extract().response();

    }


    @Given("user deletes country on API {string} {string}")
    public void user_deletes_country_on_api(String endpoint, String id) {
        response = given().headers("Authorization", "Bearer " + Authentication.generateToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON).when()
                .delete(endpoint+id).then().extract().response();

    }
}
