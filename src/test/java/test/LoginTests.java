package test;

import io.qameta.allure.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.LoginPage;
import page.TextBoxPage;

import static io.qameta.allure.SeverityLevel.BLOCKER;
import static util.driver.DriverHolder.getDriver;
import static org.testng.Assert.*;

@Epic("Login")
@Feature("Login feature")
public class LoginTests extends BaseTest{

    LoginPage loginPage;

    @BeforeMethod
    public void setLoginPage(){
        loginPage = new LoginPage(getDriver());
    }

    @Test(description = "Verify that a user can't login with invalid username")
    @Severity(BLOCKER)
    @Description("Verify that a user can't login with invalid username")
    @Story("As a user I should be not able to Login with invalid username ")
    public void invalidUsernameTest(){
        loginPage.fillUsername("Baku87")
                .fillPassword("123456")
                .clickLoginButton();
        assertEquals(loginPage.expectedErrorMessage,loginPage.getErrorMessage());
    }


    @Test(description = "Verify that a user can't login with invalid username")
    @Severity(BLOCKER)
    @Description("Verify that a user can't login with invalid username")
    @Story("As a user I should be not able to Login with invalid username ")
    public void invalidPasswordTest(){
        loginPage.fillUsername("Test123")
                .fillPassword("secret_sauce")
                .clickLoginButton();
        assertEquals(loginPage.expectedErrorMessage,loginPage.getErrorMessage());
    }

    @Test(description = "Verify that a user can't login with invalid username")
    @Severity(BLOCKER)
    @Description("Verify that a user can't login with invalid username")
    @Story("As a user I should be not able to Login with invalid username ")
    public void invalidUsernameAndPasswordTest(){
        loginPage.fillUsername("Test123")
                .fillPassword("secret_sauce123")
                .clickLoginButton();
        assertEquals(loginPage.expectedErrorMessage,loginPage.getErrorMessage());
    }

}

