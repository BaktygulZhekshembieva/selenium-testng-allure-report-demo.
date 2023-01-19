package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonPage extends BasePage{

    public RadioButtonPage(WebDriver driver){
        super(driver);
    }
    private final By radioButtonLink = By.xpath("//span[text()='Radio Button']");
    private final By yesRadioButton = By.xpath("//input[@id='yesRadio']");
    private final By yesResult = By.xpath("//span[text()='Yes']");

    public RadioButtonPage clickLink(){
        click(radioButtonLink);
        return this;
    }
    public RadioButtonPage clickYes(){
        click(yesRadioButton);
        return this;
    }
    public String getYesResult(){
        return getText(yesResult);
    }
}
