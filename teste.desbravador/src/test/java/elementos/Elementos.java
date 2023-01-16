package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	public By dataEntrada = By.xpath("//*[@id=\"calendar\"]/div[2]/div[2]/table[1]/tbody/tr[3]/td[2]/div"); 
	public By dataSaida = By.xpath("//*[@id=\"calendar\"]/div[2]/div[2]/table[1]/tbody/tr[3]/td[4]/div");
	public By quantidadeHospede = By.xpath("//input[@placeholder=\"Adultos\"]");
	public By bntVerificaDispo = By.xpath("//button [text()='Verificar Disponibilidade']");
	public By bntAdiciona = By.xpath("//*[@id=\"root\"]/main/div/div/div/div[4]/div/div[1]/div[2]/div[3]/div/div/div/div/div/div[1]/div/div[4]/div[3]/button");
	public By bntContinuar1 = By.xpath("//*[@id=\"root\"]/main/div/div/div/div[4]/div/div[2]/div/div[1]/div[2]/div[3]/div/div/button");
	public By bntHospede = By.xpath("//*[@id=\"root\"]/main/div/div/div[3]/div[1]/div[1]/div/div/div/div/div[2]/div/div[1]/div[2]/button");
	public By hospede1 = By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/div[2]/div[1]/div/input");
	public By hospede2 = By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/div[3]/div[1]/div/input");
	public By bntSalvar = By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/div[4]/div/button");
	public By bntContinuar2 = By.xpath("//*[@id=\"root\"]/main/div/div/div[3]/div[1]/div[3]/div/div/button[2]");
	public By email = By.xpath("//*[@id=\"root\"]/main/div/div/div[3]/div/div[2]/form/div[1]/div[1]/div/div[1]/div/div/div[1]/div/input");
	public By pNome = By.xpath("//input [@name='firstName']");
	public By sNome = By.xpath("//input [@name='lastName']");
	public By tCPF = By.xpath("//*[@id=\"root\"]/main/div/div/div[3]/div/div[2]/form/div[1]/div[1]/div/div[2]/div[1]/div/select/option[2]");
	public By doc = By.xpath("//*[@id=\"root\"]/main/div/div/div[3]/div/div[2]/form/div[1]/div[1]/div/div[2]/div[2]/div/input");
	public By tel = By.xpath("//*[@id=\"root\"]/main/div/div/div[3]/div/div[2]/form/div[1]/div[1]/div/div[2]/div[3]/div/input");
	public By pais = By.xpath("//*[@id=\"root\"]/main/div/div/div[3]/div/div[2]/form/div[1]/div[1]/div/div[2]/div[4]/div/div/div/divls");
	public By cep = By.xpath("//*[@id=\"root\"]/main/div/div/div[3]/div/div[2]/form/div[1]/div[1]/div/div[2]/div[5]/div/div[1]/input");
	public By pesquisar = By.xpath("//*[@id=\"root\"]/main/div/div/div[3]/div/div[2]/form/div[1]/div[1]/div/div[2]/div[5]/div/div/button");
	public By nCartão = By.xpath("//*[@id=\"root\"]/main/div/div/div[3]/div/div[2]/form/div[1]/div[2]/div/div[3]/div[1]/div/div[1]/input");
	public By nomeCartão = By.xpath("//*[@id=\"root\"]/main/div/div/div[3]/div/div[2]/form/div[1]/div[2]/div/div[3]/div[2]/div/input");
	public By valid = By.xpath("//*[@id=\"root\"]/main/div/div/div[3]/div/div[2]/form/div[1]/div[2]/div/div[3]/div[3]/div/input");
	public By cvc = By.xpath("//*[@id=\"root\"]/main/div/div/div[3]/div/div[2]/form/div[1]/div[2]/div/div[3]/div[4]/div/input");
	public By captch = By.xpath("//*[@id=\"recaptcha-anchor-label\"]");
	public By termo = By.xpath("//*[@id=\"root\"]/main/div/div/div[3]/div/div[2]/form/div[3]/div[2]/div/div[1]/div/div/input");
	public By finalizar = By.xpath("//*[@id=\"root\"]/main/div/div/div[3]/div/div[2]/form/div[5]/div/div/button");
	
	
}
