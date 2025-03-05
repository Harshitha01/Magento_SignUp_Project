package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

import magento_SignUpLogin_Pages.RegistrationPage;

public class TC001_Successful_User_Registration {
	WebDriver driver = Hooks.driver;
    RegistrationPage registrationPage = new RegistrationPage(driver);


    @When("User fills the registration form with valid data")
    public void user_fills_the_registration_form_with_valid_data() {
        registrationPage.fillRegistrationForm("Elena", "Gilbert", "Elena"+System.currentTimeMillis()+"@example.com", "ElenaGilbert123");
        
    }

    @When("User submits the form")
    public void user_submits_the_form() {
        registrationPage.submitForm();
    }

    @Then("Account should be created successfully")
    public void account_should_be_created_successfully() {
        driver.quit();
    }
}

