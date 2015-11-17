package Loja;

import Excepions.ErroDeEntrada;
import Excepions.ErroDeLogica;
import Excepions.UsuarioNExiste;
import Jogo.Jogo.EstiloDeJogo;
import Jogo.Jogo.TipoDeJogo;

public class Fachada {
    /* 114210417 - Matheus Gomes Maia: LAB 6 - Turma 1 */

	Controller controller = new Controller();

	/**
	 * Cadastro de usuario.
	 * 
	 * @param nome
	 * @param login
	 * @param grana
	 */
	public void criaUsuario(String nome, String login, int grana) {
		try {
			this.controller.criaUsuario(nome, login, grana);
		} catch (ErroDeEntrada e) {
			e.printStackTrace();
		}
	}

	/**
	 * Cadastro e criação de jogo.
	 * 
	 * @param nome
	 * @param valor
	 * @param plataforma
	 * @param tipo
	 * @param estilos
	 */
	public void jogoNovo(String nome, int valor, TipoDeJogo plataforma, EstiloDeJogo tipo, EstiloDeJogo estilos) {
		this.controller.jogoNovo(nome, valor, plataforma, tipo);
	}

	/**
	 * Computa a venda de um jogo.Muda o dinheiro e a biblioteca do usuario.
	 * 
	 * @param nome
	 * @param usuario
	 */
	public void vendaJogos(String nome, String usuario) {
		try {
			this.controller.vendaJogos(nome, usuario);
		} catch (ErroDeEntrada e) {
			e.printStackTrace();
		} catch (ErroDeLogica e) {
			e.printStackTrace();
		}
	}

	/**
	 * O jogador venceu o jogo e é recompensado por isso.
	 * 
	 * @param jogo
	 * @param usuario
	 * @param experiencia
	 * @param zerou
	 */
	public void recopensar(String jogo, String usuario, int experiencia, boolean zerou) {
		try {
			this.controller.recomprensar(jogo, usuario, experiencia, zerou);
		} catch (UsuarioNExiste e) {
			e.printStackTrace();
		}
	}

	/**
	 * O jogador perdeu o joge é punido por isso.
	 * 
	 * @param jogo
	 * @param usuario
	 * @param experiencia
	 * @param zerou
	 */

	public void punir(String jogo, String usuario, int experiencia, boolean zerou) {
		try {
			this.controller.punir(jogo, usuario, experiencia, zerou);
		} catch (UsuarioNExiste e) {
			e.printStackTrace();
		}
	}

	/**
	 * Retorna o Tipo do usuario
	 * 
	 * @param usuario
	 * @return
	 */
	public String retornaTipoUsuario(String usuario) {
		try {
			return this.controller.retornaTipoUsuario(usuario);
		} catch (UsuarioNExiste e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Imprime as informacoes de todos os usuario.
	 */
	public void imprimirInformacoes() {
		System.out.println(this.controller.imprimirInformacoes());
	}

	/**
	 * Retorna o jogo mais jogado do usuario.
	 * 
	 * @param usuario
	 * @return
	 */
	public String maisJogados(String usuario) {
		try {
			return this.controller.maisJogados(usuario);
		} catch (UsuarioNExiste e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Retorna o jogo com maior Score do usuario.
	 * 
	 * @param usuario
	 * @return
	 */
	public String maiorScore(String usuario) {
		try {
			return this.controller.maiorScore(usuario);
		} catch (UsuarioNExiste e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Retorna todos os jogos de um certo tipo.
	 * 
	 * @param usuario
	 * @param tipo
	 * @return
	 */
	public String jogosDeUmTipo(String usuario, String tipo) {
		try {
			return this.controller.jogosDeUmTipo(usuario, tipo);
		} catch (UsuarioNExiste e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
