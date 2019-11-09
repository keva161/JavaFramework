package PageObjects;

import Core.WebDriver.WebDriverFactory;
import org.openqa.selenium.support.PageFactory;

import static Core.Config.Settings.CHOSEN_BROWSER;

public class Pages {

    public static Homepage homepage;

    public static void init()
    {
        homepage = PageFactory.initElements(new WebDriverFactory().CreateBrowser(CHOSEN_BROWSER), Homepage.class);
    }

}
