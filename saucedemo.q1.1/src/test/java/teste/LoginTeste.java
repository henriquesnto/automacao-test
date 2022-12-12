package teste;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import elementos.Elementos;
import metodos.Metodos;
import runner.Execulta;

public class LoginTeste {
	
	Elementos el = new Elementos();
	Metodos metodos = new Metodos();
	
	
	@Before
	public void abrirNavegador() throws InterruptedException {
		Execulta.abrirNavegador();
		Thread.sleep(3000);
		
	}
	
	@After
	public void fecharNavegador() {
		Execulta.fecharNavegador();
		
	}

	@Test
	public void loginInvalido() {
		Execulta.preencher(el.name, "aaaaaaaaaaaaaaa");
		Execulta.preencher(el.password, "aaaaaaaaaaaaaaa");
		Execulta.clicar(el.bntLogin);
		Execulta.evidencia("Login Invalido");


	}
	
	@Test
	public void loginBranco() {
		Execulta.preencher(el.name, "");
		Execulta.preencher(el.password, "");
		Execulta.clicar(el.bntLogin);
		Execulta.evidencia("Dados em Branco");


	}
	
}
