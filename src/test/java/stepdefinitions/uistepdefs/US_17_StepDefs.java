package stepdefinitions.uistepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import pages.AdminPage;
import pojos.US17_TestItemsPojo;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;



public class US_17_StepDefs {

    AdminPage adminPage=new AdminPage();
    Faker faker=new Faker();
    US17_TestItemsPojo testItemsPojo=new US17_TestItemsPojo();
    Response response;

    @Given("US17 goes to Medunna Url")
    public void us17_goes_to_medunna_url() {
        Driver.getDriver();
    }
    @When("US17 navigates to URL")
    public void us17_navigates_to_url() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_login_url"));
        Driver.getDriver().manage().window().maximize();

    }
    @When("US17 Admin clicks to Sign In Icon")
    public void us17_admin_clicks_to_sign_in_icon() {
        adminPage.profileicon.click();
        adminPage.signInUnderProfileIcon.click();
    }
    @Given("US17 Admin provide valid {string} and {string}")
    public void us17_admin_provide_valid_and(String username, String password) {
        adminPage.usernameBox.sendKeys(username);
        adminPage.passwordBox.sendKeys(password);
        Driver.waitAndClick(adminPage.signInButton);
    }
    @Given("US17 Admin navigates to Items&Titles segment and clicks on Test Item")
    public void us17_admin_navigates_to_items_titles_segment_and_clicks_on_test_item() {
        Driver.waitAndClick(adminPage.ItemsAndTitles);
        Driver.waitAndClick(adminPage.adminTestItemDropDownButton);
    }
    @Then("US17 Admin navigates Create a new Test Item button and clicks")
    public void us17_admin_navigates_create_a_new_test_item_button_and_clicks() {
        Driver.wait(2);
        Driver.waitAndClick(adminPage.AdminPageTestItemCreateNewTestItem);
    }
    @Then("US17 Admin navigates Name field clicks and send the name with faker")
    public void us17_admin_navigates_name_field_clicks_and_send_the_name_with_faker() {
        String name=faker.name().firstName();
        Driver.waitAndSendText(adminPage.adminPageCreateOrEditTestItemNameBox,name);

    }
    @Then("US17 Admin navigates Description field clicks and send it with faker")
    public void us17_admin_navigates_description_field_clicks_and_send_it_with_faker() {
        String description=faker.medical().diseaseName();
        Driver.waitAndSendText(adminPage.adminPageCreateOrEditTestItemDescriptionBox,description);

    }
    @Then("US17 Admin navigates Price field clicks and send it with faker")
    public void us17_admin_navigates_price_field_clicks_and_send_it_with_faker() {
        String price= String.valueOf(faker.number().numberBetween(30,50));
        Driver.waitAndSendText(adminPage.adminPageCreateOrEditTestItemPriceBox,price);


    }
    @Then("US17 Admin navigates Default Min Value clicks  and send it with faker")
    public void us17_admin_navigates_default_min_value_clicks_and_send_it_with_faker() {
        String minValue= String.valueOf(faker.number().numberBetween(30,60));
        Driver.waitAndSendText(adminPage.adminPageCreateOrEditTestItemDefaultMinValueBox,minValue);

    }
    @Then("US17 Admin navigates Default Max Value colon clicks and send it with faker")
    public void us17_admin_navigates_default_max_value_colon_clicks_and_send_it_with_faker() {
        String maxValue= String.valueOf(faker.number().numberBetween(150,180));
        Driver.waitAndSendText(adminPage.adminPageCreateOrEditTestItemDefaultMaxValueBox,maxValue);
        Driver.wait(2);

    }
    @Then("US17 Admin navigates save button and clicks")
    public void us17_admin_navigates_save_button_and_clicks() {
        Driver.wait(2);
        Driver.waitAndClick(adminPage.adminPageCreateOrEditTestItemSaveButton);
    }
    @Then("US17 Admin catch the message and verify it")
    public void us17_admin_catch_the_message_and_verify_it() {
        Assert.assertTrue(Driver.waitForVisibility(adminPage.adminPageCreateOrEditTestItemPopUpMessage,3).isDisplayed());
    }
    @Then("US17 Admin navigates View button and clicks")
    public void us17_admin_navigates_view_button_and_clicks() {
        Driver.waitAndClick(adminPage.adminPageTestItemView);

    }
    @Then("US17 Admin navigates Test Item information")
    public void us17_admin_navigates_test_item_information() {
        Assert.assertTrue(Driver.waitForVisibility(adminPage.adminPageViewTestItemHeader,3).isDisplayed());
        Driver.wait(3);


    }
    @Then("US17 Admin navigates Delete button and clicks")
    public void us17_admin_navigates_delete_button_and_clicks() {
        Driver.waitAndClick(adminPage.createdDateChange);
        Driver.wait(3);
        Driver.clickWithJS(adminPage.adminPageTestItemDelete);

    }
    @Then("US17 Admin navigates Confirm delete operation and clicks Delete button")
    public void us17_admin_navigates_confirm_delete_operation_and_clicks_delete_button() {
        Driver.wait(2);
        Driver.clickWithJS(adminPage.adminPageTestItemConfirmDeleteOperationButton);

    }
    @Then("US17 Admin catch the alert and verify it")
    public void us17_admin_catch_the_alert_and_verify_it() {
        Driver.wait(2);
     //   Assert.assertTrue(adminPage.adminPageCreateOrEditTestItemAlertMessage.isDisplayed());
        Assert.assertTrue(adminPage.ATestItemIsDeletedWithIdentifier.isDisplayed());


    }

    @Then("US17 capture the screenshot")
    public void us17_capture_the_screenshot() throws IOException {
        ReusableMethods.getScreenshot("CreateTestItem Screenshot");
    }
    @Then("US17 Close the page")
    public void us17_close_the_page() {
        Driver.closeDriver();
    }
}
