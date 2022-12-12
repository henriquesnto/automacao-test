
@background
Feature: Aprendendo background
  Como aluno
  Quero aprender background
  Para executar testes
  
  Background: Acessar tela de login
  	Given que estja na tela de login 

	@positivo @smoke
  Scenario: Login valido
  And informo o usuario "standard_user"
  And informo a senha "secret_sauce"
  When clicar no botao login
  Then login realaizado com sucesso
  
  @negativo
  Scenario: Login invalido
  But informo o usuario invalido "user_nao _existe"
  But informo a senha invalida "sauce"
  When clicar no botao login
  Then login nao realizado
  
  @negativo @smoke
  Scenario: Login bloqueado
  But informo o usuario invalido "locked_out_user"
  But informo a senha invalida "secret_sauce"
  When clicar no botao login
  Then login mensagem de usuario bloquado
