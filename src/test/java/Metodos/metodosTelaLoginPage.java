package Metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class metodosTelaLoginPage {
	
	
	WebDriver web;
	
	
	public void abrirNavegadoESite(String url) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		web = new ChromeDriver();
		web.manage().window().maximize();
		web.get(url);
	}
	
	public void clicar(By elemento) {
		web.findElement(elemento).click();
	}
	
	public void preencherTexto(By elemento , String texto) {
		web.findElement(elemento).sendKeys(texto);
	}
	
	public void pausar (int tempo) throws InterruptedException {
		Thread.sleep(tempo);
	}
	
	public void fecharNavegador() {
		web.quit();
		
		
	}
	

	public void tirarPrint (String nome) throws IOException {
		
		TakesScreenshot scrShot = ((TakesScreenshot) web);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("./src/evidencias/" + nome + ".png");
		FileUtils.copyFile(SrcFile, DestFile);	
	}
	
	
	public void validaTexto(By elemento , String texto) {
		String mensagem = web.findElement(elemento).getText();
		assertEquals(texto,mensagem);
		
	}
	public void scroll(By elemento) {
		WebElement element = web.findElement(elemento);
	((JavascriptExecutor)web).executeScript("arguments[0].scrollIntoView(true);",element);
	
}
}