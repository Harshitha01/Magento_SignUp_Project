package stepDefinitions;

import static org.junit.Assert.assertTrue;
import java.util.List;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import magento_SignUpLogin_Pages.Login_Page;

public class TC007_Login_with_Empty_Fields {
	WebDriver driver = Hooks.driver; 
    Login_Page loginPage = new Login_Page(driver);


    @When("User logs in with empty email {string} and empty password {string}")
    public void user_logs_in_with_empty_email_and_empty_password(String email, String password) {
        loginPage.login(email,password); 
    }

    @Then("User should see validation errors for empty fields")
    public void user_should_see_validation_errors_for_empty_fields() {
    	List<String> errors = loginPage.getErrorMessageForMandatoryFields();
   	 	assertTrue(errors.contains("This is a required field."));
        driver.quit();
    }



}
