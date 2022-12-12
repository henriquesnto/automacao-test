package exemplo;

import org.junit.Test;
import org.openqa.selenium.By;

import metodos.Metodos;

public class ExemploUsandoMetodos {
	
	Metodos metodos = new Metodos();
	
	By name = By.name("q");
	
	@Test
	public void testeDeExemplo() {
		metodos.acessarSite();
		metodos.evidencia("1 - Antes de escrever");
		metodos.escrever(name, "Tecnologia");
		metodos.pause(2000);
		metodos.evidencia("2 - Depois que escreveu");
		metodos.clear(name);
		metodos.evidencia("3 - Depois que apagou");
		metodos.pause(5000);
		metodos.escrever(name, "Automatização");
		metodos.evidencia("4 - Escrevemos novamente");
		metodos.submit(name);
		metodos.evidencia("5 - Pesquisamos");
		metodos.fechar();


	}

}
