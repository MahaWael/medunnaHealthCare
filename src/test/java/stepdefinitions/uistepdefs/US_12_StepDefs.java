package stepdefinitions.uistepdefs;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.DoctorPage;
import pages.HomePage;
import pages.RegistrationPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import java.util.List;

public class US_12_StepDefs {

    Actions actions=new Actions(Driver.getDriver());
    RegistrationPage registrationPage = new RegistrationPage();
    HomePage homePage = new HomePage();
    DoctorPage doctorPage = new DoctorPage();

    @Given("user clicks sign in button")
    public void user_clicks_sign_in_button() {
        actions.moveToElement(registrationPage.loginIcon).click().build().perform();
        Driver.waitAndClick(homePage.homePageSignInButton);
    }
    @Then("us12 user enters username")
    public void us12_user_enters_username() {
        Driver.waitAndSendText(homePage.homePageUsernameBox, "sudan_dr_ph1");

    }

    @Then("us12 user enters password")
    public void us12_user_enters_password() {
        Driver.waitAndSendText(homePage.homePagePasswordBox, "Abc123def*");
    }

    @Then("us12 staff enters username")
    public void us12_staff_enters_username() {
        Driver.waitAndSendText(homePage.homePageUsernameBox, "team89staff01");

    }

    @Then("us12 staff enters password")
    public void us12_staff_enters_password() {
        Driver.waitAndSendText(homePage.homePagePasswordBox, "team89staff");
    }

    @Then("us12 user clicks on sign in button")
    public void us12_user_clicks_on_sign_in_button() {
        Driver.waitAndClick(homePage.homePageLoginButton);

    }
    @Then("us12 doctor navigates my pages")
    public void us12_doctor_navigates_my_pages() {
        ReusableMethods.waitFor(1);
        actions.moveToElement(doctorPage.doctorMyPagesBox).click().build().perform();
    }
    @Then("us12 doctor clicks on my appointments")
    public void us12_doctor_clicks_on_my_appointments() {

        Driver.waitAndClick(doctorPage.doctorMyAppointmentsBox);

    }
    @When("us12 doctor clicks on edit button")
    public void us12_doctor_clicks_on_edit_button() {
        Driver.waitAndClick(doctorPage.doctorEditButton);

    }
    @Then("us12 doctor clicks on request a test button")
    public void us12_doctor_clicks_on_request_a_test_button() {
        Driver.waitAndClick(doctorPage.doctorRequestTestButton);
        Driver.clickWithJS(doctorPage.doctorRequestTestButton);
        Driver.waitAndClick(doctorPage.doctorRequestTestButton);
        //needs to click 2 times

    }
    @Then("us12 doctor verifies test has {string}")
    public void us12_doctor_verifies_test_has(String test) {


        List<WebElement> tableRows =Driver.getDriver().findElements(By.xpath("//tbody/tr/td[2]"));


        for (int i= 0 ; i<tableRows.size(); i++){
            if (tableRows.get(i).toString().toLowerCase().contains(test)){
                Assert.assertTrue(true);
            }
        }}

    @Then("us12 doctor verifies test request is saved")
    public void us12_doctor_verifies_test_request_is_saved() {
        Driver.wait(1);
        Assert.assertTrue(doctorPage.savedSuccessfullyPopup.isDisplayed());
    }


    @Then("us12 doctor selects listed items and saves")
    public void us12_doctor_selects_listed_items_and_saves() {
        ReusableMethods.waitFor(2);
        //ReusableMethods.selectCheckBox(doctorPage.sodiumCheckBox, true);
        Driver.clickWithJS(doctorPage.sodiumCheckBox);
        ReusableMethods.waitFor(2);

        Driver.clickWithJS(doctorPage.ureaCheckBox);
        ReusableMethods.waitFor(2);

        Driver.clickWithJS(doctorPage.hemoglobinCheckBox);

        ReusableMethods.waitFor(2);
        JSUtils.scrollIntoViewJS(doctorPage.albuminCheckBox);
        ReusableMethods.waitFor(1);
        Driver.clickWithJS(doctorPage.albuminCheckBox);

        ReusableMethods.waitFor(2);
        JSUtils.scrollIntoViewJS(doctorPage.creatinineCheckBox);
        ReusableMethods.waitFor(1);
        Driver.clickWithJS(doctorPage.creatinineCheckBox);

        ReusableMethods.waitFor(2);
        JSUtils.scrollIntoViewJS(doctorPage.potassiumCheckBox);
        ReusableMethods.waitFor(1);
        Driver.clickWithJS(doctorPage.potassiumCheckBox);

        JSUtils.scrollIntoViewJS(doctorPage.saveButton);
        Driver.waitAndClick(doctorPage.saveButton);




    }


}

