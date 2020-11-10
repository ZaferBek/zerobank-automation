
  Feature: Account Summary Page

Scenario: Account Summary Page title confirmation
  Given the user is logged in
  When the user is on Account Summary page
  Then page should have the title "Zero - Account Summary"
  And Account Summary page should have the following account types
    |Cash Accounts      |
    |Investment Accounts|
    |Credit Accounts    |
    |Loan Accounts      |
  And Credit Accounts table must have columns
    |Account    |
    |Credit Card|
    |Balance    |
