package validando.title;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeiroTeste {
	
	WebDriver driver;

	@Before 
	public void setUp() throws Exception {
		System.getProperty("Webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void itau() {
		driver.get("https://www.itau.com.br/");
		String titulo = driver.getTitle();
		assertEquals("Banco Itaú | Feito com você", titulo);
	}

	@Test
	public void amazon() {
		driver.get("https://www.amazon.com.br/");
		String titulo = driver.getTitle();
		assertEquals("Amazon.com.br | Tudo pra você, de A a Z.", titulo);

	}
	
	@Test
	public void kabum() {
		driver.get("https://www.kabum.com.br/");
		String titulo = driver.getTitle();
		assertEquals("KaBuM! | Maior E-commerce de Tecnologia e Games da América Latina", titulo);

	}
	
	@Test
	public void google() {
		driver.get("https://www.google.com.br/");
		String url = driver.getCurrentUrl();
		assertEquals("https://www.google.com.br/", url);

	}

}
