Feature: Login Scenarios

Background: 
    Given User opens Magento homepage
    When User clicks on Sign In

Scenario: Successful Login
    And User logs in with email "damon@example.com" and password "SnATKWtAmx47!j_"
    Then User should see homepage after login

Scenario: Login with Invalid Credentials
    And User logs in with valid email "damon@example.com" and invalid password "Stefan"
    Then User should see an error message for invalid login

Scenario: Login with Empty Fields
    And User logs in with empty email "" and empty password ""
    Then User should see validation errors for empty fields
