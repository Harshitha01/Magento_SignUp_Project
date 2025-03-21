package stepDefinitions;

import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertTrue;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import magento_SignUpLogin_Pages.RegistrationPage;

public class TC003_Registration_with_Existing_Email {
	WebDriver driver = Hooks.driver; 
	RegistrationPage registrationPage = new RegistrationPage(driver);

    @When("User fills the registration form with firstName {string} and lastName {string} and existing email {string} and password {string} and confirmPassword {string}")
    public void user_fills_the_registration_form_with_firstName_and_lastName_and_existing_email_and_password_and_confirmPassword(String firstName, String lastName, String email, String password, String confirmPassword) {
        registrationPage.fillRegistrationForm(firstName, lastName, email, password,confirmPassword);
    }

    @Then("User should see an error message for duplicate email")
    public void User_should_see_an_error_message_for_duplicate_email() {
    	 String actualErrorMessage = registrationPage.getDuplicateEmailErrorMessage();
    	 assertTrue(actualErrorMessage.contains("There is already an account with this email address"));
        driver.quit();
    }
}

