package Loja;

import java.util.*;

import Excepions.ErroDeEntrada;
import Excepions.ErroDeLogica;
import Excepions.UsuarioNExiste;
import Jogo.Jogo;
import Jogo.JogoFactory;
import Usuario.Noob;
import Usuario.Usuario;
import Usuario.UsuarioFactory;

public class Loja {
    /* 114210417 - Matheus Gomes Maia: LAB 6 - Turma 1 */

	// DADOS
	private ArrayList<Usuario> usuariosCadastrados = new ArrayList<Usuario>();
	private ArrayList<Jogo> jogosCadastrados = new ArrayList<Jogo>();
	private double totalArrecadado = 0;
	Map<String, Usuario> mapaDeUsuarios = new HashMap<String, Usuario>();
	Map<String, Double> tabelaDeJogos = new HashMap<String, Double>();

	/**
	 * Cria e cadastra usuarios novos.Armazena numa array de usuarios e em um
	 * mapa com o id como chave e o propio usuario como valor.
	 * 
	 * @param nome
	 * @param login
	 * @param grana
	 * @throws ErroDeEntrada 
	 */
	public void criaUsuario(String nome, String login, double grana) throws ErroDeEntrada {
		if(nome.isEmpty()||login.isEmpty()||grana<0){
			throw new ErroDeEntrada("Confira as esntradas ao criar o usuario");
		}
		Usuario usuarioNovo = new Usuario(nome, login, grana);
		usuarioNovo.setJogador(new Noob());
		mapaDeUsuarios.put(login, usuarioNovo);
		usuariosCadastrados.add(usuarioNovo);
	}

	/**
	 * Cria e armzena jogos novos.Armazena na lista de JogosCadastrados
	 * 
	 * @param nome
	 * @param valor
	 * @param tipo
	 * @param deJogos
	 */
	public void jogoNovo(String nome, double valor, Jogo.TipoDeJogo tipo, Jogo.EstiloDeJogo... deJogos) {
		Jogo jogoNovo = JogoFactory.criaJogo(nome, valor, tipo, deJogos);
		jogosCadastrados.add(jogoNovo);
		tabelaDeJogos.put(jogoNovo.getNome(), jogoNovo.getValor());
		tabelaDeJogos.get(nome);
	}

	/**
	 * Vende os jogos para um usuario.
	 * 
	 * @param nome
	 * @param login
	 * @throws ErroDeEntrada 
	 * @throws ErroDeLogica 
	 */
	public void vendaJogos(String nome, String login) throws ErroDeEntrada, ErroDeLogica {
		if (mapaDeUsuarios.containsKey(login) || (tabelaDeJogos.containsKey(nome))) {
			Usuario usuario = mapaDeUsuarios.get(login);
			Jogo jogo = null;
			for (Jogo jogo2 : jogosCadastrados) {
				if (jogo2.getNome() == nome) {
					jogo = jogo2;
				}
			}

			if (usuario.getDinheiroQuePossui() >= (tabelaDeJogos.get(nome)) * usuario.getJogador().valorDoDesconto) {
				totalArrecadado += (tabelaDeJogos.get(nome) * usuario.getJogador().valorDoDesconto);
				Jogo jogoCopia = JogoFactory.criacopia(jogo);
				usuario.comprarJogo(jogoCopia);

			} else {
				throw new ErroDeLogica("Usuario nao tem dinheiro suficiente");
			}
		} else {
			throw new ErroDeEntrada("Jogo ou Usuario nao cadastrado!");

		}
	}

	/**
	 * Adiciona dinheiro para o usuario definido.
	 * 
	 * @param login
	 * @param valor
	 * @throws UsuarioNExiste 
	 */
	public void adicionaDinheiro(String login, double valor) throws UsuarioNExiste {
		if (mapaDeUsuarios.containsKey(login)) {
			for (Usuario usuario : usuariosCadastrados) {
				if (usuario.getLogin() == login) {
					usuario.adicionaDinheiro(valor);
				}
			}
		} else {
			throw new UsuarioNExiste("N tem como adicionar dinheiro, o usuario nao existe");
		}
	}

