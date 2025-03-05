Feature: Registration Scenarios

Background:
Given User opens Magento homepage
When User clicks on Create Account
And User submits the form

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
    
    Examples:
    | firstName | lastName  | email             	  | password             | confirmPassword      |
    # User Registration
    | Stefan    | Salvatore | stefan@example.com 	  | StefanSalvatore@1234 | StefanSalvatore@1234 |
    # Existing user scenario
    | Damon     | Salvatore | damon@example.com 	  | SnATKWtAmx47!j_      | SnATKWtAmx47!j_      | 
    # Invalid Email scenario
    | Caroline  | Forbes		| Caroline@example.com1	| CarolineForbes@123   | CarolineForbes@123   |
    # Weak Password scenario
    | Bonnie    | Bennett		| bonnie@example.com    | Bon1234              | Bon1234              |
    # Empty fields scenario
    |           | 		      |                       |                      |                      |
