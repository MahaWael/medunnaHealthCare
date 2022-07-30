package stepdefinitions.uistepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AdminPage;
import pages.DoctorPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US_13_StepDefs {
    DoctorPage doctorPage=new DoctorPage();
    AdminPage adminPage=new AdminPage();

    @Given("us13 user goes to Medunna Url")
    public void user_goes_to_medunna_url() {
        Driver.getDriver();
    }
    @When("us13 user navigates to URL")
    public void user_navigates_to_url() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));
        Driver.getDriver().manage().window().maximize();

    }
    @When("us13 doctor clicks to Sign In Icon")
    public void doctor_clicks_to_sign_in_icon() {
        adminPage.profileicon.click();
        adminPage.signInUnderProfileIcon.click();
    }
    @Given("us13 Doctor provide valid {string} and {string}")
    public void doctor_provide_valid_and(String username, String password) {
        adminPage.usernameBox.sendKeys(username);
        adminPage.passwordBox.sendKeys(password);
        Driver.waitAndClick(adminPage.signInButton);

    }
    @Given("us13 doctor navigates to My Pages segment and clicks on My Appointments")
    public void doctor_navigates_to_my_pages_segment_and_clicks_on_my_appointments() {
        Driver.waitAndClick(doctorPage.doctorPageMyPagesDropBox);
        Driver.waitAndClick(doctorPage.doctorPagesMyAppointments);

    }
    @Then("us13 doctor navigates Edit button and clicks")
    public void doctor_navigates_edit_button_and_clicks() {
        Driver.waitAndClick(doctorPage.doctorPageAppointmentsFirstEditButton);

    }

    @Then("us13 Doctor navigates Show Test Result and clicks")
    public void doctor_navigates_show_test_result_and_clicks() {
        Driver.wait(2);
        Driver.waitAndClick(doctorPage.doctorPageAppointmentShowTestResultsButton);

    }
    @Then("us13 Doctor navigates and clicks to View Results")
    public void doctor_navigates_and_clicks_to_view_results() {
        Driver.wait(2);
        Driver.waitAndClick(doctorPage.doctorPageAppointmentShowTestResultsViewResultsButton);

    }
    @Then("us13 Doctor verifies all test information")
    public void doctor_verifies_all_test_information() {
        Driver.wait(2);
        Assert.assertTrue(doctorPage.doctorPageYouCanSeeAllTestResult.isDisplayed());

    }
    @Then("us13 Doctor navigates and clicks to Request Inpatient button")
    public void doctor_navigates_and_clicks_to_request_inpatient_button() {
        Driver.wait(2);
        Driver.waitAndClick(doctorPage.doctorPageAppointmentRequestInpatientButton);

    }
    @Then("us13 Doctor verifies succes message contains A new In Patients is created")
    public void doctor_verifies_succes_message_contains_a_new_in_patients_is_created() {

        Assert.assertTrue(Driver.waitForVisibility(doctorPage.doctorPageANewInPatientIsCreatedWithIdentifierMessage,3).isDisplayed());

    }

    @Then("us13 capture the screenshot")
    public void capture_the_screenshot() throws IOException {
        ReusableMethods.getScreenshot("TestResults Screenshot");

    }

    @Then("us13 Close the page")
    public void close_the_page() {
        Driver.closeDriver();
    }
}
