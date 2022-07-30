@US_21
@Regression
Feature: Staff can update patient appointments

  Background: US21 user in login page
    Given US21 user goes to medunna url
    When US21 user navigates to profile icon and clicks it
    And US21 user click sign in button
    Then US21 click username field

  @US_21_01
  Scenario Outline: US_21_08_staff_edit_patient
    And US21 user enters usernameUS21 "<usernameUS21>" as staff
    And US21 user enters passwordUS21 "<passwordUS21>" as staff
    Then US21 user clicks Sign-in button
    And US21 user navigates to MY PAGES Button and  click it
    And US21 click search patient button from dropdown
    Then US21 User Enters valid SSN number "<SSN Number>"
    And US21 User navigates to Show Appointments of patient and clicks
    And US21 User clicks the edit button of the first appointment
    Then US21 User can update the status "<status1>" CANCELLED , "<status2>" PENDING or "<status3>" UNAPPROVED
    And US21 User selects the current doctor whose doctor value "<doctorvalue>"
    Then US21 User clicks Save button and verifies that is saved
    And US21  Staff close the application

    Examples:
      |usernameUS21|passwordUS21|SSN Number|status1|status2|status3|doctorvalue|
      |team89staff01|team89staff|890-12-4324|CANCELLED|PENDING|UNAPPROVED|115993|

  @US_21_02
  Scenario Outline: US_21_08_staff_edit_patient
    And US21 user enters usernameUS21 "<usernameUS21>" as staff
    And US21 user enters passwordUS21 "<passwordUS21>" as staff
    Then US21 user clicks Sign-in button
    And US21 user navigates to MY PAGES Button and  click it
    And US21 click search patient button from dropdown
    Then US21 User Enters valid SSN number "<SSN Number>"
    And US21 User navigates to Show Appointments of patient and clicks
    Then US21 User clicks Show Tests button
    And US21 User clicks View Results button
    Then US21 Verify that user can see Test Results
    And US21  Staff close the application

    Examples:
      |usernameUS21|passwordUS21|SSN Number|
      |team89staff01|team89staff|890-12-4324|

