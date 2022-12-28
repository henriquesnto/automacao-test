package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import page.Browser;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/features",
		glue = "steps",
		tags = "@tag",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:target/report.html", "json:target/report.json"}
	
		
		)


public class Run extends Browser{
	
	@AfterClass
	public static void fecharNavegador() {
		
		adriver().quit();
		System.out.println("--------TesteFinalizado-------");
		
	}
	
		

}

