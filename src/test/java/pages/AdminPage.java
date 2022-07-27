package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminPage {

    public AdminPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //            First Home page
    //This web elements created in the first sprint
    //If you need any new WebElement please create at the bottom of the class
    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement profileicon;

    @FindBy(xpath = "//*[@id='login-item']/span")
    public WebElement signInUnderProfileIcon;

    @FindBy (xpath = "//*[@id=\"account-menu\"]/div/a[2]/span")
    public WebElement registerUnderProfileIcon;

    //            Login the page as an admin
    @FindBy (xpath = "//h5//span")
    public WebElement signInPageVerify;  // on the top of the sign in page

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameBox;

    @FindBy (linkText = "Username cannot be empty!")
    public WebElement usernameCanNotBeEmpty;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "Password cannot be empty!")
    public  WebElement passwordNameCanNotBeEmpty;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(xpath = "//a[@class='btn btn-danger btn-sm'][1]")
    public WebElement adminfirstPatientDelete;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement adminCancelDeleteOperation;

    //         Dropdown under admin
    @FindBy (xpath = "//*[contains(text(),'Sign in')]")
    public WebElement popUpSignInVerify;

    //         Dropdown under admin
    @FindBy(linkText = "Vusal Gasimov")
    public WebElement adminName;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[10]")
    public WebElement adminSettings;  // Under VusalGasimov ==> Settings

    @FindBy(xpath = "(//a[@class='dropdown-item'])[11]")
    public WebElement adminPassword;   //  Under VusalGasimov ==> Password

    @FindBy(linkText = "Sign out")
    public WebElement signOut;  //  Under VusalGasimov ==> Sign out

    @FindBy(xpath = "//li[@id='admin-menu']")
    public WebElement AdministrationButton;
    // Administration on the header part

    @FindBy(xpath = "//*[@id=\"admin-menu\"]/a")  //a[@class='dropdown-item'])[9]
    public WebElement administrationButton;
    // Administration on the header part

    @FindBy(xpath = "//a[@class='dropdown-item'][1]")  //a[@class='dropdown-item'][1]
    public WebElement userManagmentButtonUnderAdminidtrstion;
    // Administration ==> Users managment

//    When you click user management you will have 'Users' page

    //  @FindBy(linkText = "Users")

    @FindBy(xpath = "//h2//span")
    public WebElement usersHeader;
    // Administration ==> Users management ==> Users Page==>Users

    @FindBy(linkText = "Create a new user")
    public WebElement createANewUser;
    // '+Create a New user' button

    @FindBy(xpath = "//a[@class='btn btn-info btn-sm'][1]")
    public WebElement firstUsersView;
    // First users 'View' button for other users just change [1] to [2]...[20]

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm'][1]")
    public WebElement firstUsersEdit;
    // First users 'Edit' button for other users just change [1] to [2]...[20]

    @FindBy(xpath = "/(/a[@class='btn btn-danger btn-sm'])[1]")
    public WebElement firstUsersDelete;
    // First users 'Delete' button for other users just change [1] to [2]...[20]

    @FindBy(xpath = "//div[@class='info jhi-item-count']")
    public WebElement showspopulatedusers;
    // under Users of the page showing the numbers of items
