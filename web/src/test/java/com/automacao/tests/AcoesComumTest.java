package com.automacao.tests;

import org.junit.*;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;

import com.automacao.pages.AcoesComumPage;
import com.automacao.pages.InicialPage;
import com.automacao.support.Inicio;

public class AcoesComumTest {
	
	public WebDriver navegador;
	AcoesComumPage basePage;
	InicialPage inicialPage;
	
	@Rule
	public TestName NomeTeste = new TestName();
	
	@Before
	public void iniciarTeste() {
		navegador = Inicio.criarMultiplusNavegadores();
	}
	
	@After
	public void finalizarTeste() {
		Inicio.FinalizarNavegadores();
	}

}
