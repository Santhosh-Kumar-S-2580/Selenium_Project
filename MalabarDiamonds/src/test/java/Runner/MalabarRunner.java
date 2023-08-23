package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/Register.feature",
				glue={"stepDefinition","CommonUtils","Common_step_def"},
				dryRun=false,
				monochrome=false,
				plugin={"pretty","html:report/htmlreport.html"},
				publish=true)

public class MalabarRunner {

}
//tags= "@InvalidCredentials"