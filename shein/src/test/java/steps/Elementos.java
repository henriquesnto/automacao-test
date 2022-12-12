package steps;

import org.openqa.selenium.By;

public class Elementos {
	
	By closeCupom = By.xpath("/html/body/div[1]/div[5]/div[1]/div/i");
	By produto = By.xpath("/html/body/div[1]/div[1]/div[6]/div/div/div[1]/div/section[1]/div[1]/a");
	By addCarrinho = By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[3]/div[1]/div[1]/button");
	By pesquisar = By.name("header-search");
	By enviar = By.xpath("//div[@class='search-btn she-btn-black j-search-btn']");
	By validarProduto = By.xpath("//*[@id=\"product-list-v2\"]/div[1]/div[2]/div/section/section/div[1]/h1");
	
	
	
	By mercadoLivrePesquisar = By.name("as_word");
	By cookieAceitar = By.xpath("/html/body/div[2]/div[1]/div[2]/button[1]");
	By mLivreProduto = By.xpath("//*[@id=\"root-app\"]/div/div[2]/section/ol[1]/li[1]/div/div/a");
	By mLivreAddCarrinho = By.xpath("//*[@id=\"buybox-form\"]/div[5]/div/button[2]/span");	
}
