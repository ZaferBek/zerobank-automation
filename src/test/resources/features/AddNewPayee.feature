
  Feature: Add new Payee under Pay Bills

    Scenario: Add a new Payee
      Given user select Add New Payee tab
      And user creates new payee using following information
      |Payee Name     |The Law Offices of Hyde, Price&Scharks |
      |Payee Address  |100 Same st, Anytown, USA, 10001       |
      |Account        |Checking                               |
      |Payee details  |XYZ account                            |
      Then message "The new payee The Law Offices of Hyde, Price&Scharks was successfully created." should be displayed

