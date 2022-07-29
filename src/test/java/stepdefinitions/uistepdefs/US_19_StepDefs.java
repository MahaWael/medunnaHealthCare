package stepdefinitions.uistepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.StaffPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_19_StepDefs {
    StaffPage staffPage=new StaffPage();
    HomePage homePage=new HomePage();

    //TC01
    @Given("US19 user launches the browser")
    public void us19_user_launches_the_browser() {
        Driver.getDriver();
    }
    @Then("US19 user goes to medunna url")
    public void us19_user_goes_to_medunna_url() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_login_url"));
        Driver.wait(3);
    }
    @Then("US19 user clicks on dropDownList")
    public void us19_user_clicks_on_drop_down_list() {
        staffPage.homepageDropBox.click();
        Driver.wait(3);
    }
    @Then("US19 User clicks to SignIn  button")
    public void us19_user_clicks_to_sign_in_button() {
        staffPage.homePageSignInButton.click();
    }
    @Then("US19 User enters credentials and signs in")
    public void us19_user_enters_credentials_and_signs_in() {
        staffPage.SignInUsername.sendKeys("team89admin");
        staffPage.SignInPassword.sendKeys("team89admin");
        staffPage.InternalSignInButton.click();
    }
    @When("US19 User navigates to Items & Titles")
    public void us19_user_navigates_to_items_titles() {
        staffPage.ItemsDropList.click();
        Driver.wait(3);


    }
    @When("US19 User clicks on Staff button")
    public void us19_user_clicks_on_staff_button() {
        staffPage.StaffButton.click();
        Driver.wait(3);
    }
    @Then("US19 User clicks on Create a new Staff button")
    public void us19_user_clicks_on_create_a_new_staff_button() {
        staffPage.CreateAnewStuffButton.click();
    }
    @Then("US19 User enters SSN {string}, firstname {string}, lastname {string}, phone number {string} and DOB {string}")
    public void us19_user_enters_ssn_firstname_lastname_phone_number_and_dob(String string, String string2, String string3, String string4, String string5) {
        staffPage.EnteringNewStaffSSNButton.sendKeys(string);
        staffPage.EnteringNewStaffFirstnameButton.sendKeys(string);
        staffPage.EnteringNewStaffLastnameButton.sendKeys(string);
        staffPage.EnteringNewStaffPhoneNumberButton.sendKeys(string);
        staffPage.EnteringNewStaffDatOfBirthButton.sendKeys(string);
    }
    @Then("US19 User clicks Save button")
    public void us19_user_clicks_save_button() {
        staffPage.SaveButton.click();
        Driver.wait(3);
    }

    @Then("US19 User clicks on Create a new Staff button for searching the new created staff")
    public void us19_user_clicks_on_create_a_new_staff_button_for_searching_the_new_created_staff() {
        staffPage.CreateAnewStuffButton.click();
    }
    @Then("US19 User enter SSN of new staff to search about it")
    public void us19_user_enter_ssn_of_new_staff_to_search_about_it() {
        staffPage.EnteringNewStaffSSNButton.sendKeys("654-54-5432");
    }
    @Then("US19 User clicks on Search user button")
    public void us19_user_clicks_on_search_user_button() {
        staffPage.UserSearchButton.click();
    }
    @Then("US19 User receives the message of success")
    public void us19_user_receives_the_message_of_success() {
        Assert.assertTrue(staffPage.SuccessMessageOfSearching.isDisplayed());
    }

    //TC02
    @When("US19 User clicks on View button")
    public void us19_user_clicks_on_view_button() {
        staffPage.ViewingStaffInfoButton.click();
        Driver.wait(3);
    }
    @Then("US19 User can see the info of the new staff and verify that")
    public void us19_user_can_see_the_info_of_the_new_staff_and_verify_that() {
        Assert.assertTrue(staffPage.VerifyViewingInfo.isDisplayed());
    }

    //TC03
    @When("US19 User clicks on the new staff id button to view it")
    public void us19_user_clicks_on_the_new_staff_id_button_to_view_it() {
        staffPage.ChoosingNewStaffIDButton.click();
        Driver.wait(3);
    }
    @Then("US19 User verifies viewing the  info")
    public void us19_user_verifies_viewing_the_info() {
        Assert.assertTrue(staffPage.VerifyViewingInfo.isDisplayed());
    }

    //TC04
    @When("US19 User clicks on Edit button of the new staff")
    public void us19_user_clicks_on_edit_button_of_the_new_staff() {
        staffPage.EditingStaffInfoButton.click();
        Driver.wait(3);
    }
    @Then("US19 User edits the phone number")
    public void us19_user_edits_the_phone_number() {
        staffPage.EnteringNewStaffPhoneNumberButton.sendKeys("8723078124");
    }
    @Then("US19 User click Save button")
    public void us19_user_click_Save_button() {
        staffPage.SaveButton.click();
        Driver.wait(3);

    }
    @Then("US19 User receives success message")
    public void us19_user_receives_success_message() {
        Assert.assertTrue(staffPage.SuccessMessageOfSearching.isDisplayed());
    }
    //TC05
    @When("US19 User clicks on delete button of the new staff")
    public void us19_user_clicks_on_delete_button_of_the_new_staff() {
        staffPage.DeletingStaffInfoButton.click();
        Driver.wait(3);
        //Driver.waitAndClick(staffPage.DeletingStaffInfoButton);
        //Driver.wait(3);
    }
    @Then("US19 User delete the phone number")
    public void us19_user_delete_the_phone_number() {
        //staffPage.EnteringNewStaffPhoneNumberButton.sendKeys(Keys.DELETE);
        staffPage.EnteringNewStaffPhoneNumberButton.clear();
        Driver.wait2(3);
    }
    @Then("US19 User click on Save button")
    public void us19_user_click_on_save_button() {
        staffPage.SaveButton.click();
        Driver.waitAndClick(staffPage.SaveButton);
    }
    @Then("US19 User receives the success message")
    public void us19_user_receives_the_success_message() {
        Assert.assertTrue(staffPage.SuccessMessageOfSearching.isDisplayed());
    }







}