package stepdefinitions.uistepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AdminPage;
import pages.PatientPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;
import java.io.IOException;

public class US_09_AdminStepDefs {

    AdminPage adminPage = new AdminPage();
    PatientPage patientPage= new PatientPage();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();

    @Given("US09 user goes to base url")
    public void US09_user_goes_to_base_url() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_login_url"));

    }
    @Given("US09 user clicks profile icon")
    public void US09_user_clicks_profile_icon() {
        adminPage.profileicon.click();
        Driver.wait(2);
    }
    @Given("US09 user click sign in button")
    public void US09_user_click_sign_in_button() {
        Driver.wait(2);
        adminPage.signInUnderProfileIcon.click();
    }
    @Then("US09 click username box")
    public void US09_click_username_box() {
        Driver.wait(2);
        adminPage.usernameBox.click();
    }
    @Then("US09 user enters username {string}")
    public void US09_user_enters_username(String username) {
        Driver.wait(2);
        adminPage.usernameBox.sendKeys(username);
    }
    @Then("US09 user enters password {string}")
    public void US09_user_enters_password(String password) {
        Driver.wait(2);
        adminPage.passwordBox.sendKeys(password);
    }
    @Then("US09 user clicks Sign-in button in the pop-up page")
    public void us09_user_clicks_sign_in_button_in_the_pop_up_page() {
        Driver.wait(2);
        adminPage.signInButton.click();
    }
    @Then("US09 verify that the Items&Titles button is visible")
    public void US09_verify_that_the_items_titles_button_is_visible() {
        Driver.wait(2);
        Assert.assertTrue(adminPage.itemsAndTitles.isDisplayed());
    }
    @Then("US09 click Items&Titles button us09")
    public void US09_click_items_titles_button_us09() {
        Driver.wait(2);
        adminPage.adminItemsandTitles.click();
        Driver.wait(4);
    }
    @Then("US09 click Patient button us09")
    public void US09_click_patient_button_us09() {
        adminPage.patientInDropdown.click();
        Driver.wait(2);
    }
    @Then("US09 verify that user is in Patients page")
    public void US09_verify_that_user_is_in_patients_page() {
        Assert.assertTrue(adminPage.patientsPageVerify.isDisplayed());
        Driver.wait(2);
    }
    @Then("US09 verify that there is a view button on the first patient")
    public void US09_verify_that_there_is_a_view_button_on_the_first_patient() {
        Assert.assertTrue(adminPage.adminPageAppointmentView.isDisplayed());
        Driver.wait(2);
    }
    @Then("US09 click view button for the first patient")
    public void US09_click_view_button_for_the_first_patient() {
        adminPage.adminPageAppointmentView.click();
        Driver.wait(2);
        JSUtils.scrollIntoViewJS(Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-primary']")));
        JSUtils.scrollIntoViewJS(Driver.getDriver().findElement(By.xpath("(//i[@class='bi bi-envelope'])[1]")));
    }
    @Then("US09 verify that the user is in the patient's information page")
    public void US09_verify_that_the_user_is_in_the_patient_s_information_page() {
        Driver.wait(2);
        Assert.assertTrue(adminPage.firstPatientsPageVerify.isDisplayed());
    }
    @Then("US09 verify that there is a Edit button on the first patient")
    public void US09_verify_that_there_is_a_edit_button_on_the_first_patient() {
        Assert.assertTrue( adminPage.firstUsersEdit.isDisplayed());
    }
    @Then("US09 click User management button")
    public void US09_click_user_management_button() {
        Driver.wait(2);
        adminPage.userManagementDropDownUnderAdmin.click();
    }
    @Then("US09 click Edit button for the first patient")
    public void US09_click_edit_button_for_the_first_patient() {
        Driver.wait(2);
        adminPage.firstUsersEdit.click();
    }
    @Then("US09 user goes to last users page")
    public void US09_user_goes_to_last_users_page() {
        JSUtils.scrollIntoViewJS(Driver.getDriver().findElement(By.xpath("(//a[@href='javascript:void(0)'])[8]")));
        Driver.wait(3);
    }
    @Then("US09 click Delete button of the last patient on the first page")
    public void US09_click_delete_button_of_the_last_patient_on_the_first_page() {
        adminPage.oldpatienttodelete.click();
    }
    @Then("US09 verify that pop up shows up")
    public void US09_verify_that_pop_up_shows_up() {
        ReusableMethods.waitFor(3);
        Assert.assertTrue(adminPage.cancelPopUp.isDisplayed());
    }

    @Then("US09 verify that SSN search box is visible")
    public void US09_verify_that_ssn_search_box_is_visible() throws IOException {
        ReusableMethods.getScreenshot("SSN Search box is not visible In Users Page");
    }
    @Then("US09 click Administration button")
    public void US09_click_administration_button() {
        Driver.wait(2);
        adminPage.administrationButton.click();
    }
//    @Then("US09 Verify that User management button is visible")
//    public void US09_verify_that_user_management_button_is_visible() {
//        ReusableMethods.waitFor(3);
//        Assert.assertEquals("User management", adminPage.userManagmentButtonUnderAdminidtrstion.getText());
//    }
    @Then("US09 click User mamagement button")
    public void US09_click_user_mamagement_button() {
        Driver.wait(4);
        adminPage.userManagementDropDownUnderAdmin.click();
    }
    @Then("US09 verify that user is in Users page")
    public void US09_verify_that_user_is_in_users_page() {
        ReusableMethods.waitFor(4);
        Assert.assertTrue(adminPage.usersHeader.isDisplayed());
    }
    @Then("US09 User can delete any patient info us09")
    public void US09_user_can_delete_any_patient_info_us09() throws IOException {
        ReusableMethods.getScreenshot("Admin can delete patients");
    }
    @Then("US09 Verify user in patient page")
    public void US09_verify_user_in_patient_page() {
        Assert.assertTrue(patientPage.createOrEditPatient.isDisplayed());
    }
    @Then("US09 user enters firstname and lastname bithdate email phone gender blood group address description User Country State")
    public void US09_user_enters_firstname_and_lastname_bithdate_email_phone_gender_blood_group_address_description_user_country_state() {
        ReusableMethods.waitFor(2);
        ReusableMethods.doubleClick(patientPage.editPatientFirstName);
        ReusableMethods.waitFor(3);
        patientPage.editPatientFirstName.sendKeys(Keys.DELETE);
        Driver.waitAndSendText(patientPage.editPatientFirstName, Faker.instance().name().firstName());
//        patientPage.editPatientFirstName.sendKeys("Jan");
        ReusableMethods.doubleClick(patientPage.editPatientLastName);
        ReusableMethods.waitFor(3);
        patientPage.editPatientLastName.sendKeys(Keys.DELETE);
        Driver.waitAndSendText(patientPage.editPatientLastName, Faker.instance().name().lastName());
//        patientPage.editPatientLastName.sendKeys("Brown");
        ReusableMethods.doubleClick(patientPage.birthdayPartEdit);
        patientPage.birthdayPartEdit.sendKeys(Keys.DELETE);
        patientPage.birthdayPartEdit.sendKeys("06.08.19761834");
        ReusableMethods.doubleClick(patientPage.editPatientEmail);
        ReusableMethods.waitFor(4);
        patientPage.editPatientEmail.clear();
        Driver.waitAndSendText(patientPage.editPatientEmail, Faker.instance().internet().emailAddress());
        ReusableMethods.waitFor(3);
//       patientPage.editPatientEmail.sendKeys("janwatt2345@gmail.com");
        ReusableMethods.doubleClick(patientPage.editPatientPhone);
        String t = Keys.chord(Keys.CONTROL, "a");
        patientPage.editPatientPhone.sendKeys(t);
        patientPage.editPatientPhone.sendKeys(Keys.DELETE);
        patientPage.editPatientPhone.sendKeys("434-527-8968");
        ReusableMethods.waitFor(2);
        ReusableMethods.doubleClick(patientPage.editPatientGender);
        patientPage.editPatientGender.sendKeys(Keys.DELETE);
        patientPage.editPatientGender.sendKeys("OTHER");
        JSUtils.scrollIntoViewJS(Driver.getDriver().findElement(By.xpath("//*[@id=\"patient-birthDate\"]")));
        ReusableMethods.waitFor(4);
        actions.moveToElement(patientPage.editPatientBloodGroup).click().sendKeys("AB+").click().perform();
        Select selectBlood = new Select(patientPage.editPatientBloodGroup);
        selectBlood.selectByIndex(3);
        ReusableMethods.waitFor(3);
        ReusableMethods.doubleClick(patientPage.editPatientAddress);
        String add = Keys.chord(Keys.CONTROL, "a");
        patientPage.editPatientAddress.sendKeys(add);
        patientPage.editPatientAddress.sendKeys(Keys.DELETE);
        ReusableMethods.waitFor(4);
        Driver.waitAndSendText(patientPage.editPatientAddress, Faker.instance().address().fullAddress());
//        patientPage.editPatientAddress.sendKeys("7 Richmond Road RG9 7NW Newbury");
        ReusableMethods.waitFor(3);
        ReusableMethods.doubleClick(patientPage.editPatientDescription);
        String dscrpt = Keys.chord(Keys.CONTROL, "a");
        patientPage.editPatientDescription.sendKeys(dscrpt);
        patientPage.editPatientDescription.sendKeys(Keys.DELETE);
        patientPage.editPatientDescription.sendKeys("new patient full blood test");
        ReusableMethods.waitFor(3);
        ReusableMethods.doubleClick(patientPage.editPatientUserName);
        Select selectUser = new Select(patientPage.editPatientUserName);
        selectUser.selectByIndex(7);
        ReusableMethods.waitFor(3);
        ReusableMethods.doubleClick(patientPage.editPatientCountry);
        Select selectCountry = new Select(patientPage.editPatientCountry);
        selectCountry.selectByIndex(7);
        ReusableMethods.waitFor(2);
        ReusableMethods.doubleClick(patientPage.editPatientState);
        patientPage.editPatientState.sendKeys(Keys.DELETE);
        patientPage.editPatientState.sendKeys("LA");
    }
    @Then("US09 click Save")
    public void US09_click_save() {
        Driver.wait(2);
        patientPage.editPatientSaveButton.click();
        Driver.wait(2);

    }
    @Then("US09 verify that pop up visible on the left corner")
    public void us09_verify_that_pop_up_visible_on_the_left_corner() throws IOException {
        ReusableMethods.getScreenshot("Admin EditPatient Screenshot");
    }

    @Then("US09 verify that user can see all registration info populated")
    public void US09_verify_that_user_can_see_all_registration_info_populated() throws IOException {
        ReusableMethods.waitFor(2);
        JSUtils.scrollIntoViewJS(Driver.getDriver().findElement(By.xpath("(//a[@href='javascript:void(0)'])[8]")));

//        JSUtils.scrollIntoViewJS(Driver.getDriver().findElement(By.xpath("//div[@class='info jhi-item-count']")));
        ReusableMethods.waitFor(4);
        ReusableMethods.getScreenshot("Admin can see registration info");
    }
    @Then("US09 verify Patients SSN Search box not visible")
    public void US09_verify_patients_ssn_search_box_not_visible() throws IOException {
        Assert.assertTrue(adminPage.patientsPageVerify.isDisplayed());
        ReusableMethods.getScreenshot("Admin can not search patients by SSN ");
    }
    @Then("US09 verify that the first patient has delete button")
    public void US09_verify_that_the_first_patient_has_delete_button() {
        Assert.assertTrue((adminPage.adminfirstPatientDelete.isDisplayed()));
    }
    @Then("US09 click Delete button of the first patient on the first page")
    public void US09_click_delete_button_of_the_first_patient_on_the_first_page() {
        adminPage.adminfirstPatientDelete.click();
        ReusableMethods.waitFor(3);
    }
    @Then("US09 verify that delete button is ckickable")
    public void US09_verify_that_delete_button_is_ckickable() throws IOException {
        Assert.assertTrue(adminPage.adminCancelDeleteOperation.isDisplayed());
        ReusableMethods.getScreenshot("Admin can delete patient info");
        ReusableMethods.waitFor(2);
        adminPage.adminCancelDeleteOperation.click();
    }
    @Then("US09 close the application")
    public void US09_close_the_application() {
        Driver.closeDriver();
    }
}



