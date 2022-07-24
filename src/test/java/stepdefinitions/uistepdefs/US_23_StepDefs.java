package stepdefinitions.uistepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.StaffPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_23_StepDefs {

    HomePage homePage = new HomePage();
    StaffPage staffPage = new StaffPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);

    @Given("us23 staff goes to medunna url")
    public void us23_staff_goes_to_medunna_url() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_login_url"));
    }

    @Given("us23 staff signs in")
    public void us23_staff_signs_in() {
        homePage.login(ConfigReader.getProperty("staff_username"),ConfigReader.getProperty("staff_password"));
    }
    @Given("us23 staff clicks to My pages button")
    public void us23_staff_clicks_to_my_pages_button() throws InterruptedException {
        Driver.waitAndClick(staffPage.buttonMyPages,5);
        Thread.sleep(1000);
    }
    @Given("us23 staff clicks to Search Patient button")
    public void us23_staff_clicks_to_search_patient_button() throws InterruptedException {
        Driver.waitAndClick(staffPage.searchPatient,5);
        Thread.sleep(1000);
    }
    @When("us23 staff enter user SSN in the SSN searchBox")
    public void us23_staff_enter_user_ssn_in_the_ssn_search_box() throws InterruptedException {
        Driver.waitAndSendText(staffPage.patientSSNVerify,"890-01-",5);
        Thread.sleep(7000);
    }
    @When("us23 staff clicks show appointments button")
    public void us23_staff_clicks_show_appointments_button() {
        Driver.waitAndClick(staffPage.showAppointmentFirstPatient,5);
    }
    @Then("us23 staff verifies that there is a button as Payment\\/ Invocie Process for the completed tests")
    public void us23_staff_verifies_that_there_is_a_button_as_payment_invocie_process_for_the_completed_tests() {
        Assert.assertTrue(Driver.waitForVisibility(staffPage.paymentInfoButton,5).isDisplayed());
    }
    @When("us23 staff clicks on Payment\\/ Invocie Process button")
    public void us23_staff_clicks_on_payment_invocie_process_button() {
        Driver.waitAndClick(staffPage.paymentInfoButton,5);
    }
    @Then("us23 staff verifies that exam fee and total fee and test item fees exist in this page")
    public void us23_staff_verifies_that_exam_fee_and_total_fee_and_test_item_fees_exist_in_this_page() {
        Assert.assertTrue(Driver.waitForVisibility(staffPage.paymentInfoPageExamFeeAmount,5).isDisplayed());
        Assert.assertTrue(Driver.waitForVisibility(staffPage.paymentInfoPageTestItemAmount1,5).isDisplayed());
        Assert.assertTrue(Driver.waitForVisibility(staffPage.paymentInfoPageTestItemAmount2,5).isDisplayed());
        Assert.assertTrue(Driver.waitForVisibility(staffPage.paymentInfoPageTestItemAmount3,5).isDisplayed());
        Assert.assertTrue(Driver.waitForVisibility(staffPage.paymentInfoPageTestItemAmount4,5).isDisplayed());
        Assert.assertTrue(Driver.waitForVisibility(staffPage.paymentInfoPageTestItemAmount5,5).isDisplayed());
        Assert.assertTrue(Driver.waitForVisibility(staffPage.paymentInfoPageTotalAmount,5).isDisplayed());


    }
    @When("us23 staff clicks on create invoice Button")
    public void us23_staff_clicks_on_create_invoice_button() {
        Driver.waitAndClick(staffPage.paymentInfoPageCreateInvoiceButton,5);
    }
    @When("us23 staff clicks on create Button")
    public void us23_staff_clicks_on_create_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("us23 verify that staff can view the invoice")
    public void us23_verify_that_staff_can_view_the_invoice() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
