package stepdefinitions.uistepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_03_StepDefs {
    HomePage homePage=new HomePage();
    //git try note

    @Given("user goes to Medunna Url")
    public void user_goes_to_medunna_url() {
        Driver.getDriver();
    }
    @When("user navigates to URL")
    public void user_navigates_to_url() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_login_url"));
    }
    @When("user clicks to Register button")
    public void user_clicks_to_register_button() {
        homePage.homepageDropBox.click();
        homePage.homePageRegisterButton.click();

    }
    @And("user enters any four characters")
    public void userEntersAnyFourCharacters() {
        homePage.registrationPasswordBox.sendKeys("123a"+ Keys.ENTER);
    }

    @Then("user verifies that text of Your password is required to be at least four characters.  does NOT appear")
    public void userVerifiesThatTextOfYourPasswordIsRequiredToBeAtLeastFourCharactersDoesNOTAppear() {
        Assert.assertFalse(homePage.registrationPasswordRedBox.isDisplayed());

    }
    @Then("user closes the browser")
    public void user_closes_the_browser() {
        Driver.closeDriver();
    }

    @And("user enters less than four characters")
    public void userEntersLessThanFourCharacters() {
        homePage.registrationPasswordBox.sendKeys("123"+ Keys.ENTER);
    }

    @Then("user verifies that text of Your password is required to be at least four characters.  is visible")
    public void userVerifiesThatTextOfYourPasswordIsRequiredToBeAtLeastFourCharactersIsVisible() {
        Assert.assertTrue(homePage.registrationPasswordRedBox.isDisplayed());
    }
    @When("user enters six small letters as password")
    public void user_enters_six_small_letters_as_password() {
        homePage.registrationPasswordBox.sendKeys("abcdef");
    }
    @When("user enters six small letters and one capital letter as password")
    public void user_enters_six_small_letters_and_one_capital_letter_as_password() {
        homePage.registrationPasswordBox.sendKeys("abcdefG");
    }

    @Then("user verifies that strength bar is red")
    public void userVerifiesThatStrengthBarIsRed() {
        Assert.assertTrue(homePage.registrationPasswordStrengthBarRed.isDisplayed());
    }

    @Then("user verifies that strength bar is orange")
    public void userVerifiesThatStrengthBarIsOrange() {
        Assert.assertTrue(homePage.registrationPasswordStrengthBarOrange.isDisplayed());
    }

    @And("user enters five small letters and two capital letter as password")
    public void userEntersFiveSmallLettersAndTwoCapitalLetterAsPassword() {
        homePage.registrationPasswordBox.sendKeys("abcdeFG");
    }

    @And("user enters seven small letters and only as password")
    public void userEntersSevenSmallLettersAndOnlyAsPassword() {
        homePage.registrationPasswordBox.sendKeys("abcdefg");
    }

    @And("user enters six capital letters and one small letter as password")
    public void userEntersSixCapitalLettersAndOneSmallLetterAsPassword() {
        homePage.registrationPasswordBox.sendKeys("ABCDEFg");
    }

    @And("user enters four capital letters and three small letter as password")
    public void userEntersFourCapitalLettersAndThreeSmallLetterAsPassword() {
        homePage.registrationPasswordBox.sendKeys("ABCDefg");
    }

    @And("user enters seven capital letters as password")
    public void userEntersSevenCapitalLettersAsPassword() {
        homePage.registrationPasswordBox.sendKeys("ABCDEFG");
    }

    @And("user enters six small letters and one digit as password")
    public void userEntersSixSmallLettersAndOneDigitAsPassword() {
        homePage.registrationPasswordBox.sendKeys("abcdef1");
    }

    @And("user enters six capital letters and one digit as password")
    public void userEntersSixCapitalLettersAndOneDigitAsPassword() {
        homePage.registrationPasswordBox.sendKeys("ABCDEF1");
    }

    @And("user enters six seven digits as password")
    public void userEntersSixSevenDigitsAsPassword() {
        homePage.registrationPasswordBox.sendKeys("1234567");
    }

    @And("user enters six capital letters and one special character as password")
    public void userEntersSixCapitalLettersAndOneSpecialCharacterAsPassword() {
        homePage.registrationPasswordBox.sendKeys("ABCDEF?");}

    @And("user enters five capital letters, one digit and one special character as password")
    public void userEntersFiveCapitalLettersOneDigitAndOneSpecialCharacterAsPassword() {
        homePage.registrationPasswordBox.sendKeys("ABCDE1?");
    }

    @Then("user verifies that strength bar is lime")
    public void userVerifiesThatStrengthBarIsLime() {
        Assert.assertTrue(homePage.registrationPasswordStrengthBarLime.isDisplayed());
    }

    @And("user enters seven special characters as password")
    public void userEntersSevenSpecialCharactersAsPassword() {
        homePage.registrationPasswordBox.sendKeys("!@#$%^&");
    }

    @And("user enters four capital and three small letters without special characters as password")
    public void userEntersFourCapitalAndThreeSmallLettersWithoutSpecialCharactersAsPassword() {
        homePage.registrationPasswordBox.sendKeys("ABCDefg");
    }

    @And("user enters four capital and one small letter, one digit and one special character as password")
    public void userEntersFourCapitalAndOneSmallLetterOneDigitAndOneSpecialCharacterAsPassword() {
        homePage.registrationPasswordBox.sendKeys("ABCDe1?");
    }

    @Then("user verifies that strength bar is green")
    public void userVerifiesThatStrengthBarIsGreen() {
        Assert.assertTrue(homePage.registrationPasswordStrengthBarGreen.isDisplayed());
    }

    @And("user enters six capital and one small letters one digit without special characters as password")
    public void userEntersSixCapitalAndOneSmallLettersOneDigitWithoutSpecialCharactersAsPassword() {
        homePage.registrationPasswordBox.sendKeys("ABCDEFg1");
    }
}
