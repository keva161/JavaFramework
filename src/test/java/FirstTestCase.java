import PageObjects.Pages;
import org.junit.Assert;
import org.junit.Test;

public class FirstTestCase extends BaseTest {

    @Test
    public void GoogleResults()
    {
        Pages.google.Goto();
        Pages.google.TypeInQuery("Testing");
        Pages.google.WaitForSearchResults();

        Assert.assertTrue("Title contains the string testing", Pages.google.GetTitle().contains("Testing"));



    }
}
