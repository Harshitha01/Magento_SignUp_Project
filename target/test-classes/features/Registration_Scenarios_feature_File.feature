Feature: Registration Scenarios

Background:
Given User opens Magento homepage
When User clicks on Create Account
And User submits the form

  Scenario: Successful User Registration
    And User fills the registration form with valid firstName "Rohini" and lastName "Bhat" and email "Rohini@example.com" and password "RohiniBhat@12345" and confirmPassword "RohiniBhat@12345"
    And User submits the form
    Then Account should be created successfully

  Scenario: Registration with Existing Email
    And User fills the registration form with firstName "Rohan" and lastName "Chad" and existing email "Rahul@example.com" and password "RohanChad@1234567890" and confirmPassword "RohanChad@1234567890"
    And User submits the form
    Then User should see an error message for duplicate email

  Scenario: Registration with Invalid Email Format
    And User fills the registration form with firstName "Caroline" and lastName "Forbes" and invalid email "Caroline@example.com1@" and password "CarolineForbes@123" and confirmPassword "CarolineForbes@123"
    And User submits the form
    Then User should see an error message for invalid email format

  Scenario: Registration with Weak Password
    And User fills the registration form with firstName "Bonnie" and lastName "Bennett" and email "bonnie@example.com" and weak password "Bon1234" and confirmPassword "Bon1234"
    And User submits the form
    Then User should see an error message for password strength

  Scenario: Registration with Empty Fields
    And User submits the form without filling firstName "" and lastName "" and email "" and password "" and confirmPassword ""
    Then User should see validation errors for mandatory fields
    
