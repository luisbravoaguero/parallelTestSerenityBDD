package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasePage extends PageObject {
    private static final Logger LOGGER = LoggerFactory.getLogger(BasePage.class);


    public BasePage() {
        super();
    }

    private void logDriverInstance() {
        if (getDriver() != null) {
            LOGGER.info("Using WebDriver instance: {}", getDriver().toString());
        } else {
            LOGGER.warn("WebDriver instance is not initialized.");
        }
    }
    public void clickButton(By locator) {
        getDriver().findElement(locator).click();
    }

    public void enterText(By locator, String text) {
        logDriverInstance();
        LOGGER.info("Searching for: {}", text);
        getDriver().findElement(locator).sendKeys(text);
    }

    public void openUrls(String url){
        logDriverInstance();
        LOGGER.info("Opening URL: {}", url);
        getDriver().get(url);
    }
}
