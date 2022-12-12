package regression.test.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import regression.test.runner.Executa;

public class BackgroundTest {

	@Given("que estja na tela de login")
	public void queEstjaNaTelaDeLogin() {
		Executa.abrirNavegador();
	}

	@Given("informo o usuario {string}")
	public void informoOUsuario(String string) {
	
	}

	@Given("informo a senha {string}")
	public void informoASenha(String string) {
	}

	@When("clicar no botao login")
	public void clicarNoBotaoLogin() {
	}

	@Then("login realaizado com sucesso")
	public void loginRealaizadoComSucesso() {
	}

	@Given("informo o usuario invalido {string}")
	public void informoOUsuarioInvalido(String string) {
	}

	@Given("informo a senha invalida {string}")
	public void informoASenhaInvalida(String string) {
	}

	@Then("login nao realizado")
	public void loginNaoRealizado() {
	}

	@Then("login mensagem de usuario bloquado")
	public void loginMensagemDeUsuarioBloquado() {
	}

}
