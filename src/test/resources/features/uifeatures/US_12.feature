@Regression
Feature: doctor
  Scenario Outline: doctor page
    Given user goes to base url
    Then us12 user clicks sign in button
    Then us12 user enters username
    And us12 user enters password
    And us12 user clicks on sign in button
    And us12 doctor navigates my pages
    And us12 doctor clicks on my appointments
    When us12 doctor clicks on edit button
    Then us12 doctor clicks on request a test button
    And us12 doctor verifies test has "<test>"
    Then us12 doctor selects listed items and saves
    And us12 doctor verifies test request is saved

    Examples:
      |test|
      |hemoglobin|
      #|glucose|
      #|sodium|
      #|urea|
      #|creatinine|
      #|potassium|
      #|total protein|
      #|albumin|

  Scenario: staff page
    Given user goes to base url
    Then us12 user clicks sign in button
    Then us12 staff enters username
    And us12 staff enters password
    And us12 user clicks on sign in button
    And us12 doctor navigates my pages
    And us12 doctor clicks on my appointments