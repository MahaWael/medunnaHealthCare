@US0505
@Regression
@Smoke_Test
Feature:Patient profile
  Background:
    Given us0501 Navigate to Medunna page

  @tc_0505
  Scenario Outline: test new applicants
    When us0501 Click on Profile icon button
    Then us0501 Click on Register button
    And us0501 Enter a valid SSN "<SSN>"
    And us0501 Enter a valid first name "<firstname>"
    And us0501 Enter a valid last name "<lastname>"
    And us0501 Enter a username "<username>"
    And us0501 Enter a valid email "<valid_email>"
    And us0501 Enter password without any symbols or gaps "<password>"
    And us0501 Enter New password confirmation "<newpassword>"
    And us0501 click register button
    Then us0501 Verify Registration Saved message pop up
    Then us0501 Click on Profile button
    Then us0501 Click on Signin button
    And us0501 User login with username "<username>"
    And us0501 User enters their password "<password>"
    Then us0501 User clicks sign in button
    Then us0501 Click on My Page (Patient) button
    Then us0501 Click on My Appointments
    Then us0501 Verify Appointments is visible
    Then us0501 Click on user's name
    Then us0501 Verify Patient page is visible
    And User closes the browser

    Examples:
      |SSN|firstname| lastname| username| valid_email|password|newpassword |username |password       |
      |543-44-8909|team89app09 |team89app09 |team89app09|team89app09@gmail.com|team89app09|team89app09|team89app09|team89app09|
