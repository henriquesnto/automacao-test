package runner;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import drivers.Drivers;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Execulta extends Drivers{
	
	public static void abrirNavegador() {
		String url = "https://www.saucedemon.com";
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions firefoxdriver = new FirefoxOptions();
		//chromeOptions.addArguments("--headless");
		firefoxdriver.addArguments("--start-maximezed");
		driver =  new FirefoxOptions(firefoxOptions);
		driver.getBinary(url);
		
	}
	
		public static void fecharNavegador() {
	  	driver.quit();
	}	
		
	public static void preencher(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}
	
	public static void clicar(By elemento) {
		driver.findElement(elemento).click();
		
	}
	
	public static void evidencia(String nomeEvidencia) {
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./evidencias1/" + nomeEvidencia + ".png");
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	
}


