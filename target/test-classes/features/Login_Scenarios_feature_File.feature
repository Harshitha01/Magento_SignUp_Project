Feature: Login Scenarios

  Scenario: Successful Login
    Given User opens Magento homepage
    When User clicks on Sign In
    And User logs in with valid credentials
    Then User should see homepage after login
    
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