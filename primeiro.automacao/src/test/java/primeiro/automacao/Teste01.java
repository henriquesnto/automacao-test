package primeiro.automacao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teste01 {
	
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com.br/");
	}

	@After
	public void tearDown() throws Exception {
	}	
	
	@Test
	public void test() {
		By pesquisar = By.xpath("//input[@id='twotabsearchtextbox']");
		driver.findElement(pesquisar).sendKeys("iphone");
	}
	

}
