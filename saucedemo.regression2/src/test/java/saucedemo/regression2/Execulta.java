package saucedemo.regression2;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "steps",
		tags = "@login",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:target/report-cucumber.html"},
		snippets = SnippetType.CAMELCASE
		)

public class Execulta {
	
	public static void abrirNavegador() {
		
		
	}

}
