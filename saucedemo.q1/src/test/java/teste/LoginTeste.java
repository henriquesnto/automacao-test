package teste;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import elementos.Elementos;
import runner.Execulta;

public class LoginTeste {
	
	Elementos el = new Elementos();
	
	@Before
	public void iniciarTest() throws InterruptedException {
		Execulta.abrirNavegador();
		Thread.sleep(3000);
	
	}

	@After
	public void fechartest() {
		Execulta.fecharNavegador();
	}
	
	@Test
	public void testLoginInválidos() {
		Execulta.preencher(el.name(), "aaaaaaaaaaaaaaaaaaaaaaaaa");
		Execulta.preencher(el.password(), "*¨%%¨#%@$%@#%$#@%@");
		Execulta.clicar(el.bntLogin());
	}

	@Test
	public void testLoginBranco() {
		Execulta.preencher(el.name(), "aaaaaaaaaaaaaaaaaaaaaaaaa");
		Execulta.preencher(el.password(), "*¨%%¨#%@$%@#%$#@%@");
		Execulta.clicar(el.bntLogin());
	}
	
}
