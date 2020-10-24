
Feature:Login

  Scenario: login with valid credentials
    Given the user is on the login page
    When the user enters valid credentials
    Then Account Summary page should be displayed

