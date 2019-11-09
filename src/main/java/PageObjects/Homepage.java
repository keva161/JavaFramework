package PageObjects;

import org.openqa.selenium.Keys;
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

    @FindBy(how = How.NAME, using = "q")
    private WebElement searchBox;

    @FindBy(how = How.XPATH, using = "//h2[text()='Web results']/parent::div")
    private WebElement searchResults;

    public void Goto()
    {
        driver.get("http://google.com");
    }

    public void TypeInQuery(String query)
    {
        searchBox.sendKeys(query + Keys.RETURN);
    }
}
