package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import conexoes.DriversFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "steps",
		tags = "@testecucumber",
		monochrome = true,
		dryRun = false,
		plugin = {"pretty","html:target/cucumber-report.html"},
		snippets = SnippetType.CAMELCASE
		)
		

public class Executa extends DriversFactory {

	public static void abrirNavegador() {
		
		String url = "https://demoqa.com/";
		String navegador = "Chrome";
		
		if(navegador.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}else {
			System.out.println("Digite Chrome ou firefox");
			
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
}
