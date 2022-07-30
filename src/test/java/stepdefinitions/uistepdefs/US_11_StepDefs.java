package stepdefinitions.uistepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.DoctorPage;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_11_StepDefs {

    HomePage homePage = new HomePage();
    DoctorPage doctorPage = new DoctorPage();
    Actions actions= new Actions(Driver.getDriver());


    @When("us11 doctor goes to base url")
    public void us11_doctor_goes_to_base_url() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_login_url"));
    }
    @When("us11 doctor goes to sign in page")
    public void us11_doctor_goes_to_sign_in_page() {
        homePage.homepageDropBox.click();
        homePage.homePageSignInButton.click();
    }
    @When("us11 doctor sign in")
    public void us11_doctor_sign_in() {
        homePage.login(ConfigReader.getProperty("doctor_username"),ConfigReader.getProperty("doctor_password"));
    }
    @When("us11 doctor navigates to my pages")
    public void us11_doctor_navigates_to_my_pages() throws InterruptedException {

        Driver.waitAndClick(doctorPage.doctorMyPagesBox);
        Thread.sleep(5000);
    }
    @When("us11 doctor clicks on My appointments")
    public void us11_doctor_clicks_on_my_appointments() throws InterruptedException {

        Driver.waitAndClick(doctorPage.doctorPagesMyAppointments);
        Thread.sleep(5000);
    }
    @Then("us11 verify patient's info id, start and end date, status, physician are present")
    public void us11_verify_patient_s_info_id_start_and_end_date_status_physician_are_present() {
        Assert.assertTrue(doctorPage.firstPatientAppointmentID.isDisplayed());
        Assert.assertTrue(doctorPage.firstPatientAppointmentStartDateTime.isDisplayed());
        Assert.assertTrue(doctorPage.firstPatientAppointmentEndDateTime.isDisplayed());
        Assert.assertTrue(doctorPage.firstPatientAppointmentStatus.isDisplayed());
        Assert.assertTrue(doctorPage.firstPatientAppointmentPhysician.isDisplayed());
        Assert.assertTrue(doctorPage.firstPatientAppointmentPatient.isDisplayed());

    }
    @When("us11 doctor clicks on edit button to create or edit an apppointment")
    public void us11_doctor_clicks_on_edit_button_to_create_or_edit_an_apppointment() {
        Driver.waitAndClick(doctorPage.firstPatientAppointmentEditButton);
    }
    @When("us11 doctor select the status")
    public void us11_doctor_select_the_status() {
        Select select = new Select(doctorPage.appointmentEditStatus);
        select.selectByVisibleText("COMPLETED");
    }
    @When("us11 doctor fill in necessary parts")
    public void us11_doctor_fill_in_necessary_parts() {

        doctorPage.appointmentEditAnamnesis.sendKeys("anamnesis info");
        doctorPage.appointmentEditTreatment.sendKeys("treatment info");
        doctorPage.appointmentEditDiagnosis.sendKeys("Diagnosis info");
        doctorPage.appointmentEditPrescription.sendKeys("prescription info");
        doctorPage.appointmentEditDescription.sendKeys("description info");

    }
    @When("us11 doctor clicks on Save button")
    public void us11_doctor_clicks_on_save_button() {
        Driver.waitAndClick(doctorPage.appointmentEditSaveButton);
    }
    @Then("us11 verify appointment is saved successfully")
    public void us11_verify_appointment_is_saved_successfully() {
        Assert.assertTrue(doctorPage.appointmentEditSuccessfuly.getText().contains("The Appointment is updated with identifier"));
    }

    @When("us11 doctor leaves the anamnesis Treatment and Diagnosis fields blank")
    public void us11_doctor_leaves_the_anamnesis_treatment_and_diagnosis_fields_blank() {
        doctorPage.appointmentEditAnamnesis.sendKeys("");
        doctorPage.appointmentEditTreatment.sendKeys("");
        doctorPage.appointmentEditDiagnosis.sendKeys("");
    }
    @Then("us11 verify that There is  warning message for each field")
    public void us11_verify_that_there_is_warning_message_for_each_field() {

        Assert.assertEquals(doctorPage.appointmentEditErrorMessageForAnemnesis.getText(),"This field is required.");
        Assert.assertEquals(doctorPage.appointmentEditErrorMessageForTreatment.getText(),"This field is required.");
        Assert.assertEquals(doctorPage.appointmentEditErrorMessageForDiagnosis.getText(),"This field is required.");
    }
    @When("us11 doctor leave the prescription and description field empty")
    public void us11_doctor_leave_the_prescription_and_description_field_empty() {
        doctorPage.appointmentEditPrescription.sendKeys("");
        doctorPage.appointmentEditDescription.sendKeys("");
    }

    @When("us11 doctor select the status as unapproved")
    public void us11_doctor_select_the_status_as_unapproved() {
        Select select = new Select(doctorPage.appointmentEditStatus);
        select.selectByValue("UNAPPROVED");
    }
    @Then("us11 verify that Unapproved option can not be selectable")
    public void us11_verify_that_unapproved_option_can_not_be_selectable() {
        Select select = new Select(doctorPage.appointmentEditStatus);
        select.selectByIndex(2);
        Assert.assertEquals(doctorPage.appointmentEditStatus.getText(),"PENDING");
        select.selectByIndex(1);
        Assert.assertNotEquals(doctorPage.appointmentEditStatus.getText(),"UNAPPROVED");
    }


}