#language: pt
#Author: henriquesnto@outlook.com

@tag
Funcionalidade: Validar formulario
  Eu como usuário quero enviar o formulario para enviar uma mensagem

  @tag1
  Cenario: Enviar formulario
    Dado que eu esteja no formulario
    Quando eu preencher e enviar o formulario
    Entao sou direcionado para o site da escola

    