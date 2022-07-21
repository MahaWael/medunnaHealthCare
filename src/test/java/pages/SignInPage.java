package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import java.util.List;

public class SignInPage {
    public SignInPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class = 'd-flex align-items-center dropdown-toggle nav-link']")
    public WebElement dropdown;

    @FindBy(xpath = "//a[@id = 'login-item']")
    public WebElement SignInDropdown;

    @FindBy(xpath = "//input[@name= 'username']")
    public WebElement username;

    @FindBy(xpath = "//input[@name= 'password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type= 'submit']")
    public WebElement signInButton;

    @FindBy(xpath = "(//a[@class = 'd-flex align-items-center dropdown-toggle nav-link'])[6]/span")
    public WebElement userNameText;

    @FindBy(xpath = "//div[@class = 'alert alert-danger fade show']")
    public WebElement unsuccessfulMessage;

    @FindBy(xpath = "//div[@class = 'Toastify__toast-body']")
    public WebElement unsuccessfulMessageToastify;

    @FindBy(xpath = "//div [@class = 'invalid-feedback']")
    public WebElement invalidFeedbackPassword;

    @FindBy(xpath = "//div [text() = 'Field translation-not-found[hospitalmsappfrontendApp.loginVM.password] does not meet min/max size requirements!']")
    public WebElement sizeReqMessagePassword;

    @FindBy(xpath = "//div [text() = 'Field translation-not-found[hospitalmsappfrontendApp.loginVM.username] does not meet min/max size requirements!']")
    public WebElement sizeReqMessageUsername;

    @FindBy(xpath = "(//div [@class = 'invalid-feedback'])[1]")
    public WebElement invalidFeedbackUserName;

    @FindBy(xpath = "//label[@class = 'form-check-label']")
    public WebElement rememberMe;

    @FindBy(xpath = "//label[@class = 'form-check-label']")
    public WebElement checkbox;

    @FindBy(xpath = "//a[@href = '/account/reset/request']")
    public WebElement passResetReqLink;

    @FindBy(xpath = "// *[text()= 'Reset your password']")
    public WebElement resetYourPasswordText;

    @FindBy(xpath = "(// div[@class= 'alert alert-warning fade show'])[2]/span/span")
    public WebElement dontHaveAnAccountText;

    @FindBy(xpath = "(//a[@href = '/account/register'])[2]")
    public WebElement registerANewAccountLink;

    @FindBy(xpath = "//h1[@id= 'register-title']")
    public WebElement registrationText;

    @FindBy(xpath = "//button[@class = 'btn btn-secondary']")
    public WebElement cancelBtn;

    @FindBy(xpath = "//div[@class = 'Toastify']")
    public WebElement loginSuccessMessageToastify;

    @FindBy(xpath = "//h5[@class = 'modal-title']")
    public List<WebElement> SigInText;

}
