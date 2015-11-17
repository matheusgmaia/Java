package Excepions;

public class UsuarioNExiste extends ErroDeLogica{


	/**
	 * 
	 */
	private static final long serialVersionUID = 8128842985866887954L;

	public UsuarioNExiste(String string){
		super("Usuario nao existe" + string);
	}

}
