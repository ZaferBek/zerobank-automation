
  Feature: Pay Bills page activities
Background:
  Given the user is logged in

    Scenario: Add a new Payee
      And the user navigates to Pay Bills module
      When the user selects Add New Payee tab
      And the user creates new payee using following information
      |Payee Name     |The Law Offices of Hyde, Price&Scharks |
      |Payee Address  |100 Same st, Anytown, USA, 10001       |
      |Account        |Checking                               |
      |Payee details  |XYZ account                            |
      Then message "The new payee The Law Offices of Hyde, Price&Scharks was successfully created." should be displayed
@wip
Scenario: Pay Saved Payee
  And the user navigates to Pay Bills module
  And page should have the title "Zero - Pay Bills"
  When user completes a successful Pay operation
  Then "The payment was successfully submitted." should be displayed
  When the user tries to make a payment without entering the amount
  Then "Please fill in this field." popup message should be displayed
  When the user tries to make a payment without entering the date
  Then "Please fill in this field." popup message should be displayed

