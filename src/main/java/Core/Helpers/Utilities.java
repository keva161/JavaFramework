package Core.Helpers;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import org.openqa.selenium.WebDriver;

public class Utilities {

    public static void TakeScreenShot(WebDriver driver)
    {
        Shutterbug.shootPage(driver).save();
    }
}
