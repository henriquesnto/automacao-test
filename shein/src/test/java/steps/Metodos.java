package steps;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import drivers.DriversFactory;

public class Metodos extends DriversFactory {

	public static void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public static void preencher(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public static void enviar(By elemento) {
		driver.findElement(elemento).submit();
	}

	public static void scroll() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)");

	}

	public static void validarTexto(By elemento, String textoEsperado) {
		String textoCapturado = driver.findElement(elemento).getText();
		System.out.println("O texto capturado é " + textoCapturado);
		assertEquals(textoEsperado, textoCapturado);
	}

		 public static void evidencia(String nomeEvidencia) {
		 TakesScreenshot scrShot = (TakesScreenshot) driver;
		 File srcFile = scrShot.getScreenshotAs(OutputType.FILE); 
		 File destFile = new File("./evidencias1/" + nomeEvidencia + ".png"); 
		 try {
		 FileUtils.copyFile(srcFile, destFile); } 
	 
		 catch (IOException e) {
		 e.printStackTrace(); }
	  

}
