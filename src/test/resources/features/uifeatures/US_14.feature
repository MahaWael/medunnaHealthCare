@US_14
Feature: password_strength
  Background:
    Given user goes to Medunna Url
    When user navigates to URL
    And doctor clicks to Sign In Icon



  @US_14_TC_01
  Scenario Outline: see_test_information
    Given Doctor provide valid "<username>" and "<password>"
    And doctor navigates to My Pages segment and clicks
    Then doctor clicks My Inpatients
    And Doctor verifies all info from inpatient
    And capture the screenshot
    Then Close the page
    Examples:Doctor can see all info from inpatient
      | username     | password   |
      | sudan_dr_ph1 | Abc123def* |

  @US_14_TC_02_01
  Scenario Outline: see_test_information
    Given Doctor provide valid "<username>" and "<password>"
    And doctor navigates to My Pages segment and clicks
    Then doctor clicks My Inpatients
    And Doctor navigates Edit button and clicks
    And Doctor can especially update status staying of InPatient
    Then Close the page
    Examples:you can see status update result
      | username     | password   |
      | sudan_dr_ph1 | Abc123def* |

  @US_14_TC_02_02
  Scenario Outline: see_test_information
    Given Doctor provide valid "<username>" and "<password>"
    And doctor navigates to My Pages segment and clicks
    Then doctor clicks My Inpatients
    And Doctor navigates Edit button and clicks
    And Doctor can especially update status discharged of InPatient
    Then Close the page
    Examples:you can see status update result
      | username     | password   |
      | sudan_dr_ph1 | Abc123def* |

  @US_14_TC_02_03
  Scenario Outline: see_test_information
    Given Doctor provide valid "<username>" and "<password>"
    And doctor navigates to My Pages segment and clicks
    Then doctor clicks My Inpatients
    And Doctor navigates Edit button and clicks
    And Doctor can especially update status cancelled of InPatient
    Then Close the page
    Examples:you can see status update result
      | username     | password   |
      | sudan_dr_ph1 | Abc123def* |

  @US_14_TC_03
  Scenario Outline: see_test_information
    Given Doctor provide valid "<username>" and "<password>"
    And doctor navigates to My Pages segment and clicks
    Then doctor clicks My Inpatients
    And Doctor navigates Edit button and clicks
    And Doctor can navigates room drop down and clicks
    And Doctor can navigates Save button and clicks
    Then Close the page
    Examples:you can see room update result
      | username     | password   |
      | sudan_dr_ph1 | Abc123def* |