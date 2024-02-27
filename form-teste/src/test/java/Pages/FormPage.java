package Pages;

import Elementos.Elementos;
import Metodos.MetodosDeTeste;

public class FormPage {

	MetodosDeTeste metodo = new MetodosDeTeste();

	public static void validarCadastro() {

		MetodosDeTeste.validarAlert("Nome: User\r\n"
				+ "Sobrenome: User\r\n"
				+ "Email: user@example.com\r\n"
				+ "Numero: 0123456789\r\n"
				+ "\r\n"
				+ "Cadastro realizado sucesso!\r\n"
				+ "\r\n"
				+ "Nome: User\r\n"
				+ "Sobrenome: User\r\n"
				+ "Email: user@example.com\r\n"
				+ "Numero: 0123456789\r\n"
				+ "");
	}

	public static void preencherNome(String nome) {
		MetodosDeTeste.escrever(Elementos.nome, "User");
	}

	public static void preencherSobrenome(String sobrenome) {
		MetodosDeTeste.escrever(Elementos.sobrenome, "User");
	}

	public static void preencherEmail(String email) {
		MetodosDeTeste.escrever(Elementos.email, "user@example.com");
	}

	public static void preencherGenero() {
		MetodosDeTeste.clicar(Elementos.genero);
	}

	public static void preencherNumero(String numero) {
		MetodosDeTeste.escrever(Elementos.numero, "0123456789");
	}
	
	public static void preencherSenha(String senha) {
		MetodosDeTeste.escrever(Elementos.senha, "12345");
	}
	
	public static void confirmarSenha(String confirmarSenha) {
		MetodosDeTeste.escrever(Elementos.confirmarSenha, "12345");
	}
	
	public static void enviarForm() {
		MetodosDeTeste.clicar(Elementos.botao);

	}
	
}
