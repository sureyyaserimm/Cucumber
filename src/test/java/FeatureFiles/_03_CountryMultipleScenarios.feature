Feature: Country Multi Scenario

  Background:  # before senaryo
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to country page

  Scenario: Create country
    When create country
    Then Success message should be displayed

  Scenario: Create a country 2
    When create a country name as "srysrm123" code as "srysrm12"
    Then Success message should be displayed