package steps;

import java.io.IOException;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import page.Formulario;
import page.Metodos;

public class Formtest {
	
	Metodos metodos = new Metodos();
	Formulario form = new Formulario();
	
	
	
	@Dado("que eu esteja no formulario")
	public void que_eu_esteja_no_formulario() {
	
		metodos.abrirNavegador("file:///H:/One%20Drive/OneDrive/3.Conhecimento/Programa%C3%A7%C3%A3o/E2E%20Treinamentos/2-Plataforma/Automa%C3%A7%C3%A3o%20de%20Testes%20Java,%20Selenium,%20Cucumber,%20Postman%20e%20Restassured/06%20-%20Semana%20Pir%C3%A2mide%20de%20Teste%20-%20UI/_Recursos/smntest/index.html");
		
	}

	@Quando("eu preencher e enviar o formulario")
	public void eu_preencher_e_enviar_o_formulario() throws IOException {
		form.preencherFormulario("Luiz Henrique Araujo Santos", "henrique@test.com", "Parabéns você é foda!");
	}

	@Entao("sou direcionado para o site da escola")
	public void sou_direcionado_para_o_site_da_escola() {
		metodos.validarTitle("E2E Treinamentos");
	}


}
