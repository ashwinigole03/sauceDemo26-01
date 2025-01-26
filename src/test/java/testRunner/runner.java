package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		 features="src/test/java/FeatureFiles",
		 glue="stepDefination",
		 dryRun=false,
		 monochrome=true
		
		
		)

public class runner extends AbstractTestNGCucumberTests{

}
