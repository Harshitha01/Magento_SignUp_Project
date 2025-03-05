package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import magento_SignUpLogin_Pages.Login_Page;

public class TC006_Login_with_Invalid_Credentials {
	WebDriver driver = Hooks.driver; 
    Login_Page loginPage = new Login_Page(driver);

    @When("User logs in with invalid credentials")
    public void user_logs_in_with_invalid_credentials() {
        loginPage.login("Elena@example.com", "Ele$"); 
    }

    @Then("User should see an error message for invalid login")
    public void user_should_see_an_error_message_for_invalid_login() {
    	String invalidLoginMessage = loginPage.getInvalidLoginErrorMessage();
        Assert.assertTrue(invalidLoginMessage.contains("The account sign-in was incorrect or your account is disabled temporarily."));
        driver.quit();
    }

}

