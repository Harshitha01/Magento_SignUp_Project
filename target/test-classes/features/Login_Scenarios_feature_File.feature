Feature: Login Scenarios

Background: 
    Given User opens Magento homepage
    When User clicks on Sign In

  Scenario: Successful Login
    And User logs in with valid credentials
    Then User should see homepage after login
    
  Scenario: Login with Invalid Credentials
    And User logs in with invalid credentials
    Then User should see an error message for invalid login

  Scenario: Login with Empty Fields
    And User tries to log in with empty fields
    Then User should see validation errors for empty fields
    
  Examples:
    | email             	  | password             |
    # User Login
    | stefan@example.com 	  | StefanSalvatore@1234 |
    # Invalid Credentials scenario
    | stefan@example.com 	  | SnATKWtAmx47!j_      | 
    # Empty fields scenario
    |                       |                      |