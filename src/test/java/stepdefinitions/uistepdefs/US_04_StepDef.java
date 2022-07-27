package stepdefinitions.uistepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.SignInPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_04_StepDef {
    SignInPage signInPage = new SignInPage();

    @Given("US04 Navigate to Medunna page")
    public void US04_navigate_to_medunna_page() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_login_url"));
    }

    @Then("US04 Verify that home page is visible successfully")
    public void US04_verify_that_home_page_is_visible_successfully() {
        String url = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(ConfigReader.getProperty("medunna_login_url"), url);
    }

    @Then("US04 Click on Sign in button")
    public void US04_click_on_sign_in_button() {
        signInPage.dropdown.click();
        signInPage.SignInDropdown.click();
    }

    @Then("US04 Verify Sign in page is visible succesfully")
    public void US04_verify_sign_in_page_is_visible_succesfully() {

        String loginPageUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(ConfigReader.getProperty("login_page_url"), loginPageUrl);
    }

    @Then("US04 Enter a valid username {string}")
    public void US04_enter_a_valid_username(String username) {
        signInPage.username.sendKeys(username);
    }

    @Then("US04 Enter a valid password {string}")
    public void US04_enter_a_valid_password(String password) {
        signInPage.password.sendKeys(password);
    }

    @Then("US04 Click Sign in button")
    public void US04_click_sign_in_button() {
        signInPage.signInButton.click();
    }

    @Then("US04 Verify the message that user has logined succesfully")
    public void US04_verify_the_message_that_user_has_logined_succesfully() {
        ReusableMethods.waitForVisibility(signInPage.loginSuccessMessageToastify,2);
        Assert.assertTrue(signInPage.loginSuccessMessageToastify.isDisplayed());
    }

    @Then("US04 Verify that first name and last name of user are visible")
    public void US04_verify_that_first_name_and_last_name_of_user_are_visible() {
        String username = signInPage.userNameText.getText();
        Assert.assertEquals("Admin Team89", username);
    }

    @Then("US04 Enter a invalid username {string}")
    public void US04_enter_a_invalid_username(String invalidUsername) {
        signInPage.username.sendKeys(invalidUsername);
    }

    @Then("US04 Verify  the message -Authentication information not correct.-  is visible")
    public void US04_verify_the_message_authentication_information_not_correct_is_visible() {
        ReusableMethods.waitForVisibility(signInPage.unsuccessfulMessage, 2);
        ReusableMethods.waitForVisibility(signInPage.unsuccessfulMessageToastify, 2);

        Assert.assertTrue(signInPage.unsuccessfulMessage.isDisplayed());
        Assert.assertTrue(signInPage.unsuccessfulMessageToastify.isDisplayed());

    }

    @Then("US04 Verify that user could not login")
    public void US04_verify_that_user_could_not_login() {
        String loginPageUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(ConfigReader.getProperty("login_page_url"), loginPageUrl);
    }

    @Then("US04 Enter a invalid password {string}")
    public void US04_enter_a_invalid_password(String invalidPassword) {
        signInPage.password.sendKeys(invalidPassword);
    }

    @Then("US04 Verify the message -Password cannot be empty!-  is visible")
    public void US04_verify_the_message_password_cannot_be_empty_is_visible() {
        ReusableMethods.waitForVisibility(signInPage.invalidFeedbackPassword,2);
        Assert.assertTrue(signInPage.invalidFeedbackPassword.isDisplayed());
    }
    @Then("US04 Verify the message password -does not meet min-max size requirements!- is visible")
    public void US04_verify_the_message_password_does_not_meet_min_max_size_requirements_is_visible() {
        ReusableMethods.waitForVisibility(signInPage.sizeReqMessagePassword,2);
        Assert.assertTrue(signInPage.sizeReqMessagePassword.isDisplayed());
    }
    @Then("US04 Verify the message -Username cannot be empty!-  is visible")
    public void US04_verify_the_message_username_cannot_be_empty_is_visible() {
        ReusableMethods.waitForVisibility(signInPage.invalidFeedbackUserName,2);
        Assert.assertTrue(signInPage.invalidFeedbackUserName.isDisplayed());

    }
    @Then("US04 Verify the message username -does not meet min-max size requirements!- is visible")
    public void US04_verify_the_message_username_does_not_meet_min_max_size_requirements_is_visible() {
        ReusableMethods.waitForVisibility(signInPage.sizeReqMessageUsername,2);
        Assert.assertTrue(signInPage.sizeReqMessageUsername.isDisplayed());
    }
    @Then("US04 Verify 'Remember me\" text and checkbox are visible")
    public void US04_verify_remember_me_text_and_checkbox_are_visible() {
        ReusableMethods.waitForVisibility(signInPage.rememberMe,2);
        Assert.assertTrue(signInPage.rememberMe.isDisplayed());
    }
    @Then("US04 Click the checkbox")
    public void US04_click_the_checkbox() {
        signInPage.checkbox.click();
    }
    @Then("US04 Verify checkbox is checked")
    public void US04_verify_checkbox_is_checked( ) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        ReusableMethods.waitFor(2);
        Object checkboxJsValue = js.executeScript("return document.getElementById('rememberMe').value");
        System.out.println(checkboxJsValue.toString());
        Assert.assertEquals("true",checkboxJsValue.toString());
    }
    @Then("US04 Click the check box")
    public void US04_click_the_check_box() {
        signInPage.checkbox.click();
    }
    @Then("US04 Verify the checkbox unchecked")
    public void US04_verify_the_checkbox_unchecked() {
        Assert.assertFalse(signInPage.checkbox.isSelected());
    }
    @Then("US04 Verify -Did you forget your password- link is visible succesfully")
    public void US04_verify_did_you_forget_your_password_link_is_visible_succesfully() {
        ReusableMethods.waitForVisibility(signInPage.passResetReqLink,2);
        Assert.assertTrue(signInPage.passResetReqLink.isDisplayed());
    }
    @Then("US04 Click the -Did you forget your password-  link")
    public void US04_click_the_did_you_forget_your_password_link() {
        signInPage.passResetReqLink.click();
    }
    @Then("US04 Verify user is  navigated to password resetting page")
    public void US04_verify_user_is_navigated_to_password_resetting_page() {
        String passResetRequestPageUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(ConfigReader.getProperty("pass_reset_request_page_url"), passResetRequestPageUrl);
    }
    @Then("US04 Verify -Reset your password- page is visible succesfully")
    public void US04_verify_reset_your_password_page_is_visible_succesfully() {
        ReusableMethods.waitForVisibility(signInPage.resetYourPasswordText,2);
        Assert.assertTrue(signInPage.resetYourPasswordText.isDisplayed());
    }
    @Then("US04 Verify -You don't have an account yet?- text is visible succesfully")
    public void US04_verify_you_don_t_have_an_account_yet_text_is_visible_succesfully() {
        ReusableMethods.waitForVisibility(signInPage.dontHaveAnAccountText,2);
        Assert.assertTrue(signInPage.dontHaveAnAccountText.isDisplayed());
    }
    @Then("US04 Verify -Register a new account- link is visible succesfully")
    public void US04_verify_register_a_new_account_link_is_visible_succesfully() {
        ReusableMethods.waitForVisibility(signInPage.registerANewAccountLink,2);
        Assert.assertTrue(signInPage.registerANewAccountLink.isDisplayed());
    }
    @Then("US04 Click the -Register a new account-  link")
    public void US04_click_the_register_a_new_account_link() {
        signInPage.registerANewAccountLink.click();
    }
    @Then("US04 Verify user is  navigated to registration page")
    public void US04_verify_user_is_navigated_to_registration_page() {
        ReusableMethods.waitFor(2);
        String registerAccountUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(ConfigReader.getProperty("medunna_registration_url"),registerAccountUrl);
    }
    @Then("US04 Verify {string} page is visible succesfully")
    public void US04_verify_page_is_visible_succesfully(String string) {
        Assert.assertTrue(signInPage.registrationText.isDisplayed());
    }
    @Then("US04 Verify Cancel button is visible succesfully")
    public void US04_verify_cancel_button_is_visible_succesfully() {
        ReusableMethods.waitForVisibility(signInPage.cancelBtn,2);
        Assert.assertTrue(signInPage.cancelBtn.isDisplayed());
    }
    @Then("US04 Click the Cancel  button")
    public void US04_click_the_cancel_button() {
        signInPage.cancelBtn.click();
    }
    @Then("US04 Verify login page is closed-nonvisible")
    public void US04_verify_login_page_is_closed_nonvisible() {
        Assert.assertTrue(signInPage.SigInText.size() == 0);
    }
    @Then("US04 Home page is visible succesfully")
    public void US04_home_page_is_visible_succesfully() {
        String homePageUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(ConfigReader.getProperty("home_page_url"), homePageUrl);
    }

    @And("US04 Close the browser")
    public void US04_closeTheBrowser() {
        Driver.closeDriver();
    }
}
