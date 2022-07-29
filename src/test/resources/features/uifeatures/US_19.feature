@US_19_UI
Feature: Creating_New_Staff

  Background: user_launches_the_browser
    Given  US19 user launches the browser
    Then  US19 user goes to medunna url
    Then   US19 user clicks on dropDownList
    Then  US19 User clicks to SignIn  button
    Then US19 User enters credentials and signs in
    When  US19 User navigates to Items & Titles
    And US19 User clicks on Staff button


  @US19_01
  Scenario Outline: TC_01_Creating_new_staff_And_Searching_by_SSN
    Then  US19 User clicks on Create a new Staff button
    Then US19 User enters SSN "<SSN>", firstname "<firstname>", lastname "<lastname>", phone number "<phone number>" and DOB "<date of birth>"
    Then  US19 User clicks Save button
    Then US19 User clicks on Create a new Staff button for searching the new created staff
    Then  US19 User clicks on Create a new Staff button
    And  US19 User enter SSN of new staff to search about it
    Then US19 User clicks on Search user button
    Then US19 User receives the message of success

    Examples:
      |SSN| firstname| lastname| phone number| date of birth|
      |670-50-8249| team89| staff1| 12452314556| 24/07/83 |

  @US19_02
  Scenario: TC_02_New_staff_info_are_populated
    When US19 User clicks on View button
    Then US19 User can see the info of the new staff and verify that

  @US19_03
  Scenario: TC_03_Admin_can_select_a_user_from_the_existing_users
    When US19 User clicks on the new staff id button to view it
    Then US19 User verifies viewing the  info


  @US19_04
  Scenario: TC_04_info_is_editable
    When US19 User clicks on Edit button of the new staff
    Then US19 User edits the phone number
    And US19 User click Save button
    Then US19 User receives success message

  @US19_05
  Scenario: TC_05_info_can_be_deleted
    When US19 User clicks on delete button of the new staff
    Then US19 User delete the phone number
    And US19 User click on Save button
    Then US19 User receives the success message