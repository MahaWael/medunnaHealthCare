Feature: database
  @Db28
  Scenario: read user data
    * us28 user connects to the database
    * us28 user gets "*" from "country" table
    * us28 user reads all of the "name" column data
    * us28 verify "country" table "name" column contains "Alabama"
    * us28 close the database connection