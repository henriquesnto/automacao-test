package metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {
	
	WebDriver driver;
	
	public void abrirNavegador() {
		
		String url = "H:\\One Drive\\OneDrive\\3.Conhecimento\\Progamação\\E2E treinamentos\\3-Bora Automatizar\\Semana QA\\projeto.1";
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		
	}
	
	public void fecharNavegador() {
		driver.quit();

	}

	public void preencher(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
		
	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
		
		
	}

}
