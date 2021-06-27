package com.automacao.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InicialPage extends AcoesComumPage {

	public InicialPage(WebDriver navegador) {
		super(navegador);
	}

	private By txtBuscar = By.xpath("//input[@id=\"inpHeaderSearch\"]");
	private By btnBuscar = By.xpath("//span[@id='btnHeaderSearch']/i");
	

	public InicialPage buscarProduto(String nomeProduto) throws InterruptedException {

		aguardarElementoAparecer(btnBuscar);
		digitarTexto(txtBuscar, nomeProduto);
		
		return this;
	}
	
	public ResultadoProdutoPage clicarBuscarProdutoPage() {
		clicarNoElemento(btnBuscar);
		return new ResultadoProdutoPage(navegador);
	}
	
	

	

}
