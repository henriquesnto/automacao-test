package teste;

import org.junit.Before;
import org.junit.Test;

import runner.Execulta;

public class BuscarCepTeste {
	
	@Before
	public void iniciarTeste() {
		Execulta.abrirNevegador();
	}
	
	@Test
	public void buscarCepValido() {
		System.out.println("Navegador aberto com sucesso");
	}
	

}
