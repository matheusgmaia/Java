package Core;
import java.util.Set;



public class Luta extends Jogo {
	
	public Luta(String nome, double valor, Set<EstiloDeJogo> estilosDeJogo) {
		super(nome, valor, estilosDeJogo);
		super.tipo = Jogo.TipoDeJogo.LUTA;
	}


	public Luta(String nome, double valor, EstiloDeJogo[] deJogos) {
		super(nome, valor, deJogos);
		super.tipo = Jogo.TipoDeJogo.LUTA;
	}


	@Override
	public int joga(double maiorScore1, boolean zerar) {
		if(zerar == true){
			vezesZeradas +=1;
		}
		vezesJogadas += 1;
		if(maiorScore < maiorScore1){
			maiorScore = maiorScore1;
		}
		return (int) (maiorScore/1000.0);
	}



}
