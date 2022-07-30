@Regression
Feature: database_read_feature
  @db_patient_data
  Scenario: read_patient_info
    Given US09 user connects to the database
    And US09 user gets the "*" from "patient" table
    Then US09 User can read all of "first_name" column data
    Then US09 verify "patient" table "firts_name" column contains "Cara" data
    Then US09 close the database connection
