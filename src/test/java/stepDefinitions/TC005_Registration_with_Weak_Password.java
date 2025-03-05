package stepDefinitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import magento_SignUpLogin_Pages.RegistrationPage;

public class TC005_Registration_with_Weak_Password {
	WebDriver driver = Hooks.driver; 
	RegistrationPage registrationPage = new RegistrationPage(driver);

    @When("User fills the registration form with a weak password")
    public void User_fills_the_registration_form_with_a_weak_password() {
        registrationPage.fillRegistrationForm("Elena", "Gilbert", "Elena"+System.currentTimeMillis()+"@example.com1", "Elena3");
    }

    @When("User submits the form")
    public void user_submits_the_form() {
        registrationPage.submitForm();
    }

    @Then("User should see an error message for password strength")
    public void User_should_see_an_error_message_for_password_strength() {
    	 String actualErrorMessage = registrationPage.getErrorMessageForPasswordStrength();
    	 assertTrue(actualErrorMessage.contains("Minimum length of this field must be equal or greater than 8 symbols. Leading and trailing spaces will be ignored."));
        driver.quit();
    }
}