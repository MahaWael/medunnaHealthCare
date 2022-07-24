package stepdefinitions.apistepdefs;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.Messages;
import pojos.MessagesWithId;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

//GET Request
public class US_27_API_Messages {
    public static String generateToken2() {
        String username = "team89admin";
        String password = "team89admin";
        Map<String, Object> map = new HashMap<>();
        map.put("username", username);
        map.put("password", password);
        map.put("rememberme", true);

        String endPoint = "https://www.medunna.com/api/authenticate";

        Response response1 = given().contentType(ContentType.JSON).body(map).when().post(endPoint);
        JsonPath token = response1.jsonPath();
        return token.getString("id_token");
    }

    String token = "";
    Response response;
    Response response1;
    Response response2;
    Response response3;
    Messages messages = new Messages();//pojo without id for POST
    MessagesWithId messagesWithId=new MessagesWithId();//pojo with Id for PUT

    @Given("US27Api User gets the token")
    public void us27api_user_gets_the_token() {
        token = generateToken2();
        System.out.println(token);
    }

    @Given("US27Api User sets the spec params")
    public void us27api_user_sets_the_spec_params() {
        //  spec.pathParams("first","api","second","c-messages","third","77054");
        // When we have 3 params it gives problem
        //Therefore I used complete url
    }

    @Given("US27Api User sends a get request for users data")
    public void us27api_user_sends_a_get_request_for_users_data() {
        response = given().headers(
                "Authorization",
                "Bearer " + generateToken2(),
                "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON
        ).when().get("https://www.medunna.com/api/c-messages/77076");

    }

    @Given("US27Api User deserializes the users' data to java")
    public void us27api_user_deserializes_the_users_data_to_java() throws JsonProcessingException, IOException {
        ObjectMapper obj = new ObjectMapper();
        messages = obj.readValue(response.asString(), Messages.class);


    }

    @Given("US27Api User do a validation")
    public void us27api_user_do_a_validation() {
        Assert.assertTrue(messages.getName().contains("Orhan Baba"));
        Assert.assertTrue(messages.getMessage().contains("Bitsin bu hasret"));
        Assert.assertTrue(messages.getEmail().contains("orhanbaba@medunna.com"));
        Assert.assertTrue(messages.getSubject().contains("arabesk"));
    }

    //Put request
    @Given("US27Api User sends a put request for data")
    public void us27api_user_sends_a_put_request_for_data() {

        response1 = given().headers(
                        "Authorization",
                        "Bearer " + generateToken2(),
                        "Content-Type", ContentType.JSON,
                        "Accept", ContentType.JSON
                ).when().body(messagesWithId).then().contentType(ContentType.JSON).
                when().put("https://www.medunna.com/api/c-messages");
        response1.prettyPrint();
    }
    @Given("US27Api user sets the expected data as {string} {string} {string} {string}")
    public void us27api_user_sets_the_expected_data_as(String name, String email, String subject, String message) {
        messagesWithId.setName(name);
        messagesWithId.setEmail(email);
        messagesWithId.setSubject(subject);
        messagesWithId.setMessage(message);
    }


    @Given("US27Api User deserializes the data to java")
    public void us27api_user_deserializes_the_data_to_java() throws JsonProcessingException, IOException {
        ObjectMapper obj1=new ObjectMapper();
        Messages actualMessages=obj1.readValue(response1.asString(),Messages.class);
        Assert.assertEquals(messagesWithId.getName(),actualMessages.getName());
        Assert.assertEquals(messagesWithId.getEmail(),actualMessages.getEmail());
        Assert.assertEquals(messagesWithId.getSubject(),actualMessages.getSubject());
        Assert.assertEquals(messagesWithId.getMessage(),actualMessages.getMessage());
    }
    @Given("US27Api User verifies the data")
    public void us27api_user_verifies_the_data() {

    }

    //Post Request


    @Given("US27Api User sends a post request for data")
    public void us27api_user_sends_a_post_request_for_data() {
        response2 = given().headers(
                        "Authorization",
                        "Bearer " + generateToken2(),
                        "Content-Type", ContentType.JSON,
                        "Accept", ContentType.JSON
                ).when().body(messages).then().contentType(ContentType.JSON).
                when().post("https://www.medunna.com/api/c-messages");
        //response2.prettyPrint();
    }
    @Given("US27Api User deserializes and verifies the data to java")
    public void us27api_user_deserializes_and_verifies_the_data_to_java() throws IOException {

        ObjectMapper obj2=new ObjectMapper();
        Messages actualMessages=obj2.readValue(response2.asString(),Messages.class);

        Assert.assertEquals(messages.getName(),actualMessages.getName());
        Assert.assertEquals(messages.getEmail(),actualMessages.getEmail());
        Assert.assertEquals(messages.getSubject(),actualMessages.getSubject());
        Assert.assertEquals(messages.getMessage(),actualMessages.getMessage());
    }


    @Given("US27Api Users set the expected data as {string} {string} {string} {string}")
    public void us27api_users_set_the_expected_data_as(String name, String email, String subject, String message) {
        messages.setName(name);
        messages.setEmail(email);
        messages.setSubject(subject);
        messages.setMessage(message);

    }

    //Delete Request
    @Given("US27Api User endpoint {string} and with id {string} delete the message")
    public void us27api_user_endpoint_and_with_id_delete_the_message(String endpoint, String id) {
        response3=given().headers(
                "Authorization",
                "Bearer "+generateToken2(),
                "Content-Type",ContentType.JSON,
                "Accept",ContentType.JSON
        ).when().delete(endpoint+id);
        response3.prettyPrint();

    }
    @Given("US27Api User does verification")
    public void us27api_user_does_verification() throws JsonProcessingException {
        response3.then().assertThat().statusCode(200);
        Map<String, Object>actualMap=response3.as(HashMap.class);

        Assert.assertTrue(actualMap.isEmpty());

//        ObjectMapper obj3=new ObjectMapper();
//        Messages actualMessage=obj3.readValue(response3.asString(),Messages.class);
//        Assert.assertFalse(actualMessage.getName().contains("Azer Bulbul"));

    }


}