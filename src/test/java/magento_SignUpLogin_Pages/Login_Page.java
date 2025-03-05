package magento_SignUpLogin_Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page {
	WebDriver driver;

    private final By signInLink = By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]");
    private final By emailField = By.id("email");
    private final By passwordField = By.id("pass");
    private final By loginButton = By.id("send2");
    private final By invalidLoginErrorMessage = By.xpath("//div[@class='messages']//a[contains(text(),'The account sign-in was incorrect')]");
    private final By emailAddressErrorMessage = By.id("email-error");
    private final By passwordErrorMessage = By.id("pass-error");
    private final By forgotPasswordLink = By.xpath("//a[@class='action remind']//span[contains(text(),'Forgot Your Password?')]");
    private final By enterExistingEmail = By.id("email_address");
    private final By passwordReset = By.xpath("//button[@class='action submit primary']//span[contains(text(),'Reset My Password')]");
    private final By passwordResetConfirmationMessage = By.xpath("//div[@class='messages']//*[contains(text(),'If there is an account associated with')]");
    
    
    public Login_Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openLoginPage() {
        driver.findElement(signInLink).click();
    }

    public void login(String email, String password) {
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }
    public String getInvalidLoginErrorMessage() {
    	return driver.findElement(invalidLoginErrorMessage).getText();
    }
    public List<String> getErrorMessageForMandatoryFields() {
    	List<String> errors = new ArrayList<>();
        errors.add(driver.findElement(emailAddressErrorMessage).getText());
        errors.add(driver.findElement(passwordErrorMessage).getText());;
        return errors;
    }
    public void forgotPasswordLink() {
    	driver.findElement(forgotPasswordLink).click();
    }
    public void enterExistingEmail(String email) {
    	driver.findElement(enterExistingEmail).sendKeys(email);;
    }
    public void submitPasswordResetRequest() {
    	driver.findElement(passwordReset).click();
    }
    public String passwordResetMessage() {
    	return driver.findElement(passwordResetConfirmationMessage).getText();
    }
}










