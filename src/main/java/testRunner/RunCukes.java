package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
features = "src/main/java/feature", glue = "stepDefinition", monochrome =true, dryRun = true,
plugin = {"json:target/Runcuke/cucumber.json", "html:target/Runcuke/cucumber.html"}
 )

public class RunCukes {

}
