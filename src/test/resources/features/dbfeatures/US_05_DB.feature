@Regression
  @Smoke_Test
Feature: US_05 Appointment DB validation
  @US05db_patient_id_appointment
  Scenario Outline: US05db_patient_id_appointment
    Given user connects to the database
    And user gets "*" from "appointment" table
    And verify the "<table>", "<column>", "<id>" appointment
    Then user closes database connection
    Examples: test data of id
      |table    | column | id     |
      |appointment | jhi_user| 112412 |


