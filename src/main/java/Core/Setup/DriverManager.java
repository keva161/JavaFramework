package Core.Setup;
import Core.Factories.BrowserType;
import Core.Factories.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class DriverManager {
    private WebDriver driver;

    public void setDriver(BrowserType browser) {
        WebDriverFactory factory = new WebDriverFactory();
        driver = factory.CreateBrowser(browser);
    }

    public WebDriver getDriver() {
        return driver;
    }
}


