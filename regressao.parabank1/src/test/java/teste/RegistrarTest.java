package teste;

import org.junit.Before;
import org.junit.Test;

import elemento.Elementos;
import metodos.Metodos;

public class RegistrarTest {
	
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	
	@Before
	public void acessarFormulario() {
		metodos.abrirNavegador();
		metodos.clicar(el.menuRegister);
	}
	
	@Test
	public void registrar() {
		metodos.escrever(el.firstName, "ZoroSan");
		metodos.escrever(el.lastName, "Silva");
		metodos.escrever(el.address, "rua testers");
		metodos.escrever(el.city, "São Paulo");
		metodos.escrever(el.state, "SP");
		metodos.escrever(el.zipCode, "00000000");
		metodos.escrever(el.phone, "(11)2347328974");
		metodos.escrever(el.ssn, "100");
		metodos.escrever(el.userName, "ZoroSan");
		metodos.escrever(el.password, "1234123");
		metodos.escrever(el.confirmaPassword, "1234123");
		metodos.clicar(el.bntRegister);
	}
	
	@Test
	public void campoBranco() {
		metodos.clicar(el.bntRegister);
	}
	
	@Test
	public void campoIvalidos() {
		metodos.escrever(el.firstName, "@");
		metodos.escrever(el.lastName, "@");
		metodos.escrever(el.address, "@");
		metodos.escrever(el.city, "@");
		metodos.escrever(el.state, "@");
		metodos.escrever(el.zipCode, "@");
		metodos.escrever(el.phone, "@");
		metodos.escrever(el.ssn, "@");
		metodos.escrever(el.userName, "@");
		metodos.escrever(el.password, "@");
		metodos.escrever(el.confirmaPassword, "@");
		metodos.clicar(el.bntRegister);
	}
	
	@Test
	public void senhaDiferente() {
		metodos.escrever(el.firstName, "ZoroSan");
		metodos.escrever(el.lastName, "Silva");
		metodos.escrever(el.address, "rua testers");
		metodos.escrever(el.city, "São Paulo");
		metodos.escrever(el.state, "SP");
		metodos.escrever(el.zipCode, "00000000");
		metodos.escrever(el.phone, "(11)2347328974");
		metodos.escrever(el.ssn, "100");
		metodos.escrever(el.userName, "ZoroSan");
		metodos.escrever(el.password, "1234123");
		metodos.escrever(el.confirmaPassword, "9876545");
		metodos.clicar(el.bntRegister);
	} 
	
	@Test
	public void usuarioCadastrado() {
		metodos.escrever(el.firstName, "ZoroSan");
		metodos.escrever(el.lastName, "Silva");
		metodos.escrever(el.address, "rua testers");
		metodos.escrever(el.city, "São Paulo");
		metodos.escrever(el.state, "SP");
		metodos.escrever(el.zipCode, "00000000");
		metodos.escrever(el.phone, "(11)2347328974");
		metodos.escrever(el.ssn, "100");
		metodos.escrever(el.userName, "ZoroSan");
		metodos.escrever(el.password, "1234123");
		metodos.escrever(el.confirmaPassword, "1234123");
		metodos.clicar(el.bntRegister);
	}
	
}
