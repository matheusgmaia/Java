package Loja;

import java.util.*;

import Excepions.JogoNExiste;
import Jogo.Jogo;
import Jogo.JogoFactory;
import Usuario.Noob;
import Usuario.Usuario;
import Usuario.UsuarioFactory;

public class Loja {
	// DADOS
	private ArrayList<Usuario> usuariosCadastrados = new ArrayList<Usuario>();
	private ArrayList<Jogo> jogosCadastrados = new ArrayList<Jogo>();
	private double totalArrecadado = 0;
	Map<String, Usuario> mapaDeUsuarios = new HashMap<String, Usuario>();
	Map<String, Double> tabelaDeJogos = new HashMap<String, Double>();

	public void criaUsuario(String nome, String login, double grana) {
		Usuario usuarioNovo = new Usuario(nome, login, grana);
		usuarioNovo.setJogador(new Noob());
		mapaDeUsuarios.put(login, usuarioNovo);
		usuariosCadastrados.add(usuarioNovo);
	}

	public void jogoNovo(String nome, double valor, Jogo.TipoDeJogo tipo, Jogo.EstiloDeJogo... deJogos) {
		Jogo jogoNovo = JogoFactory.criaJogo(nome, valor, tipo, deJogos);
		jogosCadastrados.add(jogoNovo);
		tabelaDeJogos.put(jogoNovo.getNome(), jogoNovo.getValor());
		tabelaDeJogos.get(nome);
	}

	public void vendaJogos(String nome, String login) {
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
				System.out.println("Usuario não tem dinheiro suficiente");
			}
		} else {
			System.out.println("Jogo ou Usuario nao cadastrado!");

		}
	}

	public void adicionaDinheiro(String login, double valor) {
		if (mapaDeUsuarios.containsKey(login)) {
			for (Usuario usuario : usuariosCadastrados) {
				if (usuario.getLogin() == login) {
					usuario.adicionaDinheiro(valor);
				}
			}
		} else {
			System.out.println("Usuario não cadastrado");
		}
	}

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

	public void recopensar(String id, String jogo, int i, boolean b) {
		for (Usuario usuario : usuariosCadastrados) {
			if (usuario.getLogin() == id) {
				usuario.genhouPartida(jogo, i, b);
			}
		upgrade(id);
		}

	}

	public void punir(String id, String string2, int i, boolean b) {
		for (Usuario usuario : usuariosCadastrados) {
			if (usuario.getLogin() == id) {
				usuario.genhouPartida(string2, i, b);
			}
		upgrade(id);
		}
	}

	public String retornaTipoUsuario(String usuario) {
		return this.mapaDeUsuarios.get(usuario).getTipoDeUsuarioString();
	}

	public String maisJogados(String usuario) {
		return this.mapaDeUsuarios.get(usuario).getJogosComprados().maisJogado();
	}

	public String maiorScore(String usuario) {
		return this.mapaDeUsuarios.get(usuario).getJogosComprados().maiorScore();
	}

	public String jogosDeUmTipo(String usuario, String tipo) {
		return this.mapaDeUsuarios.get(usuario).getJogosComprados().jogosDeUmTipo(tipo);
	}
}
