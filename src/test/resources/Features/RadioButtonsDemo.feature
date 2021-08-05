#Author: tainapadalino@outlook.com

@all
Feature: RadioButtonsDemo
  Como usuario quero clicar em botoes de radio para obter valores
  
  Background:   
Given que eu esteja na tela de demonstracao e acesse botoes de radio


  Scenario: Demonstracao do botao de radio
    When selecionar sexo
    Then obtenho valor verificado

  Scenario: Demonstracao do botao de radio do grupo
    When selecionar sexo e idade
    Then obtenho valores verificados