//            Under Items&Titles

    @FindBy(xpath = "//a[@aria-haspopup='true']")  //   linkText = "items&Titles
    public WebElement itemsAndTitles;
    @FindBy(xpath = "//a[@class='dropdown-item'][1]")
    public WebElement patientInDropdown;
    // under Items&Titles patientInDropDown[1], staffinDropDown[2], physicianInDropDown[3],
    // appointmentInDropDown[3], testItemsInDropDown[4], roomInDropDown[5], countryInDropDown[6],
    // stateandCityInDropDown [7], messagesInDropDown [8]

    @FindBy(xpath = "//a[@class='dropdown-item'][2]")
    public WebElement staffInDropDown;

    @FindBy(xpath = "//a[@class='btn btn-primary float-right jh-create-entity']")
    public WebElement AdminPagePatientCreateNewPatient;

    @FindBy(xpath = "//a[@class='btn btn-primary float-right jh-create-entity']")
    public WebElement AdminPageStaffCreateNewStaff;

    @FindBy(xpath = "//a[@class ='btn btn-primary float-right jh-create-entity']")
    public WebElement AdminPagePhysicianCreateNewPhysician;

    @FindBy(xpath = "//a[@class ='btn btn-primary float-right jh-create-entity']")
    public WebElement AdminPagePatientCreateNewAppointment;

    @FindBy(xpath = "(//h2//span)[1]")
    public WebElement patientsPageVerify;

    //for the first appointment which you want to view it
    @FindBy (xpath = "(//a[@class ='btn btn-info btn-sm'])[1]")
    public WebElement adminPageAppointmentView;
    //for the second one is --> (xpath = "(//a[@class ='btn btn-info btn-sm'])[2]")
    //you can chance index number for the which appointment you  want to see.

    @FindBy(xpath = "//h2//span")
    public WebElement firstPatientsPageVerify;

    //for the first appointment which you want to edit it
    @FindBy (xpath = "(//a[@class ='btn btn-primary btn-sm'])[1]")
    public WebElement adminPageAppointmentEdit;
    //for the second one is --> (xpath = "(//a[@class ='btn btn-primary btn-sm'])[2]")
    //you can chance index number for the which appointment you  want to edit.

    //for the first appointment which you want to delete it
    @FindBy (xpath = "(//a[@class ='btn btn-danger btn-sm'])[1]")
    public WebElement adminPageAppointmentDelete;
    //for the second one is --> (xpath = "(//a[@class ='btn btn-danger btn-sm'])[2]")
    //you can chance index number for the which appointment you  want to delete.

    @FindBy(xpath = "//a[@class ='btn btn-primary float-right jh-create-entity']")
    public WebElement AdminPageTestItemCreateNewTestItem;

    //for the first TestItem which you want to view it
    @FindBy (xpath = "(//a[@class ='btn btn-info btn-sm'])[1]")
    public WebElement adminPageTestItemView;
    //for the second one is --> (xpath = "(//a[@class ='btn btn-info btn-sm'])[2]")
    //you can chance index number for the which TestItem you  want to see.

    //for the first TestItem which you want to edit it
    @FindBy (xpath = "(//a[@class ='btn btn-primary btn-sm'])[1]")
    public WebElement adminPageTestItemEdit;
    //for the second one is --> (xpath = "(//a[@class ='btn btn-primary btn-sm'])[2]")
    //you can chance index number for the which TestItem you  want to edit.

    //for the first TestItem which you want to delete it
    @FindBy (xpath = "(//a[@class ='btn btn-danger btn-sm'])[1]")
    public WebElement adminPageTestItemDelete;
    //for the second one is --> (xpath = "(//a[@class ='btn btn-danger btn-sm'])[2]")
    //you can chance index number for the which TestItem you  want to delete.

    @FindBy(xpath = "//a[@class ='btn btn-primary float-right jh-create-entity']")
    public WebElement AdminPageRoomCreateNewRoom;

    //for the first Room which you want to view it
    @FindBy (xpath = "(//a[@class ='btn btn-info btn-sm'])[1]")
    public WebElement adminPageRoomView;
    //for the second one is --> (xpath = "(//a[@class ='btn btn-info btn-sm'])[2]")
    //you can chance index number for the which Room you  want to see.

    //for the first Room which you want to edit it
    @FindBy (xpath = "(//a[@class ='btn btn-primary btn-sm'])[1]")
    public WebElement adminPageRoomEdit;
    //for the second one is --> (xpath = "(//a[@class ='btn btn-primary btn-sm'])[2]")
    //you can chance index number for the which Room you  want to edit.

    //for the first Room which you want to delete it
    @FindBy (xpath = "(//a[@class ='btn btn-danger btn-sm'])[1]")
    public WebElement adminPageRoomDelete;
    //for the second one is --> (xpath = "(//a[@class ='btn btn-danger btn-sm'])[2]")
    //you can chance index number for the which TestItem you  want to delete.

    @FindBy(xpath = "//a[@class ='btn btn-primary float-right jh-create-entity']")
    public WebElement AdminPageCountryCreateNewCountry;

    //for the first Country which you want to view it
    @FindBy (xpath = "(//a[@class ='btn btn-info btn-sm'])[1]")
    public WebElement adminPageCountryView;
    //for the second one is --> (xpath = "(//a[@class ='btn btn-info btn-sm'])[2]")
    //you can chance index number for the which Country you  want to see.

    //for the first Country which you want to edit it
    @FindBy (xpath = "(//a[@class ='btn btn-primary btn-sm'])[1]")
    public WebElement adminPageCountryEdit;
    //for the second one is --> (xpath = "(//a[@class ='btn btn-primary btn-sm'])[2]")
    //you can chance index number for the which Country you  want to edit.

    //for the first Country which you want to delete it
    @FindBy (xpath = "(//a[@class ='btn btn-danger btn-sm'])[1]")
    public WebElement adminPageCountryDelete;
    //for the second one is --> (xpath = "(//a[@class ='btn btn-danger btn-sm'])[2]")
    //you can chance index number for the which Country you  want to delete.

    @FindBy(xpath = "//a[@class ='btn btn-primary float-right jh-create-entity']")
    public WebElement AdminPageStateCityCreateNewStateCity;

    //for the first StateCity which you want to view it
    @FindBy (xpath = "(//a[@class ='btn btn-info btn-sm'])[1]")
    public WebElement adminPageStateCityView;
    //for the second one is --> (xpath = "(//a[@class ='btn btn-info btn-sm'])[2]")
    //you can chance index number for the which StateCity you  want to see.

    //for the first StateCity which you want to edit it
    @FindBy (xpath = "(//a[@class ='btn btn-primary btn-sm'])[1]")
    public WebElement adminPageStateCityEdit;
    //for the second one is --> (xpath = "(//a[@class ='btn btn-primary btn-sm'])[2]")
    //you can chance index number for the which StateCity you  want to edit.

    //for the first StateCity which you want to delete it
    @FindBy (xpath = "(//a[@class ='btn btn-danger btn-sm'])[1]")
    public WebElement adminPageStateCityDelete;
    //for the second one is --> (xpath = "(//a[@class ='btn btn-danger btn-sm'])[2]")
    //you can chance index number for the which StateCity you  want to delete.

    @FindBy(xpath = "//a[@class ='btn btn-primary float-right jh-create-entity']")
    public WebElement AdminPageMessageCreateNewMessage;

    //for the first Message which you want to view it
    @FindBy (xpath = "(//a[@class ='btn btn-info btn-sm'])[1]")
    public WebElement adminPageMessageView;
    //for the second one is --> (xpath = "(//a[@class ='btn btn-info btn-sm'])[2]")
    //you can chance index number for the which Message you  want to see.

    //for the first Message which you want to edit it
    @FindBy (xpath = "(//a[@class ='btn btn-primary btn-sm'])[1]")
    public WebElement adminPageMessageEdit;
    //for the second one is --> (xpath = "(//a[@class ='btn btn-primary btn-sm'])[2]")
    //you can chance index number for the which Message you  want to edit.

    //for the first Message which you want to delete it
    @FindBy (xpath = "(//a[@class ='btn btn-danger btn-sm'])[1]")
    public WebElement adminPageMessageDelete;
    //for the second one is --> (xpath = "(//a[@class ='btn btn-danger btn-sm'])[2]")
    //you can chance index number for the which Message you  want to delete.

    //          Create or edit a Patient page
    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement createOrEditFirstName;

    @FindBy(xpath= "//input[@name='lastName']")
    public WebElement createOrEditLastName;

    @FindBy (xpath = "//input[@name='birthDate']")
    public WebElement createOrEditBirthDate;

    @FindBy (xpath = "//input[@name='email']")
    public WebElement createOrEditEmail;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement createOrEditPhone;

    @FindBy(xpath = "//select[@name='gender']")
    public WebElement createOrEditGender;

    @FindBy(xpath = "//select[@name='bloodGroup']")
    public WebElement createOrEditBloodGroup;

    @FindBy(xpath = "//input[@name='adress']")
    public WebElement createOrEditAddress;

    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement createOrEditDescription;

    @FindBy (xpath = "//select[@name='user.id']")
    public WebElement createOrEditUser;

    @FindBy (xpath = "//select[@name='country.id']")
    public WebElement createOrEditCountry;

    @FindBy(xpath = "//select[@name='cstate.id']")
    public WebElement createOrEditState;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement createOrEditSaveButton;

    @FindBy (xpath = "(//a[@href='javascript:void(0)'])[8]")
    public WebElement getlastPatientsPage;

    //           Password for Admin
    @FindBy (linkText = "password-title")
    public WebElement passwordForAdminVerify;

    @FindBy (xpath = "//input[@name='currentPassword']")
    public WebElement currentPasswordForAdmin;

    @FindBy (xpath = "//input[@name='newPassword']")
    public WebElement newPaswordForAdmin;

    @FindBy (xpath = "//input[@name='confirmPassword']")
    public WebElement confirmationNewPasword;

    @FindBy (xpath = "//button[@type='submit']")
    public  WebElement saveNewPasswordButton;

    //           User Settings For Admin
    @FindBy(linkText = "Your first name" )
    public WebElement firstNameUserSettingsForAdmin;

    @FindBy(linkText = "Your last name")
    public WebElement lastNameUserSettingsForAdmin;

    @FindBy(linkText ="Your email")
    public WebElement emailUserSettingsForAdmin;

    //     Users page registration elements
    @FindBy (xpath = "(//th//span)[1]")
    public WebElement idUsersregistrationInfo;

    @FindBy (xpath = "(//th//span)[2]")
    public WebElement loginUsersRegistrationInfo;

    @FindBy(xpath = "(//th//span)[3]")
    public WebElement ssnUsersRegistrationInfo;

    @FindBy(xpath = "(//th//span)[4]")
    public WebElement emailUsersRegistrationInfo;

    @FindBy (xpath = "(//th//span)[5]")
    public WebElement languageUsersRegistrationInfo;

    @FindBy(xpath = "(//th//span)[6]")
    public WebElement profileUsersRegistrationInfo;

    @FindBy(xpath = "(//th//span)[7]")
    public WebElement createdDateRegistrationInfo;

    @FindBy (xpath = "(//th//span)[8]")
    public WebElement modifiedByRegistrationInfo;

    @FindBy(xpath = "(//th//span)[9]")
    public WebElement modifiedDateRegistrationInfo;

    @FindBy(xpath = "(//a[@class='btn btn-danger btn-sm'])[5]")
    public WebElement newPatientToDelete;

    @FindBy (xpath = "//*[@id=\"patient-birthDate\"]")
    public WebElement calendarIcon;

    @FindBy(xpath = "//a[@class='btn btn-danger btn-sm'][1]")
    public WebElement oldpatienttodelete;

    @FindBy(xpath = "//h5[@class='modal-title']")
    public WebElement confirmPopUp;

    @FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[3]/button[1]/span")
    public  WebElement cancelPopUp;

    @FindBy (xpath = "//div[@class='info jhi-item-count']")
    public WebElement showingPopulatedNumber;

    @FindBy(xpath = "//a[@class='btn btn-warning btn-sm']")
    public WebElement showAppointmentsinfirstpatient;