	/**
	 * Imprime as inforemacoes no console.
	 * 
	 * @return
	 */
	public String imprimirInformacoes() {
		String retorno = "";
		retorno += ("======== Centra P2-CG ========\n");
		for (Usuario usuario : usuariosCadastrados) {
			usuario.imprimeInformacoesUsuario();
		}
		retorno += ("Total arrecadado com vendas de jogos: R$ " + totalArrecadado);
		return retorno;
	}

	public void upgrade(String id) {
		if (mapaDeUsuarios.containsKey(id)) {
			Usuario usuario = mapaDeUsuarios.get(id);
			if ((usuario.getX2p() >= 1000) && (usuario.getJogador().tipoDeUsuario.equals("Noob"))) {
				UsuarioFactory.getInstance().upgrade(usuario);
				if ((usuario.getX2p() < 1000) && (usuario.getJogador().tipoDeUsuario.equals("Veterano"))) {
					UsuarioFactory.getInstance().downgrade(usuario);
				}
			}
		}
	}

	/**
	 * Ganhou a partida.Ganha experiencia e atualiza a quandtidade de vezes
	 * jogadas, o score e quatas vezes jogadas.
	 * 
	 * @param id
	 * @param jogo
	 * @param i
	 * @param b
	 * @throws UsuarioNExiste 
	 */
	public void recopensar(String id, String jogo, int i, boolean b) throws UsuarioNExiste {
		for (Usuario usuario : usuariosCadastrados) {
			if (usuario.getLogin() == id) {
				usuario.genhouPartida(jogo, i, b);
			}
			upgrade(id);
		}
		if (!mapaDeUsuarios.containsKey(id)) {
			throw new UsuarioNExiste("Nao da pra jogar, confira o id");
		}

	}

	/**
	 * Perdeu a partida.Ganha experiencia e atualiza a quandtidade de vezes
	 * jogadas, o score e quatas vezes jogadas
	 * 
	 * @param id
	 * @param string2
	 * @param i
	 * @param b
	 * @throws UsuarioNExiste 
	 */
	public void punir(String id, String string2, int i, boolean b) throws UsuarioNExiste {
		for (Usuario usuario : usuariosCadastrados) {
			if (usuario.getLogin() == id) {
				usuario.genhouPartida(string2, i, b);
			}
			upgrade(id);
		}
		if (!mapaDeUsuarios.containsKey(id)) {
			throw new UsuarioNExiste("Nao da pra jogar, confira o id");
		}
	}

	public String retornaTipoUsuario(String usuario) throws UsuarioNExiste {
		if (!mapaDeUsuarios.containsKey(usuario)) {
			throw new UsuarioNExiste("Nao da pra jogar, confira o id");
		}
		return this.mapaDeUsuarios.get(usuario).getTipoDeUsuarioString();
	}

	public String maisJogados(String usuario) throws UsuarioNExiste {
		if (!mapaDeUsuarios.containsKey(usuario)) {
			throw new UsuarioNExiste("Nao da pra jogar, confira o id");
		}
		return this.mapaDeUsuarios.get(usuario).getJogosComprados().maisJogado();
	}

	public String maiorScore(String usuario) throws UsuarioNExiste {
		if (!mapaDeUsuarios.containsKey(usuario)) {
			throw new UsuarioNExiste("Nao da pra jogar, confira o id");
		}
		return this.mapaDeUsuarios.get(usuario).getJogosComprados().maiorScore();
	}

	public String jogosDeUmTipo(String usuario, String tipo) throws UsuarioNExiste {
		if (!mapaDeUsuarios.containsKey(usuario)) {
			throw new UsuarioNExiste("Nao da pra jogar, confira o id");
		}
		return this.mapaDeUsuarios.get(usuario).getJogosComprados().jogosDeUmTipo(tipo);
	}
}
