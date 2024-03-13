package Steps;

import Elementos.ElementosLogin;
import Metodos.metodosTelaLoginPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class teste {
	
	ElementosLogin el = new ElementosLogin();
	metodosTelaLoginPage met = new metodosTelaLoginPage();
	

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

}
