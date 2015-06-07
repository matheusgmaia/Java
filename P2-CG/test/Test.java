import Jogo.Jogo;
import Loja.Loja;

public class Test {

	@org.junit.Test
	public void test() {
		Loja loja = new Loja();
		loja.criaUsuario("Matheus Maia", "matheusgmaia", 5000 );
		loja.criaUsuario("Pedro Arthur", "pedroarthur", 40000000);
		loja.jogoNovo("Donkey Kong", 10, Jogo.TipoDeJogo.PLATAFORMA, Jogo.EstiloDeJogo.COMPETITIVO, Jogo.EstiloDeJogo.MULTIPLAYER);
		loja.jogoNovo("Mario", 15000, Jogo.TipoDeJogo.LUTA, Jogo.EstiloDeJogo.COMPETITIVO, Jogo.EstiloDeJogo.MULTIPLAYER);
		loja.vendaJogos("Donkey Kong", "matheusgmaia");
		loja.vendaJogos("Donkey Kong", "pedroarthur");
		loja.vendaJogos("Mario", "pedroarthur");
		loja.recopensar("mathusgmaia","Donkey Kong", 5000, true);
		loja.punir("pedroarthur","Donkey Kong", 750, false);
		loja.recopensar("pedroarthur","Donkey Kong", 50, true);
		loja.recopensar("pedroarthur","Mario", 6000, true);
		loja.upgrade("pedroarthur");
		loja.imprimirInformacoes();

	}

}
