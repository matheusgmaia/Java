import static org.junit.Assert.*;


public class Test {

	@org.junit.Test
	public void test() {
		Loja loja = new Loja();
		Usuario matheus;
		matheus = loja.criaUsuario("Matheus Maia", "matheusgmaia", 5000 );
		loja.jogoNovo("Donkey Kong", 10, Jogo.TipoDeJogo.PLATAFORMA, Jogo.EstiloDeJogo.COMPETITIVO, Jogo.EstiloDeJogo.MULTIPLAYER);
		loja.vendaJogos("Donkey Kong", matheus);
		loja.imprimirInformacoes();
	}

}
