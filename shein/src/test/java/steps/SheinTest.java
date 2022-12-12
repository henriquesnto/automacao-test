package steps;

import org.junit.Before;
import org.junit.Test;

import runner.Executa;

public class SheinTest {
	
	Elementos el = new Elementos();
	
	@Before
	public void iniciarTeste() throws InterruptedException {
		
		Executa.abrirNavegador();
		Thread.sleep(3000);
		Metodos.evidencia("1 - Abrir navegador");
		Metodos.clicar(el.closeCupom);
		Metodos.evidencia("2 - Fechar cupom");
		
	

}
	
	@Test
	public void testAdicionarRoupaCarrinho() throws InterruptedException {
		Metodos.evidencia("3 - Página inicial" );
		Metodos.preencher(el.pesquisar, "vestido");
		Metodos.evidencia("4 - Pesquisar produto");
		Metodos.clicar(el.enviar);
		Metodos.evidencia("5 - Resultado teste");
		Metodos.validarTexto(el.validarProduto, "Vestido");
		
		
		/*Metodos.preencher(el.mercadoLivrePesquisar, "ps5");
		Metodos.enviar(el.mercadoLivrePesquisar);
		Metodos.clicar(el.cookieAceitar);
		Metodos.clicar(el.mLivreProduto);
		Thread.sleep(2000);
		Metodos.clicar(el.mLivreAddCarrinho);*/
		
	}
	
	@Test
	public void testaddCarrinho() throws InterruptedException {
		Metodos.clicar(el.produto);
		Thread.sleep(6000);
		Metodos.scroll();
		Metodos.clicar(el.addCarrinho);
	}
	
	
}
