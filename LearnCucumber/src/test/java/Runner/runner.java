package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/Login.feature",glue="stepDefinition",plugin="html:report/htmlreport.html")
public class runner {

}
