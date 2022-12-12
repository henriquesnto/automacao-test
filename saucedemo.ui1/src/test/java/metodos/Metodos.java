package metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;

	public void acessarSite() {
		String exemplo = "https://www.google.com.br/";
		String teste = "https://www.saucedemo.com/";
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(exemplo);
		System.out.println("*****************Iniciando Teste********************");
	}

	public void clicar(By element) {
		driver.findElement(element).click();
	}

	public void escrever(By element, String text) {
		driver.findElement(element).sendKeys(text);

	}

	public void submit(By element) {
		driver.findElement(element).submit();
	}

	public void clear(By element) {
		driver.findElement(element).clear();
	}

	public void pause(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void evidencia(String nomeEvidencia) {
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./evidencias/" + nomeEvidencia + ".png");
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void fechar() {
		driver.quit();

	}

	public void validarTexto(String atributo1, String atributo2, String textoEsperado) {
		String textoCapturado = driver.findElement(By.xpath("//"+atributo1+"[@"+atributo2+"='']")).getText();
		assertEquals(textoEsperado, textoCapturado);
	}
	
	public void validarTextoPorContais(String atributo1, String contains, String textoEsperado) {
		String textoCapturado = driver.findElement(By.xpath("//"+atributo1+"[text()=' "+contains+"']")).getText();
		assertEquals(textoEsperado, textoCapturado);
	}
	
}
