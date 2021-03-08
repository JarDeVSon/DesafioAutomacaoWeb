@submarino
Feature: Amazon Functionality
  As a customer
  I want to use the amazon website
  In order to do successful purchases

  Scenario: Submarino book
    Given Entrar no site da submarino "https://www.submarino.com.br/"
    When Realizar pesquisa de um livro qualquer
      | livro qualquer | harry potter |
    Then Guardar nome do produto, valor e ISBN
      | nome do produto | Coleção Harry Potter - 7 Volumes (português) Capa Comum + Marcador Exclusivo - 1ª Ed. |
      | valor           | R$ 139,90                                                                             |
      | ISBN            | (Cód.1995355802)                                                                      |