@US_13
@Regression
Feature: password_strength
  Background:
    Given us13 user goes to Medunna Url
    When us13 user navigates to URL
    And us13 doctor clicks to Sign In Icon



  @US_13_TC_01
  Scenario Outline: see_test_information
    Given us13 Doctor provide valid "<username>" and "<password>"
    And us13 doctor navigates to My Pages segment and clicks on My Appointments
    Then  us13 doctor navigates Edit button and clicks
    And us13 Doctor navigates Show Test Result and clicks
    And us13 Doctor navigates and clicks to View Results
    And us13 Doctor verifies all test information
    And us13 capture the screenshot
    Then us13 Close the page
    Examples:Doctor see the test results
      | username     | password   |
      | sudan_dr_ph1 | Abc123def* |

  @US_13_TC_02
  Scenario Outline: request_inpatient
    Given us13 Doctor provide valid "<username>" and "<password>"
    And us13 doctor navigates to My Pages segment and clicks on My Appointments
    Then  us13 doctor navigates Edit button and clicks
    And us13 Doctor navigates and clicks to Request Inpatient button
    And us13 Doctor verifies succes message contains A new In Patients is created
    And us13 capture the screenshot
    Then us13 Close the page
    Examples:Doctor can request inpatient
      | username     | password   |
      | sudan_dr_ph1 | Abc123def* |

