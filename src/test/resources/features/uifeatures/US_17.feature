@US_17
@Regression
Feature: password_strength
  Background:
    Given US17 goes to Medunna Url
    When US17 navigates to URL
    And US17 Admin clicks to Sign In Icon



  @US_17_TC_01
  Scenario Outline: create_test_items
    Given US17 Admin provide valid "<username>" and "<password>"
    And US17 Admin navigates to Items&Titles segment and clicks on Test Item
    Then  US17 Admin navigates Create a new Test Item button and clicks
    And US17 Admin navigates Name field clicks and send the name with faker
    And US17 Admin navigates Description field clicks and send it with faker
    And US17 Admin navigates Price field clicks and send it with faker
    And US17 Admin navigates Default Min Value clicks  and send it with faker
    And US17 Admin navigates Default Max Value colon clicks and send it with faker
    Then US17 Admin navigates save button and clicks
    And US17 Admin catch the message and verify it
    And US17 capture the screenshot
    Then US17 Close the page
    Examples:US17 Admin create the test items
      | username     | password   |
      | vusalgasimov | vusalgasimov |


  @US_17_TC_02
  Scenario Outline: view_test_items
    Given US17 Admin provide valid "<username>" and "<password>"
    And US17 Admin navigates to Items&Titles segment and clicks on Test Item
    Then  US17 Admin navigates View button and clicks
    Then  US17 Admin navigates Test Item information
    And US17 capture the screenshot
    Then US17 Close the page

    Examples:US17 Admin view the test items
      | username | password |
      | vusalgasimov | vusalgasimov |


  @US_17_TC_03
  Scenario Outline: delete_test_items
    Given US17 Admin provide valid "<username>" and "<password>"
    And US17 Admin navigates to Items&Titles segment and clicks on Test Item
    Then  US17 Admin navigates Delete button and clicks
    Then  US17 Admin navigates Confirm delete operation and clicks Delete button
    And US17 Admin catch the alert and verify it
    And US17 capture the screenshot
    Then US17 Close the page

    Examples:US17 Admin delete the test items
      | username | password |
      | vusalgasimov | vusalgasimov |