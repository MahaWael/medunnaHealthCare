@US24
@Regression
Feature: My appointment validation By Patient
  Background:
    Given US24 patient goes to medunna url
    Then US24 patient sign in
    Then US24 patient clicks to my pages dropdown
    Then US24 patient clicks to my appointment

  @US24_TC001
  Scenario:US24_TC001
    Given US24_TC001 patient controls test date and description
    Then US24_TC001 patient controls test min and max values


  @US24_TC002
  Scenario: US24_TC002
    Given US24_TC002 patient opens the invoice
    Then US24_TC002 patient verifies the invoice