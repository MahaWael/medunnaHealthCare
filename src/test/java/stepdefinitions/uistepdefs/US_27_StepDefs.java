
package stepdefinitions.uistepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_27_StepDefs {
    HomePage homePage = new HomePage();

    @Given("USTwentySeven The admin user goes to Medunna Url")
    public void us_twenty_seven_the_admin_user_goes_to_medunna_url() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));
    }

    @Given("USTwentySeven The admin clicks on the dropdown button")
    public void us_twenty_seven_the_admin_clicks_on_the_dropdown_button() {
        Driver.waitAndClick(homePage.homepageDropBox);
    }

    @Given("USTwentySeven The admin chooses Sign in option")
    public void us_twenty_seven_the_admin_chooses_sign_in_option() {
        Driver.waitAndClick(homePage.homePageSignInButton);

    }

    @Then("USTwentySeven The user verifies that sign in page appears")
    public void us_twenty_seven_the_user_verifies_that_sign_in_page_appears() {
        Driver.waitForVisibility(homePage.loginSignInText, 1);
    }

    @Then("USTwentySeven The user fills username and password boxes")
    public void us_twenty_seven_the_user_fills_username_and_password_boxes() {
        Driver.waitAndSendText(homePage.loginUserName, "team89admin");
        Driver.waitAndSendText(homePage.loginPassword, "team89admin");
    }

    @Then("USTwentySeven The user admin clicks on the sign in button")
    public void us_twenty_seven_the_user_admin_clicks_on_the_sign_in_button() {
        Driver.waitAndClick(homePage.loginSignInButton, 1);
    }

    @When("USTwentySeven The user admin clicks on the items&titles dropdown button")
    public void us_twenty_seven_the_user_admin_clicks_on_the_items_titles_dropdown_button() {
        homePage.adminItemsAndTitlesDropBox.click();

    }

    @When("USTwentySeven The user admin clicks on the Messages")
    public void us_twenty_seven_the_user_admin_clicks_on_the_messages() {
        homePage.adminMessagesTitle.click();
    }

    @Then("USTwentySeven The admin user verifies the page title")
    public void us_twenty_seven_the_admin_user_verifies_the_page_title() {
        Assert.assertEquals(Driver.getDriver().getTitle(), "MEDUNNA");
    }

    @Then("USTwentySeven The admin clicks on create a new message button")
    public void us_twenty_seven_the_admin_clicks_on_create_a_new_message_button() {
        Driver.waitAndClick(homePage.messagesMainPageCreateANewMessageButton);
    }

    @Then("USTwentySeven The admin user verifies the create or edit a message page appears")
    public void us_twenty_seven_the_admin_user_verifies_the_create_or_edit_a_message_page_appears() {
        Driver.waitForVisibility(homePage.messagesDefaultPageCreateOrEditMessageTitle, 1);
    }

    @Then("USTwentySeven The admin user enters info to {string} {string} {string} {string} boxes")
    public void us_twenty_seven_the_admin_user_enters_info_to_boxes(String name, String email, String subject, String message) {
        Driver.waitAndSendText(homePage.messagesDefaultPageCreateOrEditNameBox, name);
        Driver.waitAndSendText(homePage.messagesDefaultPageCreateOrEditEmailBox, email);
        Driver.waitAndSendText(homePage.messagesDefaultPageCreateOrEditSubjectBox, subject);
        Driver.waitAndSendText(homePage.messagesDefaultPageCreateOrEditMessageBox, message);
    }

    @Then("USTwentySeven The admin user clicks on save button")
    public void us_twenty_seven_the_admin_user_clicks_on_save_button() {
        Driver.waitAndClick(homePage.messagesDefaultPageCreateOrEditSaveButton);

    }

    @Then("USTwentySeven The admin user verifies the success message")
    public void us_twenty_seven_the_admin_user_verifies_the_success_message() {
        Driver.waitForVisibility(homePage.messagesDefaultPageCreateOrEditSuccessMessage, 1);

    }

    @Then("USTwentySeven The admin user close the driver")
    public void us_twenty_seven_the_admin_user_close_the_driver() {
        Driver.closeDriver();

    }

    //2nd Case
    @Then("USTwentySeven The admin user verifies the name field message")
    public void us_twenty_seven_the_admin_user_verifies_the_name_field_message() {
        Driver.waitForVisibility(homePage.messagesDefaultPageNameBoxErrorMessage, 1);
    }

    //3rd Case
    @Then("USTwentySeven The admin user verifies the email field message")
    public void us_twenty_seven_the_admin_user_verifies_the_email_field_message() {
        Driver.waitForVisibility(homePage.messagesDefaultPageEmailBoxErrorMessage, 1);
    }

    //4th Case
    @Then("USTwentySeven The admin user verifies the subject field message")
    public void us_twenty_seven_the_admin_user_verifies_the_subject_field_message() {
        Driver.waitForVisibility(homePage.messagesDefaultPageSubjectBoxErrorMessage, 1);
    }

    //5TH Case
    @Then("US27 The admin clicks on the message Id")
    public void us27_the_admin_clicks_on_the_message_id() throws InterruptedException {
        Driver.waitAndClick(homePage.messagesMainPageId);

//        scrollDownByJS();
//        Thread.sleep(5000);
//                clickElementByJS(homePage.messagesMainPageId);

    }

    @Then("US27 The admin clicks on edit button")
    public void us27_the_admin_clicks_on_edit_button() {
        Driver.waitAndClick(homePage.messagesIdPageEditButton, 1);
    }

    @Then("US27 The admin user verifies the messages page")
    public void us27_the_admin_user_verifies_the_messages_page() {
        Assert.assertTrue(homePage.messagesDefaultPageCreateOrEditMessageTitle.isDisplayed());
    }

    @Then("US27 The admin clears and write the name box as Vehbi")
    public void us27_the_admin_clears_and_write_the_name_box_as_vehbi() {
        // Driver.waitAndSendText(homePage.messagesDefaultPageCreateOrEditIdBox,"71941");
        Driver.getDriver().findElement(By.xpath("//input[@name='name']")).clear();
        Driver.waitAndSendText(homePage.messagesDefaultPageCreateOrEditNameBox, "AHMED");
    }

    @Then("US27 The admin user verifies the success message")
    public void us27_the_admin_user_verifies_the_success_message() {

        Driver.waitAndClick(homePage.messagesDefaultPageCreateOrEditSaveButton);
        Assert.assertTrue(homePage.messagesDefaultPageCreateOrEditSuccessMessage.isDisplayed());
    }

    //7th Case
    @Then("US27 The admin clears and write the email box")
    public void us27_the_admin_clears_and_write_the_email_box() {
        Driver.getDriver().findElement(By.xpath("//input[@name='email']")).clear();
        Driver.waitAndSendText(homePage.messagesDefaultPageCreateOrEditEmailBox, "vehbi@gmail.com");
    }

    //8th Case
    @Then("US27 The admin clears and write the email box as Vehbi")
    public void us27_the_admin_clears_and_write_the_email_box_as_vehbi() {
        Driver.getDriver().findElement(By.xpath("//input[@name='email']")).clear();
        Driver.waitAndSendText(homePage.messagesDefaultPageCreateOrEditEmailBox, "Vehbi");
    }

    @Then("US27 The admin user verifies the warning message")
    public void us27_the_admin_user_verifies_the_warning_message() {
        Assert.assertTrue(homePage.messagesDefaultPageCreateOrEditInvalidEmailMessage.isDisplayed());
    }

    //9th Case
    @Then("US27 The admin clears and write the subject box")
    public void us27_the_admin_clears_and_write_the_subject_box() {
        Driver.getDriver().findElement(By.xpath("//input[@name='subject']")).clear();
        Driver.waitAndSendText(homePage.messagesDefaultPageCreateOrEditSubjectBox, "cleanless");
    }

    //10th Case
    @Then("US27 The admin clears and write the message box")
    public void us27_the_admin_clears_and_write_the_message_box() {
        Driver.getDriver().findElement(By.xpath("//input[@name='message']")).clear();
        Driver.waitAndSendText(homePage.messagesDefaultPageCreateOrEditMessageBox, "pls check");
    }

    //11th Case
    @Then("US27 The admin clicks on the delete button of the corresponding message")
    public void us27_the_admin_clicks_on_the_delete_button_of_the_corresponding_message() {
        Driver.waitAndClick(homePage.messagesPageDeleteButton);
    }

    @Then("US27 The admin clicks on delete button on the pop-up message")
    public void us27_the_admin_clicks_on_delete_button_on_the_pop_up_message() {
//        Alert alert=Driver.getDriver().switchTo().alert();
//        alert.accept();
        Driver.waitAndClick(homePage.messagesPopUpDeleteMessage);
        System.out.println("PRINT");
    }

    @Then("US27 The admin verifies that deleted Id is not visible anymore s")
    public void us27_the_admin_verifies_that_deleted_id_is_not_visible_anymore_s() {
        Assert.assertEquals("A Message is deleted with identifier 71949", homePage.messageDeletedSuccessMessage.getText());
    }

    //12TH Case
    @Then("US27 The admin verifies the name, email, subject and messages titles are visible")
    public void us27_the_admin_verifies_the_name_email_subject_and_messages_titles_are_visible() {
        Assert.assertTrue(homePage.messagesMainPageEmail.isDisplayed());
        Assert.assertTrue(homePage.messagesMainPageName.isDisplayed());
        Assert.assertTrue(homePage.messagesMainPageSubject.isDisplayed());
        Assert.assertTrue(homePage.messagesMainPageMessage.isDisplayed());

    }
}
