import java.util.Collections;


public class RPG extends Jogo {
	private TipoDeJogo tipo = Jogo.TipoDeJogo.RPG;

	public RPG(String nome, double valor, EstiloDeJogo[] deJogos) {
		super(nome, valor);
		this.nome = nome;
		this.valor = valor;
		Collections.addAll(this.estilosDeJogo, deJogos);
		
	}

	@Override
	public void joga(double maiorScore, boolean zerar) {
		// TODO Auto-generated method stub
		
	}

}