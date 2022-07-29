@patientprofile
@US_05
Feature:Patient profile
  Background:
    Given  US05 Navigate to Medunna page

  @tc_0505
  Scenario Outline: test new applicants
    When Click on Profile icon button
    Then Click on Register button
    And Enter a valid SSN "<SSN>"
    And Enter a valid first name "<firstname>"
    And Enter a valid last name "<lastname>"
    And Enter a username "<username>"
    And Enter a valid email "<valid_email>"
    And Enter password without any symbols or gaps "<password>"
    And Enter New password confirmation "<newpassword>"
    And click register button
    Then Verify Registration Saved message pop up
    Then Click on Profile button
    Then US05 Click on Sign in button
    And User login with username "<username>"
    And User enters their password "<password>"
    Then User clicks sign in button
    Then Click on My Page (Patient) button
    Then Click on My Appointments
    Then Verify Appointments is visible
    Then Click on user's name
    Then Verify Patient page is visible
    And User closes the browser

    Examples:
      |SSN|firstname| lastname| username| valid_email|password|newpassword |username |password       |
      |543-44-8909|team89app09 |team89app09 |team89app09|team89app09@gmail.com|team89app09|team89app09|team89app09|team89app09|
