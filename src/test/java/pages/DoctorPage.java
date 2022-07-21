package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class DoctorPage {
    public DoctorPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //This part is added in the first Sprint
    //Please add your new web element at the bottom of the class with the comment
    @FindBy(xpath = "//*[text()='MY PAGES']")
    public WebElement doctorPageMyPagesDropBox;
    @FindBy(xpath = "//*[text()='My Appointments']")
    public WebElement doctorPagesMyAppointments;
    @FindBy(xpath = "(//*[text()='Edit'])[1]")
    public WebElement doctorPageAppointmentsFirstEditButton;
    @FindBy(xpath = "//*[text()='Request A Test']")
    public WebElement doctorPageAppointmentRequestATestButton;
    @FindBy(xpath = "//*[text()='Show Test Results']")
    public WebElement doctorPageAppointmentShowTestResultsButton;
    @FindBy(xpath = "(//*[text()='View Results'])[1]")
    public WebElement doctorPageAppointmentShowTestResultsViewResultsButton;
    @FindBy(xpath = "//*[text()='Test Results']")
    public WebElement doctorPageYouCanSeeAllTestResult;
    @FindBy(xpath = "//*[text()='Request Inpatient']")
    public WebElement doctorPageAppointmentRequestInpatientButton;
    @FindBy(xpath = "//*[contains(text(),'A new In Patient is created with identifier')]")
    public WebElement doctorPageANewInPatientIsCreatedWithIdentifierMessage;
    @FindBy(xpath = "//*[contains(text(),'InPatient request already done for this appointment')]")
    public WebElement doctorPageInPatientRequestAlreadyDoneForThisAppointment;
    @FindBy(xpath = "//*[text()='My Patients']")
    public WebElement doctorPagesMyPatients;
    @FindBy(xpath = "//*[text()='Patients']")
    public WebElement doctorPageMyPatientsHeader;
    @FindBy(xpath = "//*[text()='My Inpatients']")
    public WebElement doctorPageMyInpatients;
    @FindBy(xpath = "//*[text()='In Patients']")
    public WebElement doctorPageInPatientsText;
    @FindBy(xpath = "(//*[text()='Edit'])[5]")
    public WebElement doctorPageInPatientsFirstInpatientEditButton;
    @FindBy(xpath = "(//*[text()='Edit'])[6]")
    public WebElement doctorPageInPatientsSecondInpatientEditButton;
    @FindBy(xpath = "//select[@id='in-patient-status']")
    public WebElement doctorPageStatusDropBox;
    @FindBy(xpath = "//select[@id='in-patient-room']")
    public WebElement doctorPageRoomDropBox;
    @FindBy(xpath = "//*[text()='Save']")
    public WebElement doctorPageInPatientSaveButton;
    @FindBy(xpath = "//*[contains(text(),'The In Patient is updated with identifier')]")
    public WebElement doctorPageInPatientStatusAndRoomPopUpMessage;
    @FindBy(xpath = "//*[text()='InPatient status can not be changed with this type of status']")
    public WebElement doctorPageStatusAlert;

    //@FindBy (xpath = "//span[normalize-space()='MY PAGES']")
    //public WebElement doctorMyPagesBox;
    @FindBy (xpath = "(//span[contains(text(),'Edit')])[1]")
    public WebElement doctorEditButton;
    @FindBy (xpath = "//a[normalize-space()='Request A Test']")
    public WebElement doctorRequestTestButton;
    @FindBy (xpath = "(//*[.='My Appointments']")
    public WebElement doctorMyAppointmentsBox;
    @FindBy(xpath = "//li[@id='entity-menu']")
    public WebElement doctorMyPagesBox ;
    @FindBy (name = "1404")
    public WebElement sodiumCheckBox;
    @FindBy (name="1402")
    public WebElement ureaCheckBox;
    @FindBy (name="1408")
    public WebElement hemoglobinCheckBox;
    @FindBy (name="1403")
    public WebElement creatinineCheckBox;
    @FindBy (name="1405")
    public WebElement potassiumCheckBox;
    @FindBy (name="1407")
    public WebElement albuminCheckBox;
    @FindBy (xpath = "//span[normalize-space()='Save']")
    public WebElement saveButton;
    @FindBy (xpath = "//div[@role='alert']")
    public WebElement savedSuccessfullyPopup;
    @FindBy(xpath = "//table[@class='table']/tbody/tr[1]/td[1]")
    public WebElement firstPatientAppointmentID;
    @FindBy(xpath = "//table/tbody/tr[1]/td[2]/span[1]")
    public WebElement firstPatientAppointmentStartDateTime;
    @FindBy(xpath = "//table/tbody/tr[1]/td[3]/span[1]")
    public WebElement firstPatientAppointmentEndDateTime;
    @FindBy (xpath = "//table/tbody/tr[1]/td[4]/span[1]")
    public WebElement firstPatientAppointmentStatus;
    @FindBy(xpath = "//table/tbody/tr[1]/td[11]/a")
    public WebElement firstPatientAppointmentPhysician;
    @FindBy(xpath = "//table/tbody/tr[1]/td[12]/a")
    public WebElement firstPatientAppointmentPatient;
    @FindBy(xpath = "//table/tbody/tr[1]/td[13]/div/a")
    public WebElement firstPatientAppointmentEditButton;
    @FindBy(id = "appointment-status")
    public WebElement appointmentEditStatus;
    @FindBy(id = "appointment-anamnesis")
    public WebElement appointmentEditAnamnesis;
    @FindBy(id = "appointment-treatment")
    public WebElement appointmentEditTreatment;
    @FindBy(id = "appointment-diagnosis")
    public WebElement appointmentEditDiagnosis;
    @FindBy(id = "appointment-prescription")
    public WebElement appointmentEditPrescription;
    @FindBy(id = "appointment-description")
    public WebElement appointmentEditDescription;
    @FindBy(id = "save-entity")
    public WebElement appointmentEditSaveButton;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement appointmentEditErrorMessageForAnemnesis;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement appointmentEditErrorMessageForTreatment;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement appointmentEditErrorMessageForDiagnosis;
    @FindBy(className = "Toastify__toast-body")
    public WebElement appointmentEditSuccessfuly;

    //This part is added in the first Sprint
    //Please add your new web element at the bottom of the class with the comment
}
