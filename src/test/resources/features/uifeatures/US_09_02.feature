@US09_TC_10
Feature: US_09_doctor_patient_page
  Background: user in login page
    Given US09 user goes to base url
    And US09 user clicks profile icon
    And US09 user click sign in button
    Then US09 click username box

  Scenario Outline: no_delete button
    And US09 user enters username "<username3>"
    And US09 user enters password "<password3>"
    And US09 user clicks Sign-in button in the pop-up page as doctor
    And US09 click MY PAGES button as doctor
    And US09 click Search Patient button as doctor
    Then US09 verify that doctor in Patients page
    Then US09 verify that delete button not visible
    And US09 close the application

    Examples:
      |username3|password3|
      |team89doctor|team89doctor|