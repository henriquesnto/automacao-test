package execulta;

import org.openqa.selenium.chrome.ChromeDriver;

import drivers.Drivers;

public class Run extends Drivers {
	
	/**
	 * Metodo para abrir Navegador chrome
	 * @author henri
	 * 
	 */
	
	public static void abrirNavegador() {
		String url = "https://parabank.parasoft.com/parabank/index.htm";
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	

}
