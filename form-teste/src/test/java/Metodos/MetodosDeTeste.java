package Metodos;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.By;

import drivers.Drivers;


public class MetodosDeTeste extends Drivers {

	public static void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("Erro ao clicar no elemento ");
			System.err.println("Causa do erro " + e.getCause());
			System.err.println("Mensagem de erro " + e.getMessage());
		}
	}

	public static void escrever(By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.err.println("Causa do erro " + e.getCause());
			System.err.println("Mensagem de erro " + e.getMessage());
		}
	}

	public static void validarAlert(String textoEsperado) {
		try {
			String msgAlert = driver.switchTo().alert().getText();
			System.out.println(msgAlert);
			assertTrue(msgAlert.contains(textoEsperado));
		} catch (Exception e) {
			System.out.println("**** CAUSA DO ERRO **** " + e.getCause());
			System.out.println("**** MENSAGEM DO ERRO **** " + e.getCause());
			
		}

	}
	
}
