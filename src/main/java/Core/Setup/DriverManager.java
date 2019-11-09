package Core.Setup;

import Core.Factories.WebDriverFactory;
import org.openqa.selenium.WebDriver;

import static Core.Config.Settings.CHOSEN_BROWSER;

public class DriverManager
{
    private WebDriver driver;

    public static WebDriver getDriver()
    {
        return new WebDriverFactory().CreateBrowser(CHOSEN_BROWSER);
    }

    public void close()
    {
        driver.close();
    }

    public void get(String url)
    {
        driver.get(url);
    }
}
