import static org.junit.Assert.*;

import org.junit.Test;

import Core.Gerenciador;
import Core.Personagem;


public class TesteDePersonagem {

	@Test
	public void test() {
		Personagem personagem = new Personagem("Matheus", (1.90) , 18);
		Gerenciador gerenciador = new Gerenciador();
		personagem.setDextrezaDZ(5);
		personagem.setForcaFR(5);
		personagem.setInteligenciaQI(8);
		personagem.setVitalidadeVT(5);
		personagem.resumirAtributos();
		gerenciador.colocaDesvantagem(1, personagem);
		gerenciador.colocaDesvantagem(2, personagem);
		gerenciador.colocaVantagem(1, personagem);
		gerenciador.colocaVantagem(2, personagem);
		gerenciador.colocaVantagem(3, personagem);
		gerenciador.colocaVantagem(4, personagem);
		gerenciador.colocaDesvantagem(1, personagem);
		gerenciador.colocaDesvantagem(2, personagem);
		personagem.resumir();
		fail("Not yet implemented");
	}

}
