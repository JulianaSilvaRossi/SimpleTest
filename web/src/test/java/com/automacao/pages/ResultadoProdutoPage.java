package com.automacao.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultadoProdutoPage extends AcoesComumPage {

	public ResultadoProdutoPage(WebDriver navegador) {
		super(navegador);
	}
	
	private By lblProduto = By.xpath("//h1[@itemprop='description']/Strong");
	
	public String capturarResultadoTela() {
		String resultadoTela = capturarTextoTela(lblProduto);
		return resultadoTela;
	}

}
