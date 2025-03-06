package stepDefinitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import magento_SignUpLogin_Pages.RegistrationPage;

public class TC005_Registration_with_Weak_Password {
	WebDriver driver = Hooks.driver; 
	RegistrationPage registrationPage = new RegistrationPage(driver);

    @When("User fills the registration form with firstName {string} and lastName {string} and email {string} and weak password {string} and confirmPassword {string}")
    public void User_fills_the_registration_form_with_firstName_and_lastName_and_email_and_weak_password_and_confirmPassword
(String firstName, String lastName, String email, String password, String confirmPassword) {
        registrationPage.fillRegistrationForm(firstName, lastName, email, password,confirmPassword);
    }

    @Then("User should see an error message for password strength")
    public void User_should_see_an_error_message_for_password_strength() {
    	 String actualErrorMessage = registrationPage.getErrorMessageForPasswordStrength();
    	 assertTrue(actualErrorMessage.contains("Minimum length of this field must be equal or greater than 8 symbols. Leading and trailing spaces will be ignored."));
        driver.quit();
    }
}