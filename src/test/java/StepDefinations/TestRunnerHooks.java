package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/enlem/Cucumber/CucumberEzmet/src/test/resources/HooksDemo/HooksDemo.feature", glue={"StepsForHooks"},monochrome=true,
plugin={"pretty","junit:target\\JUnitReports\\report.xml",
		"json:target\\JSONReports\\report.json",
		"html:target\\HtmlReports\\report.json"}
)
public class TestRunnerHooks {
	
	
}
