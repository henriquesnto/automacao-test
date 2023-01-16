package elemento;

import org.openqa.selenium.By;

public class Elemento {
	
	//elemento Registro
	public By firstName = By.id("customer.firstName");
	public By lastName = By.id("customer.lastName");
	public By address = By.id("customer.address.street");
	public By city = By.id("customer.address.city");
	public By state = By.id("customer.address.state");
	public By zipCode = By.id("customer.address.zipCode");
	public By phone = By.id("customer.phoneNumber");
	public By ssn = By.id("customer.ssn");
	public By userName = By.id("customer.username");
	public By password = By.id("customer.password");
	public By repeated = By.id("repeatedPassword");
	public By btnRegister = By.xpath("//input[@value='Register']");
	public By menuRegister = By.xpath("//a[text()='Register']");
	
	// Elementos mensagens de erro
	
	// Elementos menssagens de sucesso
	
}
