package StepDefinations;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\features\\GoogleSearch.feature", glue={"StepDefinations"},monochrome=true,
plugin={"pretty","junit:target\\JUnitReports\\report.xml",
		"json:target\\JSONReports\\report.json",
		"html:target\\HtmlReports\\report.json"}
)
public class TestRunner {
	
}

