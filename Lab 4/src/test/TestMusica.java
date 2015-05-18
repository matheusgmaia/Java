package test;

import lab04.Album;
import lab04.Musica;
import lab04.Perfil;

import org.junit.Test;
import org.junit.Assert;

public class TestMusica {

	@Test
	public void testMusica(){
		try{
			Musica chandelier = new Musica("Chandelier",3,"Pop");
			Musica elasticHeart = new Musica("Elastic Heart",3,"Pop");
			Musica cellophane = new Musica("Cellophane",4,"Pop");
			
			Assert.assertEquals("Chandelier", chandelier.getNome());
			Assert.assertEquals(3, chandelier.getDuracao());
			Assert.assertEquals("Pop", chandelier.getTipo());

			Assert.assertEquals("Elastic Heart", elasticHeart.getNome());
			Assert.assertEquals(3, elasticHeart.getDuracao());
			Assert.assertEquals("Pop", elasticHeart.getTipo());
			
			Assert.assertEquals("Cellophane", cellophane.getNome());
			Assert.assertEquals(4, cellophane.getDuracao());
			Assert.assertEquals("Pop", cellophane.getTipo());
			
			Musica chandelierRemix = new Musica("Chandelier",3,"Pop");
			Assert.assertEquals(chandelier, chandelierRemix);
			Assert.assertFalse(chandelier.equals(cellophane));

		}catch(Exception e){
			Assert.fail();//nao deveria ter lancado nenhuma Exception nesse teste.
		}
	}
	
	@Test
	public void testMusicaInvalida(){
		try {
			@SuppressWarnings("unused")
			Musica tituloInvalido = new Musica("",3,"Pop");
			Assert.fail(); //se chegar aqui da erro, pois deveria lancar exception.
		} catch (Exception e) {
			Assert.assertEquals("Titulo da musica nao pode ser vazio.", e.getMessage());
		}

		try {
			@SuppressWarnings("unused")
			Musica duracaoInvalida = new Musica("Elastic Heart",-5,"Pop");
			Assert.fail(); //se chegar aqui da erro, pois deveria lancar exception.
		} catch (Exception e) {
			Assert.assertEquals("Duracao da musica nao pode ser negativa.", e.getMessage());
		}
		
		
		try {
			@SuppressWarnings("unused")
			Musica tipoInvalido = new Musica("Cellophane",4,"");
			Assert.fail(); //se chegar aqui da erro, pois deveria lancar exception.
		} catch (Exception e) {
			Assert.assertEquals("Genero da musica nao pode ser vazio.", e.getMessage());
		}
		
	}
	
	@Test
	public void testAlbum() {
		try{
			Musica stairway = new Musica("Stairway to Heaven",9,"Hard Rock");
			Album ledz4 = new Album("Led Zeppelin 4", "LedZeppelin", 1970);
			ledz4.adicionaMusica(stairway);
			ledz4.removeMusica(stairway);
				
		}catch(Exception e){
			Assert.fail();//nao deveria ter lancado nenhuma Exception nesse teste.
		}
			
	}
	
	@Test
	public void testPerfil(){
		try{
			Musica stairway = new Musica("Stairway to Heaven",9,"Hard Rock");
			Musica blackdog = new Musica("Black Dog",7,"Hard Rock");

			Album ledz4 = new Album("Led Zeppelin 4", "LedZeppelin", 1970);
			ledz4.adicionaMusica(stairway);
			

			
			Perfil matheus = new Perfil("Matheus");
			matheus.adicionaAlbum(ledz4);

			
			matheus.adicionaPlaylist("Rock", ledz4, 1);

			Album BlackDog = new Album("Outro ", "Outro", 1911);
			BlackDog.adicionaMusica(blackdog);
			
			matheus.adicionaPlaylist("Rock", BlackDog, 1);
			
		}catch (Exception e){
			Assert.assertEquals("Nao existe esse album no perfil.", e.getMessage());
		}
	}
	
	
}
