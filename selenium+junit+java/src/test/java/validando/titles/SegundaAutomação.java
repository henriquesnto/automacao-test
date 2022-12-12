package validando.titles;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SegundaAutomação {
	
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.getProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void google() {
		driver.get("https://www.google.com.br/");
		String url = driver.getCurrentUrl();
		assertEquals("https://www.google.com.br/",url);
	}

}
