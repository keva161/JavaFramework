package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Pages {

    public static Homepage homepage;

    public static void init(WebDriver driver)
    {
        System.out.println(driver);
        homepage = PageFactory.initElements(driver, Homepage.class);
    }

}
