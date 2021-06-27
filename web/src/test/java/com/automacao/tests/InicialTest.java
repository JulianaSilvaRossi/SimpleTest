package com.automacao.tests;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InicialTest extends AcoesComumTest{
	
	@Test
	public void testDeveBuscarProdutoValido_ExibirListaProduto() throws InterruptedException {
		String resultadoTela = inicialPage
				.buscarProduto("Iphone")
				.clicarBuscarProdutoPage()
				.capturarResultadoTela();
		assertEquals("Iphone", resultadoTela);
	}

}
