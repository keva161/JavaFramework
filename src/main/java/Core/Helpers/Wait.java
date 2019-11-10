package Core.Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Wait
{
    private static final Logger Logging = LoggerFactory.getLogger(Wait.class);

    public static void WaitForElement(WebDriver driver, WebElement element, int durationInSeconds)
    {
        Logging.info("Waiting for " + element + " to appear");
        WebDriverWait wait = new WebDriverWait(driver, durationInSeconds);
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
    }
}
