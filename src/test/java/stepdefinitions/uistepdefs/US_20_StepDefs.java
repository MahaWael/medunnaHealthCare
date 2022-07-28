package stepdefinitions.uistepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.AdminPage;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_20_StepDefs {
    HomePage homePage = new HomePage();
    AdminPage adminPage = new AdminPage();

    @Given("us20 admin goes to medunna url")
    public void us20_admin_goes_to_medunna_url() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_login_url"));
    }

    @When("us20 admin signs in")
    public void us20_admin_signs_in() {
        homePage.login(ConfigReader.getProperty("admin_username"),ConfigReader.getProperty("admin_password"));
    }
    @When("us20 admin clicks to Administration button")
    public void us20_admin_clicks_to_administration_button() throws InterruptedException {
        Driver.waitAndClick(adminPage.administrationButton,5);
        Thread.sleep(1000);
    }
    @When("us20 admin clicks to User Management button")
    public void us20_admin_clicks_to_user_management_button() {
        Driver.waitAndClick(adminPage.userManagmentButtonUnderAdminidtrstion,5);
    }
    @Given("us20 admin clicks on view button that is for registered user")
    public void us20_admin_click_on_view_button_that_is_for_registered_user() throws InterruptedException {
        Thread.sleep(2000);
        if(adminPage.lastPageInUserManagementPage.isEnabled())
            Driver.waitAndClick(adminPage.lastPageInUserManagementPage,5);
        int counter = 0;
        while(counter==0) {
            for (WebElement e : adminPage.team89userIDText) {
                Thread.sleep(1500);
                System.out.println(e.getText());
                if (e.getText().equals("140693")) {

                    counter++;
                }
                if(counter==0){
                    Driver.waitAndClick(adminPage.previousPageInUserManagementPage,5);
                }
            }

        }
        Driver.waitAndClick(adminPage.team89userViewButton,5);

    }
    @Then("us20 verify that All registered user info can be viewed by admin")
    public void us20_verify_that_all_registered_user_info_can_be_viewed_by_admin() {
        Assert.assertTrue(Driver.waitForVisibility(adminPage.loginTextInUserViewPage,5).isDisplayed());
        Assert.assertTrue(Driver.waitForVisibility(adminPage.firstNameTextInUserViewPage,5).isDisplayed());
        Assert.assertTrue(Driver.waitForVisibility(adminPage.lastNameTextInUserViewPage,5).isDisplayed());
        Assert.assertTrue(Driver.waitForVisibility(adminPage.eMailTextInUserViewPage,5).isDisplayed());
        Assert.assertTrue(Driver.waitForVisibility(adminPage.modifiedByTextInUserViewPage,5).isDisplayed());

    }

    @Given("us20 admin clicks on back button")
    public void us20_admin_clicks_on_back_button(){
        Driver.waitAndClick(adminPage.backButtonInUserViewPage,5);
    }

    @Given("us20 admin clicks to edit button for editing existing user")
    public void us20_admin_clicks_to_edit_button_for_editing_existing_user() throws InterruptedException {
        Thread.sleep(1000);
        if(adminPage.lastPageInUserManagementPage.isEnabled())
            Driver.waitAndClick(adminPage.lastPageInUserManagementPage,5);
        int counter = 0;
        while(counter==0) {
            Thread.sleep(1500);
            for (WebElement e : adminPage.team89userIDText) {
                if (e.getText().equals("140693")) {
                    counter++;
                }
            }
            Driver.waitAndClick(adminPage.previousPageInUserManagementPage,5);
            Thread.sleep(500);
        }
        Driver.waitAndClick(adminPage.team89userEditButton,5);
    }

    @When("us20 admin edits all credentials of user")
    public void us20_admin_edits_all_credentials_of_user() throws InterruptedException {
    Driver.waitAndSendText(adminPage.editFirstNameInEditUserPage,"1",5);
        Driver.waitAndSendText(adminPage.editLastNameInEditUserPage,"1",5);
        Driver.waitAndSendText(adminPage.editEMailInEditUserPage,"1",5);
        Select select = new Select(adminPage.editAuthoritiesInEditUserPage);
        select.selectByVisibleText("ROLE_PATIENT");
        Thread.sleep(5000);



    }

    @When("us20 admin clicks to save button")
    public void us20_admin_clicks_to_save_button() {
        Driver.waitAndClick(adminPage.saveButtonInEditUserPage,5);
    }
    @Then("us20 verify that admin can see the editing success message")
    public void us20_verify_that_admin_can_see_the_success_message() throws InterruptedException {
        Thread.sleep(750);
        Assert.assertEquals(Driver.waitForVisibility(adminPage.successMessageForEditingUser,4).getText(),"A user is updated with identifier team89userforvieweditanddelete");

    }

    @Given("us20 admin clicks to delete button for deleting existing user")
    public void us20_admin_clicks_to_delete_button_for_deleting_existing_user() throws InterruptedException {
        Thread.sleep(1000);
        if(adminPage.lastPageInUserManagementPage.isEnabled())
            Driver.waitAndClick(adminPage.lastPageInUserManagementPage,5);
        int counter = 0;
        while(counter==0) {
            for (WebElement e : adminPage.team89userIDText) {
                if (e.getText().equals("140693")) {
                    counter++;
                }
            }
            Driver.waitAndClick(adminPage.previousPageInUserManagementPage,5);
        }
        Driver.waitAndClick(adminPage.team89userDeleteButton,5);




        Thread.sleep(1000);
        Driver.getDriver().switchTo().alert().accept();
    }
    @Then("us20 verify that admin can see the deleting success message")
    public void us20_verifies_that_success_message_is_displayed() throws InterruptedException {
        Thread.sleep(750);
        Assert.assertEquals(Driver.waitForVisibility(adminPage.successMessageForEditingUser,5).getText(),"A user is deleted with identifier team89userforvieweditanddelete");
    }


}
