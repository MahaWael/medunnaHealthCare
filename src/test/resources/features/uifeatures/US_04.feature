@us04
Feature: US04
  @tc_0401
  Scenario Outline: TC_0401
    Given US04 Navigate to Medunna page
    Then US04 Verify that home page is visible successfully
    And  US04 Click on Sign in button
    Then US04 Verify Sign in page is visible succesfully
    Then US04 Enter a valid username "<username>"
    And US04 Enter a valid password "<password>"
    Then US04 Click Sign in button
    And US04 Verify the message that user has logined succesfully
    And US04 Verify that first name and last name of user are visible
    And US04 Close the browser

    Examples:
      | username    | password    |
      | team89admin | team89admin |

  @tc_0402
  Scenario Outline: TC_0402
    Given US04 Navigate to Medunna page
    Then US04 Verify that home page is visible successfully
    And  US04 Click on Sign in button
    Then US04 Verify Sign in page is visible succesfully
    Then US04 Enter a invalid username "<username>"
    And US04 Enter a valid password "<password>"
    Then US04 Click Sign in button
    And US04 Verify  the message -Authentication information not correct.-  is visible
    And US04 Verify that user could not login
    And US04 Close the browser



    Examples:
      | username | password    |
      | team89   | team89admin |

  @tc_0403
  Scenario Outline: TC_0403
    Given US04 Navigate to Medunna page
    Then US04 Verify that home page is visible successfully
    And  US04 Click on Sign in button
    Then US04 Verify Sign in page is visible succesfully
    Then US04 Enter a valid username "<username>"
    And US04 Enter a invalid password "<password>"
    Then US04 Click Sign in button
    And US04 Verify  the message -Authentication information not correct.-  is visible
    And US04 Verify that user could not login
    And US04 Close the browser



    Examples:
      | username    | password |
      | team89admin | team89   |

  @tc_0404
  Scenario Outline: TC_0404
    Given US04 Navigate to Medunna page
    Then US04 Verify that home page is visible successfully
    And  US04 Click on Sign in button
    Then US04 Verify Sign in page is visible succesfully
    Then US04 Enter a invalid username "<username>"
    And US04 Enter a invalid password "<password>"
    Then US04 Click Sign in button
    And US04 Verify  the message -Authentication information not correct.-  is visible
    And US04 Verify that user could not login
    And US04 Close the browser



    Examples:
      | username | password |
      | team89   | team89   |

  @tc_0405
  Scenario Outline: TC_0405
    Given US04 Navigate to Medunna page
    Then US04 Verify that home page is visible successfully
    And  US04 Click on Sign in button
    Then US04 Verify Sign in page is visible succesfully
    Then US04 Enter a valid username "<username>"
    Then US04 Click Sign in button
    Then US04 Verify the message -Password cannot be empty!-  is visible
    And US04 Verify the message password -does not meet min-max size requirements!- is visible
    And US04 Verify  the message -Authentication information not correct.-  is visible
    And US04 Verify that user could not login
    And US04 Close the browser



    Examples:
      | username    |
      | team89admin |

  @tc_0406
  Scenario Outline: TC_0406
    Given US04 Navigate to Medunna page
    Then US04 Verify that home page is visible successfully
    And  US04 Click on Sign in button
    Then US04 Verify Sign in page is visible succesfully
    Then US04 Enter a valid password "<password>"
    Then US04 Click Sign in button
    Then US04 Verify the message -Username cannot be empty!-  is visible
    And US04 Verify the message username -does not meet min-max size requirements!- is visible
    And US04 Verify  the message -Authentication information not correct.-  is visible
    And US04 Verify that user could not login
    And US04 Close the browser



    Examples:
      | password    |
      | team89admin |

  @tc_0407
  Scenario: TC_0407
    Given US04 Navigate to Medunna page
    Then US04 Verify that home page is visible successfully
    And  US04 Click on Sign in button
    Then US04 Verify Sign in page is visible succesfully
    Then US04 Click Sign in button
    Then US04 Click Sign in button
    Then US04 Verify the message -Username cannot be empty!-  is visible
    Then US04 Verify the message -Password cannot be empty!-  is visible
    And US04 Verify the message username -does not meet min-max size requirements!- is visible
    And US04 Verify the message password -does not meet min-max size requirements!- is visible
    And US04 Verify  the message -Authentication information not correct.-  is visible
    And US04 Verify that user could not login
    And US04 Close the browser

  @tc_0408
  Scenario Outline: TC_0408
    Given US04 Navigate to Medunna page
    Then US04 Verify that home page is visible successfully
    And  US04 Click on Sign in button
    Then US04 Verify Sign in page is visible succesfully
    Then US04 Verify 'Remember me" text and checkbox are visible
    Then US04 Enter a valid username "<username>"
    And US04 Enter a valid password "<password>"
    Then US04 Click the checkbox
    And US04 Verify checkbox is checked
    Then US04 Click the check box
    And US04 Verify the checkbox unchecked
    And US04 Close the browser

    Examples:
      | username    | password    |
      | team89admin | team89admin |

  @tc_0409
  Scenario: TC_0409
    Given US04 Navigate to Medunna page
    Then US04 Verify that home page is visible successfully
    And  US04 Click on Sign in button
    Then US04 Verify Sign in page is visible succesfully
    Then US04 Verify -Did you forget your password- link is visible succesfully
    And US04 Click the -Did you forget your password-  link
    And US04 Click the -Did you forget your password-  link
    And US04 Verify user is  navigated to password resetting page
    And US04 Verify -Reset your password- page is visible succesfully
    And US04 Close the browser

  @tc_0410
  Scenario: TC_0410
    Given US04 Navigate to Medunna page
    Then US04 Verify that home page is visible successfully
    And  US04 Click on Sign in button
    Then US04 Verify Sign in page is visible succesfully
    Then US04 Verify -You don't have an account yet?- text is visible succesfully
    And US04 Verify -Register a new account- link is visible succesfully
    And US04 Click the -Register a new account-  link
    And US04 Click the -Register a new account-  link
    And US04 Verify user is  navigated to registration page
    And US04 Verify 'Registration' page is visible succesfully
    And US04 Close the browser

  @tc_0411
  Scenario: TC_0411
    Given US04 Navigate to Medunna page
    Then US04 Verify that home page is visible successfully
    And  US04 Click on Sign in button
    Then US04 Verify Sign in page is visible succesfully
    Then US04 Verify Cancel button is visible succesfully
    And US04 Click the Cancel  button
    And US04 Click the Cancel  button
    And US04 Verify login page is closed-nonvisible
    And US04 Home page is visible succesfully
    And US04 Close the browser