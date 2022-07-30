@Api28
@Regression
Feature: Country read/create/edit/delete by api
  Scenario: Read country data
    Given user reads country API data on "https://medunna.com/api/countries"


  Scenario Outline: Create country
    Given user creates a country on API endpoint "https://medunna.com/api/countries" and using "<idJson>" "<nameJson>"
    Examples:
      |idJson||nameJson|
      |name||Alabama1|


  Scenario Outline: Edit country
    Given user edits a country on API endpoint "<endpoint>" and using "<id>" "<name>"
    Examples:
      |endpoint||id||name|
      |https://medunna.com/api/countries||131673||Mississippi1|

  Scenario Outline: Delete country
    Given user deletes country on API "<endpoint>" "<id>"
    Examples:
      |endpoint||id|
      |https://medunna.com/api/countries/||131674|