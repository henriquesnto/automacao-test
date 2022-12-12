package steps;

import org.junit.Before;
import org.junit.Test;

import metodos.Metodos;
import runner.Executa;

public class PreencherFormTest {
	
	Metodos metodos = new Metodos();
	
	@Before
	public void iniciarTeste() {
		Executa.iniciarBrowser();
	}

    @Test
    public void enviarFormularioTeste() throws InterruptedException {
    	System.out.println("Teste executado");
    	metodos.dataNascimento("1987", "", "27");
    }
	
}
