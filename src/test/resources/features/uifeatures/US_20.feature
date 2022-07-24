#commit for git/github
Feature:US20 User management / Activate a new user and provide necessary roles ONLY
  for Doctors and Staff by Admin

  Background:Admin signs in and goes to user management page
    Given us20 admin goes to medunna url
    When us20 admin navigates the sign in page
    And us20 admin signs in
    And us20 admin clicks to Administration button
    And us20 admin clicks to User Management button
  Scenario: Admin can view registered people info as firstname, lastname, email etc..
    Given us20 admin click on view button that is for registered user
    Then us20 verify that All registered user info can be viewed by admin

  Scenario Outline: Admin can edit existing user info such as activating user, giving them roles as ADMIN, USER
  PATIENT, STAFF and PHYSICIAN
    Given us20 admin clicks to edit button for editing existing user
    When us20 admin click on activate checkbox if it is not activated
    And  us20 admin select the profiles as <user>
    And us20 admin clicks to save button
    Then us20 verify that admin can see the success message
    Examples: |user|
              |ROLE_ADMIN|
              |ROLE_USER|
              |ROLE_PATIENT|
              |ROLE_STAFF|
              |ROLE_PHYSICIAN|

    Scenario: Admin can delete users
      Given us20 admin clicks to delete button for deleting existing user
      Then us20 verifies that success message is displayed
