package com.automacao.pages;

import java.io.File;

//import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;


public class AcoesComumPage {
	
	public AcoesComumPage(WebDriver navegador) {
		this.navegador = navegador;
	}
	
	protected WebDriver navegador;
	
	@Rule
	public TestName nomeMetodoTest = new TestName();

	public static String diretorioEvidencia = "./src/test/java/com/automacao/support/evidencias/";
	
	public static void armazenarEvidencia(WebDriver navegador, String nomeTest) {
		File evidencia = ((TakesScreenshot)navegador).getScreenshotAs(OutputType.FILE);
		try {
			Files.copy(evidencia, new File(diretorioEvidencia + nomeTest +"/" + nomeTest + ".png"));
		}
		catch(Exception e) {
			System.out.println("Houve uma excessão ao copiar o arquivo para a pasta: "+e.getMessage());
		}
		System.out.println("Armazenado a evidência do testes com sucesso: " + nomeTest);
	}
	
	public void aguardarElementoAparecer(By elemento) {
		WebDriverWait aguardar = new WebDriverWait(navegador, 60);
		aguardar.until(ExpectedConditions.elementToBeClickable(elemento));
	}
	
	public void digitarTexto(By elemento, String texto) {
		navegador.findElement(elemento).sendKeys(texto);
	}
	
	public void clicarNoElemento(By elemento) {
		navegador.findElement(elemento).click();
	}
	
	public void limparCampo(By elemento) {
		navegador.findElement(elemento).clear();
	}
	
	public String capturarTextoTela(By elemento) {
		aguardarElementoAparecer(elemento);
		return navegador.findElement(elemento).getText();
	}
	
	/*
	 * Printar a tela
	 * Selecionar comboBox
	 * Mover a tela para o elemento
	 * */
	
}
