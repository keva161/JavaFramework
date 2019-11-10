package PageObjects;

import Core.Helpers.Actions;
import Core.Helpers.Navigate;
import Core.Helpers.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Google {

    private WebDriver driver;

    public Google(WebDriver driver)
    {
        this.driver = driver;
    }

    @FindBy(how = How.NAME, using = "q")
    private WebElement searchBox;

    @FindBy(how = How.ID, using = "res")
    private WebElement searchResults;

    public void Goto()
    {
        Navigate.Goto("http://google.co.uk", driver);
    }

    public void TypeInQuery(String query)
    {
        Actions.FillInSearchFieldAndSubmit(searchBox, "Testing");
    }

    public void WaitForSearchResults()
    {
        Wait.WaitForElement(driver, searchResults, 5);
    }

    public String GetTitle()
    {
        return Actions.GetTitle(driver);
    }


}
