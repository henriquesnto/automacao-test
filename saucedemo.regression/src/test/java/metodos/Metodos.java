package metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import drivers.Drivers;

public class Metodos extends Drivers {
	
	/**
	 * Método para escrever passando o parametro By e String com texto
	 * @param elemento
	 * @param texto
	 */
	public void escrever(By elemento,String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.err.println("Erro ao tentar escrever no elemento" + elemento);
			
		}
		
	}
	
	/**
	 * Método para clicar passando o paramento BY 
	 * @param elemento
	 */
	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("Erro ao tentar clicar no elemento" + elemento);

		}
	}
	/**
	 * Métodos para validar url capturada
	 * @param urlDesejada
	 */

	
	public void currentUrl(String urlDesejada) {
		try {
			assertEquals(urlDesejada, driver.getCurrentUrl());
		} catch (Exception e) {
			System.err.println("Error ao tentar validar a url desejada" + urlDesejada);

		}
	}
	
	
	

}
