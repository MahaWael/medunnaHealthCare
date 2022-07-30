package stepdefinitions.apistepdefs;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.Registrant;
import utilities.ConfigReader;
import utilities.TxtWriter;

import static io.restassured.RestAssured.given;

public class US_02_APIStepDefs {
    Response response;
    Registrant[] registrant;

    @Given("user sends a get request for users data")
    public void user_sends_a_get_request_for_users_data() {
        response=given().headers("Authorization", "Bearer " + ConfigReader.getProperty("api_token"),
                "Content-Type", ContentType.JSON, "Accept", ContentType.JSON).when().get(ConfigReader.getProperty("users_api_url"));
        //sadece 20 tane sonuç gördük bu yüzden url'e ? param ekledik.
        //response.prettyPrint();
    }
    @Given("user deserializes the users data to java")
    public void user_deserializes_the_users_data_to_java() throws Exception {
        ObjectMapper obj = new ObjectMapper(); // converts object
        registrant = obj.readValue(response.asString(), Registrant[].class);
        System.out.println(registrant.length);
        boolean flag= false;
        for (int i = 0; i< registrant.length; i++){
            //System.out.println("name " + (i+1) + " : " + US02Pojos[i].getEmail());

            //String emailList= US02Pojos[i].getEmail();
            //System.out.println(emailList);
            //if (emailList.contains("shanelankunding@gmail.com")){
            if (registrant[i].getLogin().contains("hunterkrajcik")){
                flag=true;

            }

        }
        Assert.assertTrue(flag);
    }

    @Then("user saves the users data to correspondent files and validates")
    public void user_saves_the_users_data_to_correspondent_files_and_validates() {
        TxtWriter.saveUIRegistrantData(registrant);
    }

}
