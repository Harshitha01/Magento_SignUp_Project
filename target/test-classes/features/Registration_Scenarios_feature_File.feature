Feature: Registration Scenarios

Background:
Given User opens Magento homepage
When User clicks on Create Account

  Scenario: Successful User Registration
    And User fills the registration form with valid data
    And User submits the form
    Then Account should be created successfully

  Scenario: Registration with Existing Email
    And User fills the registration form with an email that already exists
    And User submits the form
    Then User should see an error message for duplicate email

  Scenario: Registration with Invalid Email Format
    And User fills the registration form with invalid email format
    And User submits the form
    Then User should see an error message for invalid email format

  Scenario: Registration with Weak Password
    And User fills the registration form with a weak password
    And User submits the form
    Then User should see an error message for password strength

  Scenario: Registration with Empty Fields
    And User submits the form without filling mandatory fields
    Then User should see validation errors for mandatory fields
