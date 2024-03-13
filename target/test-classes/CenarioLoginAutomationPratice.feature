#language: pt


@tag
Funcionalidade: Login no site Automation pratice
  @tag1
  Cenário: Compra de T-shirt
    Dado que esteja no site "http://www.automationpractice.pl/index.php"
    Quando clicar para logar
    E clicar no logo
    E preencher o campo de pesquisa T-shirt
    E clicar no produto blouse adicionando no carrinho
    Entao deve levar a tela de compra
    

 