package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import magento_SignUpLogin_Pages.RegistrationPage;

public class TC001_Successful_User_Registration {
	WebDriver driver = Hooks.driver;
    RegistrationPage registrationPage = new RegistrationPage(driver);


    @When("User fills the registration form with valid data")
    public void user_fills_the_registration_form_with_valid_data(String firstName, String lastName, String email, String password, String confirmPassword) {
    	registrationPage.fillRegistrationForm(firstName, lastName, email, password,confirmPassword);
    }

    @Then("Account should be created successfully")
    public void account_should_be_created_successfully() {
    	String title = driver.getTitle();
        Assert.assertTrue(title.contains("My Account"));
        driver.quit();
    }
}