//   Doctor

    @FindBy(xpath = "//a[@class='btn btn-warning btn-sm'][1]")
    public WebElement doctorVerifyPatientsPage;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement firstPatientPageChooseEdit;

    @FindBy (xpath = "//div[@class='modal-content']")
    public WebElement signInVerifyA;

    @FindBy (xpath = "//div[@id='app-view-container']")
    public WebElement noSearchSSNForAdmin;

    //          Create or edit a user
    @FindBy(xpath = "//h2//a")
    public WebElement createANewUserTickBox;

    @FindBy(id="login")
    public WebElement loginTypeBox;

    @FindBy(id="firstName")
    public WebElement firstNameTypeBox;

    @FindBy(id="lastName")
    public WebElement lastNameTypeBox;

    @FindBy(id="email")
    public WebElement emailTypeBox;

    @FindBy(id="ssn")
    public WebElement ssnTypeBox;

    @FindBy(id="langKey")
    public WebElement languageDropDownBox;

    @FindBy(id="authorities")
    public WebElement profilesDropDownBox;

    @FindBy(xpath = "//button[@type='submit']")
    public  WebElement submitUserButton;
    @FindBy(xpath = "//span[normalize-space()='Appointment']")
    public WebElement appointmentsInDropdown;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]")
    public WebElement AdminPagePatientPatientID;
    @FindBy(xpath = "//span[normalize-space()='Patients']")
    public WebElement AdminPagePatientPatientVerify;


    //This web elements created in the first sprint
    //If you need any new WebElement please create at the bottom of the class
    //Create your new WebElements under this comment

    // Birol
    @FindBy (xpath = "//span[normalize-space()='Country']")
    public WebElement countryDropDown;
    @FindBy (xpath = "//input[@id='country-name']")
    public WebElement sendCountryName;
    @FindBy (xpath = "//span[normalize-space()='Save']")
    public WebElement saveCountryButton;
    @FindBy (xpath = "//div[@role='alert']")
    public WebElement countrySavedPopUp;
    @FindBy (xpath = "(//*[name()='path'][@fill='currentColor'])[1]")
    public WebElement homeIcon;
    @FindBy (xpath = "(//a)[1039]")
    public WebElement viewCountryDetailsButton;
    @FindBy (xpath = "//dd[normalize-space()='Alabama']")
    public WebElement viewCountryAlabama;
    @FindBy (xpath = "(//a)[1040]")
    public WebElement countryEditButton;
    @FindBy (xpath = "//input[@id='country-name']")
    public WebElement countryEditCountryNameBox;
    @FindBy (xpath = "(//a)[693]") //orjinal 1041 olacak bak yine de
    public WebElement countryDeleteButton;
    @FindBy (xpath = "//button[@id='jhi-confirm-delete-country']")
    public WebElement countryDeleteConfirmButton;
    @FindBy (xpath = "//div[@role='alert']")
    public WebElement countryDeletedPopUp;
    @FindBy(xpath = "//span[normalize-space()='Items&Titles']")
    public WebElement ItemsAndTitles;


    // these web elements belong to Seher

    @FindBy(xpath = "(//*[text()='Test Item'])[1]")
    public WebElement adminTestItemDropDownButton;

    //under create new test item button

    @FindBy(xpath = "//input[@id='c-test-item-name']")
    public WebElement adminPageCreateOrEditTestItemNameBox;

    @FindBy(xpath = "//input[@id='c-test-item-description']")
    public WebElement adminPageCreateOrEditTestItemDescriptionBox;

    @FindBy(xpath = "//input[@id='c-test-item-price']")
    public WebElement adminPageCreateOrEditTestItemPriceBox;

    @FindBy(xpath = "//input[@id='c-test-item-defaultValMin']")
    public WebElement adminPageCreateOrEditTestItemDefaultMinValueBox;

    @FindBy(xpath = "//input[@id='c-test-item-defaultValMax']")
    public WebElement adminPageCreateOrEditTestItemDefaultMaxValueBox;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement adminPageCreateOrEditTestItemSaveButton;

    @FindBy(xpath = "//*[contains(text(),'A new Test Item is created with identifier')]")
    public WebElement adminPageCreateOrEditTestItemPopUpMessage;

    @FindBy(xpath = "//*[text()='Internal server error.']")
    public WebElement adminPageCreateOrEditTestItemAlertMessage;

    @FindBy(xpath = "//*[text()='Created Date']")
    public WebElement createdDateChange;

    @FindBy(xpath = "//*[contains(text(),'A Test Item is deleted with identifier')]")
    public WebElement ATestItemIsDeletedWithIdentifier;


    //View test item page header
    @FindBy(xpath = "(//*[text()='Test Item'])[2]")
    public WebElement adminPageViewTestItemHeader;

    @FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div[3]/button[2]/span")
    public WebElement adminPageTestItemConfirmDeleteOperationButton;

    @FindBy(xpath = "//li[@id='entity-menu']")
    public WebElement adminItemsandTitles;

    @FindBy (xpath= "(//div[@role='menu'])[2]")
    public WebElement userManagementDropDownUnderAdmin;




}
