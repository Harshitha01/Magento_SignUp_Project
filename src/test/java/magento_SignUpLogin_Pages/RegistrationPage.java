package magento_SignUpLogin_Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
    WebDriver driver;

    private final By createAccountLink = By.linkText("Create an Account");
    private final By firstNameField = By.id("firstname");
    private final By lastNameField = By.id("lastname");
    private final By emailField = By.id("email_address");
    private final By passwordField = By.id("password");
    private final By confirmPasswordField = By.id("password-confirmation");
    private final By submitButton = By.cssSelector("button[title='Create an Account']");
    private final By duplicateEmailErrorMessage = By.xpath("//div[contains(@class, 'message-error')]");
    private final By invalidEmailErrorMessage = By.id("email_address-error");
    private final By passwordStrengthErrorMessage = By.id("password-error");
    private final By firstNameErrorMessage = By.id("firstname-error");
    private final By lastNameErrorMessage = By.id("lastname-error");
    private final By emailAddressErrorMessage = By.id("email_address-error");
    private final By passwordErrorMessage = By.id("password-error");
    private final By passwordConfirmationErrorMessage = By.id("password-confirmation-error");
    

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openCreateAccountPage() {
        driver.findElement(createAccountLink).click();
    }

    public void fillRegistrationForm(String firstName, String lastName, String email, String password, String confirmPassword) {
        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(lastName);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(confirmPasswordField).sendKeys(confirmPassword);
    }

    public void submitForm() {
        driver.findElement(submitButton).click();
    }
    public String getDuplicateEmailErrorMessage() {
    	return driver.findElement(duplicateEmailErrorMessage).getText();
    }
    public String getInvalidEmailErrorMessage() {
    	return driver.findElement(invalidEmailErrorMessage).getText();
    }
    public String getErrorMessageForPasswordStrength() {
    	return driver.findElement(passwordStrengthErrorMessage).getText();
    }
    public List<String> getErrorMessageForMandatoryFields() {
    	List<String> errors = new ArrayList<>();
        errors.add(driver.findElement(firstNameErrorMessage).getText());
        errors.add(driver.findElement(lastNameErrorMessage).getText());
        errors.add(driver.findElement(emailAddressErrorMessage).getText());
        errors.add(driver.findElement(passwordErrorMessage).getText());
        errors.add(driver.findElement(passwordConfirmationErrorMessage).getText());
        return errors;
    }

}
