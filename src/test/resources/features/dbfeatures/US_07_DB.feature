@Regression
Feature:TC_0705
  @tc_0705
  Scenario: TC_0705
    Given US07 user connects to the database
    Then US07 gets appointment data from database and verify appointments
    Then US07 close the database connection