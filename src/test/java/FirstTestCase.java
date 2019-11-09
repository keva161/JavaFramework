import PageObjects.Pages;
import org.junit.Test;

public class FirstTestCase extends BaseTest {

    @Test
    public void Test_All_The_Navbar_Links()
    {
        Pages.homepage.Goto();
    }
}
