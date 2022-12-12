package correio;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidacaoUrl {
	
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.getProperty("webdriver.chrome.driver", "./Drivers.chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		driver.get("https://www.correios.com.br/");
		String url = driver.getCurrentUrl();
		assertEquals("https://www.correios.com.br/", url);
	}

}
