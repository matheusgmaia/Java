package Usuario;


public class Veterano extends Usuario{

	public Veterano(String nome2, String login2, double grana) {
		super(nome2, login2, grana);
		this.tipoDeUsuario = Usuario.TipoDeUsuario.VETERANO;
	}

}
