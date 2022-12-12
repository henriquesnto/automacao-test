package run;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import conexoes.DriversFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "steps",
		tags = "@teste",
		monochrome = true,
		dryRun = false,
		plugin = {"pretty","html:target/cucumber-report.html"},
		snippets = SnippetType.CAMELCASE
		)


public class Executa extends DriversFactory {
	
	
	public static void abrirNevegador() {
		
		String url = "https://demoqa.com/";
		String navegador ="Chrome";
		boolean headless = true;
		
		
		if(navegador.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver-105.0.5195.52-win32.exe");
			ChromeOptions optionsChrome  = new ChromeOptions(); 
			if(headless) {
				//optionsChrome.addArguments("--headless");
				optionsChrome.addArguments("--disable-gpu");
				optionsChrome.addArguments("--window-size=1400,800");
			}
			
			driver = new ChromeDriver(optionsChrome);
		}else if(navegador.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver-v0.31.0-win64.exe");
			FirefoxOptions optionsFirefox  = new FirefoxOptions();
			if(headless) {
				optionsFirefox.addArguments("--headless");
				optionsFirefox.addArguments("--disable-gpu");
				optionsFirefox.addArguments("--window-size=1400,800");
			}
			driver = new FirefoxDriver(optionsFirefox);
		}else {
			System.out.println("Digite Chorme ou firefox");
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		
	}

}
