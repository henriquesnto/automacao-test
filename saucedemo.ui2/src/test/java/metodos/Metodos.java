package metodos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {
	
	WebDriver driver;
	
	public void abrirNevegador() {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
}
