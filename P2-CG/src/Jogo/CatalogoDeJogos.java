package Jogo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CatalogoDeJogos{
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

	public String maisJogado() {
		double maior = Double.NEGATIVE_INFINITY;
		String maisJogado = "";
		for (Jogo jogo : jogosComprados) {
			if(jogo.getVezesJogadas() > maior){
				maior = jogo.getVezesJogadas();
				maisJogado = jogo.getNome();
			}
		}
		return maisJogado;
	}

	public String maiorScore() {
		double maior = Double.NEGATIVE_INFINITY;
		String maiorScore = "";
		for (Jogo jogo : jogosComprados) {
			if(jogo.getMaiorScore() > maior){
				maior = jogo.getMaiorScore();
				maiorScore = jogo.getNome();
			}
		}
		return maiorScore;
	}
	public ArrayList<Jogo> compararDefault(){
		
		Collections.sort(this.jogosComprados, new Comparator<Jogo>() {
			@Override
			public int compare(Jogo jogo1, Jogo jogo2) {
				return jogo1.getNome().
						compareTo(jogo2.getNome());
			}
		});
		return this.jogosComprados;
	}
	
	public ArrayList<Jogo> compararVicio(){
		
		Collections.sort(this.jogosComprados, new Comparator<Jogo>() {
			@Override
			public int compare(Jogo jogo1, Jogo jogo2) {
				return jogo1.getVezesJogadas()-(jogo2.getVezesJogadas());
			}
		});
		return this.jogosComprados;
	}
	
	public ArrayList<Jogo> compararDesempenho(){
		
		Collections.sort(this.jogosComprados, new Comparator<Jogo>() {
			@Override
			public int compare(Jogo jogo1, Jogo jogo2) {
				return (int)((jogo1.getMaiorScore())-(jogo2.getMaiorScore()));
			}
		});
		return this.jogosComprados;
	}
	
	public ArrayList<Jogo> compararExperiencia(){
		
		Collections.sort(this.jogosComprados, new Comparator<Jogo>() {
			@Override
			public int compare(Jogo jogo1, Jogo jogo2) {
				return (int)((jogo1.getVezesZeradas())-(jogo2.getVezesZeradas()));
			}
		});
		return this.jogosComprados;
	}

	public String jogosDeUmTipo(String tipo) {
		ArrayList<String> jogos = new ArrayList<String>();
		this.compararDefault();
		for (Jogo jogo : jogosComprados) {
			if(jogo.tipo.tipoDoJogo == tipo){
				jogos.add(jogo.nome);
			}
		}
		return jogos.toString();
	}


	
	
}
