package stepDefinitions;

import cucumber.api.java.After;
import webdriver.Driver;

public class Hooks {
    @After
    public void logEndOfScenario() throws Exception
    {
        Driver.quit();
    }
}
