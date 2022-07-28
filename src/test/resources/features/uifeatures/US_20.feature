#commit for git/github
  @US_20
Feature:US20 User management / Activate a new user and provide necessary roles ONLY
  for Doctors and Staff by Admin

  Scenario: Admin can view or edit or delete registered user
    Given us20 admin goes to medunna url
    And us20 admin signs in
    And us20 admin clicks to Administration button
    And us20 admin clicks to User Management button
    Given us20 admin clicks on view button that is for registered user
    Then us20 verify that All registered user info can be viewed by admin
    Given us20 admin clicks on back button
    And us20 admin clicks to edit button for editing existing user
    When us20 admin edits all credentials of user
    And us20 admin clicks to save button
    Then us20 verify that admin can see the editing success message
    Given us20 admin clicks to delete button for deleting existing user
    Then us20 verify that admin can see the deleting success message



