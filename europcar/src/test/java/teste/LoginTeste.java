package teste;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import elementos.Elementos;
import runner.Execulta;

public class LoginTeste{

	Elementos el = new Elementos();

	@Before
	public void iniciarTest() throws InterruptedException {
		Execulta.abrirNavegador();
		Thread.sleep(5000);
		Execulta.clicar(el.getCookies());
		Thread.sleep(3000);
		Execulta.clicar(el.getMenu());
		Thread.sleep(3000);
		Execulta.clicar(el.getAcessarLogin());
		Execulta.evidencia("Login Efetuado");

	}

	@After
	public void fechartest() {
		Execulta.fecharNavegador();
	}

	@Test
	public void testLoginVálido() {
		Execulta.preencher(el.getEmail(), "zthiagor67@gmail.com");
		Execulta.preencher(el.getSenha(), "Zthiagor67");
		Execulta.clicar(el.getEntrar());
	}
	
	@Test
	public void testLoginInválidos() {
		Execulta.preencher(el.getEmail(), "aaaaaaaaaaaaaaaaaaaaaaaaa");
		Execulta.preencher(el.getSenha(), "*¨%%¨#%@$%@#%$#@%@");
		Execulta.clicar(el.getEntrar());
	}
	
	@Test
	public void testdadosBranco() {
		Execulta.preencher(el.getEmail(), "");
		Execulta.preencher(el.getSenha(), "");
		Execulta.clicar(el.getEntrar());
	}

	@Test
	public void testEmailIdEmBranco() {
		Execulta.preencher(el.getEmail(), "");
		Execulta.preencher(el.getSenha(), "Zthiagor67");
		Execulta.clicar(el.getEntrar());
	}
	
	@Test
	public void testSenhaEmBranco() {
		Execulta.preencher(el.getEmail(), "zthiagor67@gmail.com");
		Execulta.preencher(el.getSenha(), "");
		Execulta.clicar(el.getEntrar());
	}
	
	@Test
	public void testLimiteDeCaracteresEmailId() {
		Execulta.preencher(el.getEmail(), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		Execulta.preencher(el.getSenha(), "");
		Execulta.clicar(el.getEntrar());
	}
	
	@Test
	public void testLimiteDeCaracteresSenha() {
		Execulta.preencher(el.getEmail(), "");
		Execulta.preencher(el.getSenha(), "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		Execulta.clicar(el.getEntrar());
	}
	
	@Test
	public void testCheckBox() {
		Execulta.preencher(el.getEmail(), "zthiagor67@gmail.com");
		Execulta.preencher(el.getSenha(), "Zthiagor67");
		Execulta.clicar(el.getEntrar());
		Execulta.clicar(el.getBox());
	}
}
