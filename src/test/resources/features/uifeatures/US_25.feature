@US_25
Feature:Patient profile
  Background:
    Given user25 Navigate to Medunna page

  @tc_2501
  Scenario Outline: test new applicants
    When user25 Click on profile icon
    Then user25 Click on Sign in button
    And user25 enter valid credentials username as "<username>" and password as "<password>" boxes
    And user25 Clicks sign in button
    And user25 Click on My Page (Patient) button
    And user25 Click on Make an Appointment button
    And user25 clicks on phone box and types valid phone number as "<phonenumber>"
    And user25 Click on Send an Appointment Request button
    Then user25 Verify Appointment registration saved! We will call you as soon as possible message is visible
    And user25 clicks on My Page (Patient) button
    And user25 Click on my appointments
    Then user25 Verify Appointments page is visible
    And user25 User closes the browser
    Examples:
      |username|password|phonenumber|
      |team89patient01|patient01|345-789-3435|