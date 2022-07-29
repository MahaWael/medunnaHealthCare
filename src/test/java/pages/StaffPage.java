package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class StaffPage {

    public StaffPage() {PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "//h5[@class='modal-title']")
    public WebElement signInOnStaffPageVerify;

    @FindBy (xpath = "//input[@name='username']")
    public WebElement usernameForStaff;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordForStaff;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement signInAsAStaff;
//        MY PAGES on header

    @FindBy (xpath = "//li[@id='entity-menu']") //xpath = "//li[@id='entity-menu']
    public WebElement buttonMyPages;

    //    Under MY PAGES dropdowns
    @FindBy (xpath = "(//a[@class='dropdown-item'])[1]")
    public WebElement searchPatient;

    @FindBy (xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement inPatient;
//      When you click Serach Patient you are in Patients page

    @FindBy (xpath = "//h2//span")
    public WebElement patientsPageVerify;

    @FindBy (xpath = "//input[@name='ssn']")
    public WebElement patientSSNVerify;

    @FindBy(linkText = "form-control")
    public WebElement SSNNUmberBox;

    @FindBy(xpath = "(//span[@class='d-none d-md-inline'])[1]")
    public WebElement firstPatientViewButton;
    //View button for the first patient

    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")
    public WebElement firstPatientEditButton;
    //Edit button for the first patient

    @FindBy(xpath = "(//a[@class='btn btn-warning btn-sm'])[1]")
    public WebElement getFirstPatientShowAppointmentsButton;

    @FindBy(xpath = "//div[@class='info jhi-item-count']")
    public WebElement showingNumberOfPatientsPopulated;
//       In Patients under MY PAGES

    @FindBy (linkText = "In Patients")
    public WebElement InPatientsPageVerify;

    @FindBy (xpath = "(//span[@class='d-none d-md-inline'])[1]")
    public WebElement impatientsEditButton;

    @FindBy (id = "fromDate")
    public WebElement fromDate;

    @FindBy (id = "toDate")
    public WebElement toDate;
    //            Patients
    @FindBy(xpath = "(//span[@class='d-none d-md-inline'])[1]")
    public WebElement viewButtonFirstPatient;

    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")
    public WebElement EditButtonFirstPatient;

    @FindBy(xpath = "((//span[text()='Show Appointments'])[1]")
    public WebElement showAppointmentFirstPatient;

    @FindBy(xpath = "(//th[@class='hand'])[2]")
    public WebElement validSsnpatientspage;

    @FindBy(xpath = "//h2/span")
    public WebElement createAndEditPatient;

    @FindBy (xpath = "//input[@name='firstName']")
    public WebElement stafEditFirstNamePatiet;

    @FindBy (xpath = "//input[@name='lastName']")
    public WebElement  staffEditLastNamePatient;

    @FindBy (xpath = "//input[@name='birthDate']")
    public WebElement staffEditBirtdatePatient;

    @FindBy (xpath = "//input[@name='email']")   //*[@id="email"]
    public WebElement  staffEditEmailPatient;

    @FindBy (xpath = "//input[@name='phone']")
    public WebElement  staffEditPhonePatient;

    @FindBy (xpath = "//select[@name='gender']")
    public WebElement staffEditGenderPatient;

    @FindBy (xpath = "//select[@name='bloodGroup']")
    public WebElement  staffEditBloodGroupPatient;

    @FindBy (xpath = "//input[@name='adress']")
    public WebElement  staffEditAddressPatient;

    @FindBy (xpath = "//textarea[@name='description']")
    public WebElement staffEditDescriptionPatient;

    @FindBy (xpath = "//select[@name='user.id']")
    public WebElement staffEditUserId;

    @FindBy (xpath = "//select[@name='country.id']")
    public WebElement  staffEditCountryId;

    @FindBy (xpath = "//select[@name='cstate.id']")
    public WebElement  staffEditStatePatient;

    @FindBy (xpath = " //button[@type='submit']")
    public WebElement  staffEditSavePatient;

    @FindBy(xpath = "//tbody//tr//td[2]")
    public List<WebElement> staffSearchedSsnList;

    @FindBy(xpath = "//h2[@id='appointment-heading']")
    public WebElement staffAppointmentsPageHeader;

    @FindBy(xpath = "//h2[@id='c-test-result-heading']")
    public WebElement staffTestResultsPageHeader;

    @FindBy(xpath = "//h2[@id='hospitalmsappfrontendApp.cTestResult.home.createOrEditLabel']")
    public WebElement staffUpdateTestResultPageHeader;

    @FindBy(xpath = "//input[@name='result']")
    public WebElement staffUpdateTestResultResultInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement staffUpdateTestResultSaveButton;

    @FindBy(xpath = "//div[@class = 'Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement staffUpdateTestResultSuccessMessage;

    @FindBy(xpath = "//tbody//tr[1]/td[3]")
    public WebElement staffUpdateTestResultUpdatedResult;

    @FindBy(xpath = "//tbody//tr//td[2]")
    public List <WebElement> staffUpdateTestResultUpdatedResultList;

    @FindBy(xpath = "//tbody//tr//td[1]")
    public List <WebElement> staffUpdateTestResultUpdatedIdList;

    @FindBy(xpath = "//h2[@id='c-test-heading']")
    public WebElement staffUpdateTestsPageHeader;

    @FindBy(xpath = "//input[@name='description']")
    public WebElement staffUpdateTestResultDescriptionInput;

    @FindBy(xpath = "//input[@name='id']")
    public WebElement staffUpdateTestResultIdInput;

    @FindBy(xpath = "//input[@name='date']")
    public WebElement staffUpdateTestResultDateInput;

    @FindBy(xpath = "//input[@name='createdDate']")
    public WebElement staffUpdateTestResultCreatedDateInput;

    @FindBy(xpath = "//select[@name='ctestItem.id']")
    public WebElement staffUpdateTestResultItemInput;

    @FindBy(xpath = "//select[@name='ctest.id']")
    public WebElement staffUpdateTestResultTestInput;


    @FindBy (xpath = "//a[@class='btn btn-warning btn-sm']")
    public WebElement editshowAppointmentsForTeamSecondPatient;

    @FindBy(xpath = "//select[@id='appointment-status']")
    public WebElement statusForTheTeamSecondPatient;

    @FindBy(xpath = "//select[@id='appointment-physician']")
    public WebElement physicanSelectBoxUnderAppointments;

    @FindBy(xpath ="//button[@id='save-entity']")
    public WebElement savePatientsDoctor;

    @FindBy(xpath = "(//span[@class='d-none d-md-inline'])[3]")
    public WebElement patientTwoShowAppointments;

    @FindBy( xpath = "(//span[@class='d-none d-md-inline'])[4]")
    public WebElement showTestForTeamEightyNineDoctor;

    @FindBy (xpath = "//a[@class='btn btn-info btn-sm']")
    public WebElement staffCanSeeTestResultButton;

    @FindBy (xpath = "//*[@id='entity-menu']/div/a[1]/span")
    public WebElement searchPatientTwo;

    @FindBy (xpath = "//input[@class='form-control']")
    public WebElement sSNPatientSearchBox;

    //US_23 Needs payment invoice web elements

    @FindBy(xpath = "//span[text()='Payment / Invoice Process']")
    public WebElement paymentInfoButton;

    @FindBy(xpath = "//table/thead/tr[5]/th[2]")
    public WebElement paymentInfoPageExamFeeAmount;

    @FindBy(xpath = "//table/thead/tr/td/table/tbody/tr[1]/td[2]")
    public WebElement paymentInfoPageTestItemAmount1;
    @FindBy(xpath = "//table/thead/tr/td/table/tbody/tr[2]/td[2]")
    public WebElement paymentInfoPageTestItemAmount2;
    @FindBy(xpath = "//table/thead/tr/td/table/tbody/tr[3]/td[2]")
    public WebElement paymentInfoPageTestItemAmount3;
    @FindBy(xpath = "//table/thead/tr/td/table/tbody/tr[4]/td[2]")
    public WebElement paymentInfoPageTestItemAmount4;
    @FindBy(xpath = "//table/thead/tr/td/table/tbody/tr[5]/td[2]")
    public WebElement paymentInfoPageTestItemAmount5;

    @FindBy(xpath = "(//table)[1]/tbody[1]/tr[1]/td[2]")
    public WebElement paymentInfoPageTotalAmount;

    @FindBy(xpath = "//a[text()=' Show Invoice']")
    public WebElement paymentInfoPageCreateInvoiceButton;

    @FindBy(xpath = "//th[text()='INVOICE']")
    public WebElement paymentInfoInvoiceText;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement paymentsavebuttonInInvoicePage;


}


