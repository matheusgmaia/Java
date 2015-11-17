package Jogo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CatalogoDeJogos {
	/* 114210417 - Matheus Gomes Maia: LAB 6 - Turma 1 */

	private ArrayList<Jogo> jogosComprados = new ArrayList<Jogo>();

	public void adiciona(Jogo jogo) {
		this.getArrayJogos().add(jogo);
	}

	public ArrayList<Jogo> getArrayJogos() {
		return jogosComprados;
	}

	public void setJogosComprados(ArrayList<Jogo> jogosComprados) {
		this.jogosComprados = jogosComprados;
	}

	/**
	 * Retorna o jogo mais Jogado do catalogo.
	 * 
	 * @return
	 */
	public String maisJogado() {
		double maior = Double.NEGATIVE_INFINITY;
		String maisJogado = "";
		for (Jogo jogo : jogosComprados) {
			if (jogo.getVezesJogadas() > maior) {
				maior = jogo.getVezesJogadas();
				maisJogado = jogo.getNome();
			}
		}
		return maisJogado;
	}

	/**
	 * Retorna o jogo com o maior score do catalogo.
	 * 
	 * @return
	 */
	public String maiorScore() {
		double maior = Double.NEGATIVE_INFINITY;
		String maiorScore = "";
		for (Jogo jogo : jogosComprados) {
			if (jogo.getMaiorScore() > maior) {
				maior = jogo.getMaiorScore();
				maiorScore = jogo.getNome();
			}
		}
		return maiorScore;
	}

	/**
	 * Compara por Nome os jogos da Biblioteca.
	 * 
	 * @return
	 */
	public ArrayList<Jogo> compararDefault() {

		Collections.sort(this.jogosComprados, new Comparator<Jogo>() {
			@Override
			public int compare(Jogo jogo1, Jogo jogo2) {
				return jogo1.getNome().compareTo(jogo2.getNome());
			}
		});
		return this.jogosComprados;
	}

	/**
	 * Compara por VezesJogadas os jogos da Biblioteca.
	 * 
	 * @return
	 */
	public ArrayList<Jogo> compararVicio() {

		Collections.sort(this.jogosComprados, new Comparator<Jogo>() {
			@Override
			public int compare(Jogo jogo1, Jogo jogo2) {
				return jogo1.getVezesJogadas() - (jogo2.getVezesJogadas());
			}
		});
		return this.jogosComprados;
	}

	/**
	 * Compara por maior score os Jogos do desempenho.
	 * 
	 * @return
	 */
	public ArrayList<Jogo> compararDesempenho() {

		Collections.sort(this.jogosComprados, new Comparator<Jogo>() {
			@Override
			public int compare(Jogo jogo1, Jogo jogo2) {
				return (int) ((jogo1.getMaiorScore()) - (jogo2.getMaiorScore()));
			}
		});
		return this.jogosComprados;
	}

	/**
	 * Compara os jogos por vezes zeradas.
	 * 
	 * @return
	 */
	public ArrayList<Jogo> compararExperiencia() {

		Collections.sort(this.jogosComprados, new Comparator<Jogo>() {
			@Override
			public int compare(Jogo jogo1, Jogo jogo2) {
				return (int) ((jogo1.getVezesZeradas()) - (jogo2.getVezesZeradas()));
			}
		});
		return this.jogosComprados;
	}

	/**
	 * Retorna os jogos de um tipo apenas.
	 * 
	 * @param tipo
	 * @return
	 */
	public String jogosDeUmTipo(String tipo) {
		ArrayList<String> jogos = new ArrayList<String>();
		this.compararDefault();
		for (Jogo jogo : jogosComprados) {
			if (jogo.tipo.tipoDoJogo == tipo) {
				jogos.add(jogo.nome);
			}
		}
		return jogos.toString();
	}

}
