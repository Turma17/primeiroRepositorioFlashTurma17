package Steps;




import java.io.IOException;

import Elementos.ElementosCompra;
import Elementos.ElementosLogin;
import Metodos.metodosTelaLoginPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class teste {
	
	ElementosLogin el = new ElementosLogin();
	metodosTelaLoginPage met = new metodosTelaLoginPage();
	ElementosCompra Comp = new ElementosCompra();

@Dado("que esteja no site {string}")
public void que_esteja_no_site(String string) throws InterruptedException {
	met.abrirNavegadoESite(string);
	met.pausar(2000);
  
}

@Quando("clicar para logar")
public void clicar_para_logar() throws InterruptedException {
	met.clicar(el.getBtnSingIn());
	met.pausar(4000);
    
}

@Quando("preencher login e senha validos")
public void preencher_login_e_senha_validos() {
	met.preencherTexto(el.getCpLogin(), "testeturma18@gmail.com");
	met.preencherTexto(el.getCpPassword(), "123456789");
	
   
}

@Entao("é logado com sucesso")
public void é_logado_com_sucesso() {
	met.clicar(el.getBtnLogin());
	met.fecharNavegador(); 
}
/////////////////////////CENARIO COMPRA T-SHIRT///////////////////////////////

@Quando("clicar no logo")
public void clicar_no_logo() throws InterruptedException {
	met.preencherTexto(el.getCpLogin(), "testeturma18@gmail.com");
	met.preencherTexto(el.getCpPassword(), "123456789");	
	met.clicar(el.getBtnLogin());
	met.pausar(3000);
	met.clicar(Comp.getClicarLogo());
}

@Quando("preencher o campo de pesquisa T-shirt")
public void preencher_o_campo_de_pesquisa_t_shirt() throws InterruptedException {
	met.pausar(3000);
	met.preencherTexto(Comp.getCpPesquisa(), "T-shirt");
	met.clicar(Comp.getClicarBusca());
	
}

@Quando("clicar no produto blouse adicionando no carrinho")
public void clicar_no_produto_blouse_adicionando_no_carrinho() throws InterruptedException, IOException {
   met.pausar(3000);
   met.clicar(Comp.getClicarBlouse());
   met.pausar(3000);
   met.clicar(Comp.getClicarCor());
   met.pausar(3000);
   met.tirarPrint("evidencias");
   met.clicar(Comp.getClicarAdicionar());
   met.pausar(3000);
   met.clicar(Comp.getClicarProsseguir());
   met.pausar(4000);
   met.clicar(Comp.getClicarCheckout());
   met.scroll(Comp.getClicarCheckout());
   met.validaTexto(Comp.getValidarMsg(), "SHOPPING-CART SUMMARY");
   met.tirarPrint("evidencias");
   
   
   
   
}

@Entao("deve levar a tela de compra")
public void deve_levar_a_tela_de_compra() {
    
}



}




