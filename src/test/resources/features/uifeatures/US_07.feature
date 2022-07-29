@us_07
Feature:TC_0701
  @tc_0701
  Scenario Outline: TC_0701
    Given US07 Navigate to Medunna page
    Then US07 Verify that home page is visible successfully
    And  US07 Click on Sign in button
    Then US07 Verify Sign in page is visible succesfully
    Then US07 Enter a valid username "<username>"
    And US07 Enter a valid password "<password>"
    Then US07 Click Sign in button
    And US07 Click -Make an Apooinment- link
    And US07 Enter  a phone number "<phone_number>"
    And US07 Verify the order for date as  day-mm-year
    And US07 Select a current date
    And US07 Click -Send an Appoinment Request- button
    And US07 Verify -Appoinment saved- message is visible
    And US07 Click My Appoinments
    Then US07 Verify Appointments page is visible
    And US07 Verify last created appoinment is visible
    Then US07 Close the browser

    Examples:
      | username      | password      | phone_number |
      | team89patient | team89patient | 123-123-1234 |

  @tc_0702
  Scenario Outline:TC_0702
    Given US07 Navigate to Medunna page
    Then US07 Verify that home page is visible successfully
    And  US07 Click on Sign in button
    Then US07 Verify Sign in page is visible succesfully
    Then US07 Enter a valid username "<username>"
    And US07 Enter a valid password "<password>"
    Then US07 Click Sign in button
    And US07 Click -Make an Apooinment- link
    And US07 Enter  a phone number "<phone_number>"
    And US07 Verify the order for date as  day-mm-year
    And US07 Select a future date
    And US07 Click -Send an Appoinment Request- button
    And US07 Verify -Appoinment saved- message is visible
    And US07 Click My Appoinments
    Then US07 Verify Appointments page is visible
    And US07 Verify last created future date appoinment is visible
    Then US07 Close the browser

    Examples:
      | username      | password      | phone_number |
      | team89patient | team89patient | 123-123-1234 |

  @tc_0703
  Scenario Outline:TC_0703
    Given US07 Navigate to Medunna page
    Then US07 Verify that home page is visible successfully
    And  US07 Click on Sign in button
    Then US07 Verify Sign in page is visible succesfully
    Then US07 Enter a valid username "<username>"
    And US07 Enter a valid password "<password>"
    Then US07 Click Sign in button
    And US07 Click -Make an Apooinment- link
    And US07 Enter  a phone number "<phone_number>"
    And US07 Verify the order for date as  day-mm-year
    And US07 Select a past date
    Then US07 Verify -Appointment date can not be past date! message is visible
    And US07 Click -Send an Appoinment Request- button
    And US07 Verify -Appoinment saved- message is not visible
    And US07 Click My Appoinments
    Then US07 Verify Appointments page is visible
    And US07 Verify last created past date appoinment is not visible
    Then US07 Close the browser

    Examples:
      | username      | password      | phone_number |
      | team89patient | team89patient | 123-123-1234 |