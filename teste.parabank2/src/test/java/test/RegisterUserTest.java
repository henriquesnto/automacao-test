package test;

import org.junit.Before;
import org.junit.Test;

import execulta.Run;
import page.RegisterUserPage;

public class RegisterUserTest {
	
	RegisterUserPage registrar = new RegisterUserPage();
	
	
	@Before
	public void iniciarTest() {
		Run.abrirNavegador();
	}
	
	
	@Test
	public void testeRegisterUser() {
		registrar.acessarForm();
		registrar.enviarForm("teste11", "teste11", "teste11", "teste11", "teste11", "teste11", "teste11", "teste11", "asdfasdfsdf", "teste11", "teste11");
	}
	
	// Fazer assert nas messangens 
	@Test
	public void testRegisterUserDadosBranco() {
		registrar.acessarForm();
		registrar.enviarForm(null, null, null, null, null, null, null, null, null, null, null);

	}
	
	@Test
	public void testRegisterUserSenhaDiferentes() {
		registrar.acessarForm();
		registrar.enviarForm("teste11", "teste11", "teste11", "teste11", "teste11", "teste11", "teste11", "teste11", "teste11", "teste15", "teste18");

	}
	
	@Test
	public void testRegisterUserCadastrado() {
		registrar.acessarForm();
		registrar.enviarForm("teste11", "teste11", "teste11", "teste11", "teste11", "teste11", "teste11", "teste11", "teste11", "teste11", "teste11");

	}

}
