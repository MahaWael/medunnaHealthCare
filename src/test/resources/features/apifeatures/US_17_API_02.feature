@US_17_API
@Regression
Feature: test items

  @US17_GetAPI
  Scenario: fetch all data of test items
    Given US17 admin send a get request for test items' data
    And US17 admin deserializes the test items' data to java
    Then US17 admin saves the test items data to correspondent files and validates