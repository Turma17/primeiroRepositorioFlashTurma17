package Elementos;

import org.openqa.selenium.By;

public class ElementosLogin {
	
	
	private By btnSingIn = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
	
	private By cpLogin = By.name("email");
	
	private By cpPassword = By.name("passwd");
	
	private By btnLogin = By.id("SubmitLogin");

	public By getBtnSingIn() {
		return btnSingIn;
	}

	public By getCpLogin() {
		return cpLogin;
	}

	public By getCpPassword() {
		return cpPassword;
	}

	public By getBtnLogin() {
		return btnLogin;
	}
	
	
	

}
