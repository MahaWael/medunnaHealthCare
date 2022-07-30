package stepdefinitions.uistepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.DoctorPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_10_StepDefs {


    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    DoctorPage doctorPage = new DoctorPage();


    @Given("Doctor goes to medunna url")
    public void doctor_goes_to_medunna_url() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_login_url"));
    }

    @Then("Doctor navigates the sign in page")
    public void doctor_navigates_the_sign_in_page() {
        homePage.homepageDropBox.click();
        Driver.waitAndClick(homePage.homePageSignInButton, 1000);
    }

    @Then("Doctor sign in")
    public void doctor_sign_in() {
        Driver.waitAndSendText(loginPage.username, "sudan_dr_ph1", 1000);
        Driver.waitAndSendText(loginPage.password, "Abc123def*", 1000);
        Driver.waitAndClick(loginPage.loginButton, 1000);
    }

    @Then("Doctor navigates to My Pages segment")
    public void doctor_navigates_to_my_pages_segment() {
        Driver.waitAndClick(doctorPage.doctorPageMyPagesDropBox, 1000);
    }

    @Then("Doctor clicks on My appointments")
    public void doctor_clicks_on_my_appointments() {
        Driver.waitAndClick(doctorPage.doctorPagesMyAppointments, 1000);
    }


    @Given("Doctor verify appointment list and time slot are present")
    public void doctor_verify_appointment_list_and_time_slot_are_present() {

        Driver.wait(2);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//tbody/tr)[1]")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//input[@id='fromDate']")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//span[normalize-space()='07/07/22 01:00']")).isDisplayed());
    }

    @Given("Doctor closes the browser for test01")
    public void doctor_closes_the_browser_for_test01() {
        Driver.wait(1);
        Driver.getDriver().quit();
    }


    @Given("Doctor clicks on Edit button")
    public void doctor_clicks_on_edit_button() {

        Driver.waitAndClick(doctorPage.doctorPageAppointmentsFirstEditButton, 1000);

    }

    @Given("Doctor verifies patient's info id, start and end date, status, physician and patient are present")
    public void doctor_verifies_patient_s_info_id_start_and_end_date_status_physician_and_patient_are_present() {


        Driver.wait(1);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//input[@id='appointment-id']")).isDisplayed());
        Driver.wait(1);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//input[@id='appointment-startDate']")).isDisplayed());
        Driver.wait(1);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//input[@id='appointment-endDate']")).isDisplayed());
        Driver.wait(1);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//select[@id='appointment-status']")).isDisplayed());
        Driver.wait(1);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//select[@id='appointment-physician']")).isDisplayed());

    }

    @Given("Doctor closes the browser for test02")
    public void doctor_closes_the_browser_for_test02() {

        Driver.wait(1);
        Driver.getDriver().quit();
    }


}