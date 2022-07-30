@Regression
Feature: Check DB Connectivity for Messages
  @US_27_DB
  Scenario: messages
    Given US27 The user connects to DB
    And US27 The user gets "*" columns from "cmessage" table
    Then US27 The user verifies that "cmessage" table "name" column contains "Azer Bulbul"
    And US27 The user closes the DB