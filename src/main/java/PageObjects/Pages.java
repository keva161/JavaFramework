package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Pages {

    public static Google google;

    public static void init(WebDriver driver)
    {
        google = PageFactory.initElements(driver, Google.class);
    }

}
