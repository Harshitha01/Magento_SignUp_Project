package stepDefinitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import magento_SignUpLogin_Pages.RegistrationPage;

public class TC004_Registration_with_Invalid_Email_Format {
	WebDriver driver = Hooks.driver; 
	RegistrationPage registrationPage = new RegistrationPage(driver);

    @When("User fills the registration form with invalid email format")
    public void User_fills_the_registration_form_with_invalid_email_format(String firstName, String lastName, String email, String password, String confirmPassword) {
        registrationPage.fillRegistrationForm(firstName, lastName, email, password,confirmPassword);
    }

    @Then("User should see an error message for invalid email format")
    public void User_should_see_an_error_message_for_invalid_email_format() {
    	 String actualErrorMessage = registrationPage.getInvalidEmailErrorMessage();
    	 assertTrue(actualErrorMessage.contains("Please enter a valid email address (Ex: johndoe@domain.com)."));
        driver.quit();
    }
}




