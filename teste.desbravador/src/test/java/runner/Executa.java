package runner;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import drivers.Drivers;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/features",
		glue = "steps",
		tags = "@reserva",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:target/report-cucumber.html"},
		snippets = SnippetType.CAMELCASE
		)
		
public class Executa extends Drivers {
	
	public static void abrirNavegador() {
		boolean headless = false;
		String url = "https://reservas.desbravador.com.br/hotel-app/hotel-teste-desbravador-8050";
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");
		if(headless) {
			chromeOptions.addArguments("--headless");
		}
		driver = new ChromeDriver(chromeOptions);
		driver.get(url);
	}
	
	public static void fecharNavegador() {
		driver.quit();
	}
	
	public static void evidencia(String nomeEvidencia) {
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./evidencias1/" + nomeEvidencia + ".png");
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	

}
