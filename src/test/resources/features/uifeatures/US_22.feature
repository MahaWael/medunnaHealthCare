@us22
Feature: Patient Test results by Staff (Laboratory technician)

  @us22_01
  Scenario Outline: US_22_01
    Given US22 user goes to Medunna website
    Then US22 user logs in as a Staff
    And US22 user click Search Patients link
    Then US22 verify patients search input box is visible
    Then US22 user enters a valid SSN "<SSN>" into search input box
    And US22 user verify the results that searched SSN is visible
    And US22 user closes the browser

    Examples: Ssn
      | SSN         |
      | 317-16-6114 |
      | 321-54-4567 |
      | 832-71-5231 |

  @us22_02
  Scenario Outline: US_22_02
    Given US22 user goes to Medunna website
    Then US22 user logs in as a Staff
    And US22 user click Search Patients link
    Then US22 verify patients search input box is visible
    Then US22 user enters a invalid SSN "<SSN>" into search input box
    And US22 user verify any result does not come up
    And US22 user closes the browser

    Examples: Ssn
      | SSN         |
      | 987-12-1234 |
      | 987-12-7898 |
      | 321-12-5436 |


  @us22_03
  Scenario Outline: US_22_03
    Given US22 user goes to Medunna website
    Then US22 user logs in as a Staff
    And US22 user click Search Patients link
    Then US22 verify patients search input box is visible
    And US22 user clicks first patient's show appointments button
    And US22 verify appointments page is visible
    And US22 user clicks first show tests button
    And US22 user verify tests page is visible
    And US22 user clicks first test view result button
    And US22 verify test results page is visible
    And US22 user clicks first test's edit button
    And US22 verify  test result update page is visible
    And US22 user enters a number "<result>" into result input box
    And US22 user click save
    And US22 verify the test result is updated message comes up
    And US22 verify the test result is updated
    And US22 user closes the browser

    Examples: Result
      | result |
      | 80     |
      | 60     |
      | 50     |

  @us22_04
  Scenario Outline: US_22_04
    Given US22 user goes to Medunna website
    Then US22 user logs in as a Staff
    And US22 user click Search Patients link
    Then US22 verify patients search input box is visible
    And US22 user clicks first patient's show appointments button
    And US22 verify appointments page is visible
    And US22 user clicks first show tests button
    And US22 user verify tests page is visible
    And US22 user clicks first test view result button
    And US22 verify test results page is visible
    And US22 user clicks first test's edit button
    And US22 verify  test result update page is visible
    And US22 user enters a description "<description>" into description input box
    And US22 user click save
    And US22 verify the test description is updated message comes up
    And US22 verify the test description is updated
    And US22 user closes the browser



    Examples:
      | description       |
      | Calcitonin Test   |
      | CCP Antibody Test |
      | Dental Exam       |


  @us22_05
  Scenario: US_22_05
    Given US22 user goes to Medunna website
    Then US22 user logs in as a Staff
    And US22 user click Search Patients link
    Then US22 verify patients search input box is visible
    And US22 user clicks first patient's show appointments button
    And US22 verify appointments page is visible
    And US22 user clicks first show tests button
    And US22 user verify tests page is visible
    And US22 user clicks first test view result button
    And US22 verify test results page is visible
    And US22 user clicks first test's edit button
    And US22 verify  test result update page is visible
    And US22 verify test id is visible
    And US22 verify test id is not updatable
    And US22 user closes the browser


  @us22_06
  Scenario: US_22_06
    Given US22 user goes to Medunna website
    Then US22 user logs in as a Staff
    And US22 user click Search Patients link
    Then US22 verify patients search input box is visible
    And US22 user clicks first patient's show appointments button
    And US22 verify appointments page is visible
    And US22 user clicks first show tests button
    And US22 user verify tests page is visible
    And US22 user clicks first test view result button
    And US22 verify test results page is visible
    And US22 user clicks first test's edit button
    And US22 verify  test result update page is visible
    And US22 verify test date is visible
    And US22 verify test date is not updatable
    And US22 user closes the browser

  @us22_07
  Scenario: US_22_07
    Given US22 user goes to Medunna website
    Then US22 user logs in as a Staff
    And US22 user click Search Patients link
    Then US22 verify patients search input box is visible
    And US22 user clicks first patient's show appointments button
    And US22 verify appointments page is visible
    And US22 user clicks first show tests button
    And US22 user verify tests page is visible
    And US22 user clicks first test view result button
    And US22 verify test results page is visible
    And US22 user clicks first test's edit button
    And US22 verify  test result update page is visible
    And US22 verify test created date is visible
    And US22 verify test created date is not updatable
    And US22 user closes the browser


  @us22_08
  Scenario: US_22_08
    Given US22 user goes to Medunna website
    Then US22 user logs in as a Staff
    And US22 user click Search Patients link
    Then US22 verify patients search input box is visible
    And US22 user clicks first patient's show appointments button
    And US22 verify appointments page is visible
    And US22 user clicks first show tests button
    And US22 user verify tests page is visible
    And US22 user clicks first test view result button
    And US22 verify test results page is visible
    And US22 user clicks first test's edit button
    And US22 verify  test result update page is visible
    And US22 verify test item is visible
    And US22 verify test item is not updatable
    And US22 user closes the browser


  @us22_09
  Scenario: US_22_09
    Given US22 user goes to Medunna website
    Then US22 user logs in as a Staff
    And US22 user click Search Patients link
    Then US22 verify patients search input box is visible
    And US22 user clicks first patient's show appointments button
    And US22 verify appointments page is visible
    And US22 user clicks first show tests button
    And US22 user verify tests page is visible
    And US22 user clicks first test view result button
    And US22 verify test results page is visible
    And US22 user clicks first test's edit button
    And US22 verify  test result update page is visible
    And US22 verify test  is visible
    And US22 verify test  is not updatable
    And US22 user closes the browser