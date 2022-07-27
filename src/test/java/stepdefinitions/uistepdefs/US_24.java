package stepdefinitions.uistepdefs;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.DoctorPage;
import pages.HomePage;
import pages.LoginPage;
import pages.PatientPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_24 {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    DoctorPage doctorPage = new DoctorPage();
    PatientPage patientPage = new PatientPage();


    @Given("US24 patient goes to medunna url")
    public void us24_patient_goes_to_medunna_url() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_login_url"));
    }

    @Then("US24 patient sign in")
    public void us24_patient_sign_in() {
        homePage.homepageDropBox.click();
        Driver.waitAndClick(homePage.homePageSignInButton, 1000);

        Driver.waitAndSendText(loginPage.username, "team89patient06", 1000);
        Driver.waitAndSendText(loginPage.password, "patient06", 1000);
        Driver.waitAndClick(loginPage.loginButton, 1000);
    }

    @Then("US24 patient clicks to my pages dropdown")
    public void us24_patient_clicks_to_my_pages_dropdown() {

        Driver.waitAndClick(patientPage.myPagesPatient,1000);

    }

    @Then("US24 patient clicks to my appointment")
    public void us24_patient_clicks_to_my_appointment() {
        Driver.waitAndClick(patientPage.myAppointments,1000);
    }

    @Given("US24_TC001 patient controls test date and description")
    public void us24_tc001_patient_controls_test_date_and_description() {
        Driver.wait(1);
        String actualResult = patientPage.myAppointmentCreatedDate.getText();
        Assert.assertEquals("19/07/22 13:15",actualResult);


    }

    @Then("US24_TC001 patient controls test min and max values")
    public void us24_tc001_patient_controls_test_min_and_max_values() {
        Driver.waitAndClick(patientPage.myAppointmentShowTests,1000);
        Driver.waitAndClick(patientPage.myAppointmentViewResults,1000);

        Driver.wait(1);
        Assert.assertEquals("136",patientPage.myAppointmentDefaultMin.getText());
        Driver.wait(1);
        Assert.assertEquals("145",patientPage.myAppointmentDefaultMax.getText());
        Driver.wait(2);
        Driver.closeDriver();

    }

    @Given("US24_TC002 patient opens the invoice")
    public void us24_tc002_patient_opens_the_invoice() {

        Driver.waitAndClick(patientPage.myAppointmentShowInvoice);

    }

    @Then("US24_TC002 patient verifies the invoice")
    public void us24_tc002_patient_verifies_the_invoice() {

        String actualResult = patientPage.invoiceVerify.getText();
        Driver.wait(1);
        Assert.assertEquals("INVOICE",actualResult);

    }
}
