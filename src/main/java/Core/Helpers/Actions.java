package Core.Helpers;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Actions
{
    private static final Logger Logging = LoggerFactory.getLogger(Actions.class);

    public static void FillInSearchFieldAndSubmit(WebElement element, String keysToSend)
    {
        Logging.info("Typing into the search field");
        element.sendKeys(keysToSend + Keys.RETURN);
    }

    public static void Click(WebElement element)
    {
        Logging.info("Clicking on: " + element);
        element.click();
    }

    public static String GetTitle(WebDriver driver)
    {
        Logging.info("Getting the page title");
        String title = driver.getTitle();
        return title;
    }
}
