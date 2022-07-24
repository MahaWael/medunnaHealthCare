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
    @FindBy(xpath = "(//span[@style='color: rgb(255, 255, 255);'])[2]")
    public WebElement homePageDoctorsButton;
    @FindBy(xpath = "(//span[@style='color: rgb(255, 255, 255);'])[2]")
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
        Driver.waitAndClick(homepageDropBox);
        Driver.waitAndClick(homePageSignInButton);
        Driver.waitAndSendText(homePageUsernameBox,username);
        Driver.waitAndSendText(homePagePasswordBox,password);
        Driver.waitAndClick(homePageLoginButton);
    }

    //This part is added in the first sprint
    //Please add your code after this comment
    //Bestami (US_27)

    // homepage-main locators





//homepage-login locators
    @FindBy(xpath = "(//span[text()='Sign in'])[2]")
    public WebElement loginSignInText;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement loginUserName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement loginPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginSignInButton;


    //homepage-admin locators
    @FindBy(xpath = "//span[text()='Items&Titles']")
    public WebElement adminItemsAndTitlesDropBox;

    @FindBy(xpath = "//span[text()='Messages']")
    public WebElement adminMessagesTitle;


    //home page- MessagesMainPage
    @FindBy(xpath = "//span[text()='Name']")
    public WebElement messagesMainPageName;

    @FindBy(xpath = "//span[text()='Email']")
    public WebElement messagesMainPageEmail;

    @FindBy(xpath = "//span[text()='Subject']")
    public WebElement messagesMainPageSubject;

    @FindBy(xpath = "//span[text()='Message']")
    public WebElement messagesMainPageMessage;

    @FindBy(xpath = "//span[text()='Create a new Message']")
    public WebElement messagesMainPageCreateANewMessageButton;

    @FindBy(linkText = "71945")
    public WebElement messagesMainPageId;


    //homepage-Messages Default Page
    @FindBy(xpath = "(//a[@class='btn btn-danger btn-sm'])[5]")
    public WebElement messagesPageDeleteButton;

    @FindBy(xpath = "//button[@id='jhi-confirm-delete-cMessage']")
    public WebElement messagesPopUpDeleteMessage;

    @FindBy(xpath = "//div[text()='A Message is deleted with identifier 71945']")
    public WebElement messageDeletedSuccessMessage;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement messagesIdPageEditButton;

    @FindBy(xpath = "//span[text()='Create or edit a Message']")
    public WebElement messagesDefaultPageCreateOrEditMessageTitle;

    @FindBy(xpath = "//input[@name='id']")
    public WebElement messagesDefaultPageCreateOrEditIdBox;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement messagesDefaultPageCreateOrEditNameBox;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement messagesDefaultPageCreateOrEditEmailBox;

    @FindBy(xpath = "//input[@name='subject']")
    public WebElement messagesDefaultPageCreateOrEditSubjectBox;

    @FindBy(xpath = "//input[@name='message']")
    public WebElement messagesDefaultPageCreateOrEditMessageBox;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement messagesDefaultPageCreateOrEditSaveButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement messagesDefaultPageCreateOrEditSuccessMessage;

    @FindBy(xpath ="//div[text()='This field is invalid']" )
    public WebElement messagesDefaultPageCreateOrEditInvalidEmailMessage;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement messagesDefaultPageNameBoxErrorMessage;

    @FindBy(xpath = "//div[text()='Your email is required.']")
    public WebElement messagesDefaultPageEmailBoxErrorMessage;

    @FindBy(xpath = "//div[text()='This field is required.']")
    public WebElement messagesDefaultPageSubjectBoxErrorMessage;

    //Birol
    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement homeSignInButton;

}