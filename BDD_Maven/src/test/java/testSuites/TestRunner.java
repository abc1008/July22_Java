package testSuites;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src\\test\\resources\\Features"}, 
glue = {"StepDefinition", "hooks"},
plugin = {"pretty", "html:report.html"})
public class TestRunner extends AbstractTestNGCucumberTests{
	
	
	
	
	

}
