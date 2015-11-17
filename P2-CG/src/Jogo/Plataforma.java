package Jogo;
import java.util.Set;


public class Plataforma extends Jogo {
    /* 114210417 - Matheus Gomes Maia: LAB 6 - Turma 1 */

	public Plataforma(String nome, double valor, Set<EstiloDeJogo> estilosDeJogo) {
		super(nome, valor, estilosDeJogo);
		tipo = Jogo.TipoDeJogo.PLATAFORMA;

	}

	public Plataforma(String nome, double valor, EstiloDeJogo[] deJogos) {
		super(nome, valor, deJogos);
		tipo = Jogo.TipoDeJogo.PLATAFORMA;
	}

	@Override
	public int joga(double maiorScore1, boolean zerar) {
		if(zerar == true){
			vezesZeradas +=1;
		}
		super.jogando();
		if(maiorScore < maiorScore1){
			maiorScore = maiorScore1;
		}
		if(zerar == true){
			return 20;
		}
		return 0;
	}





}
