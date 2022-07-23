@US_23
  Feature: Payment Invoice by Staff
    Scenario: Staff can open invoice menu and see the fees of the test items and total cost and create invoice for the patient then should see the invoice that staff created
      Given us20 staff goes to medunna url
      And us20 staff navigates the sign in page
      And us20 staff signs in
      And us20 staff clicks to My pages button
      And us20 staff clicks to Search Patient button
      When us20 staff enter user SSN in the SSN searchBox
      And us20 staff clicks show appointments button
      Then us20 staff verifies that there is a button as Payment/ Invocie Process for the completed tests
      When us20 staff clicks on Payment/ Invocie Process button
      Then us20 staff verifies that exam fee and total fee and test item fees exist in this page
      When us20 staff clicks on create invoice Button
      And us20 staff clicks on create Button
      And us20 staff enter user SSN in the SSN searchBox
      And us20 staff clicks show appointments button
      And us20 staff clicks on Payment/ Invocie Process button
      Then us20 verify that staff can view the invoice