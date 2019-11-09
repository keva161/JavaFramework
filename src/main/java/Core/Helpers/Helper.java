package Core.Helpers;

import PageObjects.Pages;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Helper extends Pages
{
    private WebDriver driver;

    public void CaptureScreenshot(WebDriver driver) {
        Shutterbug.shootPage(driver).save();
    }

    public void MoveToElement(WebElement element)
    {
        Actions builder = new Actions(driver);
        Actions hoverOverWebElement = builder.moveToElement(element);
        builder.perform();
    }
}
