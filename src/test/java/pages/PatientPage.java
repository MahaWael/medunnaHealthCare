package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PatientPage {
    public PatientPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id=\"register-submit\"]/span")
    public WebElement PatientPageregisterbutton;
    @FindBy(xpath = "//a[@aria-haspopup='true']")
    public WebElement PatientpageIconbutton;
    @FindBy(xpath = "//a[@aria-haspopup='true']") //*[@id='entity-menu']
    public WebElement PatientpageMyPagesPatient ;
    @FindBy(xpath = "//a[@class='dropdown-item'][1]")
    public WebElement PatientpageMyAppointments;
    @FindBy(xpath = "//*[@id='appointment-heading']") ////h2[@id= 'appointment-heading']
    public WebElement PatientpageAppointmentHeading;
    @FindBy(xpath = "//a[@href=\"/patient-detail/112412\"]")
    public WebElement PatientpageClickPatientName;
    @FindBy(xpath = "//a[@href='/tests/appointment/101918']")
    public WebElement PatientpageShowTests;
    @FindBy(xpath = "//div[@id='app-view-container']")
    public WebElement Patientpageprofile;
    @FindBy(xpath = "//*[@id='entity-menu']/div/a[2]/span")
    public WebElement PatientpageMakeanAppointment;
    @FindBy(xpath = "//input[@name='phone']")
    public WebElement PatientpagePhone;
    @FindBy(xpath = "//input[@name='appoDate']")
    public WebElement PatientpageAppointmentDate;
    @FindBy(xpath = "//span[normalize-space()='Send an Appointment Request']")  //*[@id='register-submit']
    public WebElement PatientpageSendAppointmentRequest;
    @FindBy(xpath = "//div[@class= 'invalid-feedback'][1]")
    public WebElement PatientpageInvalidSsn;
    @FindBy(xpath = "//*[@id=\"register-form\"]/div[2]/div[2]/div/div")
    public WebElement PatientpageInvalidPhone;
    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement PatientpageInvalidEmail1;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement PatientpagePassword;
    @FindBy(xpath = "//div[@role='alert']")
    public WebElement PatientpageRegistrSavedMessage;
    //Mr Sefik added these 4 elements in below
    @FindBy( xpath = "//tbody//tr[last()]//td[6]")
    public WebElement lastAppointmentDate;
    @FindBy( xpath = "//tbody//tr[1]//td[6]")
    public WebElement fistAppointmentDate;
    @FindBy( xpath = "//tbody//tr[2]//td[6]")
    public WebElement midAppointmentDate;
    @FindBy( xpath = "//span[text() ='Appointment date can not be past date!']")
    public WebElement appointmentCantBePastMessage;


    //Goksen gave me the following elements
    @ FindBy(xpath = "//h2//span")
    public WebElement createOrEditPatient;
    @FindBy (xpath = "//input[@name='firstName']")
    public WebElement editPatientFirstName;
    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement editPatientLastName;
    @FindBy (xpath = "//*[@id=\"patient-birthDate\"]")
    public WebElement calendarIconPatientBirthDayEdit;
    @FindBy (xpath = "//input[@name='email']")
    public WebElement editPatientEmail;
    @FindBy (xpath = "//input[@name='phone']")
    public WebElement editPatientPhone;
    @FindBy(xpath = "//select[@name='gender']")
    public WebElement editPatientGender;
    @FindBy(xpath = "//select[@name='bloodGroup']")
    public  WebElement editPatientBloodGroup;
    @FindBy(xpath = "//input[@name='adress']")
    public WebElement editPatientAddress;
    @FindBy (xpath = "//textarea[@name='description']" )
    public  WebElement editPatientDescription;
    @FindBy (xpath = "//select[@name='user.id']" )
    public WebElement editPatientUserName;
    @FindBy (xpath = "//select[@name='country.id']")
    public WebElement editPatientCountry;
    @FindBy (xpath = "//select[@name='cstate.id']")
    public WebElement editPatientState;
    @FindBy (xpath = "//button[@type='submit']")
    public WebElement editPatientSaveButton;
    @FindBy(xpath= "//input[@name='birthDate']")
    public WebElement birthdayPartEdit;
    @FindBy(xpath ="//*[@id=\"entity-menu\"]/div/a[1]/span")
    public WebElement doctorMyPagesSearchPatient;
    @FindBy(xpath = "//a[@class='btn btn-danger btn-sm'][1]")
    public WebElement adminfirstPatientDelete;
    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement adminCancelDeleteOperation;

    //Please add your WebElemets below this comment section

    //US24

    @FindBy(xpath = "//span[normalize-space()='19/07/22 13:15']")
    public WebElement myAppointmentCreatedDate;

    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[2]")
    public WebElement myAppointmentShowTests;

    @FindBy(xpath = "//a[@class='btn btn-info btn-sm']")
    public WebElement myAppointmentViewResults;

    @FindBy(xpath = "//tbody/tr/td[4]")
    public  WebElement myAppointmentDefaultMin;

    @FindBy(xpath = "//tbody/tr/td[5]")
    public  WebElement myAppointmentDefaultMax;

    @FindBy(xpath = "//a[@class='btn btn-warning btn-sm']")
    public  WebElement myAppointmentShowInvoice;

    @FindBy(xpath = "//th[normalize-space()='INVOICE']")
    public WebElement invoiceVerify;

    @FindBy(xpath = "//*[@id='entity-menu']/div/a[1]/span")
    public WebElement myAppointments;

    @FindBy(xpath = "//*[@id='entity-menu']")
    public WebElement myPagesPatient ;









}
