@US19DB
Feature:Admin_can_see_staff_by_id

  Scenario: read staff info
    Given US19 User connects to the database
    And US19 User can get "*" from "staff" table
    Then US19 User can read all of "first_name" column data
    Then US19 verify that  "staff" table "first_name" contains "team89" data
    Then US19 close the database connection
