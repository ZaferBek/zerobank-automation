@login
Feature:Login
Background:
  Given the user is on the login page
  And  the user press on signin button

  Scenario: login with valid credentials
    When the user enter valid credentials
    Then Account Summary page should be displayed

Scenario: Unable to login with Invalid Username
  When the user enter wrong username
  Then error message "Login and/or password are wrong" is displayed

  Scenario: Unable to login with Invalid Password
    When the user enter wrong password
    Then error message "Login and/or password are wrong" is displayed

  Scenario: Unable to login with Blank Username
    When the user enter blank username
    Then error message "Login and/or password are wrong" is displayed

  Scenario: Unable to login with Blank Password
    When the user enter blank password
    Then error message "Login and/or password are wrong" is displayed

