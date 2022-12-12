package metodos;

import org.openqa.selenium.By;

import drivers.DriversFactory;

public class Metodos extends DriversFactory{
	
	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}
	
	public void clicarporTexto(String atributo, String texto) {
		driver.findElement(By.xpath("//"+atributo+"[text()='"+texto+"']")).click();
	}
	
	public void dataNascimento(String ano, String mes, String dia) throws InterruptedException {
		
		By calendario = By.id("dateOfBirthInput");
		By anoElemento = By.xpath("//*[@class='react-datepicker__year-select']");
		//By diaElemento = By.xpath("//*[@class=['react-datepicker__day react-datepicker__day--026 react-datepicker__day--selected react-datepicker__day--today']");
		//By mesElemento = By.xpath("//*[@class='react-datepicker__month-select']");
		Thread.sleep(2000);
		clicar(calendario);
		clicar(anoElemento);
		//clicar(diaElemento);
		//clicar(mesElemento);
		clicarporTexto("option", ano);
		//clicarporTexto("option", dia);
		//clicarporTexto("option", mes);
	}
	


}
