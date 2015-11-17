package Core;
import java.util.HashSet;
import java.util.Set;

public abstract class Jogo {

	// VARIAVEIS
	protected String nome;
	protected double valor;
	protected double maiorScore = 0;
	protected int vezesJogadas = 0;
	protected int vezesZeradas = 0;
	protected Set<Jogo.EstiloDeJogo> estilosDeJogo = new HashSet<Jogo.EstiloDeJogo>();
	public TipoDeJogo tipo = null;

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
		ONLINE("Online", 0, 10, 10, 0), OFFLINE("Offline", 30, 0, 0, 0), MULTIPLAYER(
				"Multiplayer", 10, 0, 0, 0), COOPERATIVO("Cooperativo", 0, 50,
				20, 20), COMPETITIVO("Competitivo", 0, 20, 0, 20);
		public String estiloDeJogo;
		public int recompensaNoob;
		public int punicaoNoob;
		public int recompensaVeterano;
		public int punicaoVeterano;

		EstiloDeJogo(String estilo, int recompensaN, int punicaoN,
				int recompensaV, int punicaoV) {
			estiloDeJogo = estilo;
			recompensaNoob = recompensaN;
			punicaoNoob = punicaoN;
			recompensaVeterano = recompensaV;
			punicaoVeterano = punicaoV;

		}
	}

	public Jogo(String nome, double valor, Set<EstiloDeJogo> estilos) {
		this.nome = nome;
		this.valor = valor;
		this.estilosDeJogo.addAll(estilos);
	}

	public Jogo(String nome, double valor, EstiloDeJogo[] deJogos) {
		this.nome = nome;
		this.valor = valor;
		for (EstiloDeJogo estiloDeJogo : deJogos) {
			this.estilosDeJogo.add(estiloDeJogo);
		}
	}

	public abstract int joga(double maiorScore, boolean zerar);

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

	public Set<Jogo.EstiloDeJogo> getEstilosDeJogo() {
		return estilosDeJogo;
	}

	public void setEstilosDeJogo(Set<Jogo.EstiloDeJogo> estilosDeJogo) {
		this.estilosDeJogo = estilosDeJogo;
	}

	public TipoDeJogo getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeJogo tipo) {
		this.tipo = tipo;
	}

}
