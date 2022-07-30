@doctor_appointment
@Regression
Feature: US_11 Doctor can create or edit the appointments

  Background:Doctor goes to url and sign in
    Given us11 doctor goes to base url
    And us11 doctor goes to sign in page
    When us11 doctor sign in
    And us11 doctor navigates to my pages
    And us11 doctor clicks on My appointments


  Scenario: TC1101_Doctor can create or edit an appointment and save their changes

    Then us11 verify patient's info id, start and end date, status, physician are present
    Given us11 doctor clicks on edit button to create or edit an apppointment
    When us11 doctor select the status
    And us11 doctor fill in necessary parts
    And us11 doctor clicks on Save button
    Then us11 verify appointment is saved successfully


  Scenario:TC1102_User should see the warning messages below each blank textbox that must be filled
    Given us11 doctor clicks on edit button to create or edit an apppointment
    When us11 doctor leaves the anamnesis Treatment and Diagnosis fields blank
    And us11 doctor clicks on Save button
    Then us11 verify that There is  warning message for each field

  Scenario: TC1103_To check some fields is optional
    Given us11 doctor clicks on edit button to create or edit an apppointment
    When us11 doctor select the status
    And us11 doctor fill in necessary parts
    And us11 doctor leave the prescription and description field empty
    And us11 doctor clicks on Save button
    Then us11 verify appointment is saved successfully

  Scenario: TC1104_To check doctors can edit status part
    Given us11 doctor clicks on edit button to create or edit an apppointment
    When us11 doctor select the status as unapproved
    Then us11 verify that Unapproved option can not be selectable
