package validando.url4;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validando {
	
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.getProperty("webdriver.chrome.driver","./Driver.chormedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void validacao() {
		
		driver.get("https://www.typing.com/br/student/lessons");
		String title = driver.getTitle();
		assertEquals("Lições de digitação | Aprenda a Digitar e Melhore a Sua Velocidade de Digitação Grátis - Typing.com", title);
		
	}

}
