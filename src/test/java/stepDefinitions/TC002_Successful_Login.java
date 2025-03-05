package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import magento_SignUpLogin_Pages.Login_Page;


public class TC002_Successful_Login {
	WebDriver driver = Hooks.driver; 
    Login_Page loginPage = new Login_Page(driver);


    @When("User logs in with valid credentials")
    public void user_logs_in_with_valid_credentials() {
        loginPage.login("Elena@example.com", "ElenaGilbert123"); 
    }

    @Then("User should see homepage after login")
    public void user_should_see_homepage_after_login() {
    	String title = driver.getTitle();
        Assert.assertTrue(title.contains("My Account"));
        driver.quit();
    }

}
