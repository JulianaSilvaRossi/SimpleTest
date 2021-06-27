package com.automacao.tests;

import org.junit.*;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;

import com.automacao.pages.AcoesComumPage;
import com.automacao.pages.InicialPage;
import com.automacao.pages.ResultadoProdutoPage;
import com.automacao.support.ConfiguracaoPadrao;

public class AcoesComumTest {
	
	public WebDriver navegador;
	AcoesComumPage acoesComumPage;
	InicialPage inicialPage;
	ResultadoProdutoPage resultadoProdutoPage;
	
	@Rule
	public TestName nomeMetodoTest = new TestName();
	
	@Before
	public void iniciarTeste() {
		navegador = ConfiguracaoPadrao.criarMultiplusNavegadores();
		//navegador = ConfiguracaoPadrao.abrirChrome();
		inicialPage = new InicialPage(navegador);
	}
	
	@After
	public void finalizarTeste() {
		AcoesComumPage.armazenarEvidencia(navegador, nomeMetodoTest.getMethodName());
		ConfiguracaoPadrao.FinalizarNavegadores();
	}

}
