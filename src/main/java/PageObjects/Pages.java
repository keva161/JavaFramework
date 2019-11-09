package PageObjects;

import Core.Setup.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Pages extends DriverManager{

    public static Homepage homepage;

    public WebDriver driver = getDriver();

    public static void init()
    {
        homepage = PageFactory.initElements(getDriver(), Homepage.class);
    }

}
