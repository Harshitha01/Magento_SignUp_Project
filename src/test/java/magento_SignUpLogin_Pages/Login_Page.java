package magento_SignUpLogin_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page {
	WebDriver driver;

    private final By signInLink = By.linkText("");
    private final By emailField = By.id("email");
    private final By passwordField = By.id("pass");
    private final By loginButton = By.id("send2");

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
}










