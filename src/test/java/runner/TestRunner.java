package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features/"},
        glue = {"classpath:stepDefinition"},
        plugin = {"pretty", "html:target/cucumber-report-html", "json:target/cucumber-report.json"},
        tags = {}
)
public class TestRunner {

}
