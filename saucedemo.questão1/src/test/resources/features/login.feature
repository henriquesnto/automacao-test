
@login
Feature: Login
	Como usuario 
	quero realizar o login
	Para acessar a conta
	
	Background:Acessar a tela de login
	Given que esteja na tela de login
	
	@loginPositivo
  Scenario: Login valido
    And preencher o usuarios
    And preencher a senha
    When realizar o login
    Then Login realizado com sucesso
    	
  @tag1
  Scenario: User bloquado
    But preencher com usuarios bloquado
    And preencher a senha
    When realizar o login
    Then sistema apresenta mensagem de usuario bloquado
    
 @tag1
  Scenario: Login com dados invalido
    But preencher com usuarios invalido 
    But preencher a senha invalida
    When realizar o login
    Then sistema apresenta mensagem de usuario e senha invalida

    @tag1
  Scenario: Login com dados em branco
    But não preencher nenhum dado 
    When realizar o login
    Then sistema apresenta mensagem dados em branco