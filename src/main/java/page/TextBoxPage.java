package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBoxPage extends BasePage{

    public TextBoxPage(WebDriver driver) {
        super(driver);
    }

    private final By fullNameInputField = By.xpath("//input[@id='userName']");
    private final By emailInputField = By.xpath("//input[@id='userEmail']");
    private final By currentAddressInputField = By.xpath("//textarea[@id='currentAddress']");
    private final By permanentAddressInputField = By.xpath("//textarea[@id='permanentAddress']");
    private final By submitButton = By.xpath("//button[@id='submit']");

    private final By nameResultField = By.xpath("//p[@id='name']");
    private final By emailResultField = By.xpath("//p[@id='email']");
    private final By currentAddressResult = By.xpath("//p[@id='currentAddress']");
    private final By permanentAddressResult = By.xpath("//p[@id='permanentAddress']");


    public TextBoxPage fillFullName(String fullName){
        sendKeys(fullNameInputField,fullName);
        return this;
    }

    public TextBoxPage fillEmail(String email){
        sendKeys(emailInputField,email);
        return this;
    }

    public TextBoxPage fillCurrentAddress(String currentAddress){
        sendKeys(currentAddressInputField,currentAddress);
        return this;
    }

    public TextBoxPage fillPermanentAddress(String address){
        sendKeys(permanentAddressInputField,address);
        return this;
    }

    public TextBoxPage clickSubmit(){
        click(submitButton);
        return this;
    }


    public String getNameResultField() {
        return getText(nameResultField);
    }

    public String getEmailResultField() {
        return getText(emailResultField);
    }

    public String getCurrentAddressResult() {
        return getText(currentAddressResult);
    }

    public String getPermanentAddressResult() {
        return getText(permanentAddressResult);
    }


}