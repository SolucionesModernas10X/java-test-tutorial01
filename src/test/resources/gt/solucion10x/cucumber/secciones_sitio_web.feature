Feature: Secciones del sitio web
  Se debe verificar que el sitio web tenga las secciones de logo, menu, redes sociales, etc..

  Scenario: Verificar Seccion logo
    Given Abrir navegador web e ingresar al sitio web
    And   Navegador debe mostrar el sitio web
    Then  El sitio web debe mostrar el logo
