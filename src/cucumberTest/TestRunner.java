package cucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature/CheckAlertInDetailedWidget.feature"
		,glue={"stepDefinition"}
		,monochrome = true
		,format = {"pretty", "html:Report"}
		//,dryRun = true
		)
 
public class TestRunner {
 
}