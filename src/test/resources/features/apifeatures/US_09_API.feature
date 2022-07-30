@Regression
Feature: validate patient info
  @09All_ApiPatientInfo
  Scenario: total patient info
    Given user sends a get request for patient data
    When user deserializes the patient data  to java
    Then user saves the patient data to correspondent files and validates
