@Regression
Feature: create country
  @US28
  Scenario: Admin creates a country
    Given user goes to base url
    Then user clicks sign in button
    Then us28 user enters username
    And us28 user enters password
    And us28 user clicks on sign in button
    And us28 user clicks items and titles button
    And us28 user clicks country button
    And us28 user clicks create a new country button
    Then us28 user sends a country "Alabama"
    And us28 user clicks save button
    Then us28 user verifies request is saved
  @US28
  Scenario: Admin views country details
    Given user goes to base url
    Then user clicks sign in button
    Then us28 user enters username
    And us28 user enters password
    And us28 user clicks on sign in button
    And us28 user clicks items and titles button
    And us28 user clicks country button
    And us28 user clicks view button
    And us28 user verifies reading country data


  @US28
  Scenario: Admin changes the country name
    Given user goes to base url
    Then user clicks sign in button
    Then us28 user enters username
    And us28 user enters password
    And us28 user clicks on sign in button
    And us28 user clicks items and titles button
    And us28 user clicks country button
    And us28 user clicks edit button
    And us28 user changes the country name "Minnesota"
    And us28 user clicks save button

  @US28
  Scenario: Admin creates a country
    Given user goes to base url
    Then user clicks sign in button
    Then us28 user enters username
    And us28 user enters password
    And us28 user clicks on sign in button
    And us28 user clicks items and titles button
    And us28 user clicks country button
    And us28 user clicks delete button
    And us28 user confirms delete operation
    And us28 user verifies the country deleted
