package steps;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;
import utils.MassaDeDados;

public class LoginTest {
	
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	MassaDeDados massa = new MassaDeDados();
	

	@Given("que esteja na tela de login")
	public void queEstejaNaTelaDeLogin() throws InterruptedException {
		Executa.abrirNavegador();
		Thread.sleep(3000);
		
	}
	@Given("preencher o usuarios")
	public void preencherOUsuarios() {
		metodos.escrever(el.name,massa.standard_user);
		
	}
	@Given("preencher a senha")
	public void preencherASenha() {
		metodos.escrever(el.password,massa.secret_sauce);

	}
	@When("realizar o login")
	public void realizarOLogin() {
		metodos.clicar(el.bntLogin);
	
	}
	@Then("Login realizado com sucesso")
	public void loginRealizadoComSucesso() {

	}


	@Given("preencher com usuarios bloquado")
	public void preencherComUsuariosBloquado() {
	
	}
	@Then("sistema apresenta mensagem de usuario bloquado")
	public void sistemaApresentaMensagemDeUsuarioBloquado() {
	 
	}


	@Given("preencher com usuarios invalido")
	public void preencherComUsuariosInvalido() {

	}
	@Given("preencher a senha invalida")
	public void preencherASenhaInvalida() {

	}
	@Then("sistema apresenta mensagem de usuario e senha invalida")
	public void sistemaApresentaMensagemDeUsuarioESenhaInvalida() {

	}

	@Given("não preencher nenhum dado")
	public void nãoPreencherNenhumDado() {

	}
	@Then("sistema apresenta mensagem dados em branco")
	public void sistemaApresentaMensagemDadosEmBranco() {

	}





	





}
