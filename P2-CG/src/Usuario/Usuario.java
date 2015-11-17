package Usuario;

import java.util.ArrayList;

import Jogo.CatalogoDeJogos;
import Jogo.Jogo;

public class Usuario {

	// ATRIBUTOS
	private String nome;
	private String login;
	int x2p = 0;
	double dinheiroGasto;
	private Jogador jogador;
	private double dinheiroQuePossui;
	CatalogoDeJogos jogosComprados = new CatalogoDeJogos();


	public Usuario(String nome2, String login2, double grana) {
		this.setNome(nome2);
		this.login = login2;
		this.dinheiroQuePossui = grana;

	}

	public void comprarJogo(Jogo jogo) {
		this.jogosComprados.adiciona(jogo);
		this.x2p += jogo.getValor() * 10;
		this.dinheiroQuePossui -= jogo.getValor() * this.getJogador().valorDoDesconto;
		this.dinheiroGasto += jogo.getValor();
	}

	public void imprimeInformacoesUsuario() {
		System.out.println(this.login + "\n" + this.getNome() + " - Jogador" + this.jogador.tipoDeUsuario
				+ " X2p:" + this.x2p + "\nLista de Jogos:");
		for (Jogo jogo : jogosComprados.getArrayJogos()) {
			System.out.println("\n+ " + jogo.getNome() + "- " + jogo.tipo + ":" + "\n==> Jogou "
					+ jogo.getVezesJogadas() + " vez(es)" + "\n==> Zerou " + jogo.getVezesZeradas() + " vez(es)"
					+ "\n==> Maior score: " + jogo.getMaiorScore() + "\n");
		}
		System.out.println("\nTotal de preco de jogos:" + this.dinheiroGasto + "\n-------------------------------\n");

	}

	public void genhouPartida(String nome, double score, boolean zerou) {
		this.getJogador().ganhoupartida(this, nome, score, zerou);
	}

	public void perdeuPartida(String nome, double score, boolean zerou) {
		this.getJogador().perdeupartida(this, nome, score, zerou);
	}

	public double getDinheiroQuePossui() {
		return dinheiroQuePossui;
	}

	public void setDinheiroQuePossui(double dinheiroQuePossui) {
		this.dinheiroQuePossui = dinheiroQuePossui;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void adicionaDinheiro(double valor) {
		setDinheiroQuePossui((getDinheiroQuePossui() + valor));
	}

	public int getX2p() {
		return x2p;
	}

	public void setX2p(int x2p) {
		this.x2p = x2p;
	}

	public double getDinheiroGasto() {
		return dinheiroGasto;
	}

	public void setDinheiroGasto(double dinheiroGasto) {
		this.dinheiroGasto = dinheiroGasto;
	}



	public CatalogoDeJogos getJogosComprados() {
		return jogosComprados;
	}

	public void setJogosComprados(ArrayList<Jogo> jogosComprados) {
		this.jogosComprados.setJogosComprados(jogosComprados);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}



	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public String getTipoDeUsuarioString() {
		return this.jogador.getTipoDeUsuario();
	}

}
