package TestRunner;




import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\rohit.bhargava\\eclipse-workspace\\CucumberJava\\src\\test\\resources\\Features\\DemoWebShop.feature",
		glue={"stepDefinitions"},
		tags = "@Sort and @GiftCard",
		dryRun=false,		
		plugin= {"pretty"},
		monochrome = true
		//tags = {'@Regression'}
	
		
		)
public class Runner {

}
