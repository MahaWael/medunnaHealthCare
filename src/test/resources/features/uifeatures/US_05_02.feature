@NewApplicant
@US_05
Feature: Patient data
  Background:
    Given US05 Navigate to Medunna page
    Then Click on Make an Appointment button

  @tc_0501
  Scenario Outline:TC_0501
    And user provides their first name as "<firstName>"
    And user types in their last name as "<lastName>"
    And user provides their ssn id as "<ssn>"
    And user enters their phone number as  "<phoneNumber>"
    And user types their email address as "<email>"
    Then user enters date Appointment_Date_Time as "<date>"
    Then Click on "Send and Appointment Request" box
    Then Verify "Appointment registration saved! We will call you as soon as possible" message pop up
    Then user registers and saves the records
    Examples: test data for new applicants
      | firstName|lastName|ssn|phoneNumber|email|date|
      |team89app09 |team89app09 |543-44-8909|655-455-2109|team89app09@gmail.co.uk|28/07/2022|



  @tc_0502
  Scenario Outline: TC_0502
    Then Enter an invalid SSN "<invalid_SSN>"
    Then Verify the message - Your SSN is invalid - is visible
    And User closes the browser
    Examples:
      |invalid_SSN|
      |343566666 |

  @tc_0503
  Scenario Outline: TC_0503
    Then Enter an invalid Email "<invalid_Email>"
    Then Verify the message - This field is invalid - is visible
    And User closes the browser
    Examples:
      | invalid_Email |
      | team89@gmahf  |

  @tc_0504
  Scenario Outline: TC_0504
    Then Enter an invalid phone number "<phoneNumber>"
    Then Verify the message - Phone number is invalid - is visible
    And User closes the browser
    Examples:
      | phoneNumber|
      | 655544452  |
