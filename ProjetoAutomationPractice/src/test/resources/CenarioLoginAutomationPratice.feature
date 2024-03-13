#language: pt


@tag
Funcionalidade: Login no site Automation pratice
  @tag1
  Cenário: Logar com sucesso no site Automation Pratice
    Dado que esteja no site "http://www.automationpractice.pl/index.php"
    Quando clicar para logar
    E preencher login e senha validos
    Entao é logado com sucesso

 