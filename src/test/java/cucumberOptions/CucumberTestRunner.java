package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//map vao file feature in cucumber
		features = {"src/test/java/features"},
		glue= {"stepDefinitions"},
		//hien thi console
		monochrome = true,
		//Finish General Report
		plugin = {"pretty","html:target/cucumber-report-default","json:target/site/json/first_cucumber.json"},
		//how to write code
		snippets = SnippetType.CAMELCASE,
		tags = {"@login"}
		)
public class CucumberTestRunner {

}
