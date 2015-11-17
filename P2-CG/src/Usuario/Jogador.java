package Usuario;

import Jogo.Jogo;

public class Jogador {
    /* 114210417 - Matheus Gomes Maia: LAB 6 - Turma 1 */

	public double valorDoDesconto;
	public String tipoDeUsuario;
	
	public void ganhoupartida(Usuario usuario, String nome, double score, boolean zerou) {
		int pontosPorJogar = 0;
		int recompensa = 0;
		for (Jogo jogo : usuario.jogosComprados.getArrayJogos()) {
			if (jogo.getNome() == nome) {
				int x2pGanho = jogo.joga(score, zerou);
				if (jogo.tipo.equals(Jogo.TipoDeJogo.LUTA)) {
					if (jogo.getMaiorScore() < score) {
						pontosPorJogar += x2pGanho;
					}
				} else {
					pontosPorJogar += x2pGanho;
				}
				for (Jogo.EstiloDeJogo estilo : jogo.getEstilosDeJogo()) {
					if (this.tipoDeUsuario.equals("Noob")) {
						recompensa += estilo.recompensaNoob;
					} else {
						recompensa += estilo.recompensaVeterano;
					}
				}
				usuario.x2p += (pontosPorJogar + recompensa);
			}
		}

	}

	public void perdeupartida(Usuario usuario, String nome, double score, boolean zerou) {
		int pontosPorJogar = 0;
		int punicao = 0;
		for (Jogo jogo : usuario.jogosComprados.getArrayJogos()) {
			if (jogo.getNome() == nome) {
				int x2pGanho = jogo.joga(score, zerou);
				if (jogo.tipo.equals(Jogo.TipoDeJogo.LUTA)) {
					if (jogo.getMaiorScore() < score) {
						pontosPorJogar += x2pGanho;
					}
				} else {
					pontosPorJogar += x2pGanho;
				}
				for (Jogo.EstiloDeJogo estilo : jogo.getEstilosDeJogo()) {
					if (usuario.getJogador().tipoDeUsuario.equals("Noob")) {
						punicao -= estilo.recompensaNoob;
					} else {
						punicao -= estilo.recompensaVeterano;
					}
				}
				usuario.x2p += (pontosPorJogar - punicao);
			}
		}

	}

	public String getTipoDeUsuario() {
		return this.tipoDeUsuario;
	}

}
