package steps;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class MySteps {
    private static final Logger LOGGER = LoggerFactory.getLogger(MySteps.class);

    private BasePage basePage;
    public void openWebsite(String url) {
        LOGGER.info("Opening the website: {}", url);
        basePage.openUrl(url);
    }
    public void searchFor(By by, String searchTerm) {
        LOGGER.info("Searching for: {}", searchTerm);
        basePage.enterText(by,searchTerm);
    }
}
