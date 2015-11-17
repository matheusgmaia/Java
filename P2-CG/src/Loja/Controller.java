package Loja;

import Jogo.Jogo.EstiloDeJogo;
import Jogo.Jogo.TipoDeJogo;

public class Controller {

	Loja loja = new Loja();
	
	public void criaUsuario(String nome, String login, int grana) {
		this.loja.criaUsuario(nome, login, grana);
	}

	public void jogoNovo(String nome, int valor, TipoDeJogo tipo, EstiloDeJogo estilos) {
		this.loja.jogoNovo(nome, valor, tipo, estilos);
	}

	public void vendaJogos(String nome, String usuario) {
		this.loja.vendaJogos(nome, usuario);
	}

	public void recomprensar(String jogo, String usuario, int experiencia, boolean zerou) {
		this.loja.recopensar(jogo, usuario, experiencia, zerou);
	}

	public void punir(String jogo, String usuario, int experiencia, boolean zerou) {
		this.loja.punir(jogo, usuario, experiencia, zerou);
	}

	public void upgrade(String usuario){
		this.loja.upgrade(usuario);
	}

	public String retornaTipoUsuario(String usuario) {
		return this.loja.retornaTipoUsuario(usuario);
	}

	public String imprimirInformacoes() {
		return this.loja.imprimirInformacoes();
				
	}

	public String maisJogados(String usuario) {
		return this.loja.maisJogados(usuario);
	}

	public String maiorScore(String usuario) {
		return this.loja.maiorScore(usuario);
	}

	public String jogosDeUmTipo(String usuario, String tipo) {
		return this.loja.jogosDeUmTipo(usuario, tipo);
	}
	

}
