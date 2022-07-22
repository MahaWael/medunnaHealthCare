package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //This part is added in the first sprint
    //this is a note
    //MAIN HomePage
    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement homepageDropBox;
    @FindBy(xpath = "(//span)[13]")
    public WebElement homePageRegisterButton;
    @FindBy(xpath = "(//span)[12]")
    public WebElement homePageSignInButton;
    @FindBy(xpath = "//a[@class='appointment-btn scrollto']")
    public WebElement homePageMakeAnAppointmentButton;
    @FindBy(xpath = "(//span[@style='color: rgb(255, 255, 255);'])[1]")
    public WebElement homePageHomeButton;
    @FindBy(xpath = "(//span[@style='color: rgb(255, 255, 255);'])[2]")
    public WebElement homePageAboutButton;
    @FindBy(xpath = "(//span[@style='color: rgb(255, 255, 255);'])[3]")
    public WebElement homePageServicesButton;
    @FindBy(xpath = "(//span[@style='color: rgb(255, 255, 255);'])[4]")
    public WebElement homePageDepartmentsButton;
    @FindBy(xpath = "(//span[@style='color: rgb(255, 255, 255);'])[5]")
    public WebElement homePageDoctorsButton;
    @FindBy(xpath = "(//span[@style='color: rgb(255, 255, 255);'])[6]")
    public WebElement homePageContactButton;
    @FindBy (xpath = "//input[@id='username']")
    public WebElement homePageUsernameBox;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement homePagePasswordBox;
    @FindBy(xpath = "//button[@type='submit']//span[contains(text(),'Sign in')]")
    public WebElement homePageLoginButton;



    //RegistrationPage
    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement registrationSsnNumberBox;
    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement registrationFirstNameBox;
    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement registrationLastNameBox;
    @FindBy(xpath = "//input[@name='username']")
    public WebElement registrationUserNameBox;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement registrationEmailBox;
    @FindBy(xpath = "//input[@name='firstPassword']")
    public WebElement registrationPasswordBox;
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
    @FindBy(xpath = "//input[@name='secondPassword']")
    public WebElement registrationNewPasswordConfirmationBox;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement registrationRegisterButton;
    @FindBy(xpath = "//*[text()='Your username is required.']")
    public WebElement registrationUserNameWarningMessage;
    @FindBy(xpath = "//*[text()='Your email is required.']")
    public WebElement registrationEmailWarningMessage;
    @FindBy(xpath = "//*[text()='Your confirmation password is required.']")
    public WebElement registrationNewPasswordWarningMessage;


    @FindBy(xpath = "//div=[@class='dropdown-menu dropdown-menu-right']")
    public WebElement dropDownList;
    @FindBy (xpath = "//a[@href='/account/register']")
//@FindBy(linkText = "Register")
    public WebElement RegisterButton;
    @FindBy (xpath = "//input[@placeholder='000-00-0000']")
    public WebElement RegistrationSSNBox;
    @FindBy(xpath = "//div[@class='invalid-feedback'][1]")
    public WebElement RegistrationSSNWarningMessage;
    @FindBy(xpath = "//input[@placeholder='First Name']")
    public WebElement RegistrationFirstnameBox;
    @FindBy (xpath = "//*[text()='Your FirstName is required.']")
    public WebElement RegistrationFirstnameWarningMessage;
    @FindBy(id = "lastName")
    public WebElement RegistrationLastnameBox;
    // @FindBy(linkText = "Your LastName is required")
    @FindBy(xpath = "//div[@class='invalid-feedback'][2]")
    public WebElement RegistrationLastnameWaningMessage;
    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement RegistrationUsernameBox;


    public void login(String username,String password){
        homePageUsernameBox.sendKeys(username);
        homePagePasswordBox.sendKeys(password);
        homePageLoginButton.click();
    }

    //This part is added in the first sprint
    //Please add your code after this comment

    //US26 abdurrahim

    //contactPage
    @FindBy(xpath = "//input[@id='name']")
    public WebElement contactPageName;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement contactPageEmail;

    @FindBy(xpath = "//input[@id='subject']")
    public WebElement contactPageSubject;

    @FindBy(xpath = "//textarea[@id='message']")
    public WebElement contactPageMessage;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement contactSendButton;

    @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement contactAlert;

}