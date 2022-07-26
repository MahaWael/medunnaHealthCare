Feature: US17 Test Item DB validation

  @US17_DB
  Scenario Outline: US17_TestItem_DB_validation
    Given US17 admin connects to the database
    And US17 admin gets "*" from "c_test_item" table
    And US17 verify the "<table>","<columname>","<name>" test item
    Then user closes database connection
    Examples: test data of test item
      |table | columname |name|
      |select * from c_test_item |name |Urea|