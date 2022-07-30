@Regression
Feature: registration
  @US02TC01
  Scenario Outline: register_with_valid_credentials
    Given us02 user goes to base url
    And us02 user clicks register button
    Then us02 us02 user enters SSN "<SSN>"
    And us02 user enters first name "<first_name>"
    And us02 user enters last name "<last_name>"
    And us02 user enters username with faker "<user_name>"
    And us02 user enters email with faker "<email>"
    And us02 user enters password "<password>"
    And us02 user types in their password confirmation as "<passwordconfirm>"
    Then us02 user registers and saves the records


    Examples:
      |SSN        |first_name   |last_name        |user_name  |email            |password|passwordconfirm|
      |777-89-5550|Brian        |Cole             |bcoleu13    |examplefu@email.com|test123?|test123?|

  @US02TC02
  Scenario: register_without_a_username

    Given user goes to base url
    And us02 user clicks register button
    And us02 user clicks on the username box without sending data
    And us02 user clicks on the firstname box
    And us02 user verifies getting name warning message

  @US02TC03
  Scenario Outline: register_with_invalid_emails

    Given user goes to base url
    And us02 user clicks register button
    And us02 user enters email "<email>"
    And us02 user clicks on the firstname box
    And us02 user verifies getting email warning message

    Examples:
      |email|
      |example.email.com|
      |example@emailcom|
      |textsample|
      |joe@example@email.com|
      |joe.@email.com|
      |.joe@email.com|
      |example@email|
      |joe@example!sample.com|
      |joe@@email.com|
      |joe...joe@email.com|
      |#@%^%#$@#$@#.com|
      |joe@email.web|
      |joe@111.222.333.44445|


  @US02TC04
  Scenario Outline: register_with_valid_username

    Given user goes to base url
    And us02 user clicks register button
    And us02 user enters username "<user_name>"
    And us02 user clicks on the firstname box
    And us02 user verifies getting username warning message

    Examples:
      |user_name|
      |b_cole|
      |bcole?|

  @US02TC05
  Scenario: register_without_a_username

    Given user goes to base url
    And us02 user clicks register button
    And us02 user clicks on the email box without sending data
    And us02 user clicks on the firstname box
    And us02 user verifies getting email required message