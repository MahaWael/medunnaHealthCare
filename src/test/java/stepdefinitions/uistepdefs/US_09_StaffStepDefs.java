
package stepdefinitions.uistepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AdminPage;
import pages.StaffPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import java.io.IOException;

public class US_09_StaffStepDefs {
    StaffPage staffPage = new StaffPage();
    AdminPage adminPage = new AdminPage();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();

    @Then("US09 user enters username2 {string}")
    public void US09_user_enters_username2(String username2) {
        adminPage.usernameBox.sendKeys(username2);
    }
    @Then("US09 user enters password2 {string}")
    public void US09_user_enters_password2(String password2) {
        adminPage.passwordBox.sendKeys(password2);
    }
    @Then("US09 click MY PAGES Button on staff page")
    public void US09_click_my_pages_button_on_staff_page() {
        staffPage.buttonMyPages.click();
        Driver.wait(3);
    }
    @Then("US09 click search patient button on staff page")
    public void US09_click_search_patient_button_on_staff_page() {
        staffPage.searchPatient.click();
        Driver.wait(3);
    }
    @Then("US09 verify staff in patients page")
    public void US09_verify_staff_in_patients_page() {
        Assert.assertTrue(staffPage.patientsPageVerify.isDisplayed());
    }

    @Then("US09 verify that patient SSN box visible")
    public void US09_verify_that_patient_ssn_box_visible() {
        Assert.assertTrue(staffPage.patientSSNVerify.isDisplayed());
    }

