@US_27_UI
@Regression
Feature: US_27
  Background:
    Given USTwentySeven The admin user goes to Medunna Url
    And USTwentySeven The admin clicks on the dropdown button
    And USTwentySeven The admin chooses Sign in option
    Then USTwentySeven The user verifies that sign in page appears
    And USTwentySeven The user fills username and password boxes
    And USTwentySeven The user admin clicks on the sign in button
    When USTwentySeven The user admin clicks on the items&titles dropdown button
    And USTwentySeven The user admin clicks on the Messages
    Then USTwentySeven The admin user verifies the page title


  Scenario Outline: US_27_Messages_TC_01
    * USTwentySeven The admin clicks on create a new message button
    * USTwentySeven The admin user verifies the create or edit a message page appears
    * USTwentySeven The admin user enters info to "<name>" "<email>" "<subject>" "<message>" boxes
    * USTwentySeven The admin user clicks on save button
    * USTwentySeven The admin user verifies the success message
    * USTwentySeven The admin user close the driver

    Examples: data 1
      |name|email|subject|message|
      |Ubuntu|ubuntu@gmail.com|cloudserver|message|

  Scenario Outline: US_27_Messages_TC_02
    * USTwentySeven The admin clicks on create a new message button
    * USTwentySeven The admin user verifies the create or edit a message page appears
    * USTwentySeven The admin user enters info to "<name>" "<email>" "<subject>" "<message>" boxes
    * USTwentySeven The admin user verifies the name field message
    * USTwentySeven The admin user close the driver
    Examples: data 2
      |name|email|subject|message|
      |    |ubuntu@gmail.com|cloudserver|message|

  Scenario Outline: US_27_Messages_TC_03
    * USTwentySeven The admin clicks on create a new message button
    * USTwentySeven The admin user verifies the create or edit a message page appears
    * USTwentySeven The admin user enters info to "<name>" "<email>" "<subject>" "<message>" boxes
    * USTwentySeven The admin user verifies the email field message
    * USTwentySeven The admin user close the driver
    Examples: data 3
      |name|email|subject|message|
      |  Ubuntu  |     |cloudserver|message|

  Scenario Outline: US_27_Messages_TC_04
    * USTwentySeven The admin clicks on create a new message button
    * USTwentySeven The admin user verifies the create or edit a message page appears
    * USTwentySeven The admin user enters info to "<name>" "<email>" "<subject>" "<message>" boxes
    * USTwentySeven The admin user verifies the subject field message
    * USTwentySeven The admin user close the driver
    Examples: data 4
      |name|email|subject|message|
      |  Ubuntu  |ubuntu@gmail.com|      |message|

  Scenario Outline: US_27_Messages_TC_05
    * USTwentySeven The admin clicks on create a new message button
    * USTwentySeven The admin user verifies the create or edit a message page appears
    * USTwentySeven The admin user enters info to "<name>" "<email>" "<subject>" "<message>" boxes
    * USTwentySeven The admin user clicks on save button
    * USTwentySeven The admin user verifies the success message
    * USTwentySeven The admin user close the driver
    Examples: data 5
      |name|email|subject|message|
      |  Ubuntu  |ubuntu@gmail.com|cloudserver|   |

  Scenario: US_27_Messages_TC_06
    * US27 The admin clicks on the message Id
    * US27 The admin clicks on edit button
    * US27 The admin user verifies the messages page
    * US27 The admin clears and write the name box as Vehbi
    * US27 The admin user verifies the success message
    * USTwentySeven The admin user close the driver

  Scenario: US_27_Messages_TC_07
    * US27 The admin clicks on the message Id
    * US27 The admin clicks on edit button
    * US27 The admin user verifies the messages page
    * US27 The admin clears and write the email box
    * US27 The admin user verifies the success message
    * USTwentySeven The admin user close the driver

  Scenario: US_27_Messages_TC_08
    * US27 The admin clicks on the message Id
    * US27 The admin clicks on edit button
    * US27 The admin user verifies the messages page
    * US27 The admin clears and write the email box as Vehbi
    * US27 The admin user verifies the warning message
    * USTwentySeven The admin user close the driver

  Scenario: US_27_Messages_TC_09
    * US27 The admin clicks on the message Id
    * US27 The admin clicks on edit button
    * US27 The admin user verifies the messages page
    * US27 The admin clears and write the subject box
    * US27 The admin user verifies the success message
    * USTwentySeven The admin user close the driver

  Scenario: US_27_Messages_TC_10
    * US27 The admin clicks on the message Id
    * US27 The admin clicks on edit button
    * US27 The admin user verifies the messages page
    * US27 The admin clears and write the message box
    * US27 The admin user verifies the success message
    * USTwentySeven The admin user close the driver

  Scenario: US_27_Messages_TC_11
    * US27 The admin clicks on the delete button of the corresponding message
    * US27 The admin clicks on delete button on the pop-up message
#    * US27 The admin verifies that deleted Id is not visible anymore s

  Scenario: US_27_Messages_TC_12
    * US27 The admin verifies the name, email, subject and messages titles are visible
    * USTwentySeven The admin user close the driver