package runner.APITestRun;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"stepDef"},
        features = {"src/test/java/features"},
        plugin = {"pretty","html:reports/api/api-report.html", "json:reports/api/api-report.json"},
        tags = "@api"
)

public class APIRunner {
}
