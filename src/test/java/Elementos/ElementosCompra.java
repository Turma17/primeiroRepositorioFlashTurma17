package Elementos;

import org.openqa.selenium.By;

public class ElementosCompra {

	private By ClicarLogo = By.xpath("//*[@id=\"header_logo\"]/a/img");
	private By CpPesquisa = By.id("search_query_top");
	private By ClicarBusca = By.name("submit_search");
	private By ClicarBlouse = By.xpath("//*[@id=\"best-sellers_block_right\"]/div/ul/li[1]/a/img");
	private By ClicarCor = By.xpath("//*[@id=\"color_to_pick_list\"]/li[1]");
	private By ClicarAdicionar = By.id("add_to_cart");
	private By ClicarProsseguir = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span");
	private By ValidarMsg = By.id("cart_title");
	private By ClicarCheckout = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span");
	public By getClicarLogo() {
		return ClicarLogo;
	}
	public By getCpPesquisa() {
		return CpPesquisa;
	}
	public By getClicarBusca() {
		return ClicarBusca;
	}
	public By getClicarBlouse() {
		return ClicarBlouse;
	}
	public By getClicarCor() {
		return ClicarCor;
	}
	public By getClicarAdicionar() {
		return ClicarAdicionar;
	}
	public By getClicarProsseguir() {
		return ClicarProsseguir;
	}
	public By getValidarMsg() {
		return ValidarMsg;
	}
	public By getClicarCheckout() {
		return ClicarCheckout;
	}
}
