package Core;

import Core.Usuario.TipoDeUsuario;

public class Noob extends Usuario{

	public Noob(String nome2, String login2, double grana) {
		super(nome2, login2, grana);
		this.tipoDeUsuario = Usuario.TipoDeUsuario.NOOB;
	}

}
