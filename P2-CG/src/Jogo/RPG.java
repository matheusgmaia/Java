package Jogo;
import java.util.Set;

public class RPG extends Jogo {
    /* 114210417 - Matheus Gomes Maia: LAB 6 - Turma 1 */

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
		super.jogando();
		return 10;

	}





}
