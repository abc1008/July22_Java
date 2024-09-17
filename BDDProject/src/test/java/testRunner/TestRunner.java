package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\Features"},
		glue = {"stepDefinitions", "hooks"},
		plugin = {"pretty","html:target\\report.html"}
		
)
public class TestRunner extends AbstractTestNGCucumberTests{

	
	
	
	
	
	
}
