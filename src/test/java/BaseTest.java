import Core.Helpers.Utilities;
import Core.Setup.DriverManager;
import PageObjects.Pages;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static Core.Config.Settings.CHOSEN_BROWSER;

public class BaseTest
{
    public DriverManager driverManager = new DriverManager();
    private static final long startTime = System.currentTimeMillis();
    private static final Logger Logging = LoggerFactory.getLogger(BaseTest.class);

    // Sets a rule in JUnit to get get the test name which is used for the screenshots name if one is taken.
    @Rule
    public TestName name = new TestName();

    @Rule
    public final TestRule watchman = new TestWatcher() {
        @Override
        public Statement apply(Statement base, Description description) {
            return super.apply(base, description);
        }

        @Override
        protected void succeeded(Description description) {
            Logging.info("TEST SUCCEEDED: " + name.getMethodName() + " - Time taken: " + (System.currentTimeMillis() - startTime + "ms"));
        }

        @Override
        protected void failed(Throwable e, Description description) {
            Utilities.TakeScreenShot(driverManager.getDriver());
            Logging.info("TEST FAILED: " + e.getMessage());
        }
    };
    // Instantiates a WebDriver object & passes it to all of the pages for the tests
    @Before
    public void CreateDriver()
    {
        driverManager.setDriver(CHOSEN_BROWSER);
        Pages.init(driverManager.getDriver());
        Logging.info("TEST STARTING:  " + name.getMethodName());
    }

    // Closes the browser and destroys the WebDriver object after the test
    @After
    public void Destroy()
    {
        driverManager.close();
    }
}
