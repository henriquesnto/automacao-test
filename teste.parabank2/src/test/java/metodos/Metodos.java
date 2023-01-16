package metodos;

import org.openqa.selenium.By;

import drivers.Drivers;

public class Metodos extends Drivers{
	
	/**
	 * Metodo clicar em um elemento web passando uma class BY
	 * @param elemento
	 * @param passoTeste
	 * @author henri
	 */
	
	public void clicar(By elemento, String passoTeste) {
		try {
			driver.findElement(elemento).click();
			
		} catch (Exception e) {
			System.err.println("**** Erro no passo " + passoTeste + "******");
			System.out.println("**** Causa do erro *********" + e.getCause());
			System.out.println("**** Menssagem de erro **** " + e.getMessage());

		}

	}
	
	/**
	 * Metodo clicar em um elemento web passando uma class BY
	 * @param elemento
	 * @param passoTeste
	 * @author henri
	 */

	public void preencher(By elemento, String texto, String passoTeste) {
		try {
			driver.findElement(elemento).sendKeys(texto);
			
		} catch (Exception e) {
			System.err.println("**** Erro no passo " + passoTeste + "******");
			System.out.println("**** Causa do erro *********" + e.getCause());
			System.out.println("**** Menssagem de erro **** " + e.getMessage());

		}
			
	}

}

