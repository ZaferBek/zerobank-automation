
  Feature: Add new Payee under Pay Bills
Background:
  Given the user is logged in
@wip
    Scenario: Add a new Payee
      Given the user navigates to Pay Bills module
      And the user selects Add New Payee tab
      And the user creates new payee using following information
      |Payee Name     |The Law Offices of Hyde, Price&Scharks |
      |Payee Address  |100 Same st, Anytown, USA, 10001       |
      |Account        |Checking                               |
      |Payee details  |XYZ account                            |
      Then message "The new payee The Law Offices of Hyde, Price&Scharks was successfully created." should be displayed

