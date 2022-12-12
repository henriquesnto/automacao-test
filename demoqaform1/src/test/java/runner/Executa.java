package runner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import drivers.DriversFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Executa extends DriversFactory {
	
	public static void iniciarBrowser() {
		String navegador = "Chrome";
		String ambiente = "https://demoqa.com/automation-practice-form\r\n";
				
		if(navegador.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeOptions = new ChromeOptions();
			//chromeOptions.addArguments("--headless");
			driver = new ChromeDriver(chromeOptions);
			
		} else if(navegador.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			firefoxOptions.addArguments("--headless");
			driver = new FirefoxDriver(firefoxOptions);
			
		} else if(navegador.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			EdgeOptions edgeOptions = new EdgeOptions();
			edgeOptions.addArguments("--headless");
			driver = new EdgeDriver(edgeOptions);
			
		
		} else {
			
			System.err.println("Opção Invalida Digite Chrome | Firefox |Edge");
		}
		driver.get(ambiente);
		driver.manage().window().maximize();
	}
	

}
