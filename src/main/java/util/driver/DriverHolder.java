package util.driver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import page.BasePage;

public class DriverHolder {

    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    private static Logger logger = LogManager.getLogger(BasePage.class);

    public static WebDriver getDriver() {
        try {
            logger.info("Hello World My tests are starting with Selenium WebDriver");
        }
        catch (WebDriverException e){
            logger.error(e.getMessage());
        }
        return driver.get();
    }

    public static void setDriver(WebDriver driver) {
        DriverHolder.driver.set(driver);
    }
}
