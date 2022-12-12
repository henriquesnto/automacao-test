package teste;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import metodos.Metodos;
import elementos.Elementos;

public class CasatroUsuarioTeste {
	
	
	Metodos metodos = new Metodos();
	Elementos el  = new Elementos();

	@Before
	public void setUp() throws Exception {
			metodos.abrirNavegador();
	}
	

	@After
	public void tearDown() throws Exception {
		 metodos.fecharNavegador();
		
	}

	@Test
	public void testCadastraUsuario() {
		metodos.preencher(el.getNome(),"Luiz");
		metodos.preencher(el.getEmail(),"luiz@henrique.com");
		metodos.preencher(el.getSenha(),"12345");
		metodos.clicar(el.getbtnCadastrar());
	}

	@Test
	public void testCadastraNomeBranco() {
		metodos.preencher(el.getNome(),"");
		metodos.clicar(el.getbtnCadastrar());
	}

	@Test
	public void testCadastraEmailBranco() {
		metodos.preencher(el.getNome(),"Luiz");
		metodos.preencher(el.getEmail(),"");
		metodos.clicar(el.getbtnCadastrar());

	}
	 
	@Test
	public void testCadastraSenhaBranco() {
		metodos.preencher(el.getNome(),"Luiz");
		metodos.preencher(el.getEmail(),"luiz@henrique.com");
		metodos.preencher(el.getSenha(),"");
		metodos.clicar(el.getbtnCadastrar());
	}
}
