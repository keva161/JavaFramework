package Core.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverFactory {

    public WebDriver CreateBrowser(BrowserType browser)
    {
        switch(browser) {
            case Chrome:
                return createChromeDriver();
            case Firefox:
                return createFirefoxDiver();
            case InternetExplorer:
                return createInternetExplorerDriver();
            default:
                System.out.println("Invalid browser type");
                return null;
        }
    }

    private WebDriver createChromeDriver()
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(options);
    }

    private WebDriver createFirefoxDiver()
    {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

    private WebDriver createInternetExplorerDriver()
    {
        WebDriverManager.iedriver().setup();
        return new InternetExplorerDriver();
    }
}

