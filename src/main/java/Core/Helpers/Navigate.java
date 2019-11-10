package Core.Helpers;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Navigate {

    private static final Logger Logging = LoggerFactory.getLogger(Navigate.class);

    public static void Goto(String url, WebDriver driver)
    {
        Logging.info("Navigating to: " + url);
        driver.get(url);
    }
}
