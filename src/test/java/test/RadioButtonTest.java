package test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.Story;
import static org.testng.Assert.*;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.TextBoxPage;

import static io.qameta.allure.SeverityLevel.BLOCKER;
import static util.driver.DriverHolder.getDriver;

public class RadioButtonTest extends BaseTest {

    private TextBoxPage textBoxPage;

    @BeforeMethod
    public void setRadioButtonPage(){
        textBoxPage = new TextBoxPage(getDriver());
    }

    @Test(description = "Verify that a user can type any text in Permanent Address input field")
    @Severity(BLOCKER)
    @Description("Verify that a user can type any text in Email input field")
    @Story("As a user I should be able to enter my email")
    public void inputPermanentAddressTest(){
        String expectedEmail = "john@gmail.com";
        textBoxPage.fillEmail(expectedEmail).clickSubmit();
        assertTrue(textBoxPage.getEmailResultField().contains(expectedEmail));
    }

}