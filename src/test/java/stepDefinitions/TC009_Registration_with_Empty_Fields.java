package stepDefinitions;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import magento_SignUpLogin_Pages.RegistrationPage;

public class TC009_Registration_with_Empty_Fields {
	WebDriver driver = Hooks.driver; 
	RegistrationPage registrationPage = new RegistrationPage(driver);

    @When("User submits the form without filling firstName {string} and lastName {string} and email {string} and password {string} and confirmPassword {string}")
    public void user_submits_the_form_without_filling_firstName_and_lastName_and_email_and_password_and_confirmPassword(String firstName, String lastName, String email, String password, String confirmPassword) {
        registrationPage.fillRegistrationForm(firstName, lastName, email, password, confirmPassword);
        registrationPage.submitForm();
    }

    @Then("User should see validation errors for mandatory fields")
    public void User_should_see_validation_errors_for_mandatory_fields() {
    	 List<String> errors = registrationPage.getErrorMessageForMandatoryFields();
    	 assertTrue(errors.contains("This is a required field."));
        driver.quit();	
    }

}
