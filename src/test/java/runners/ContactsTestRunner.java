package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
 features="C:\\Users\\Shahin Alam\\eclipse-workspace\\cucumberdemo\\src\\test\\java\\featuresfile",
 glue="stepdefinitions",
 format= {"pretty","html:test-output"},
 monochrome=true,
 strict=true,
 dryRun=false
	
		)

public class ContactsTestRunner {

}
