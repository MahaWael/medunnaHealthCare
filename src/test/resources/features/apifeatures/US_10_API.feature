@Regression
Feature: Validate appointments with API
  @US_10Api
  Scenario:
    Given doctor sends a get request for appointment data
    And doctor deserializes the appointment data to java
    Then doctor saves the appointment data to correspondent files and validates