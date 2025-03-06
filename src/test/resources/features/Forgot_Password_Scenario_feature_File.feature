Feature: Forgot Password Functionality

Background: 
    Given User opens Magento homepage
    When User clicks on Sign In

  Scenario: Forgot Password Functionality
    And User clicks on Forgot Password link
    And User enters registered email "damon@example.com"
    And User submits the request
    Then User should receive a password reset email "damon@example.com"