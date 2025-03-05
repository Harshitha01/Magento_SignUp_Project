Feature: Forgot Password Functionality

Background: 
    Given User opens Magento homepage
    When User clicks on Sign In

  Scenario: Forgot Password Functionality
    And User clicks on Forgot Password link
    And User enters registered email address
    And User submits the request
    Then User should receive a password reset email
    
  Examples:
    | email             	  |
    # Registered Email
    | stefan@example.com 	  |
    # Password Reset Email
    | damon@example.com 	  |