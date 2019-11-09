
package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WayToAutomation {

    WebDriver driver;

    public WayToAutomation(WebDriver driver)
    {
        this.driver = driver;
    }

    public void WaitForPageToLoad()
    {
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("container"))));
    }

    public void RevealResourcesMenu()
    {
        WebElement resourcesLink = driver.findElement(By.xpath("//li[@class='dropdown']/a[text()='Resources']"));
        Actions builder = new Actions(driver);
        Actions hoverOverWebElement = builder.moveToElement(resourcesLink);
        builder.perform();
    }

    public void ClickOnPracticeSite()
    {
        WebElement practiceLink = driver.findElement(By.xpath("//a[text()='Practice site 1']"));
        practiceLink.click();
    }

    public void SelectCountry()
    {
        Select countryDropdown = new Select(driver.findElement(By.name("country")));
        countryDropdown.selectByValue("Martinique");
    }
}
