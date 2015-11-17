package Loja;

import Jogo.Jogo.EstiloDeJogo;
import Jogo.Jogo.TipoDeJogo;

public class Fachada {

	Controller controller = new Controller();

	public void criaUsuario(String nome, String login, int grana) {
			this.controller.criaUsuario(nome, login, grana);
	}

	public void jogoNovo(String nome, int valor, TipoDeJogo plataforma, EstiloDeJogo tipo,
			EstiloDeJogo estilos) {
		this.controller.jogoNovo(nome, valor, plataforma, tipo);
	}

	public void vendaJogos(String nome, String usuario) {
		this.controller.vendaJogos(nome, usuario);
	}

	public void recopensar(String jogo, String usuario, int experiencia, boolean zerou) {
		this.controller.recomprensar(jogo, usuario, experiencia, zerou);
	}

	public void punir(String jogo, String usuario, int experiencia, boolean zerou) {
		this.controller.punir(jogo, usuario, experiencia, zerou);
	}

	public void upgrade(String usuario) {
		this.controller.upgrade(usuario);
	}

	public String retornaTipoUsuario(String usuario) {
		return this.controller.retornaTipoUsuario(usuario);
	}

	public void imprimirInformacoes() {
		System.out.println(this.controller.imprimirInformacoes());
	}

	public String maisJogados(String usuario) {
		return this.controller.maisJogados(usuario);
	}

	public String maiorScore(String usuario) {
		return this.controller.maiorScore(usuario);
	}

	public String jogosDeUmTipo(String usuario, String tipo) {
		return this.controller.jogosDeUmTipo(usuario, tipo);
	}
	
}
