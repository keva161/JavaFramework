package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Homepage {

    private WebDriver driver;

    public Homepage(WebDriver driver)
    {
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//a[text()='Continuing Education']")
    private WebElement ContinuingEducationLink;

    public void Goto()
    {
        System.out.println("Navigating");
        driver.get("https://www.practiceground.org/");
    }

}
