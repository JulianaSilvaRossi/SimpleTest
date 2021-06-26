package com.automacao.pages;

import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AcoesComumPage {
	
	public AcoesComumPage(WebDriver navegador) {
		super();
		this.navegador = navegador;
	}
	
	@Rule
	public TestName NomeTeste = new TestName();

	protected WebDriver navegador;
	
	public void aguardarElementoAparecer(By elemento) {
		WebDriverWait aguardar = new WebDriverWait(navegador, 60);
		aguardar.until(ExpectedConditions.elementToBeClickable(elemento));
	}
	
	public void digitarTexto(By elemento, String texto) {
		navegador.findElement(elemento).sendKeys(texto);
	}
	
	public void clicar(By elemento) {
		navegador.findElement(elemento).click();
	}
	
	public void limparCampo(By elemento) {
		navegador.findElement(elemento).clear();
	}
	
}
