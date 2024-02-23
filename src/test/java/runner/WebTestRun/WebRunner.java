package runner.WebTestRun;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"stepDef"},
        features = {"src/test/java/features"},
        plugin = {"pretty","html:reports/web/web-report.html", "json:reports/web/web-report.json"},
        tags = "@web"
)

public class WebRunner {
}
