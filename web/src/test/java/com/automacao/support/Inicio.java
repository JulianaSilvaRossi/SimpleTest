package com.automacao.support;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Inicio {
	
	public static String url = "https://www.magazineluiza.com.br/";
	
	private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<WebDriver>() {
		@Override
		protected synchronized WebDriver initialValue() {
			return abrirChrome();
		}
	};
	
	public static WebDriver criarMultiplusNavegadores() {
		return threadDriver.get();
		
	}

	public static WebDriver abrirChrome() {
		System.setProperty("webdriver.chrome.driver", "./\\drivers\\chrome\\chromedriver.exe");
		ChromeOptions opcoesChrome =  new ChromeOptions();
		opcoesChrome.addArguments("--headless");
		
		WebDriver navegador = new ChromeDriver();
		//WebDriver navegador = new ChromeDriver(opcoesChrome);
		navegador.manage().window().setSize(new Dimension(1366, 768));
		navegador.get(url);
		return navegador;
	}
	
	public static void FinalizarNavegadores() {
		WebDriver navegador = criarMultiplusNavegadores();
		if(navegador != null) {
			navegador.quit();
			navegador = null;
		}
		if(threadDriver != null) {
			threadDriver.remove();
		}
	}
	

}
