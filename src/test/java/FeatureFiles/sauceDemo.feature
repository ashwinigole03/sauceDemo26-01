Feature: SauceDemo Application

  Scenario: Validate LoginPage Functionality
    Given user should open browser
    When user enter valid Username as "standard_user" and Password as "secret_sauce"
    Then user click on login button
