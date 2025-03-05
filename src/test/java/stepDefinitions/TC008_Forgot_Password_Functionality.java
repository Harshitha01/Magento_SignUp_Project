package stepDefinitions;


import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import magento_SignUpLogin_Pages.Login_Page;

public class TC008_Forgot_Password_Functionality {
	WebDriver driver = Hooks.driver; 
    Login_Page loginPage = new Login_Page(driver);


    @When("User clicks on Forgot Password link")
    public void user_clicks_on_Forgot_Password_link() {
        loginPage.forgotPasswordLink();
    }

    @When("User enters registered email address")
    public void user_should_see_validation_errors_for_empty_fields() {
    	loginPage.enterExistingEmail("Elena@example.com");
    	
        
    }
    @When("User submits the request")
    public void user_submits_the_request() {
    	loginPage.submitPasswordResetRequest();
    	
    }
    @Then("User should receive a password reset email")
    public void user_should_receive_a_password_reset_email() {
    	String actualErrorMessage = loginPage.passwordResetMessage();
   	 assertTrue(actualErrorMessage.contains("If there is an account associated with harshirv@gmail.com you will receive an email with a link to reset your password."));
        driver.quit();
    }



}



