package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import runner.Executa;

public class CucumberTeste {
	
	@Before
	public void iniciarTeste() {
		Executa.abrirNavegador();
		
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
