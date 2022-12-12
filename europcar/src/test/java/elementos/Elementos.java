package elementos;
import org.openqa.selenium.By;

public class Elementos {
	
	private By email = By.xpath("//div[@class='text_padding_div']//input[@name='driverID']");
	private By senha = By.xpath("//div[@class='text_padding_div']//input[@name='password']");
	private By checkBox = By.xpath("//*[@id=\"loginForm\"]/div[1]/fieldset/div[3]/label");
	private By bntEntrar = By.xpath("//span[text()='ENTRAR']");
	private By cookiesAceitar = By.xpath("//*[@id='didomi-notice-disagree-button']");
	private By menu = By.xpath("//button[@id='burgerMenuBtn']");
	private By acessarLogin = By.xpath("//a[@href='/EBE/module/driver/AuthenticateDrivers1000.do?action=7']");
	
	
	public By getEmail() {
		return email;
	}
	
	public By getSenha() {
		return senha;
	}

	public By getBox() {
		return checkBox;
	}
	
	public By getEntrar() {
		return bntEntrar;
	}
	
	public By getCookies() {
		return cookiesAceitar;
	}
	
	public By getMenu() {
		return menu;
	}
	
	public By getAcessarLogin() {
		return acessarLogin;
	}
}
