package Core;
import java.util.Set;

import Core.Jogo.EstiloDeJogo;
import Core.Jogo.TipoDeJogo;

public class RPG extends Jogo {

	public RPG(String nome, double valor, Set<EstiloDeJogo> estilosDeJogo) {
		super(nome, valor, estilosDeJogo);
		tipo = Jogo.TipoDeJogo.RPG;
	}

	public RPG(String nome, double valor, EstiloDeJogo[] deJogos) {
		super(nome, valor, deJogos);
		tipo = Jogo.TipoDeJogo.RPG;
	}

	@Override
	public int joga(double maiorScore1, boolean zerar) {
		if(zerar == true){
			vezesZeradas +=1;
		}
		if(maiorScore < maiorScore1){
			maiorScore = maiorScore1;
		}
		vezesJogadas += 1;
		return 10;

	}





}
