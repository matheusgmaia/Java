package Loja;
import java.util.*;

import Excepions.JogoNExiste;
import Jogo.Jogo;
import Jogo.JogoFactory;
import Usuario.Noob;
import Usuario.Usuario;
import Usuario.Veterano;

public class Loja {
	// DADOS
	private ArrayList<Usuario> usuariosCadastrados = new ArrayList<Usuario>();
	Map<String, Usuario> mapaDeUsuarios = new HashMap<String, Usuario>();


	public void criaUsuario(Usuario usuarioNovo) {
		mapaDeUsuarios.put(usuarioNovo.getLogin(), usuarioNovo);
		usuariosCadastrados.add(usuarioNovo);
	}


	public void adicionaDinheiro(String login, double valor) {
		if (mapaDeUsuarios.containsKey(login)) {
			for (Usuario usuario : usuariosCadastrados) {
				if (usuario.getLogin() == login) {
					usuario.adicionaDinheiro(valor);
				}
			}
		} else {
			System.out.println("Usuario não cadastrado");
		}
	}


	public void upgrade(String id) {
		if (mapaDeUsuarios.containsKey(id)) {
			Usuario usuario = mapaDeUsuarios.get(id);
				if ((usuario.getX2p() >= 1000) && (usuario instanceof Noob)) {
					Veterano u = new Veterano(usuario.getNome(),
							usuario.getLogin(), usuario.getDinheiroQuePossui());
					u.setX2p(usuario.getX2p());
					u.setDinheiroGasto(usuario.getDinheiroGasto());
					u.setJogosComprados(usuario.getJogosComprados());
					usuariosCadastrados.remove(usuario);
					usuariosCadastrados.add(u);
				}
			}
		}
	

	public void downgrade(String id) throws JogoNExiste {
		if (mapaDeUsuarios.containsKey(id)) {
			Usuario usuario = mapaDeUsuarios.get(id);
				if ((usuario.getX2p() < 1000) && (usuario instanceof Veterano)) {
					Noob u = new Noob(usuario.getNome(), usuario.getLogin(),
							usuario.getDinheiroQuePossui());
					u.setX2p(usuario.getX2p());
					u.setDinheiroGasto(usuario.getDinheiroGasto());
					u.setJogosComprados(usuario.getJogosComprados());
					usuariosCadastrados.remove(usuario);
					usuariosCadastrados.add(u);
				}
			}
	}


	public void recopensar(String id, String string2, int i, boolean b) {
		for (Usuario usuario : usuariosCadastrados) {
			if (usuario.getLogin() == id) {
				usuario.recopensar(string2, i, b);
			}
		
	}

}

	public void punir(String id, String string2, int i, boolean b) {
		for (Usuario usuario : usuariosCadastrados) {
			if (usuario.getLogin() == id) {
				usuario.recopensar(string2, i, b);
			}
		
	}		
		/**public void imprimirInformacoes() {
			System.out.println("======== Centra P2-CG ========\n");
			for (Usuario usuario : usuariosCadastrados) {
				usuario.imprimeInformacoesUsuario();
			}
			System.out
					.println("Total arrecadado com vendas de jogos: R$ "
							+ totalArrecadado);
		}
	}**/

}
}