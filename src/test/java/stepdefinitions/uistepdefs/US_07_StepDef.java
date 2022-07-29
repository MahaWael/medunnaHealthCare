package stepdefinitions.uistepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.PatientPage;
import pages.SignInPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class US_07_StepDef {

    PatientPage patientPage = new PatientPage();
    SignInPage signInPage = new SignInPage();
    @Given("US07 Navigate to Medunna page")
    public void US07_navigate_to_medunna_page() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_login_url"));
    }

    @Then("US07 Verify that home page is visible successfully")
    public void US07_verify_that_home_page_is_visible_successfully() {
        String title = Driver.getDriver().getTitle();
        String url = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(ConfigReader.getProperty("medunna_login_url"), url);
    }
    @Then("US07 Click on Sign in button")
    public void US07_click_on_sign_in_button() {
        signInPage.dropdown.click();
        signInPage.SignInDropdown.click();
    }
    @Then("US07 Enter a valid username {string}")
    public void US07_enter_a_valid_username(String username) {
        signInPage.username.sendKeys(username);
    }

    @Then("US07 Enter a valid password {string}")
    public void US07_enter_a_valid_password(String password) {
        signInPage.password.sendKeys(password);
    }

    @Then("US07 Click Sign in button")
    public void US07_click_sign_in_button() {
        signInPage.signInButton.click();
    }

    @Then("US07 Verify Sign in page is visible succesfully")
    public void US07_verify_sign_in_page_is_visible_succesfully() {

        String loginPageUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(ConfigReader.getProperty("login_page_url"), loginPageUrl);
    }
    @Then("US07 Click -Make an Apooinment- link")
    public void US07_click_make_an_apooinment_link() {
        ReusableMethods.waitFor(2);
        patientPage.PatientpageMyPagesPatient.click();
        ReusableMethods.waitForVisibility(patientPage.PatientpageMakeanAppointment,2);
        patientPage.PatientpageMakeanAppointment.click();
    }
    @Then("US07 Enter  a phone number {string}")
    public void US07_enter_a_phone_number(String phoneNumber) {
        patientPage.PatientpagePhone.sendKeys(phoneNumber);
    }
    @Then("US07 Verify the order for date as  day-mm-year")
    public void US07_verify_the_order_for_date_as_day_mm_year() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        String date = js.executeScript("return document.getElementById('appoDate').value").toString();
        String regex = "^\\d{4}\\-(0[1-9]|1[012])\\-(0[1-9]|[12][0-9]|3[01])$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date);
        Assert.assertTrue(matcher.matches());
    }
    @Then("US07 Select a current date")
    public void US07_select_a_current_date() {
        patientPage.PatientpageAppointmentDate.sendKeys(ReusableMethods.getDate());
    }
    @Then("US07 Click -Send an Appoinment Request- button")
    public void US07_click_send_an_appoinment_request_button() {
        patientPage.PatientpageSendAppointmentRequest.click();
    }
    @Then("US07 Verify -Appoinment saved- message is visible")
    public void US07_verify_appoinment_saved_message_is_visible() {
        ReusableMethods.waitForVisibility(patientPage.PatientpageRegistrSavedMessage,2);
        Assert.assertTrue(patientPage.PatientpageRegistrSavedMessage.isDisplayed());
    }
    @Then("US07 Click My Appoinments")
    public void US07_click_my_appoinments() {
        patientPage.PatientpageMyPagesPatient.click();
        ReusableMethods.waitForClickablility(patientPage.PatientpageMyAppointments,2);
        patientPage.PatientpageMyAppointments.click();
    }
    @Then("US07 Verify Appointments page is visible")
    public void US07_verify_appointments_page_is_visible() {
        ReusableMethods.waitForVisibility(patientPage.PatientpageAppointmentHeading,2);
        Assert.assertTrue(patientPage.PatientpageAppointmentHeading.isDisplayed());
    }
    @Then("US07 Verify last created appoinment is visible")
    public void US07_verify_last_created_appoinment_is_visible() {
        Assert.assertTrue(patientPage.lastAppointmentDate.getText().contains(ReusableMethods.getTime()));
        System.out.println(patientPage.lastAppointmentDate.getText());
        System.out.println(ReusableMethods.getTime());
    }
    @Then("US07 Select a future date")
    public void US07_select_a_future_date() {
        patientPage.PatientpageAppointmentDate.sendKeys(ReusableMethods.getFutureDate());
        ReusableMethods.waitFor(4);
    }

    @Then("US07 Verify last created future date appoinment is visible")
    public void US07_verify_last_created_future_date_appoinment_is_visible() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(patientPage.fistAppointmentDate.getText().contains(ReusableMethods.getTime()));
        System.out.println(patientPage.fistAppointmentDate.getText());
        System.out.println(ReusableMethods.getTime());
    }

    @Then("US07 Select a past date")
    public void US07_select_a_past_date() {
        patientPage.PatientpageAppointmentDate.sendKeys(ReusableMethods.getPastDate());
    }
    @Then("US07 Verify -Appoinment saved- message is not visible")
    public void US07_verify_appoinment_saved_message_is_not_visible() {
        ReusableMethods.waitForVisibility(patientPage.PatientpageRegistrSavedMessage,2);
        Assert.assertFalse(patientPage.PatientpageRegistrSavedMessage.isDisplayed());
    }
    @Then("US07 Verify last created past date appoinment is not visible")
    public void US07_verify_last_created_past_date_appoinment_is_not_visible() {
        Assert.assertFalse(patientPage.midAppointmentDate.getText().contains(ReusableMethods.getTime()));
        System.out.println(patientPage.midAppointmentDate.getText());
        System.out.println(ReusableMethods.getTime());
    }
    @Then("US07 Verify -Appointment date can not be past date! message is visible")
    public void US07_verify_appointment_date_can_not_be_past_date_message_is_visible() {
        ReusableMethods.waitForVisibility(patientPage.appointmentCantBePastMessage,2);
        Assert.assertTrue(patientPage.appointmentCantBePastMessage.isDisplayed());
    }
    @And("US07 Close the browser")
    public void US07_closeTheBrowser() {
        Driver.closeDriver();
    }

}
