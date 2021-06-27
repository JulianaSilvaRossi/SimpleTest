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
	
	@Test
	public void testDeveBuscarProdutoValido_ExibirListaProduto2() throws InterruptedException {
		String resultadoTela = inicialPage
				.buscarProduto("Geladeira")
				.clicarBuscarProdutoPage()
				.capturarResultadoTela();
		assertEquals("Geladeira", resultadoTela);
	}
	
	@Test
	public void testDeveBuscarProdutoValido_ExibirListaProduto3() throws InterruptedException {
		String resultadoTela = inicialPage
				.buscarProduto("Fogao")
				.clicarBuscarProdutoPage()
				.capturarResultadoTela();
		assertEquals("Fogao", resultadoTela);
	}
	
	@Test
	public void testDeveBuscarProdutoValido_ExibirListaProduto4() throws InterruptedException {
		String resultadoTela = inicialPage
				.buscarProduto("Fraldas")
				.clicarBuscarProdutoPage()
				.capturarResultadoTela();
		assertEquals("Fraldas", resultadoTela);
	}
	
	@Test
	public void testDeveBuscarProdutoValido_ExibirListaProduto5() throws InterruptedException {
		String resultadoTela = inicialPage
				.buscarProduto("Livros")
				.clicarBuscarProdutoPage()
				.capturarResultadoTela();
		assertEquals("Livros", resultadoTela);
	}
	
	@Test
	public void testDeveBuscarProdutoValido_ExibirListaProduto6() throws InterruptedException {
		String resultadoTela = inicialPage
				.buscarProduto("Camiseta")
				.clicarBuscarProdutoPage()
				.capturarResultadoTela();
		assertEquals("Camiseta", resultadoTela);
	}

}
