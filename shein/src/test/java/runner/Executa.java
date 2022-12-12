package runner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import drivers.DriversFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Executa extends DriversFactory{
	
	public static void abrirNavegador() {
		String url = "https://br.shein.com/";
	//	String url = "https://www.mercadolivre.com.br/";
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments("--headless");
		driver = new ChromeDriver(chromeOptions);
		driver.get(url);
		driver.manage().window().maximize();
		
	}

}
