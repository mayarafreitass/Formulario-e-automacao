package Navegadores;

import org.openqa.selenium.chrome.ChromeDriver;

import drivers.Drivers;

public class Navegadores extends Drivers {

	public static void iniciarTeste() {
		String ambiente = "file:///D:/form/form.html";
		try {
			driver = new ChromeDriver();
			driver.get(ambiente);
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.err.println("Causa do erro " + e.getCause());

		}

	}

	public static void fecharTeste() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.err.println("Causa do erro " + e.getCause());
		}
	}
	
}
