package metodos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {
	
	// Class do Selenium - Interagir com browser
	WebDriver driver;
	
	public void abrirNavegador() {
		String url = "https://parabank.parasoft.com/parabank";
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

}
