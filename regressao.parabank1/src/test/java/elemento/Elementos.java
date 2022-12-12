package elemento;

import org.openqa.selenium.By;

public class Elementos {
	
	public By menuRegister = By.xpath("//a[text()='Register']");
// Campos do formulário de registro 	
	public By firstName = By.xpath("//*[@id='customer.firstName']");
	public By lastName = By.xpath("//*[@id='customer.lastName']");
	public By address = By.xpath("//*[@id='customer.address.street']");
	public By city = By.xpath("//*[@id='customer.address.city']");
	public By state = By.xpath("//*[@id='customer.address.state']");
	public By zipCode = By.xpath("//*[@id='customer.address.zipCode']");
	public By phone = By.xpath("//*[@id='customer.phoneNumber']");
	public By ssn = By.xpath("//*[@id='customer.ssn']");
	public By userName = By.xpath("//*[@id='customer.username']");
	public By password = By.xpath("//*[@id='customer.password']");
	public By confirmaPassword = By.xpath("//*[@id='repeatedPassword']");
	public By bntRegister = By.xpath("//*[@value='Register']");

	
	public By getFirstName() {
		return firstName;
	}
	
}
