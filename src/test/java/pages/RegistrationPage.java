package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegistrationPage {
    public RegistrationPage() {
        PageFactory.initElements(Driver.getDriver(),this);    }

    @FindBy (xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement loginIcon;

    @FindBy (xpath = "//span[normalize-space()='Register']")
    public WebElement registerButton;

    @FindBy (xpath = "//input[@id='ssn']")
    public WebElement registrationSsnNumberBox;

    @FindBy (xpath = "//input[@id='firstName']")
    public WebElement registrationFirstNameBox;

    @FindBy (xpath = "//input[@id='lastName']")
    public WebElement registrationLastNameBox;

    @FindBy (xpath = "//input[@id='username']")
    public WebElement registrationUserNameBox;

    @FindBy (xpath = "//input[@id='email']")
    public WebElement registrationEmailBox;

    @FindBy (xpath = "//input[@id='firstPassword']")
    public WebElement registrationPasswordBox;

    @FindBy (xpath = "//input[@id='secondPassword']")
    public WebElement registrationNewPasswordConfirmationBox;

    @FindBy (xpath = "//button[@id='register-submit']//span[contains(text(),'Register')]")
    public WebElement registrationRegisterButton;

    @FindBy (xpath = "//div[normalize-space()='Registration Saved']")
    public WebElement registrationSavedMessage;

    @FindBy (xpath = "//div[@class='invalid-feedback']")
    public WebElement registrationErrorMessage;

    @FindBy(xpath = "//*[text()='Your username is required.']")
    public WebElement registrationUserNameWarningMessage;

    @FindBy(xpath = "//div[normalize-space()='Your email is required.']")
    public WebElement registrationEmailWarningMessage;

    @FindBy(xpath = "//div[normalize-space()='This field is invalid']")
    public WebElement registrationInvalidEmailWarningMessage;

    @FindBy(xpath = "//div[normalize-space()='Your username is invalid.']")
    public WebElement registrationInvalidUserNameWarningMessage;

    @FindBy(xpath = "(//span)[12]")
    public WebElement homePageSignInButton;

    @FindBy(xpath = "(//div[@class='text-danger form-group'])[6]")
    public WebElement registrationPasswordRedBox;
    @FindBy(xpath = "//li[@style='background-color: rgb(255, 0, 0);']")
    public WebElement registrationPasswordStrengthBarRed;
    @FindBy(xpath = "//li[@style='background-color: rgb(221, 221, 221);']")
    public WebElement registrationPasswordStrengthBarOrange;
    @FindBy(xpath = "//li[@style='background-color: rgb(153, 255, 0);']")
    public WebElement registrationPasswordStrengthBarLime;
    @FindBy(xpath = "//li[@style='background-color: rgb(0, 255, 0);']")
    public WebElement registrationPasswordStrengthBarGreen;
}