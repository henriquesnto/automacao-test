package metodo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodo {
	
	WebDriver driver;
	
	public void abriNevegador() {
		String teste ="https://www.saucedemo.com/";
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(teste);
		System.out.println("**********Teste Finalisado");
	}
	

}
