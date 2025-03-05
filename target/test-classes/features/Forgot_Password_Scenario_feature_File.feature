Feature: Forgot Password Functionality

  Scenario: Forgot Password Functionality
    Given User opens Magento homepage
    When User clicks on Sign In
    And User clicks on Forgot Password link
    And User enters registered email address
    And User submits the request
    Then User should receive a password reset email