@US27_Api
Feature: Us_27_Api
  Background:
    * US27Api User gets the token

  @US_27_Api_GetRequest
  Scenario: Get Request
    * US27Api User sets the spec params
    * US27Api User sends a get request for users data
    * US27Api User deserializes the users' data to java
    * US27Api User do a validation

  @US_27_Api_PutRequest
  Scenario Outline:Put Request
    * US27Api user sets the expected data as "<name>" "<email>" "<subject>" "<message>"
    * US27Api User sends a put request for data
    * US27Api User deserializes the data to java
    * US27Api User verifies the data
    Examples: data
      |name|email|subject|message|
      |Suveyda|suveyda@gmail.com|lateness|I'll be late for appointment|

  @US_27_Api_PostRequest
  Scenario Outline:Post Request
    * US27Api Users set the expected data as "<name>" "<email>" "<subject>" "<message>"
    * US27Api User sends a post request for data
    * US27Api User deserializes and verifies the data to java

    Examples: data
      |name|email|subject|message|
      |Vehbi|vehbi@gmail.com|lateness|I'll be late for appointment|

  @US_27_Api_DeleteRequest
  Scenario Outline: Delete Request
    * US27Api User endpoint "<endpoint>" and with id "<id>" delete the message
#    * US27Api User does verification
    Examples: data 3
      |endpoint|id|
      | https://www.medunna.com/api/c-messages/ | 77072 |