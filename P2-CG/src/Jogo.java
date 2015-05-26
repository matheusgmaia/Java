import java.awt.List;
import java.util.ArrayList;

import Jogo.TipoDeJogo;


public class Jogo {
	
	//VARIÁVEIS
	private String nome;
	private double valor;
	private double maiorScore;
	private int vezesJogadas;
	private int vezesZeradas;
	private int tipoDeJogo;
	private ArrayList<Jogo.EstiloDeJogo> estilosDeJogo = new ArrayList<Jogo.EstiloDeJogo>();
	private TipoDeJogo tipo;
	
	//TIPOS DE JOGO
	public enum TipoDeJogo{
		RPG("RPG"),LUTA("Luta"), PLATAFORMA("Plataforma");
		public String tipoDoJogo;
		TipoDeJogo(String tipo){
			tipoDoJogo = tipo;
		} 
	}
	
	//ESTILO DE JOGO
	public enum EstiloDeJogo{
		ONLINE("Online"), OFFLINE("Offline"), MULTIPLAYER("Multiplayer"), COOPERATIVO("Cooperativo"), COMPETITIVO("Competitivo");
		public String estiloDeJogo;
		EstiloDeJogo(String estilo){
			estiloDeJogo = estilo;
		}
	}
	
	public Jogo(String nome, double valor, TipoDeJogo tipo) {
		this.nome = nome;
		this.valor = valor;
		this.tipo = tipo;
	}

	public void joga(double maiorScore, boolean zerar){
		if(getMaiorScore() > maiorScore){
			setMaiorScore(maiorScore);
		}
		if (zerar == true){
			setVezesZeradas(getVezesZeradas()+1);
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getMaiorScore() {
		return maiorScore;
	}
	public void setMaiorScore(double maiorScore) {
		this.maiorScore = maiorScore;
	}
	public int getVezesJogadas() {
		return vezesJogadas;
	}
	public void setVezesJogadas(int vezesJogadas) {
		this.vezesJogadas = vezesJogadas;
	}
	public int getVezesZeradas() {
		return vezesZeradas;
	}
	public void setVezesZeradas(int vezesZeradas) {
		this.vezesZeradas = vezesZeradas;
	}
	

}
