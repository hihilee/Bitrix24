Feature: Login
  Agile Story: As a user, I should be able to login with valid credentials when I am on the login page.

  Scenario: CRM24 logo verification
    Given User is on login page
    When User have valid credentials
    Then User should see CRM24 logo.
