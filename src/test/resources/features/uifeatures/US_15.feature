@US_15
Feature: Create or edit patient by admin


  Background:
    Given Admin goes to medunna url
    Then Admin navigates the sign in page
    Then Admin sign in
    Then Admin navigates to Items&Titles segment

  Scenario:TC_001
    Given Admin clicks to patients button
    Then Admin clicks on create a new patient
    Then Admin creats new patients with necessary credentials
    Then Admin clicks on save button
    And Admin closes the browser for test01

  Scenario:TC_002
    Given Admin clicks to patients button
    Then Admin clicks on patients ID
    Then Admin verify all necessary credential
    And Admin closes the browser for test02

  Scenario:TC_003
    Given Admin clickcs to appointment button
    And Admin  clicks on patient's ID
    Then Admin clicks on edit button
    Then Admin try to assign doctor for patient
    And Admin closes the browser for test03

  Scenario:TC_004
    Given Admin clickcs to patients button
    Then Admin clicks on patients ID
    Then Admin control patient's state or blank
    Then Admin verify patient's country is US and can not be blank
    And Admin closes the browser for test04




