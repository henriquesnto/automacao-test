package validando.url2;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidarUrl {
	
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.getProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void mercadoLivre() {
		driver.get("https://www.mercadolivre.com.br/");
		String url = driver.getCurrentUrl();
		assertEquals("https://www.mercadolivre.com.br/",url);
	}
	
	@Test
	public void aliexpress() {
		driver.get("https://best.aliexpress.com/");
		String url = driver.getCurrentUrl();
		assertEquals("https://best.aliexpress.com/",url);
	}
	
	@Test
	public void instagram() {
		driver.get("https://www.instagram.com/");
		String url = driver.getCurrentUrl();
		assertEquals("http://www.instagram.com/",url);
	}

}
