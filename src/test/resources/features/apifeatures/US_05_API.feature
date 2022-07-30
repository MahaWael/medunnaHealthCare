@Regression
Feature: api patient data

  @US05_GetApiPatient
  Scenario: appointment get request
    Given user sends get request for patients' appointment data
    Then user deserializes the patients' data to Java
    And user saves the patients' data to correspondent files and validates






