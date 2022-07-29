package stepdefinitions.uistepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.HomePage;
import pages.PatientPage;
import pojos.Appointment;
import utilities.Driver;
import utilities.ReusableMethods;
import java.io.IOException;

public class US_05_StepDefs_01 {
    HomePage homePage = new HomePage();
    PatientPage patientPage = new PatientPage();
    Appointment appointment = new Appointment();
    Faker faker = new Faker();
    Driver driver;

    @When("Click on Profile icon button")
    public void click_on_profile_icon_button() {
        Driver.waitAndClick(patientPage.PatientpageIconbutton);
    }
    @Then("Click on Register button")
    public void click_on_register_button() {
        Driver.waitAndClick(homePage.homePageRegisterButton);
    }
    @Then("Enter a valid SSN {string}")
    public void enter_a_valid_ssn(String ssn ){
        homePage.registrationSsnNumberBox.sendKeys(ssn);

    }
    @Then("Enter a valid first name {string}")
    public void enter_a_valid_first_name(String firstName) {
        appointment.setFirstName(firstName);
        homePage.registrationFirstNameBox.sendKeys(firstName + Keys.ENTER);
    }
    @Then("Enter a valid last name {string}")
    public void enter_a_valid_last_name(String lastName) {
        appointment.setLastName(lastName);
        homePage.registrationLastNameBox.sendKeys(lastName + Keys.ENTER);
    }
    @Then("Enter a username {string}")
    public void enter_a_username(String username) {
        appointment.setLogin(appointment.getLogin());
        homePage.registrationUserNameBox.sendKeys(username + Keys.ENTER);
    }
    @Then("Enter a valid email {string}")
    public void enter_a_valid_email(String email) {
        appointment.setEmail(appointment.getEmail());
        homePage.registrationEmailBox.sendKeys(email + Keys.ENTER);
    }
    @Then("Enter password without any symbols or gaps {string}")
    public void enter_password_without_any_symbols_or_gaps(String password) {
        appointment.setPassword(appointment.getPassword());
        homePage.registrationPasswordBox.sendKeys(password + Keys.ENTER);

    }
    @Then("Enter New password confirmation {string}")
    public void enter_new_password_confirmation(String passwordconfirm) {
        appointment.setPassword(appointment.getPassword());
        homePage.registrationNewPasswordConfirmationBox.sendKeys(passwordconfirm + Keys.ENTER);
    }
    @Then("click register button")
    public void click_register_button() {
        Driver.waitAndClick(homePage.registrationRegisterButton);
    }
    @Then("Verify Registration Saved message pop up")
    public void verify_registration_saved_message_pop_up() throws IOException {
        // ReusableMethods.waitFor(1);
        //Assert.assertTrue(patientPage.PatientpageRegistrSavedMessage.isDisplayed());
        Assert.assertTrue(Driver.waitForVisibility(patientPage.PatientpageRegistrSavedMessage, 5).isDisplayed());
        ReusableMethods.getScreenshot("Click on Profile button");
    }
    @Then("Click on Profile button")
    public void click_on_profile_button(){
        patientPage.PatientpageIconbutton.click();
        Driver.wait(2);
    }
    @Then("US05 Click on Sign in button")
    public void US05_click_on_sign_in_button() {
        homePage.homePageSignInButton.click();
        Driver.sleep(1000);
    }
    @Then("User login with username {string}")
    public void user_login_with_username(String username) {
        appointment.setLogin(appointment.getLogin());
        homePage.registrationUserNameBox.sendKeys(username+ Keys.ENTER);
        Driver.wait(1);
    }
    @Then("User enters their password {string}")
    public void user_enters_their_password(String password) {
        appointment.setPassword(appointment.getPassword());
        patientPage.PatientpagePassword.sendKeys(password + Keys.ENTER);
        Driver.wait(1);
    }

    @Then("User clicks sign in button")
    public void user_clicks_sign_in_button() {
        Driver.waitAndClick(homePage.homePageSignInButton);
    }
    @Then("Click on My Page \\(Patient) button")
    public void click_on_my_page_patient_button() {
        Driver.waitAndClick(patientPage.PatientpageMyPagesPatient);
    }
    @Then("Click on My Appointments")
    public void click_on_my_appointments() {
        Driver.waitAndClick(patientPage.PatientpageMyAppointments);
    }
    @Then("Verify Appointments is visible")
    public void verify_appointments_is_visible() throws IOException {

        patientPage.PatientpageMyAppointments.isDisplayed();
        Driver.wait(1);
        ReusableMethods.getScreenshot("My Appointments");
    }
    @Then("Click on user's name")
    public void click_on_user_s_name() {
        Driver.waitAndClick(patientPage.PatientpageClickPatientName);
    }
    @Then("Verify Patient page is visible")
    public void verify_patient_page_is_visible() {
        Assert.assertTrue(patientPage.Patientpageprofile.isDisplayed());
        Driver.wait(5);
    }



}
