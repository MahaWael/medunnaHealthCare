package stepdefinitions.uistepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_26 {

    HomePage homePage = new HomePage();
    Faker faker = new Faker();

    @Given("US26_TC001 any user goes to Medunna website")
    public void us26_tc001_any_user_goes_to_medunna_website() {

        Driver.getDriver().get(ConfigReader.getProperty("medunna_login_url"));

    }

    @Given("US26_TC001 any user clicks to contact portal")
    public void us26_tc001_any_user_clicks_to_contact_portal() {
        Driver.wait(2);
        homePage.homePageContactButton.click();

    }

    @Given("US26_TC001 any user provide {string}, {string}, {string}, {string}")
    public void us26_tc001_any_user_provide(String string, String string2, String string3, String string4) {
        Driver.wait(1);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(homePage.contactPageMessage).build();

        Driver.wait(2);
        string=faker.name().firstName()+faker.name().lastName();
        string2=string+"@gmail.com";
        string3=faker.lorem().characters(6,20);
        string4=faker.lorem().characters();
        Driver.wait(1);
        homePage.contactPageName.sendKeys(string );
        Driver.wait(1);
        homePage.contactPageEmail.sendKeys(string2);
        Driver.wait(1);
        homePage.contactPageSubject.sendKeys(string3,Keys.ENTER);
        Driver.wait(1);
        homePage.contactPageMessage.sendKeys(string4);






    }

    @Given("US26_TC001 any user clicks to send")
    public void us26_tc001_any_user_clicks_to_send() {

        /*
        Driver.wait(2);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(homePage.contactSendButton).doubleClick().build().perform();

         */


        // Driver.wait(2);
        // homePage.contactSendButton.click();



    }

    @Then("US26_TC001 any user validate green box")
    public void us26_tc001_any_user_validate_green_box() {
        String expectedResult=homePage.contactAlert.getText();
        System.out.println(expectedResult);
        Assert.assertEquals(expectedResult,"Your message has been received\n" +
                "✖︎");

    }

}
