#Author: tainapadalino@outlook.com

@all
Feature: Simple Form Demo
Como usuario que acessar o formulario de demonstracao para inserir dados

Background:   
Given que eu esteja na tela de demonstracao e acesse o formulario


  Scenario: Campo de entrada unico
    When digitar mensagem
    Then valido mensagem

 Scenario: Dois campos de entrada
    When inserir valor para a e b
    Then valido a soma feita
 



