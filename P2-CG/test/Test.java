import org.junit.Assert;

import Jogo.Jogo;
import Loja.Fachada;
import Loja.Loja;

public class Test {

	@org.junit.Test
	public void test() {
		Fachada fachada = new Fachada();
		
		//CRIA USUARIOS
		fachada.criaUsuario("Matheus Maia", "matheusgmaia", 5000 );
		fachada.criaUsuario("Pedro Arthur", "pedroarthur", 40000000);
		
		//CRIA JOGOS
		fachada.jogoNovo("Donkey Kong", 10, Jogo.TipoDeJogo.PLATAFORMA, Jogo.EstiloDeJogo.COMPETITIVO, Jogo.EstiloDeJogo.MULTIPLAYER);
		fachada.jogoNovo("Mario", 15000, Jogo.TipoDeJogo.PLATAFORMA, Jogo.EstiloDeJogo.COMPETITIVO, Jogo.EstiloDeJogo.MULTIPLAYER);
		fachada.jogoNovo("Zelda", 15000, Jogo.TipoDeJogo.LUTA, Jogo.EstiloDeJogo.COMPETITIVO, Jogo.EstiloDeJogo.MULTIPLAYER);
		fachada.jogoNovo("Mortal Kombat", 15000, Jogo.TipoDeJogo.LUTA, Jogo.EstiloDeJogo.COMPETITIVO, Jogo.EstiloDeJogo.MULTIPLAYER);
		
		//VENDE JOGOS
		fachada.vendaJogos("Donkey Kong", "matheusgmaia");
		fachada.vendaJogos("Donkey Kong", "pedroarthur");
		fachada.vendaJogos("Mario", "pedroarthur");
		fachada.vendaJogos("Zelda", "pedroarthur");
		fachada.vendaJogos("Mortal Kombat", "pedroarthur");
		
		//JOGANDO
		fachada.recopensar("mathusgmaia","Donkey Kong", 5000, true);
		fachada.punir("pedroarthur","Donkey Kong", 750, false);
		fachada.recopensar("pedroarthur","Donkey Kong", 50, true);
		fachada.recopensar("pedroarthur","Donkey Kong", 50, false);
		fachada.recopensar("pedroarthur","Mario", 6000, true);
		fachada.recopensar("pedroarthur","Mario", 6000, true);
		
		//UPGRADE // IMPRIMINDO INFORMAÇOES
		Assert.assertEquals("Veterano", fachada.retornaTipoUsuario("pedroarthur"));
		fachada.imprimirInformacoes();
		
		//BIBLIOTECA PESSOAL DE JOGOS
		Assert.assertEquals("Donkey Kong", fachada.maisJogados("matheusgmaia"));
		Assert.assertEquals("Donkey Kong", fachada.maisJogados("pedroarthur"));
		Assert.assertEquals("Donkey Kong", fachada.maisJogados("pedroarthur"));
		Assert.assertEquals("Mario", fachada.maiorScore("pedroarthur"));
		Assert.assertEquals("[Mortal Kombat, Zelda]", fachada.jogosDeUmTipo("pedroarthur", "Luta"));
		Assert.assertEquals("[Donkey Kong]", fachada.jogosDeUmTipo("matheusgmaia", "Plataforma"));
		Assert.assertEquals("Donkey Kong", fachada.maisJogados("matheusgmaia"));
		
		

	}

}
