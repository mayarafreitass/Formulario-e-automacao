package Testes;

import org.junit.jupiter.api.Test;

import Navegadores.Navegadores;
import Pages.FormPage;

public class FuncionalidadesDeTeste {

	FormPage form = new FormPage();

	@Test
	public void preencherFormCorretamente() {
		Navegadores.iniciarTeste();
		FormPage.preencherNome("User");
		FormPage.preencherSobrenome("User");
		FormPage.preencherEmail("User@exemplo.com");
		FormPage.preencherGenero();
		FormPage.preencherNumero("0123456789");
		FormPage.preencherSenha("12345");
		FormPage.confirmarSenha("12345");
		FormPage.enviarForm();
		FormPage.validarCadastro();
		
	}

	@Test
	public void naoPreencherNome() {
		Navegadores.iniciarTeste();
		FormPage.preencherSobrenome("User");
		FormPage.preencherEmail("User@exemplo.com");
		FormPage.preencherGenero();
		FormPage.preencherNumero("0123456789");
		FormPage.preencherSenha("12345");
		FormPage.confirmarSenha("12345");
		FormPage.enviarForm();
		FormPage.validarCadastro();
	}

	@Test
	public void naoPreencherSobrenome() {
		Navegadores.iniciarTeste();
		FormPage.preencherNome("User");
		FormPage.preencherEmail("User@exemplo.com");
		FormPage.preencherGenero();
		FormPage.preencherNumero("0123456789");
		FormPage.preencherSenha("12345");
		FormPage.confirmarSenha("12345");
		FormPage.enviarForm();
		FormPage.validarCadastro();
	}

	@Test
	public void naoPreencherEmail() {
		Navegadores.iniciarTeste();
		FormPage.preencherNome("User");
		FormPage.preencherSobrenome("User");
		FormPage.preencherGenero();
		FormPage.preencherNumero("0123456789");
		FormPage.preencherSenha("12345");
		FormPage.confirmarSenha("12345");
		FormPage.enviarForm();
		FormPage.validarCadastro();
	}

	@Test
	public void naoPreencherGenero() {
		Navegadores.iniciarTeste();
		FormPage.preencherNome("User");
		FormPage.preencherSobrenome("User");
		FormPage.preencherEmail("User@exemplo.com");
		FormPage.preencherNumero("0123456789");
		FormPage.preencherSenha("12345");
		FormPage.confirmarSenha("12345");
		FormPage.enviarForm();
		FormPage.validarCadastro();
	}

	@Test
	public void naoPreencherNumero() {
		Navegadores.iniciarTeste();
		FormPage.preencherNome("User");
		FormPage.preencherSobrenome("User");
		FormPage.preencherEmail("User@exemplo.com");
		FormPage.preencherGenero();
		FormPage.preencherSenha("12345");
		FormPage.confirmarSenha("12345");
		FormPage.enviarForm();
		FormPage.validarCadastro();
	}

	@Test
	public void naoPreencherSenha() {
		Navegadores.iniciarTeste();
		FormPage.preencherNome("User");
		FormPage.preencherSobrenome("User");
		FormPage.preencherEmail("User@exemplo.com");
		FormPage.preencherGenero();
		FormPage.preencherNumero("0123456789");
		FormPage.confirmarSenha("12345");
		FormPage.enviarForm();
		FormPage.validarCadastro();
	}

	@Test
	public void naoConfirmarSenha() {
		Navegadores.iniciarTeste();
		FormPage.preencherNome("User");
		FormPage.preencherSobrenome("User");
		FormPage.preencherEmail("User@exemplo.com");
		FormPage.preencherGenero();
		FormPage.preencherNumero("0123456789");
		FormPage.preencherSenha("12345");
		FormPage.enviarForm();
		FormPage.validarCadastro();
	}
}
