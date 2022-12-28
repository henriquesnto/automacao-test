package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	private static WebDriver driver;
	
	public static WebDriver adriver() {
		
		return driver;
	}
	
	public void abrirNavegador(String site) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();
		
	}
	
	
	
}
