Feature: Validate appointments with API



  @US_15Api
  Scenario:
    Given admin sends a get request for patient data
    And admin deserializes the patient data to java
    Then admin saves the patient data to correspondent files and validates