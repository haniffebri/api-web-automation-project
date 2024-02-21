package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"stepDef"},
        features = {"src/test/java/features"},
        plugin = {"pretty","html:reports/api-web-report.html", "json:reports/api-web-report.json"}
)

public class TestRunner {
}
