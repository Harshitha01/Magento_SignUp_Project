package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import magento_SignUpLogin_Pages.Login_Page;
import magento_SignUpLogin_Pages.RegistrationPage;

public class CommonSteps {

    WebDriver driver = Hooks.driver;
    RegistrationPage registrationPage = new RegistrationPage(driver);
    Login_Page loginPage = new Login_Page(driver);

    @Given("User opens Magento homepage")
    public void user_opens_magento_homepage() {
        System.out.println("User is on Magento homepage.");
        //String title = driver.getTitle();
        //Assert.assertTrue(title.contains("My Account"));
    }

    @When("User clicks on Create Account")
    public void user_clicks_on_create_account() {
        registrationPage.openCreateAccountPage();
    }
	@When("User clicks on Sign In")
    public void user_clicks_on_sign_in() {
        loginPage.openLoginPage();
    }
	@When("User submits the form")
    public void user_submits_the_form() {
        registrationPage.submitForm();
    }
}
