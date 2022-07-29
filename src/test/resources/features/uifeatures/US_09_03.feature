@US09_staff
Feature: US_09_staff_search_edit_patient
  Background: user in login page
    Given US09 user goes to base url
    And US09 user clicks profile icon
    And US09 user click sign in button
    Then US09 click username box

  @US09_TC_08
  Scenario Outline: US09_08_staff_edit_patient
    And US09 user enters username2 "<username2>"
    And US09 user enters password2 "<password2>"
    And US09 user clicks Sign-in button in the pop-up page
    And US09 click MY PAGES Button on staff page
    And US09 click search patient button on staff page
    Then US09 verify staff in patients page
    Then US09 verify that patient SSN box visible
    And US09 user click edit button for first patient as staff
    And US09 verify that create or edit a patient page visible as staff
    Then US09 verify staff can edit firstname lastname birthdate email phone gender blood group address description user country and state
    And US09 click save button as staff
    Then US09 verify that pop up visible on the right corner
    And US09 staff close the application

    Examples:
      |username2|password2|
      |team89staff|team89staff|

  @US09_TC_09
  Scenario Outline: US09_09_staff_can_not_delete
    And US09 user enters username "<username2>"
    And US09 user enters password "<password2>"
    And US09 user clicks Sign-in button in the pop-up page
    And US09 click MY PAGES Button on staff page
    And US09 click search patient button on staff page
    Then US09 verify delete button not visible for first patient
    And US09 staff close the application

    Examples:
      |username2|password2|
      |team89staff|team89staff|

  @US09_TC_11
  Scenario Outline: US09_08_staff_can_search_patient
    And US09 user enters username "<username2>"
    And US09 user enters password "<password2>"
    And US09 user clicks Sign-in button in the pop-up page
    And US09 click MY PAGES Button on staff page
    And US09 click search patient button on staff page
    Then US09 verify that staff can search with SSN id
    And US09 click Ssn box patients page as staff
    And US09 staff enter valid ssn number "<validssn>"
    And US09 verify that staff can search patient page
    And US09 staff close the application

    Examples:
      |username2|password2|validssn|
      |team89staff|team89staff|678-67-6789|

