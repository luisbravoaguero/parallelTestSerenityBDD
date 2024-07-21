package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;
import steps.MySteps;

public class MyStepdefs {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyStepdefs.class);
    @Steps
    MySteps steps;
    @Given("I am on the login page for {string}")
    public void i_am_on_the_login_page_for(String url) {
        steps.openWebsite(url);
    }

    @Then("Search a video of {string}")
    public void searchAVideoOf(String input) {
        steps.searchFor(By.xpath("//*[@id=\"root\"]/main/section[1]/div/form/div/input"),input);
    }
}
