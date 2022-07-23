package stepdefinitions.uistepdefs;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AdminPage;
import pages.DoctorPage;
import pages.HomePage;
import pages.RegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;


public class US_28_StepDefs {

    Actions actions=new Actions(Driver.getDriver());
    RegistrationPage registrationPage = new RegistrationPage();
    HomePage homePage = new HomePage();
    DoctorPage doctorPage = new DoctorPage();
    AdminPage adminPage = new AdminPage();

    @Given("user goes to base url")
    public void user_goes_to_base_url() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_login_url"));
    }


    @Given("user clicks sign in button")
    public void user_clicks_sign_in_button() {
        actions.moveToElement(registrationPage.loginIcon).click().build().perform();
        Driver.waitAndClick(homePage.homeSignInButton);
    }


    @Then("us28 user enters username")
    public void us28_user_enters_username() {
        Driver.waitAndSendText(homePage.homePageUsernameBox, "vusalgasimov");

    }

    @Then("us28 user enters password")
    public void us28_user_enters_password() {
        Driver.waitAndSendText(homePage.homePagePasswordBox, "vusalgasimov");
    }


    @Then("us28 user clicks on sign in button")
    public void us28_user_clicks_on_sign_in_button() {
        Driver.waitAndClick(homePage.homePageLoginButton);
    }

    @Then("us28 user clicks items and titles button")
    public void us28_user_clicks_items_and_titles_button() {
        Driver.waitAndClick(adminPage.ItemsAndTitles);

    }
    @Then("us28 user clicks country button")
    public void us28_user_clicks_country_button() {
        Driver.waitAndClick(adminPage.countryDropDown);

    }
    @Then("us28 user clicks create a new country button")
    public void us28_user_clicks_create_a_new_country_button() {
        Driver.waitAndClick(adminPage.AdminPageCountryCreateNewCountry);

    }
    @Then("us28 user sends a country {string}")
    public void us28_user_sends_a_country(String string) {
        Driver.waitAndSendText(adminPage.sendCountryName, string);

    }
    @Then("us28 user clicks save button")
    public void us28_user_clicks_save_button() {
        Driver.waitAndClick(adminPage.saveCountryButton);

    }
    @Then("us28 user verifies request is saved")
    public void us28_user_verifies_request_is_saved() {
        Driver.wait(2);
        Assert.assertTrue(adminPage.countrySavedPopUp.isDisplayed());

    }

    @Then("us28 user clicks view button")
    public void us28_user_clicks_view_button() {
        Driver.wait(1);
        JSUtils.scrollIntoViewJS(adminPage.viewCountryDetailsButton);
        Driver.waitAndClick(adminPage.viewCountryDetailsButton);

    }
    @Then("us28 user verifies reading country data")
    public void us28_user_verifies_reading_country_data() {
        Driver.wait(2);
        Assert.assertTrue(adminPage.viewCountryAlabama.isDisplayed());

    }

    @Then("us28 user clicks edit button")
    public void us28_user_clicks_edit_button() {
        Driver.waitAndClick(adminPage.countryEditButton);

    }
    @Then("us28 user changes the country name {string}")
    public void us28_user_changes_the_country_name(String string) {
        Driver.wait(1);
        adminPage.countryEditCountryNameBox.sendKeys(Keys.CONTROL + "a");
        adminPage.countryEditCountryNameBox.sendKeys(Keys.DELETE);
        adminPage.countryEditCountryNameBox.sendKeys("Minnesota");
    }


    @Then("us28 user clicks delete button")
    public void us28_user_clicks_delete_button() {
        Driver.wait(1);
        JSUtils.scrollIntoViewJS(adminPage.countryDeleteButton);
        Driver.waitAndClick(adminPage.countryDeleteButton);
    }
    @Then("us28 user confirms delete operation")
    public void us28_user_confirms_delete_operation() {
        Driver.wait(1);
        Driver.waitAndClick(adminPage.countryDeleteConfirmButton);

    }
    @Then("us28 user verifies the country deleted")
    public void us28_user_verifies_the_country_deleted() {
        Driver.wait(2);
        Assert.assertTrue(adminPage.countryDeletedPopUp.isDisplayed());

    }

}
