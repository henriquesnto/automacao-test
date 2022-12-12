package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	private By nome = By.xpath("//input[@id='nome_cad']");
	private By email = By.xpath("//input[@id='email_cad']");
	private By senha = By.xpath("//input[@id='senha_cad']");
	private By btnCadastrar = By.xpath("//input[@type='submit']");
	
	public By getNome() {
		return nome;
	}
	public By getEmail() {
		return email;
	}
	public By getSenha() {
		return senha;
	}
	public By getbtnCadastrar() {
		return btnCadastrar;
	}

	


}
