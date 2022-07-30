package stepdefinitions.uistepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.RegistrationPage;
import pojos.Registrant;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TxtWriter;

public class US_02_StepDefs {
    Actions actions=new Actions(Driver.getDriver());
    RegistrationPage registrationPage = new RegistrationPage();
    Registrant registrant = new Registrant();
    Faker faker=new Faker();


    @Given("user goes to base url")
    public void user_goes_to_base_url() {Driver.getDriver().get(ConfigReader.getProperty("medunna_login_url"));
    }
    @Given("user clicks register button")
    public void user_clicks_register_button() {
        actions.moveToElement(registrationPage.loginIcon).click().build().perform();
        ReusableMethods.waitForClickablility(registrationPage.registerButton, 2).click();
    }

    @Given("us02 user enters SSN {string}")
    public void us02_user_enters_ssn(String SSN) {
        SSN = faker.idNumber().ssnValid();
        Driver.waitAndSendText(registrationPage.registrationSsnNumberBox, SSN);
        registrant.setSsn(SSN);
    }

    @Given("us02 user enters first name {string}")
    public void us02_user_enters_first_name(String firstName) {
        firstName= faker.name().firstName();
        Driver.waitAndSendText(registrationPage.registrationFirstNameBox, firstName);
        registrant.setFirstName(firstName);
    }

    @Given("us02 user enters last name {string}")
    public void us02_user_enters_last_name(String lastName) {
        lastName= faker.name().lastName();
        Driver.waitAndSendText(registrationPage.registrationLastNameBox, lastName);
        registrant.setLastName(lastName);
    }

    @Given("us02 user enters username {string}")
    public void us02_user_enters_username(String userName) {
        Driver.waitAndSendText(registrationPage.registrationUserNameBox, userName);
    }

    @Given("us02 user enters username with faker {string}")
    public void us02_user_enters_username_with_faker(String userName) {
        userName= registrant.getFirstName().toLowerCase() + registrant.getLastName().toLowerCase();
        Driver.waitAndSendText(registrationPage.registrationUserNameBox, userName);
        registrant.setLogin(userName);
    }

    @Given("us02 user enters email {string}")
    public void us02_user_enters_email(String email) {
        Driver.waitAndSendText(registrationPage.registrationEmailBox,email);
    }

    @Given("us02 user enters email with faker {string}")
    public void us02_user_enters_email_with_faker(String email) {
        email= registrant.getLogin()+"@gmail.com";
        Driver.waitAndSendText(registrationPage.registrationEmailBox,email);
        registrant.setEmail(email);
    }

    @Given("us02 user enters password {string}")
    public void us02_user_enters_password(String password) {
        password=faker.internet().password(8, 20, true,true);
        Driver.waitAndSendText(registrationPage.registrationPasswordBox, password);
        registrant.setPassword(password);
    }

    @Given("us02 user clicks register")
    public void us02_user_clicks_register() {
        Driver.waitAndClick(registrationPage.registrationRegisterButton, 2);
    }

    @Then("us02 verify registration created succesfully pop up")
    public void us02_verify_registration_created_succesfully_pop_up() {
        Assert.assertTrue(registrationPage.registrationSavedMessage.isDisplayed());
    }

    @Given("us02 user types in their password confirmation as {string}")
    public void us02_user_types_in_their_password_confirmation_as(String passwordconfirm) {
        passwordconfirm = registrant.getPassword();
        Driver.waitAndSendText(registrationPage.registrationNewPasswordConfirmationBox, passwordconfirm);
    }

    @Then("us02 user registers and saves the records")
    public void us02_user_registers_and_saves_the_records() {
        Driver.waitAndClick(registrationPage.registrationRegisterButton);
        Driver.sleep(1000);
        Assert.assertTrue(registrationPage.registrationSavedMessage.isDisplayed());
        TxtWriter.saveUIRegistrantData(registrant);
    }

    @Given("us02 user clicks on the username box without sending data")
    public void us02_user_clicks_on_the_username_box_without_sending_data() {
        actions.moveToElement(registrationPage.registrationUserNameBox).click().build().perform();
    }

    @Given("us02 user clicks on the firstname box")
    public void us02_user_clicks_on_the_firstname_box() {
        actions.moveToElement(registrationPage.registrationFirstNameBox).click().build().perform();
    }

    @Given("us02 user verifies getting name warning message")
    public void us02_user_verifies_getting_name_warning_message() {
        Assert.assertTrue(registrationPage.registrationUserNameWarningMessage.isDisplayed());
    }

    @Given("us02 user verifies getting email warning message")
    public void us02_user_verifies_getting_email_warning_message() {

        Assert.assertTrue(registrationPage.registrationInvalidEmailWarningMessage.isDisplayed());
    }


    @Given("us02 user verifies getting email required message")
    public void us02_user_verifies_getting_email_required_message() {
        Assert.assertTrue(registrationPage.registrationEmailWarningMessage.isDisplayed());
    }


    @Given("us02 user verifies getting username warning message")
    public void us02_user_verifies_getting_username_warning_message() {
        Assert.assertTrue(registrationPage.registrationInvalidUserNameWarningMessage.isDisplayed());
    }

    @Given("us02 user clicks on the email box without sending data")
    public void us02_user_clicks_on_the_email_box_without_sending_data() {
        actions.moveToElement(registrationPage.registrationEmailBox).click().build().perform();
    }



}