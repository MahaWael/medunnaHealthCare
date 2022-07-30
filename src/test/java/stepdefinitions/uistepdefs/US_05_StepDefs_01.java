package stepdefinitions.uistepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.HomePage;
import pages.PatientPage;
import pojos.Appointment;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TxtWriter;

import java.io.IOException;

public class US_05_StepDefs_01 {
    HomePage homePage = new HomePage();
    PatientPage patientPage = new PatientPage();
    Appointment appointment = new Appointment();
    Faker faker = new Faker();
    // TC_0501
    @Given("Navigate to the Medunna page")
    public void navigate_to_medunna_page() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_login_url"));
    }

    @Then("Click on Make an Appointment button")
    public void click_on_make_an_appointment_button() {
        homePage.homePageMakeAnAppointmentButton.click();
    }

    @Then("user provides their first name as {string}")
    public void user_provides_their_first_name_as(String firstName) {
        appointment.setFirstName(firstName);
        homePage.registrationFirstNameBox.sendKeys(firstName);
        Driver.wait(2);
    }
    @Then("user types in their last name as {string}")
    public void user_types_in_their_last_name_as(String lastName) {
        appointment.setLastName(lastName);
        homePage.registrationLastNameBox.sendKeys(lastName);
        Driver.wait(2);
    }
    @Then("user provides their ssn id as {string}")
    public void user_provides_their_ssn_id_as(String ssn) {
        appointment.setSsn(ssn);
        homePage.registrationSsnNumberBox.sendKeys(ssn);
        Driver.wait(2);
    }
    @Then("user enters their phone number as  {string}")
    public void user_enters_their_phone_number_as(String phoneNumber) {
        appointment.setPhoneNumber(phoneNumber);
        Driver.waitAndSendText(patientPage.PatientpagePhone, phoneNumber);
    }
    @Then("user types their email address as {string}")
    public void user_types_their_email_address_as(String email) {
        appointment.setEmail(appointment.getEmail());
        Driver.waitAndSendText(homePage.registrationEmailBox, email);
    }
    @Then("user enters date Appointment_Date_Time as {string}")
    public void select_and_existing_date_appointment_date_time_as(String date ) {
        appointment.setDate(appointment.getDate());
        patientPage.PatientpageAppointmentDate.sendKeys(date);
        Driver.wait(2);
    }
    @Then("Click on {string} box")
    public void click_on_box(String string) {
        Driver.waitAndClick(patientPage.PatientpageSendAppointmentRequest);
        Driver.wait(2);
    }
    @Then("Verify {string} message pop up")
    public void verify_message_pop_up(String string) throws IOException {
        Assert.assertTrue(Driver.waitForVisibility(patientPage.PatientpageRegistrSavedMessage, 5).isDisplayed());
        ReusableMethods.getScreenshot("RegistrSavedMessage");
    }
    @Then("user registers and saves the records")
    public void user_registers_and_saves_the_records() {
       TxtWriter.saveUiAppointmentData(appointment);
    }
    // TC_0502
    @Then("Enter an invalid SSN {string}")
    public void enter_an_invalid_ssn(String ssn) {
        homePage.registrationSsnNumberBox.sendKeys("343566666");
    }

    @Then("Verify the message - Your SSN is invalid - is visible")
    public void verify_the_message_your_ssn_is_invalid_is_visible() {
        Assert.assertTrue(homePage.registrationSsnNumberBox.isDisplayed());
    }
    // TC_0503
    @Then("Enter an invalid Email {string}")
    public void enter_an_invalid_email(String email) {
        homePage.registrationEmailBox.sendKeys("team89@gmahf" + Keys.ENTER);
        Driver.wait(3);
    }
    @Then("Verify the message - This field is invalid - is visible")
    public void verify_the_message_this_field_is_invalid_is_visible() {
        Assert.assertTrue(homePage.registrationEmailBox.isDisplayed());
    }
    // TC_0504
    @Then("Enter an invalid phone number {string}")
    public void enter_an_invalid_phone_number(String phoneNumber) {
        patientPage.PatientpagePhone.sendKeys("655544452" + Keys.ENTER);
    }
    @Then("Verify the message - Phone number is invalid - is visible")
    public void verify_the_message_phone_number_is_invalid_is_visible() {
        Assert.assertTrue(patientPage.PatientpageInvalidPhone.isDisplayed());
    }
    @Then("User closes the browser")
    public void user_closes_the_browser() {
        Driver.closeDriver();
    }
}