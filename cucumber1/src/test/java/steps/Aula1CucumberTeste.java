package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import run.Executa;

public class Aula1CucumberTeste {

	@Before
	public void iniciarTeste() {
		Executa.abrirNevegador();
		
	}

	@Given("que esteja no formulario")
	public void queEstejaNoFormulario() {
		
	}
	
	
	@When("preencher as informações")
	public void preencherAsInformações() {
		
	}
	
	
	@Then("formulario enviado")
	public void formularioEnviado() {
		
	}




}
