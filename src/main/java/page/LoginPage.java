package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private final By usernameInputField = By.id("user-name");
    private final By passwordInputField = By.id("password");
    private final By loginButton = By.id("login-button");
    private final By errorMessageElement = By.xpath("//h3[text()='Epic sadface: Username and password do not match any user in this service']");
    public final String expectedErrorMessage = "Epic sadface: Username and password do not match any user in this service";

    public LoginPage fillUsername(String username){
        sendKeys(usernameInputField,username);
        return this;
    }

    public LoginPage fillPassword(String password){
        sendKeys(passwordInputField,password);
        return this;
    }

    public LoginPage clickLoginButton(){
        click(loginButton);
        return this;
    }

    public String getErrorMessage(){
        return getText(errorMessageElement);
    }


}
