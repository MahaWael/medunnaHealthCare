package stepdefinitions.uistepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AdminPage;
import pages.DoctorPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US_14_StepDefs {
    DoctorPage doctorPage=new DoctorPage();
    AdminPage adminPage=new AdminPage();

    @Given("doctor navigates to My Pages segment and clicks")
    public void doctor_navigates_to_my_pages_segment_and_clicks() {
        Driver.waitAndClick(doctorPage.doctorPageMyPagesDropBox);

    }
    @Then("doctor clicks My Inpatients")
    public void doctor_clicks_my_inpatients() {
        Driver.waitAndClick(doctorPage.doctorPageMyInpatients);

    }
    @Then("Doctor verifies all info from inpatient")
    public void doctor_verifies_all_info_from_inpatient() {
        Driver.wait(3);
        Assert.assertTrue( doctorPage.doctorPageInPatientsText.isDisplayed());

    }
    @Then("Doctor navigates Edit button and clicks")
    public void doctor_navigates_edit_button_and_clicks() {
        Driver.wait(3);
        Driver.waitAndClick(doctorPage.doctorPageInPatientsFirstInpatientEditButton);


    }
    @Then("Doctor can especially update status staying of InPatient")
    public void doctor_can_especially_update_status_staying_of_in_patient() throws IOException {

        Driver.waitAndClick(doctorPage.doctorPageStatusDropBox);
        Driver.selectAnItemFromDropdown(doctorPage.doctorPageStatusDropBox,"STAYING");
        Driver.clickWithJS(doctorPage.doctorPageInPatientSaveButton);
        Driver.wait(2);
        ReusableMethods.getScreenshot("Staying result ");


    }
    @Then("Doctor can especially update status discharged of InPatient")
    public void doctor_can_especially_update_status_discharged_of_in_patient() throws IOException {
        Driver.waitAndClick(doctorPage.doctorPageStatusDropBox);
        Driver.selectAnItemFromDropdown(doctorPage.doctorPageStatusDropBox,"DISCHARGED");
        Driver.clickWithJS(doctorPage.doctorPageInPatientSaveButton);
        Driver.wait(2);
        ReusableMethods.getScreenshot("Discharged result ");
    }
    @Then("Doctor can especially update status cancelled of InPatient")
    public void doctor_can_especially_update_status_cancelled_of_in_patient() throws IOException {
        Driver.waitAndClick(doctorPage.doctorPageStatusDropBox);
        Driver.selectAnItemFromDropdown(doctorPage.doctorPageStatusDropBox,"CANCELLED");
        Driver.clickWithJS(doctorPage.doctorPageInPatientSaveButton);
        Driver.wait(2);
        ReusableMethods.getScreenshot("Cancelled result ");

    }
    @Then("Doctor can navigates room drop down and clicks")
    public void doctor_can_navigates_room_drop_down_and_clicks() {
        Driver.waitAndClick(doctorPage.doctorPageRoomDropBox);
        //    Driver.selectAnItemFromDropdown(doctorPage.doctorPageRoomDropBox,"2041:DAYCARE");
        Driver.selectByIndex(doctorPage.doctorPageRoomDropBox,3);


    }
    @Then("Doctor can navigates Save button and clicks")
    public void doctor_can_navigates_save_button_and_clicks() throws IOException {
        Driver.wait(2);
        Driver.waitAndClick(doctorPage.doctorPageInPatientSaveButton);
        Driver.wait(2);
        ReusableMethods.getScreenshot("room update");

    }



}
