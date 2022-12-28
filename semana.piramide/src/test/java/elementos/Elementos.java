package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	private By nome = By.id("nome");
	private By email = By.id("email");
	private By mensagem = By.id("msg");
	private By btnEnviar = By.cssSelector("a[href*='https://ead.e2etreinamentos.com.br/']");
	
	public By getNome() {
		return nome;
	}
	public By getEmail() {
		return email;
	}
	public By getMensagem() {
		return mensagem;
	}
	public By getBtnEnviar() {
		return btnEnviar;
	}
	
}
