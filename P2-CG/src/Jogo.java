import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public abstract class Jogo {

	// VARIAVEIS
	protected String nome;
	protected double valor;
	protected double maiorScore;
	protected int vezesJogadas;
	protected int vezesZeradas;
	protected int tipoDeJogo;
	protected Set<Jogo.EstiloDeJogo> estilosDeJogo = new HashSet<Jogo.EstiloDeJogo>();
	protected TipoDeJogo tipo;

	// TIPOS DE JOGO
	public enum TipoDeJogo {
		RPG("RPG"), LUTA("Luta"), PLATAFORMA("Plataforma");
		public String tipoDoJogo;

		TipoDeJogo(String tipo) {
			tipoDoJogo = tipo;
		}
	}

	// ESTILO DE JOGO
	public enum EstiloDeJogo {
		ONLINE("Online"), OFFLINE("Offline"), MULTIPLAYER("Multiplayer"), COOPERATIVO(
				"Cooperativo"), COMPETITIVO("Competitivo");
		public String estiloDeJogo;

		EstiloDeJogo(String estilo) {
			estiloDeJogo = estilo;
		}
	}

	public Jogo(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public abstract void joga(double maiorScore, boolean zerar);

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
