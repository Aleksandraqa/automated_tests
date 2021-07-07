package testRunner;
	
	import org.junit.runner.RunWith;

	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
	        features = {"src/main/resources/featuresFile"},
	        glue = {"stepDefinition"},
	        plugin = {
	        		"json:target/cucumber.json"}
//	        tags = {"@Smoke"
//	        		
//	        }
	        
			)
	public class TestRunner {
	}



