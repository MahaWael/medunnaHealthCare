package stepdefinitions.uistepdefs;

import io.cucumber.java.en.*
        ;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.SignInPage;
import pages.StaffPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class US_22_StepDefs {
    List<String> searchedSsnListString = new ArrayList<>();
    String searchedValidSsn;
    String searchedInValidSsn;
    String toBeUpdatedResult;
    String toBeUpdatedId;
    String toBeUpdatedDescription;
    SignInPage signInPage = new SignInPage();
    StaffPage staffPage = new StaffPage();
    int index ;

    @Given("US22 user goes to Medunna website")
    public void us22_user_goes_to_medunna_website() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_login_url"));
    }

    @Then("US22 user logs in as a Staff")
    public void us22_user_logs_in_as_a_staff() {
        signInPage.dropdown.click();
        signInPage.SignInDropdown.click();
        signInPage.username.sendKeys("team89staff01");
        signInPage.password.sendKeys("team89staff");
        signInPage.signInButton.click();
    }

    @Then("US22 user click Search Patients link")
    public void us22_user_click_search_patients_link() {
        ReusableMethods.waitFor(2);
        staffPage.buttonMyPages.click();
        ReusableMethods.waitFor(2);
        staffPage.searchPatient.click();
    }

    @Then("US22 verify patients search input box is visible")
    public void us22_verify_patients_search_input_box_is_visible() {
        Assert.assertTrue(staffPage.patientSSNVerify.isDisplayed());
    }

    @Then("US22 user enters a valid SSN {string} into search input box")
    public void us22_user_enters_a_valid_ssn_into_search_input_box(String validSsn) {
        searchedValidSsn = validSsn;
        staffPage.patientSSNVerify.sendKeys(searchedValidSsn);

    }

    @Then("US22 user verify the results that searched SSN is visible")
    public void us22_user_verify_the_results_that_searched_ssn_is_visible() {
        ReusableMethods.waitFor(3);
        for (WebElement eachSsn : staffPage.staffSearchedSsnList) {
            searchedSsnListString.add(eachSsn.getText());
        }
        boolean flag = true;
        for (String eachSsn : searchedSsnListString) {
            if (!eachSsn.contains(searchedValidSsn)) {
                flag = false;
                break;
            }
        }
        //System.out.println(searchedSsnListString);
        //System.out.println(searchedSsn);
        //System.out.println(flag);
        Assert.assertTrue(flag);

    }

    @Then("US22 user enters a invalid SSN {string} into search input box")
    public void us22_user_enters_a_invalid_ssn_into_search_input_box(String inValidSsn) {
        searchedInValidSsn = inValidSsn;
        staffPage.patientSSNVerify.sendKeys(searchedInValidSsn);
    }

    @Then("US22 user verify any result does not come up")
    public void us22_user_verify_any_result_does_not_come_up() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(staffPage.staffSearchedSsnList.size() == 0);
    }

    @Then("US22 user clicks first patient's show appointments button")
    public void us22_user_clicks_first_patient_s_show_appointments_button() {
        ReusableMethods.waitFor(1);
        staffPage.showAppointmentFirstPatient.click();
    }

    @Then("US22 verify appointments page is visible")
    public void us22_verify_appointments_page_is_visible() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(staffPage.staffAppointmentsPageHeader.isDisplayed());
    }

    @Then("US22 user clicks first show tests button")
    public void us22_user_clicks_first_show_tests_button() {
        ReusableMethods.waitFor(1);
        staffPage.firstPatientEditButton.click();
    }

    @Then("US22 user verify tests page is visible")
    public void us22_user_verify_tests_page_is_visible() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(staffPage.staffUpdateTestsPageHeader.isDisplayed());
    }

    @Then("US22 user clicks first test view result button")
    public void us22_user_clicks_first_test_view_result_button() {
        ReusableMethods.waitFor(1);
        staffPage.viewButtonFirstPatient.click();
    }

    @Then("US22 verify test results page is visible")
    public void us22_verify_test_results_page_is_visible() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(staffPage.staffTestResultsPageHeader.isDisplayed());
    }

    @Then("US22 user clicks first test's edit button")
    public void us22_user_clicks_first_test_s_edit_button() {
        ReusableMethods.waitFor(1);
        staffPage.EditButtonFirstPatient.click();
    }

    @Then("US22 verify  test result update page is visible")
    public void us22_verify_test_result_update_page_is_visible() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(staffPage.staffUpdateTestResultPageHeader.isDisplayed());
    }

    @Then("US22 user enters a number {string} into result input box")
    public void us22_user_enters_a_number_into_result_input_box(String result) {
        toBeUpdatedResult = result;
        staffPage.staffUpdateTestResultResultInput.clear();
        staffPage.staffUpdateTestResultResultInput.sendKeys(toBeUpdatedResult);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        toBeUpdatedId = js.executeScript("return document.getElementById('c-test-result-id').value").toString();
        //System.out.println(toBeUpdatedId);

    }

    @Then("US22 user click save")
    public void us22_user_click_save() {

        ReusableMethods.waitFor(1);
        staffPage.staffUpdateTestResultSaveButton.click();
    }

    @Then("US22 verify the test result is updated message comes up")
    public void us22_verify_the_test_result_is_updated_message_comes_up() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(staffPage.staffUpdateTestResultSuccessMessage.isDisplayed());
    }

    @Then("US22 verify the test result is updated")
    public void us22_verify_the_test_result_is_updated() {
        List<WebElement> resultsList = staffPage.staffUpdateTestResultUpdatedIdList;

        for (int i = 0; i < resultsList.size(); i++) {
            if (resultsList.get(i).getText().equals(toBeUpdatedId)) {
                index = i + 1;
                break;
            }
        }
        //System.out.println("id" + toBeUpdatedId);
        //System.out.println(resultsList.get(0).getText());
        //System.out.println(index);
        ReusableMethods.waitFor(2);
        String result = Driver.getDriver().findElement(By.xpath("//tbody//tr[" + index + "]//td[3]")).getText();
        //System.out.println(result);

        Assert.assertTrue(toBeUpdatedResult.equals(result));

    }

    @Then("US22 user enters a description {string} into description input box")
    public void us22_user_enters_a_description_into_description_input_box(String description) {
        toBeUpdatedDescription = description;
        staffPage.staffUpdateTestResultDescriptionInput.clear();
        staffPage.staffUpdateTestResultDescriptionInput.sendKeys(toBeUpdatedDescription);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        toBeUpdatedId = js.executeScript("return document.getElementById('c-test-result-id').value").toString();
        System.out.println(toBeUpdatedId);

    }
    @Then("US22 verify the test description is updated message comes up")
    public void us22_verify_the_test_description_is_updated_message_comes_up() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(staffPage.staffUpdateTestResultSuccessMessage.isDisplayed());
    }
    @Then("US22 verify the test description is updated")
    public void us22_verify_the_test_description_is_updated() {
        List<WebElement> resultsList = staffPage.staffUpdateTestResultUpdatedIdList;

        for (int i = 0; i < resultsList.size(); i++) {
            if (resultsList.get(i).getText().equals(toBeUpdatedId)) {
                index = i + 1;
                break;
            }
        }
        System.out.println("des" +toBeUpdatedDescription);
        System.out.println("id" +toBeUpdatedId);
        System.out.println("index" +index);

        ReusableMethods.waitFor(2);
        String description = Driver.getDriver().findElement(By.xpath("//tbody//tr[" + index + "]//td[7]")).getText();
        //System.out.println( description);

        Assert.assertTrue(toBeUpdatedDescription.equals(description));
    }
    @Then("US22 verify test id is visible")
    public void us22_verify_test_id_is_visible() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(staffPage.staffUpdateTestResultIdInput.isDisplayed());
    }
    @Then("US22 verify test id is not updatable")
    public void us22_verify_test_id_is_not_updatable() {
        String isElementHasReadonly = staffPage.staffUpdateTestResultIdInput.getAttribute("readonly");

        boolean isElementUnupdatable = false;
        if(isElementHasReadonly.contains("true")){
            isElementUnupdatable =true;
        }else{
            isElementUnupdatable = false;
        }
        Assert.assertTrue(isElementUnupdatable);

    }

    @Then("US22 verify test date is visible")
    public void us22_verify_test_date_is_visible() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(staffPage.staffUpdateTestResultDateInput.isDisplayed());
    }
    @Then("US22 verify test date is not updatable")
    public void us22_verify_test_date_is_not_updatable() {

        Assert.assertTrue(ReusableMethods.isElementUnupdateable(staffPage.staffUpdateTestResultDateInput));
    }
    @Then("US22 verify test created date is visible")
    public void us22_verify_test_created_date_is_visible() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(staffPage.staffUpdateTestResultCreatedDateInput.isDisplayed());
    }
    @Then("US22 verify test created date is not updatable")
    public void us22_verify_test_created_date_is_not_updatable() {


        Assert.assertTrue(ReusableMethods.isElementUnupdateable(staffPage.staffUpdateTestResultCreatedDateInput));
    }

    @Then("US22 verify test item is visible")
    public void us22_verify_test_item_is_visible() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(staffPage.staffUpdateTestResultItemInput.isDisplayed());
    }
    @Then("US22 verify test item is not updatable")
    public void us22_verify_test_item_is_not_updatable() {
        Assert.assertTrue(ReusableMethods.isElementUnupdateable(staffPage.staffUpdateTestResultItemInput));
    }
    @Then("US22 verify test  is visible")
    public void us22_verify_test_is_visible() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(staffPage.staffUpdateTestResultTestInput.isDisplayed());
    }
    @Then("US22 verify test  is not updatable")
    public void us22_verify_test_is_not_updatable() {
        Assert.assertTrue(ReusableMethods.isElementUnupdateable(staffPage.staffUpdateTestResultTestInput));
    }


    @Then("US22 user closes the browser")
    public void us22_user_closes_the_browser() {
        Driver.closeDriver();
    }

}
