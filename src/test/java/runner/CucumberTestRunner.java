package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "json:target/cucumber.json" },
        plugin = {"html:target/cucumber-html-report"},
        features = {"src/test/resources/features"},
        glue={"stepDefinitions"}
)


public class CucumberTestRunner {
}
