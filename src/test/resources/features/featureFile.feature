Feature: User Registration and Login

  Scenario: Successful User Registration
    Given User opens Magento homepage
    When User clicks on Create Account
    And User fills the registration form with valid data
    And User submits the form
    Then Account should be created successfully

  Scenario: Successful Login
    Given User opens Magento homepage
    When User clicks on Sign In
    And User logs in with valid credentials
    Then User should see homepage after login

  Scenario: Registration with Existing Email
    Given User opens Magento homepage
    When User clicks on Create Account
    And User fills the registration form with an email that already exists
    And User submits the form
    Then User should see an error message for duplicate email

  Scenario: Registration with Invalid Email Format
    Given User opens Magento homepage
    When User clicks on Create Account
    And User fills the registration form with invalid email format
    And User submits the form
    Then User should see an error message for invalid email format

  Scenario: Registration with Weak Password
    Given User opens Magento homepage
    When User clicks on Create Account
    And User fills the registration form with a weak password
    And User submits the form
    Then User should see an error message for password strength

  Scenario: Login with Invalid Credentials
    Given User opens Magento homepage
    When User clicks on Sign In
    And User logs in with invalid credentials
    Then User should see an error message for invalid login

  Scenario: Login with Empty Fields
    Given User opens Magento homepage
    When User clicks on Sign In
    And User tries to log in with empty fields
    Then User should see validation errors for empty fields

  Scenario: Forgot Password Functionality
    Given User opens Magento homepage
    When User clicks on Sign In
    And User clicks on Forgot Password link
    And User enters registered email address
    And User submits the request
    Then User should receive a password reset email

  Scenario: Registration with Empty Fields
    Given User opens Magento homepage
    When User clicks on Create Account
    And User submits the form without filling mandatory fields
    Then User should see validation errors for mandatory fields
