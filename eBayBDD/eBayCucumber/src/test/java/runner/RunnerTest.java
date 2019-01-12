package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"/Users/salmaalam/IdeaProjects/eBayBDD/eBayCucumber/src/test/java/feature/Register.feature"},
        glue = {"stepDefinition"},
        format = {"pretty","json:report/cucumber.json","html:report/cucumber-pretty"},
        strict = false,
        monochrome = true,
        tags = {"@FunctionalTest"},
        dryRun = false



)

public class RunnerTest {


}
