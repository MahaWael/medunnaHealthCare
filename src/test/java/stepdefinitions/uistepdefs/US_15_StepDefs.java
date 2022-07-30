package stepdefinitions.uistepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.AdminPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_15_StepDefs {

    HomePage homePage   = new HomePage();
    LoginPage loginPage = new LoginPage();
    AdminPage adminPage = new AdminPage();

    @Given("Admin goes to medunna url")
    public void admin_goes_to_medunna_url() {
        Driver.wait(2);
        Driver.getDriver().get(ConfigReader.getProperty("medunna_login_url"));
    }

    @Then("Admin navigates the sign in page")
    public void admin_navigates_the_sign_in_page() {
        homePage.homepageDropBox.click();
        Driver.waitAndClick(homePage.homePageSignInButton, 1000);
    }

    @Then("Admin sign in")
    public void admin_sign_in() {
        Driver.waitAndSendText(loginPage.username, "team89admin", 1000);
        Driver.waitAndSendText(loginPage.password, "team89admin", 1000);
        Driver.waitAndClick(loginPage.loginButton, 1000);
    }

    @Then("Admin navigates to Items&Titles segment")
    public void admin_navigates_to_items_titles_segment() {
        Driver.waitAndClick(adminPage.ItemsAndTitles);
    }

    @Given("Admin clicks to patients button")
    public void admin_clicks_to_patients_button() {
        Driver.wait(2);
        adminPage.patientInDropdown.click();
        //Select select = new Select(adminPage.ItemsAndTitles);
        //select.selectByIndex(0);
    }

    @Then("Admin clicks on create a new patient")
    public void admin_clicks_on_create_a_new_patient() {
        Driver.waitAndClick(adminPage.AdminPagePatientCreateNewPatient);
    }

    @Then("Admin creats new patients with necessary credentials")
    public void admin_creats_new_patients_with_necessary_credentials() {
        Faker faker = new Faker();
        String firstname;
        firstname = faker.name().firstName();
        String lastname;
        lastname = faker.name().lastName();
        String email;
        email = firstname+lastname+"@gmail.com";
        String phoneNumber;
        phoneNumber = "12333333333";
        String country="USA";
        String city="New York";

        Driver.waitAndSendText(Driver.getDriver().findElement(By.name("firstName")),firstname,1000);
        Driver.waitAndSendText(Driver.getDriver().findElement(By.name("lastName")),lastname,1000);
        Driver.waitAndSendText(Driver.getDriver().findElement(By.name("email")),email,1000);
        Driver.waitAndSendText(Driver.getDriver().findElement(By.name("phone")),phoneNumber,1000);
        Driver.waitAndSendText(Driver.getDriver().findElement(By.name("country.id")),country,1000);
        Driver.waitAndSendText(Driver.getDriver().findElement(By.name("cstate.id")),city,1000);




    }

    @Then("Admin clicks on save button")
    public void admin_clicks_on_save_button() {
        Driver.waitAndClick(Driver.getDriver().findElement(By.xpath("//span[normalize-space()='Save']")));
        Driver.wait(1);
        boolean flag = false;
        if (adminPage.AdminPagePatientPatientVerify.getText().equals("Patients")){
            flag= true;
        }
        Assert.assertTrue(flag);
    }

    @Then("Admin closes the browser for test01")
    public void admin_closes_the_browser_for_test01() {
        Driver.wait(1);
        Driver.getDriver().quit();
    }

    @Then("Admin clicks on patients ID")
    public void admin_clicks_on_patients_id() {
        Driver.wait(1);
        adminPage.AdminPagePatientPatientID.click();
    }

    @Then("Admin verify all necessary credential")
    public void admin_verify_all_necessary_credential() {
        Driver.wait(2);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/dl[1]/dd[1]")).isDisplayed());
        Driver.wait(2);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/dl[1]/dd[2]")).isDisplayed());
    }

    @Then("Admin closes the browser for test02")
    public void admin_closes_the_browser_for_test02() {
        Driver.wait(1);
        Driver.getDriver().quit();
    }

    @Given("Admin clickcs to appointment button")
    public void admin_clickcs_to_appointment_button() {
        Driver.wait(1);
        adminPage.appointmentsInDropdown.click();
    }

    @Given("Admin  clicks on patient's ID")
    public void admin_clicks_on_patient_s_id() {
        Driver.wait(2);
        Driver.waitAndClick(Driver.getDriver().findElement(By.xpath("//a[normalize-space()='2301']")),1000);
    }

    @Then("Admin clicks on edit button")
    public void admin_clicks_on_edit_button() {
        Driver.waitAndClick(Driver.getDriver().findElement(By.xpath("//a[@class='btn btn-primary']")),1000);
    }

    @Then("Admin try to assign doctor for patient")
    public void admin_try_to_assign_doctor_for_patient() {
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//select[@id='appointment-physician']")).isSelected());
    }
    //..
    @Then("Admin closes the browser for test03")
    public void admin_closes_the_browser_for_test03() {
        Driver.wait(1);
        Driver.getDriver().quit();
    }

    @Given("Admin clickcs to patients button")
    public void admin_clickcs_to_patients_button() {
        Driver.wait(2);
        adminPage.patientInDropdown.click();
    }

    @Then("Admin control patient's state or blank")
    public void admin_control_patient_s_state_or_blank() {
        Driver.wait(2);
        boolean flag = false;
        if (Driver.getDriver().findElement(By.xpath("//tbody/tr[1]/td[15]")).getText() != null){
            flag=true;
        }
        Assert.assertTrue(flag);
    }

    @Then("Admin verify patient's country is US and can not be blank")
    public void admin_verify_patient_s_country_is_us_and_can_not_be_blank() {
        boolean flag = false;
        if (Driver.getDriver().findElement(By.xpath("//tbody/tr[1]/td[14]")).getText() == "US" && Driver.getDriver().findElement(By.xpath("//tbody/tr[1]/td[15]")).getText() != null){
            flag=true;
        }
        Assert.assertTrue(flag);
    }

    @Then("Admin closes the browser for test04")
    public void admin_closes_the_browser_for_test04() {
        Driver.wait(1);
        Driver.getDriver().quit();
    }

}
