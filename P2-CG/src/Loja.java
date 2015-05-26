import java.util.ArrayList;
import java.util.*;


public class Loja {
	//DADOS
	//private ArrayList<Usuario> usuariosCadastrados = new ArrayList<Usuario>();
	private ArrayList<Jogo> jogosCadastrados = new ArrayList<Jogo>();
	Map<String, Usuario> mapaDeUsuarios = new HashMap<String, Usuario>();
	Map<String, double> tabelaDeJogos = new HashMap<String, double>();	
	
	private void criaUsuario(String nome, String login, double grana){
		Usuario usuarioNovo = new Usuario(nome, login, grana);
		mapaDeUsuarios.put(login, usuarioNovo);
	}
	
	private void jogoNovo(String nome, double valor, Jogo.TipoDeJogo tipo){
		Jogo jogoNovo = new Jogo(nome, valor, tipo);
		jogosCadastrados.add(jogoNovo);
		tabelaDeJogos.put(jogoNovo.getNome(), jogoNovo.getValor());
		
	}
}
