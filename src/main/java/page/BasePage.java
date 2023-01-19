package page;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class BasePage {

    public static WebDriver driver;

    private static Logger logger = LogManager.getLogger(BasePage.class);

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
    }

    public void waitUntilElementVisible(By by) {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void waitUntilElementClickable(By by) {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public void click(By by) {
        logger.debug("Trying to click the button: " + by);
        waitUntilElementClickable(by);
        driver.findElement(by).click();
        logger.info("Successfilly clicked the button");
    }

    public WebElement getElement(By by) {
        waitUntilElementVisible(by);
        return driver.findElement(by);
    }

    public List<WebElement> getElements(By by) {
        waitUntilElementVisible(by);
        return driver.findElements(by);
    }

    public void sendKeys(By by, String text) {
        logger.warn("Trying to write " + text + " " + " in " +by);
        waitUntilElementVisible(by);
        driver.findElement(by).sendKeys(text);
        logger.info("Successfully wrote " + text);
    }

    public String getText(By by){
        waitUntilElementVisible(by);
        return driver.findElement(by).getText();
    }


}
