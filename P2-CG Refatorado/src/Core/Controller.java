package Core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Controller {

public static Loja loja = new Loja();
Map<String, Double> catalagoDeJogos = new HashMap<String, Double>();
private double totalArrecadado = 0;
private ArrayList<Jogo> jogosCadastrados = new ArrayList<Jogo>();

public static void criaUsuario(String nome, String login, double grana) {
	Usuario usuarioNovo = new Noob(nome, login, grana);
	loja.criaUsuario(usuarioNovo);
}
public void jogoNovo(String nome, double valor, Jogo.TipoDeJogo tipo,
		Jogo.EstiloDeJogo... deJogos) {
		Jogo jogoNovo = JogoFactory.criaJogo(nome, valor, tipo, deJogos);
		jogosCadastrados.add(jogoNovo);
		catalagoDeJogos.put(jogoNovo.getNome(), jogoNovo.getValor());catalagoDeJogos.get(nome); 
	}

public void vendaJogos(String nome, String login) {
	if (loja.mapaDeUsuarios.containsKey(login) || (catalagoDeJogos.containsKey(nome))) {
		Usuario usuario = loja.mapaDeUsuarios.get(login);
		Jogo jogo = null;
		for (Jogo jogo2 : jogosCadastrados) {
			if (jogo2.getNome() == nome) {
				jogo = jogo2;
			}
		}
		
		if (usuario.getDinheiroQuePossui() >= (catalagoDeJogos.get(nome))* usuario.getTipoDeUsuario().valorDoDesconto) {
				totalArrecadado += (catalagoDeJogos.get(nome) * usuario.getTipoDeUsuario().valorDoDesconto);
				Jogo jogoCopia = JogoFactory.criacopia(jogo);
				usuario.comprarJogo(jogoCopia);

			} else {
				System.out.println("Usuario não tem dinheiro suficiente");
			}
			} else {
				System.out.println("Jogo ou Usuario nao cadastrado!");

			}
		}

}