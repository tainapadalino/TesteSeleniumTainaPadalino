#Author: tainapadalino@outlook.com

@all
Feature: CheckboxDemo
  Como usuario quero acessar caixas de selecao para obter resultados

Background:   
Given que eu esteja na tela de selecao CheckBox


  Scenario: Demonstracao de caixa unica
    When selecionar caixa de selecao
    Then Valido mensagem de sucesso
    
      Scenario: Demonstracao de varias caixas de selecao
    When selecionar marcar todas as selecoes
    And selecionar desmarcar todas as selecoes
    And selecionar apenar uma caixa
    Then Valido alteracoes nas mensagens



