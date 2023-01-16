package page;

import elemento.Elemento;
import metodos.Metodos;

public class RegisterUserPage {

	
	Metodos metodos = new Metodos();
	Elemento el = new Elemento();
	
	
	public void acessarForm() {
		metodos.clicar(el.menuRegister, "abrindo o formulario pelo menu register da home");
	}
	
	public void enviarForm(String firstName, String lastName, String address, String city, String state, String zipCode, String phone, String ssn, String userName, String password, String repeated) {
		metodos.preencher(el.firstName,firstName, "preencher o campo firstName");
		metodos.preencher(el.lastName,lastName, "preencher o campo lastName");
		metodos.preencher(el.address,address, "preencher o campo address");
		metodos.preencher(el.city,city, "preencher o campo city");
		metodos.preencher(el.state,state, "preencher o campo state");
		metodos.preencher(el.zipCode,zipCode, "preencher o campo zipCode");
		metodos.preencher(el.phone,phone, "preencher o campo phone");
		metodos.preencher(el.ssn,ssn, "preencher o campo ssn");
		metodos.preencher(el.userName, userName, "preencher o campo userName");
		metodos.preencher(el.password,password, "preencher o campo password");
		metodos.preencher(el.repeated,repeated, "preencher o campo repeated");
		metodos.clicar(el.btnRegister, "Clicando no botao register para enviar o formulario");
		

		
		
	}
	
}
