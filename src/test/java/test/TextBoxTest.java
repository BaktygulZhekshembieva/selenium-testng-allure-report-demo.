package test;

import io.qameta.allure.*;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.TextBoxPage;


import static io.qameta.allure.SeverityLevel.BLOCKER;
import static util.driver.DriverHolder.getDriver;

@Epic("Elements")
@Feature("Text Box input fields")
public class TextBoxTest extends BaseTest {
    private TextBoxPage textBoxPage;

    @BeforeMethod
    public void textBoxSetUp() {
         textBoxPage = new TextBoxPage(getDriver());
    }

    @Test(description = "Verify that a user can type any text in Full Name input field")
    @Severity(BLOCKER)
    @Description("Verify that a user can type any text in Full Name input field")
    @Story("As a user I should be able to enter my fullname")
    public void inputFullNameTest() {
        String expectedName = "John Doe";
        textBoxPage.fillFullName(expectedName).clickSubmit();
        assertTrue(textBoxPage.getNameResultField().contains(expectedName));
    }

    @Test(description = "Verify that a user can type any text in Email input field")
    @Severity(BLOCKER)
    @Description("Verify that a user can type any text in Email input field")
    @Story("As a user I should be able to enter my email")
    public void inputEmailTest(){
        String expectedEmail = "john@gmail.com";
        textBoxPage.fillEmail(expectedEmail).clickSubmit();
        assertTrue(textBoxPage.getEmailResultField().contains(expectedEmail));
    }



}