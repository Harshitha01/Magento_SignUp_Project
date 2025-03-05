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

    @When("User submits the form without filling mandatory fields")
    public void User_submits_the_form_without_filling_mandatory_fields() {
        registrationPage.fillRegistrationForm("", "", ""+System.currentTimeMillis()+"", "");
        registrationPage.submitForm();
    }

    @Then("User should see validation errors for mandatory fields")
    public void User_should_see_validation_errors_for_mandatory_fields() {
    	 List<String> errors = registrationPage.getErrorMessageForMandatoryFields();
    	 assertTrue(errors.contains("This is a required field."));
        driver.quit();	
    }

}
