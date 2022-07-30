@Regression
Feature:TC_0704
  @api
  @tc_0704
  Scenario: TC_0704
    Given US07 user sends a get request for appointment data
    And US07 user deserializes the data to java
    Then US07 user saves the appointment data to correspondent file and validates