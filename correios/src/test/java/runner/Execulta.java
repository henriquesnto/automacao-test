package runner;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import drivers.Drivers;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Execulta extends Drivers {
	
	/**
	 * Método para abrir o navegado chrome
	 * @author henri
	 */
	
	public static void abrirNevegador() {
		String ambiente = "https://www.correios.com.br/";
		WebDriverManager.chromedriver().setup();
		ChromeOptions  chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments("--headless");
		chromeOptions.addArguments("--start-maximized");
		driver = new ChromeDriver(chromeOptions);
		driver.get(ambiente);
	
	}

}
