package com.automacao.tests;

import org.junit.Test;

public class InicialTest extends AcoesComumTest{
	
	@Test
	public void testDeveBuscarProdutoValido_ExibirListaProduto() throws InterruptedException {
		inicialPage.buscarProduto("Iphone");
	}

}
