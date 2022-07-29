@admin09
Feature: Admin
  Background: user in login page
    Given US09 user goes to base url
    And US09 user clicks profile icon
    And US09 user click sign in button
    Then US09 click username box
  @US09_TC_01
  Scenario Outline: US_0901_admin_view_patient_info
    And US09 user enters username "<username>"
    And US09 user enters password "<password>"
    And US09 user clicks Sign-in button in the pop-up page
    Then US09 verify that the Items&Titles button is visible
    And US09 click Items&Titles button us09
    And US09 click Patient button us09
    Then US09 verify that user is in Patients page
    Then US09 verify that there is a view button on the first patient
    And US09 click view button for the first patient
    Then US09 verify that the user is in the patient's information page
    And US09 close the application

    Examples: test data to login
      |username|password|
      |vusalgasimov|vusalgasimov|


  @US09_TC_02
  Scenario Outline: US_0902_Edit Patient
    And US09 user enters username "<username>"
    And US09 user enters password "<password>"
    And US09 user clicks Sign-in button in the pop-up page
    And US09 click Items&Titles button us09
    And US09 click Patient button us09
    Then US09 verify that user is in Patients page
    Then US09 verify that there is a Edit button on the first patient
    And US09 click Edit button for the first patient
    And US09 Verify user in patient page
    And US09 user enters firstname and lastname bithdate email phone gender blood group address description User Country State
    And US09 click Save
    Then US09 verify that pop up visible on the left corner
    And US09 close the application
    Examples:
      |username|password|
      |vusalgasimov|vusalgasimov|


  @US09_TC_03
  Scenario Outline: US_0903_no_ssn_search
    And US09 user enters username "<username>"
    And US09 user enters password "<password>"
    And US09 user clicks Sign-in button in the pop-up page
    And US09 click Administration button
    And US09 click User mamagement button
    Then US09 verify that user is in Users page
    Then US09 verify that SSN search box is visible
    And US09 close the application

    Examples:
      |username|password|
      |vusalgasimov|vusalgasimov|

  @US09_TC_04
  Scenario Outline: US_0904_admin can see populated registration info
    And US09 user enters username "<username>"
    And US09 user enters password "<password>"
    And US09 user clicks Sign-in button in the pop-up page
    And US09 click Administration button
    And US09 click User management button
    Then US09 verify that user can see all registration info populated
    And US09 close the application

    Examples:
      |username|password|
      |vusalgasimov|vusalgasimov|

  @US09_TC_07
  Scenario Outline: US_0907_admin_can_not_delete_patient
    And US09 user enters username "<username>"
    And US09 user enters password "<password>"
    And US09 user clicks Sign-in button in the pop-up page
    And US09 click Items&Titles button us09
    And US09 click Patient button us09
    Then US09 verify that the first patient has delete button
    And US09 click Delete button of the first patient on the first page
    Then US09 verify that pop up shows up
    And US09 verify that delete button is ckickable
    And US09 close the application
    Examples:
      |username|password|
      |vusalgasimov|vusalgasimov|

  @US09_TC_12
  Scenario Outline: ssn_seach_box_not_visible
    And US09 user enters username "<username>"
    And US09 user enters password "<password>"
    And US09 user clicks Sign-in button in the pop-up page
    And US09 click Items&Titles button us09
    And US09 click Patient button us09
    Then US09 verify that user is in Patients page
    Then US09 verify Patients SSN Search box not visible
    And US09 close the application

    Examples:
      |username|password|
      |vusalgasimov|vusalgasimov|


