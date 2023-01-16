
@reserva
Feature: Reserva
	Como usuario quero realizar uma reserva
	
	
	Background: Acessar a tela inicial
	Given que esteja na tela inicial
	
	@reservaPositivo
  Scenario: Validar reserva
    And selecione a data de entrada e saída
    And selecione a quantidade de hospedes
    And clique em verifica diponibilidade
    And adicionar reserva ao carrinho
    And clicar em continuar
    And preencher hospede da reserva
    And preencher os dados de pagamento validos
    And clicar em finalizar
    And realizar resevar
    When clicar em nova reserva 
    Then sistema direciona para tela inicial
    	