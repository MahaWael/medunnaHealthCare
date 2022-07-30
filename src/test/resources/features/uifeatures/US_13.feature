@US_13
Feature: password_strength
  Background:
    Given user goes to Medunna Url
    When user navigates to URL
    And doctor clicks to Sign In Icon



  @US_13_TC_01
  Scenario Outline: see_test_information
    Given Doctor provide valid "<username>" and "<password>"
    And doctor navigates to My Pages segment and clicks on My Appointments
    Then  doctor navigates Edit button and clicks
    And Doctor navigates Show Test Result and clicks
    And Doctor navigates and clicks to View Results
    And Doctor verifies all test information
    And capture the screenshot
    Then Close the page
    Examples:Doctor see the test results
      | username     | password   |
      | sudan_dr_ph1 | Abc123def* |

  @US_13_TC_02
  Scenario Outline: request_inpatient
    Given Doctor provide valid "<username>" and "<password>"
    And doctor navigates to My Pages segment and clicks on My Appointments
    Then  doctor navigates Edit button and clicks
    And Doctor navigates and clicks to Request Inpatient button
    And Doctor verifies succes message contains A new In Patients is created
    And capture the screenshot
    Then Close the page
    Examples:Doctor can request inpatient
      | username     | password   |
      | sudan_dr_ph1 | Abc123def* |

