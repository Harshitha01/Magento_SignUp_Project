package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import magento_SignUpLogin_Pages.Login_Page;


public class TC002_Successful_Login {
	WebDriver driver = Hooks.driver;  // Access driver from Hooks
    Login_Page loginPage = new Login_Page(driver);

    @Given("User opens Magento homepage")
    public void user_opens_magento_homepage() {
    }
	@When("User clicks on Sign In")
    public void user_clicks_on_sign_in() {
        loginPage.openLoginPage();
    }

    @When("User logs in with valid credentials")
    public void user_logs_in_with_valid_credentials() {
        loginPage.login("Elena@example.com", "ElenaGilbert123"); 
    }

    @Then("User should see homepage after login")
    public void user_should_see_homepage_after_login() {
        driver.quit();
    }

}
