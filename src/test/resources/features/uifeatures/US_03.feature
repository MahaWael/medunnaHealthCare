@US_03
  @Regression
Feature: password_strength
  Background:
    Given user goes to Medunna Url
    When user navigates to URL
    And user clicks to Register button

  Scenario: us3_tc1
    And user enters any four characters
    Then user verifies that text of Your password is required to be at least four characters.  is visible
    And user closes the browser

  Scenario: us3_tc2
    And user enters six small letters as password
    Then user verifies that strength bar is red
    And user closes the browser

  Scenario: us3_tc3
    And user enters six small letters and one capital letter as password
    Then user verifies that strength bar is orange
    And user closes the browser

  Scenario: us3_tc4
    And user enters five small letters and two capital letter as password
    Then user verifies that strength bar is orange
    And user closes the browser


  Scenario: us3_tc5
    And user enters seven small letters and only as password
    Then user verifies that strength bar is red
    And user closes the browser

  Scenario: us3_tc6
    And user enters six capital letters and one small letter as password
    Then user verifies that strength bar is orange
    And user closes the browser

  Scenario: us3_tc7
    And user enters four capital letters and three small letter as password
    Then user verifies that strength bar is orange
    And user closes the browser

  Scenario: us3_tc8
    And user enters seven capital letters as password
    Then user verifies that strength bar is red
    And user closes the browser

  Scenario: us3_tc9
    And user enters six small letters and one digit as password
    Then user verifies that strength bar is orange
    And user closes the browser

  Scenario: us3_tc10
    And user enters six capital letters and one digit as password
    Then user verifies that strength bar is orange
    And user closes the browser

  Scenario: us3_tc11
    And user enters six seven digits as password
    Then user verifies that strength bar is red
    And user closes the browser

  Scenario: us3_tc12
    And user enters six capital letters and one special character as password
    Then user verifies that strength bar is orange
    And user closes the browser

  Scenario: us3_tc13
    And user enters five capital letters, one digit and one special character as password
    Then user verifies that strength bar is lime
    And user closes the browser

  Scenario: us3_tc14
    And user enters seven special characters as password
    Then user verifies that strength bar is red
    And user closes the browser

  Scenario: us3_tc15
    And user enters four capital and three small letters without special characters as password
    Then user verifies that strength bar is orange
    And user closes the browser

  Scenario: us3_tc16
    And user enters six capital and one small letters one digit without special characters as password
    Then user verifies that strength bar is lime
    And user closes the browser

  Scenario: us3_tc17
    And user enters four capital and one small letter, one digit and one special character as password
    Then user verifies that strength bar is green
    And user closes the browser
