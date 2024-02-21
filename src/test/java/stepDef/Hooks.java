package stepDef;

import io.cucumber.java.*;
import java.util.Objects;
import static helper.Utility.quitDriver;
import static helper.Utility.startDriver;

public class Hooks {

    String tagsRunning = null;


    @Before
    public void beforeTest(Scenario scenario) {
        System.out.println("Running test");

        String[] tags = scenario.getSourceTagNames().toArray(new String[0]);
        tagsRunning = tags[0];
        if (Objects.equals(tagsRunning, "@web")) {
            startDriver();
        }
    }

    @After
    public void afterTest(Scenario scenario) throws InterruptedException {
        System.out.println("Test Finish");

        if (Objects.equals(tagsRunning, "@web")) {
            quitDriver();
        }
    }

}
