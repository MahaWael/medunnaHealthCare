@US_10
Feature: Test my appointments for physician
  Background:
    Given Doctor goes to medunna url
    Then Doctor navigates the sign in page
    Then Doctor sign in
    Then Doctor navigates to My Pages segment
    And Doctor clicks on My appointments


  Scenario:TC_001
    Given Doctor verify appointment list and time slot are present
    And Doctor closes the browser for test01

  Scenario:TC_002
    Given Doctor clicks on Edit button
    And Doctor verifies patient's info id, start and end date, status, physician and patient are present
    And Doctor closes the browser for test02

