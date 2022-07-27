package stepdefinitions.uistepdefs;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AdminPage;
import pages.PatientPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US_09_DoctorStepDefs {

    AdminPage adminPage= new AdminPage();
    PatientPage patientPage= new PatientPage();

    @Then("US09 user enters username3 {string}")
    public void US09_user_enters_username3(String username3) {
        adminPage.usernameBox.sendKeys(username3);
        Driver.wait(2);
    }
    @Then("US09 user enters password3 {string}")
    public void US09_user_enters_password3(String password3) {
        adminPage.passwordBox.sendKeys(password3);
        Driver.wait(2);
    }
    @Then("user clicks Sign-in button in the pop-up page")

    @Then("US09 user clicks Sign-in button in the pop-up page as doctor")
    public void US09_user_clicks_sign_in_button_in_the_pop_up_page_as_doctor() {
        adminPage.signInButton.click();
        Driver.wait(2);
    }
    @Then("US09 click MY PAGES button as doctor")
    public void US09_click_my_pages_button_as_doctor() {
        patientPage.PatientpageMyPagesPatient.click();
        Driver.wait(1);
    }
    @Then("US09 click Search Patient button as doctor")
    public void US09_click_search_patient_button_as_doctor() {
        patientPage.doctorMyPagesSearchPatient.click();
        Driver.wait(1);
    }
    @Then("US09 verify that delete button not visible")
    public void US09_verify_that_delete_button_not_visible() {
        Assert.assertTrue("Delete button is not visible", adminPage.showAppointmentsinfirstpatient.isDisplayed());
    }
    @Then("US09 verify that doctor in Patients page")
    public void US09_verify_that_doctor_in_patients_page() throws IOException {
        Assert.assertTrue(adminPage.doctorVerifyPatientsPage.isDisplayed());
        ReusableMethods.getScreenshot("There is no delete button");
    }
}