package steps;

import elementos.Elementos;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;
import utils.MassaDeDados;

public class ReservaTest {
	
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	MassaDeDados massa = new MassaDeDados();
	

	
	@Given("que esteja na tela inicial")
	public void queEstejaNaTelaInicial() throws InterruptedException {
		Executa.abrirNavegador();
		Thread.sleep(3000);
		
	}
	
	@After
	public void fecharNavegador() {
		Executa.fecharNavegador();
		
	}
	
	@Given("selecione a data de entrada e saída")
	public void selecioneADataDeEntradaESaída() throws InterruptedException {
		Thread.sleep(5000);
		metodos.clicar(el.dataEntrada);
		metodos.clicar(el.dataSaida);

	}
	
	@Given("selecione a quantidade de hospedes")
	public void selecioneAQuantidadeDeHospedes() throws InterruptedException {
		Thread.sleep(3000);
	    metodos.escrever(el.quantidadeHospede, "1");
	}
	
	@Given("clique em verifica diponibilidade")
	public void cliqueEmVerificaDiponibilidade() throws InterruptedException {
		Thread.sleep(5000);
		metodos.clicar(el.bntVerificaDispo);
	}
	
	@Given("adicionar reserva ao carrinho")
	public void selecionarReservaAoCarrinho() throws InterruptedException {
		Thread.sleep(3000);
		metodos.clicar(el.bntAdiciona);
	}
	
	@Given("clicar em continuar")
	public void clicarEmContinuar() throws InterruptedException {
		Thread.sleep(3000);
	    metodos.clicar(el.bntContinuar1);
	}
	
	@Given("preencher hospede da reserva")
	public void preencherHospedeDaReserva() throws InterruptedException {
		Thread.sleep(3000);
		metodos.clicar(el.bntHospede);
		Thread.sleep(3000);
		metodos.escrever(el.hospede1, "teste silva");
		metodos.clicar(el.bntSalvar);
		metodos.clicar(el.bntContinuar2);

	}
	
	@Given("preencher os dados de pagamento validos")
	public void preenchaOsDadosDePagamentoValidos() throws InterruptedException {
		Thread.sleep(3000);
		metodos.escrever(el.email, "testesilva@teste.com");
		metodos.escrever(el.pNome, "teste");
		metodos.escrever(el.sNome, "silva");
		Thread.sleep(3000);
		metodos.clicar(el.tCPF);
		Thread.sleep(3000);
		metodos.escrever(el.doc, "658.241.400-30");
		metodos.escrever(el.tel, "11 999999999");
		Thread.sleep(3000);
		metodos.clicar(el.pais);
		metodos.escrever(el.cep, "76813-056");
		metodos.clicar(el.pesquisar);
		Thread.sleep(3000);
		metodos.escrever(el.nCartão, "4000 0000 0000 0044");
		metodos.escrever(el.nomeCartão, "DESBRAVADOR SOFTWARE");
		metodos.escrever(el.valid, "12/23");
		metodos.escrever(el.cvc, "123");
		metodos.clicar(el.captch);
		metodos.clicar(el.termo);
		
	}
	
	@Given("clicar em finalizar")
	public void clicarEmFinalizar() throws InterruptedException {
		Thread.sleep(3000);
	    metodos.clicar(el.finalizar);
	}
	
	@Given("realizar resevar")
	public void realizarResevar() {
	    
	}
	
	@When("clicar em nova reserva")
	public void clicarEmNovaReserva() {
	   
	}
	
	@Then("sistema direciona para tela inicial")
	public void sistemaDirecionaParaTelaInicial() {
	    
	}




	





}
