package CucumberOptions;

import cucumber.api.CucumberOptions;

@CucumberOptions(
		features="src/test/java/Features",
		glue="stepDefination"
		)

public class TestRunner {

}
