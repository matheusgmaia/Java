package Jogo;

import Jogo.Jogo.EstiloDeJogo;
import Jogo.Jogo.TipoDeJogo;

public class JogoFactory {

	public static Jogo criaJogo(String nome, double valor, TipoDeJogo tipo,
			EstiloDeJogo[] deJogos) {
		Jogo jogoNovo = null;
		if (tipo.equals(Jogo.TipoDeJogo.RPG)) {
			Jogo RPGNovo = new RPG(nome, valor, deJogos);
			jogoNovo = RPGNovo;
		} else if (tipo.equals(Jogo.TipoDeJogo.LUTA)) {
			Jogo LutaNovo = new Luta(nome, valor, deJogos);
			jogoNovo = LutaNovo;
		} else if (tipo.equals(Jogo.TipoDeJogo.PLATAFORMA)) {
			Jogo PlataformaNovo = new Plataforma(nome, valor, deJogos);
			jogoNovo = PlataformaNovo;
		}
		return jogoNovo;
	}

	public static Jogo criacopia(Jogo original) {
		Jogo jogoNovo = null;
		if (original.tipo.equals(Jogo.TipoDeJogo.RPG)) {
			Jogo RPGNovo = new RPG(original.getNome(), original.getValor(),
					original.getEstilosDeJogo());
			jogoNovo = RPGNovo;
		} else if (original.tipo.equals(Jogo.TipoDeJogo.LUTA)) {
			Jogo LutaNovo = new Luta(original.getNome(), original.getValor(),
					original.getEstilosDeJogo());
			jogoNovo = LutaNovo;
		} else if (original.tipo.equals(Jogo.TipoDeJogo.PLATAFORMA)) {
			Jogo PlataformaNovo = new Plataforma(original.getNome(), original.getValor(),
					original.getEstilosDeJogo());
			jogoNovo = PlataformaNovo;
		}
		return jogoNovo;
	}

}
