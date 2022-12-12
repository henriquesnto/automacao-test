package metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {
	
	WebDriver driver;
	
	public void abrirNavegador() {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		
	}
	
	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
		
		}
		
	}
	

