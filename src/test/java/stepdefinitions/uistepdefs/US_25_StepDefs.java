package stepdefinitions.uistepdefs;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.HomePage;
import pages.PatientPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US_25_StepDefs {
    HomePage homePage = new HomePage();
    PatientPage patientPage = new PatientPage();
    Driver driver;

    @Given("user25 Navigate to Medunna page")
    public void user25_navigate_to_medunna_page() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_login_url"));
    }
    @When("user25 Click on profile icon")
    public void user25_click_on_profile_icon() {
        Driver.waitAndClick(patientPage.PatientpageIconbutton);
    }
    @Then("user25 Click on Sign in button")
    public void user25_click_on_sign_in_button() {
        homePage.homePageSignInButton.click();
        Driver.sleep(1000);
    }
    @Then("user25 enter valid credentials username as {string} and password as {string} boxes")
    public void user25_enter_valid_credentials_username_as_and_password_as_boxes(String username, String password) {
        homePage.registrationUserNameBox.sendKeys(username+ Keys.ENTER);
        Driver.wait(1);
        patientPage.PatientpagePassword.sendKeys(password + Keys.ENTER);
        Driver.wait(1);
    }
    @Then("user25 Clicks sign in button")
    public void user25_clicks_sign_in_button() {
        Driver.waitAndClick(homePage.homePageSignInButton);
    }
    @Then("user25 Click on My Page \\(Patient) button")
    public void user25_click_on_my_page_patient_button() {
        Driver.waitAndClick(patientPage.PatientpageMyPagesPatient);
    }
    @Then("user25 Click on Make an Appointment button")
    public void user25_click_on_make_an_appointment_button() {
        Driver.wait(2);
        patientPage.PatientpageMakeanAppointment.click();
    }
    @Then("user25 clicks on phone box and types valid phone number as {string}")
    public void user25_clicks_on_phone_box_and_types_valid_phone_number_as(String phonenumber) {
        Driver.wait(5);
        patientPage.PatientpagePhone.sendKeys(phonenumber + Keys.ENTER);
    }

    @Then("user25 Click on Send an Appointment Request button")
    public void user25_click_on_send_an_appointment_request_button() {
        Driver.waitAndClick(patientPage.PatientpageSendAppointmentRequest);
        Driver.wait(5);
    }
    @Then("user25 Verify Appointment registration saved! We will call you as soon as possible message is visible")
    public void user25_verify_appointment_registration_saved_we_will_call_you_as_soon_as_possible_message_is_visible() throws IOException {
        Assert.assertTrue(Driver.waitForVisibility(patientPage.PatientpageRegistrSavedMessage, 2).isDisplayed());
        ReusableMethods.getScreenshot("RegistrSavedMessage");
    }
    @Then("user25 clicks on My Page \\(Patient) button")
    public void user25_clicks_on_my_page_patient_button() {
        Driver.waitAndClick(patientPage.PatientpageMyPagesPatient);
    }
    @Then("user25 Click on my appointments")
    public void user25_click_on_my_appointments() throws IOException {

        Driver.waitAndClick(patientPage.PatientpageMyAppointments);
        Driver.wait(2);
        ReusableMethods.getScreenshot("Appointments page");
    }
    @Then("user25 Verify Appointments page is visible")
    public void user25_verify_appointments_page_is_visible() throws IOException {
        Driver.wait(2);
        patientPage.PatientpageMyAppointments.isDisplayed();
        ReusableMethods.getScreenshot("Appointments page");
    }
    @Then("user25 User closes the browser")
    public void user25_user_closes_the_browser() {
        Driver.closeDriver();
    }
}
