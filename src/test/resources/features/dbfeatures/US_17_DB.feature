@Regression
Feature: US17 Test Item DB validation

  @US17_DB
  Scenario: US17_TestItem_DB_validation
    Given US17 admin connects to the database
    And US17 admin gets "*" from "c_test_item" table
    Then US17 admin verify "c_test_item" table "name" column contains "Urea"
    Then US17 close the connection
