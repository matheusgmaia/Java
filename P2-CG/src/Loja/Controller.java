package Loja;

import Excepions.ErroDeEntrada;
import Excepions.ErroDeLogica;
import Excepions.UsuarioNExiste;
import Jogo.Jogo.EstiloDeJogo;
import Jogo.Jogo.TipoDeJogo;

public class Controller {

	Loja loja = new Loja();

	public void criaUsuario(String nome, String login, int grana) throws ErroDeEntrada {
		this.loja.criaUsuario(nome, login, grana);
	}

	public void jogoNovo(String nome, int valor, TipoDeJogo tipo, EstiloDeJogo estilos) {
		this.loja.jogoNovo(nome, valor, tipo, estilos);
	}

	public void vendaJogos(String nome, String usuario) throws ErroDeEntrada, ErroDeLogica {
		this.loja.vendaJogos(nome, usuario);
	}

	public void recomprensar(String jogo, String usuario, int experiencia, boolean zerou) throws UsuarioNExiste {
		this.loja.recopensar(jogo, usuario, experiencia, zerou);
	}

	public void punir(String jogo, String usuario, int experiencia, boolean zerou) throws UsuarioNExiste {
		this.loja.punir(jogo, usuario, experiencia, zerou);
	}

	public String retornaTipoUsuario(String usuario) throws UsuarioNExiste {
		return this.loja.retornaTipoUsuario(usuario);
	}

	public String imprimirInformacoes() {
		return this.loja.imprimirInformacoes();

	}

	public String maisJogados(String usuario) throws UsuarioNExiste {
		return this.loja.maisJogados(usuario);
	}

	public String maiorScore(String usuario) throws UsuarioNExiste {
		return this.loja.maiorScore(usuario);
	}

	public String jogosDeUmTipo(String usuario, String tipo) throws UsuarioNExiste {
		return this.loja.jogosDeUmTipo(usuario, tipo);
	}

}
