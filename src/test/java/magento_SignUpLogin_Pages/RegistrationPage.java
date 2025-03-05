package magento_SignUpLogin_Pages;

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

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openCreateAccountPage() {
        driver.findElement(createAccountLink).click();
    }

    public void fillRegistrationForm(String firstName, String lastName, String email, String password) {
        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(lastName);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(confirmPasswordField).sendKeys(password);
    }

    public void submitForm() {
        driver.findElement(submitButton).click();
    }
}
