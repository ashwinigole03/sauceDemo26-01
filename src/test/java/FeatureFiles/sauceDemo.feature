Feature: SauceDemo Application

  Scenario: Validate LoginPage Functionality
    Given user should open browser
    When user enter valid Username as "standard_user" and Password as "secret_sauce"
    Then user click on login button

  Scenario: Validate ProductPage Functionality
    When user should sort the product as "Price (high to low)"
    And user should select 3 products
    Then user should click on shopping Cart Trolly
