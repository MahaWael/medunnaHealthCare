package stepdefinitions.uistepdefs;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.AdminPage;
import pages.StaffPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import java.io.IOException;

public class US_21_StepDefs {
    AdminPage adminPage = new AdminPage();
    StaffPage staffPage= new StaffPage();

    @Given("US21 user goes to medunna url")
    public void us21_user_goes_to_medunna_url() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_login_url"));
    }
    @When("US21 user navigates to profile icon and clicks it")
    public void us21_user_navigates_to_profile_icon_and_clicks_it() {
        adminPage.profileicon.click();
        Driver.wait(1);
    }
    @When("US21 user click sign in button")
    public void us21_user_click_sign_in_button() {
        Driver.wait(2);
        adminPage.signInUnderProfileIcon.click();
    }
    @Then("US21 click username field")
    public void us21_click_username_field() {
        adminPage.usernameBox.click();
    }
    @Then("US21 user enters usernameUS21 {string} as staff")
    public void us21_user_enters_username_us21_as_staff(String usernameUS21) {
        adminPage.usernameBox.sendKeys(usernameUS21);
    }
    @Then("US21 user enters passwordUS21 {string} as staff")
    public void us21_user_enters_password_us21_as_staff(String passwordUS21) {
        adminPage.passwordBox.sendKeys(passwordUS21);
    }
    @Then("US21 user clicks Sign-in button")
    public void us21_user_clicks_sign_in_button() {
        adminPage.signInButton.click();
        Driver.wait(2);
    }
    @Then("US21 user navigates to MY PAGES Button and  click it")
    public void us21_user_navigates_to_my_pages_button_and_click_it() {
        staffPage.buttonMyPages.click();
        Driver.wait(1);
    }
    @Then("US21 click search patient button from dropdown")
    public void us21_click_search_patient_button_from_dropdown() {
        staffPage.searchPatient.click();
        Driver.wait(2);
    }
    @Then("US21 User Enters valid SSN number {string}")
    public void us21_user_enters_valid_ssn_number(String ssnnumber) {
        staffPage.searchBoxSSNPatientSearch.sendKeys(ssnnumber + Keys.ENTER);
        Driver.wait(1);
    }
    @Then("US21 User navigates to Show Appointments of patient and clicks")
    public void us21_user_navigates_to_show_appointments_of_patient_and_clicks() {
         staffPage.patientTwoShowAppointments.click();
        Driver.wait(3);
    }
    @Then("US21 User clicks the edit button of the first appointment")
    public void us21_user_clicks_the_edit_button_of_the_first_appointment() {
        staffPage.editshowAppointmentsForTeamSecondPatient.click();
    }
    @Then("US21 User can update the status {string} CANCELLED , {string} PENDING or {string} UNAPPROVED")
    public void us21_user_can_update_the_status_cancelled_pending_or_unapproved(String CANCELLED, String PENDING, String UNAPPROVED) {
        Driver.waitAndSendText(staffPage.statusForTheTeamSecondPatient,"CANCELLED");
        Driver.wait(1);
        Driver.waitAndSendText(staffPage.statusForTheTeamSecondPatient,"PENDING");
        Driver.wait(1);
        Driver.waitAndSendText(staffPage.statusForTheTeamSecondPatient,"UNAPPROVED");
    }
    @Then("US21 User selects the current doctor whose doctor value {string}")
    public void us21_user_selects_the_current_doctor_whose_doctor_value(String string) {
        JSUtils.scrollIntoViewJS(Driver.getDriver().findElement(By.xpath("//select[@id='appointment-physician']")));
        Driver.wait(4);
        staffPage.physicanSelectBoxUnderAppointments.click();
        Driver.wait(12);
        Driver.selectByValue(staffPage.physicanSelectBoxUnderAppointments,"115989");
        Driver.wait(2);
        Driver.selectByValue(staffPage.physicanSelectBoxUnderAppointments,"115993");
        Driver.wait(4);
    }
    @Then("US21 User clicks Save button and verifies that is saved")
    public void us21_user_clicks_save_button_and_verifies_that_is_saved() throws IOException {
        staffPage.savePatientsDoctor.click();
        Driver.wait(2);
        ReusableMethods.getScreenshot("Update for patient is saved");
    }
    @Then("US21 User clicks Show Tests button")
    public void us21_user_clicks_show_tests_button() {
        staffPage.showTestForTeamEightyNineDoctor.click();
        Driver.wait(2);
    }
    @Then("US21 User clicks View Results button")
    public void us21_user_clicks_view_results_button() {
        staffPage.staffCanSeeTestResultButton.click();
        Driver.wait(3);
    }
    @Then("US21 Verify that user can see Test Results")
    public void us21_verify_that_user_can_see_test_results() throws IOException {
        ReusableMethods.getScreenshot("Patient First Appointment Test Results");
    }
    @Then("US21  Staff close the application")
    public void us21_staff_close_the_application() {
        Driver.closeDriver();
    }
}
