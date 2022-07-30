@US_23
@Regression
  Feature: Payment Invoice by Staff
    Scenario: Staff can open invoice menu and see the fees of the test items and total cost and create invoice for the patient then should see the invoice that staff created
      Given us23 staff goes to medunna url
      And us23 staff signs in
      And us23 staff clicks to My pages button
      And us23 staff clicks to Search Patient button
      When us23 staff enter user SSN in the SSN searchBox
      And us23 staff clicks show appointments button
      Then us23 staff verifies that there is a button as Payment&Invocie Process for the completed tests
      When us23 staff clicks on Payment&Invocie Process button
      Then us23 staff verifies that exam fee and total fee and test item fees exist in this page
      When us23 staff clicks on create invoice Button
      And us23 staff clicks on create Button
      And us23 staff enter user SSN in the SSN searchBox
      And us23 staff clicks show appointments button
      And us23 staff clicks on Payment&Invocie Process button
      When us23 staff clicks on create invoice Button
      Then us23 verify that staff can view the invoice