package page;

import java.io.IOException;

import elementos.Elementos;

public class Formulario{
	
	Metodos metodos = new Metodos();
	Elementos elemento = new Elementos();

	public void preencherFormulario(String nome, String email, String mensagem) throws IOException {
		
		metodos.escrever(elemento.getNome(), nome);
		metodos.escrever(elemento.getEmail(), email);
		metodos.escrever(elemento.getMensagem(), mensagem);
		metodos.printscreen("CT0001-Enviar o formulario");
		metodos.clicar(elemento.getBtnEnviar());
	}
	
}