    @Then("US09 user click edit button for first patient as staff")
    public void US09_user_click_edit_button_for_first_patient_as_staff() {
        staffPage.EditButtonFirstPatient.click();
        Driver.wait(2);
    }
    @Then("US09 verify that create or edit a patient page visible as staff")
    public void US09_verify_that_create_or_edit_a_patient_page_visible_as_staff() {
        Assert.assertTrue(staffPage.createAndEditPatient.isDisplayed());
    }
    @Then("US09 verify staff can edit firstname lastname birthdate email phone gender blood group address description user country and state")
    public void US09_verify_that_staff_can_edit_firstname_lastname_birthdate_email_phone_gender_blood_group_address_description_user_country_and_state() {
        ReusableMethods.doubleClick(staffPage.stafEditFirstNamePatiet);
        ReusableMethods.waitFor(3);
        staffPage.stafEditFirstNamePatiet.sendKeys(Keys.DELETE);
        Driver.waitAndSendText(staffPage.stafEditFirstNamePatiet, Faker.instance().name().firstName());
//        staffPage.stafEditFirstNamePatiet.sendKeys("John");
        ReusableMethods.doubleClick(staffPage.staffEditLastNamePatient);
        ReusableMethods.waitFor(3);
        staffPage.staffEditLastNamePatient.sendKeys(Keys.DELETE);
        Driver.waitAndSendText(staffPage.staffEditLastNamePatient, Faker.instance().name().lastName());
//        staffPage.staffEditLastNamePatient.sendKeys("Smith");
        ReusableMethods.doubleClick(staffPage.staffEditBirtdatePatient);
        staffPage.staffEditBirtdatePatient.sendKeys(Keys.DELETE);
        staffPage.staffEditBirtdatePatient.sendKeys("06.09.19861834");
        ReusableMethods.doubleClick(staffPage.staffEditEmailPatient);
        ReusableMethods.waitFor(4);
        staffPage.staffEditEmailPatient.clear();
        Driver.waitAndSendText(staffPage.staffEditEmailPatient, Faker.instance().internet().emailAddress());
//        staffPage.staffEditEmailPatient.sendKeys("johnsmith2343@gmail.com");
        ReusableMethods.waitFor(3);
        ReusableMethods.doubleClick(staffPage.staffEditPhonePatient);
        String t = Keys.chord(Keys.CONTROL, "a");
        staffPage.staffEditPhonePatient.sendKeys(t);
        staffPage.staffEditPhonePatient.sendKeys(Keys.DELETE);
        staffPage.staffEditPhonePatient.sendKeys("424-657-8975");
        ReusableMethods.waitFor(3);
        ReusableMethods.doubleClick(staffPage.staffEditGenderPatient);
        staffPage.staffEditGenderPatient.sendKeys(Keys.DELETE);
        staffPage.staffEditGenderPatient.sendKeys("MALE");
        JSUtils.scrollIntoViewJS(Driver.getDriver().findElement(By.xpath("//*[@id=\"patient-birthDate\"]")));
        ReusableMethods.waitFor(4);
        ReusableMethods.doubleClick(staffPage.staffEditBloodGroupPatient);
        actions.moveToElement(staffPage.staffEditBloodGroupPatient).click().sendKeys("AB+").click().perform();
        Select selectBlood = new Select(staffPage.staffEditBloodGroupPatient);
        selectBlood.selectByIndex(3);
        ReusableMethods.waitFor(3);
        ReusableMethods.doubleClick(staffPage.staffEditAddressPatient);
        String add = Keys.chord(Keys.CONTROL, "a");
        staffPage.staffEditAddressPatient.sendKeys(add);
        staffPage.staffEditAddressPatient.sendKeys(Keys.DELETE);
        ReusableMethods.waitFor(4);
        Driver.waitAndSendText(staffPage.staffEditAddressPatient, Faker.instance().address().fullAddress());
//        staffPage.staffEditAddressPatient.sendKeys("2/A Richmond Road RG9 7NW Newbury");
        ReusableMethods.waitFor(3);
        ReusableMethods.doubleClick(staffPage.staffEditDescriptionPatient);
        String dscrpt = Keys.chord(Keys.CONTROL, "a");
        staffPage.staffEditDescriptionPatient.sendKeys(dscrpt);
        staffPage.staffEditDescriptionPatient.sendKeys(Keys.DELETE);
        staffPage.staffEditDescriptionPatient.sendKeys("New patient");
        ReusableMethods.waitFor(3);
        ReusableMethods.doubleClick(staffPage.staffEditUserId);
        Select selectUser = new Select(staffPage.staffEditUserId);
        selectUser.selectByIndex(5);
        ReusableMethods.waitFor(3);
        ReusableMethods.doubleClick(staffPage.staffEditCountryId);
        Select selectCountry = new Select(staffPage.staffEditCountryId);
        selectCountry.selectByIndex(4);
        ReusableMethods.waitFor(3);
        ReusableMethods.doubleClick(staffPage.staffEditStatePatient);
        staffPage.staffEditStatePatient.sendKeys(Keys.DELETE);
        staffPage.staffEditStatePatient.sendKeys("Durham");
    }
    @Then("US09 click save button as staff")
    public void US09_click_save_button_as_staff() throws IOException {
        ReusableMethods.getScreenshot("Staff can not edit state");
        staffPage.staffEditSavePatient.click();
        Driver.wait(2);
    }
    @Then("US09 verify that pop up visible on the right corner")
    public void US09_verify_that_pop_up_visible_on_the_right_corner() throws IOException {
        ReusableMethods.waitFor(2);
        ReusableMethods.getScreenshot("Popup Screenshot");
    }
    @Then("US09 verify that staff can search with SSN id")
    public void US09_verify_that_staff_can_search_with_ssn_id() throws IOException {
        Assert.assertTrue(staffPage.patientSSNVerify.isDisplayed());
        ReusableMethods.waitFor(5);
        ReusableMethods.getScreenshot("No Delete Button On Patients Page");
    }
    @Then("US09 click Ssn box patients page as staff")
    public void US09_click_ssn_box_patients_page_as_staff() {
        staffPage.patientSSNVerify.click();
        Driver.wait(2);
    }
    @Then("US09 staff enter valid ssn number {string}")
    public void US09_staff_enter_valid_ssn_number(String string) {
        staffPage.patientSSNVerify.sendKeys(string + Keys.ENTER);
        Driver.wait(2);
    }
    @Then("US09 verify that staff can search patient page")
    public void US09_verify_that_staff_can_search_patient_page() throws IOException {
        Assert.assertTrue(staffPage.validSsnpatientspage.isDisplayed());
        staffPage.firstPatientViewButton.click();
        Driver.wait(2);
        ReusableMethods.getScreenshot("Valid SSN Patients Page Screenshot");
    }
    @Then("US09 verify delete button not visible for first patient")
    public void US09_verify_delete_button_not_visible_for_first_patient() throws IOException {
        Assert.assertFalse("delete is visible", staffPage.viewButtonFirstPatient.isSelected());
        ReusableMethods.getScreenshot("No Delete Button On Patients Page");
    }
    @Then("US09 staff close the application")
    public void US09_staff_close_the_application() {
        Driver.closeDriver();
    }
}

