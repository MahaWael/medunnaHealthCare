@databaseTest
@Regression
Feature: database_read_feature

  @db_validate_appointment
  Scenario: read_patient_id
    Given doctor connects to the database
    And doctor gets the "*" from "appointment" table
    And doctor reads all of the "id" column data
    And doctor verify appointment
    Then close the database connection