@US_17_API
Feature: test items

  @US17_PostAPI
  Scenario: fetch all data of test items
    Given US17 admin send a post request to created test items' data
    And US17 admin deserializes the created test items' data to java
    Then US17 admin saves the test items' data to correspondent files and validates