package Core.Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Wait
{
    public WebDriver driver;

    public void WaitForElement(WebElement element, int durationInSeconds)
    {
        //WebDriverWait wait = new WebDriverWait(driver, durationInSeconds);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }
}
