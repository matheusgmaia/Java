package Excepions;

public class UsuarioNExiste extends ErroDeLogica {
	/* 114210417 - Matheus Gomes Maia: LAB 6 - Turma 1 */

	/**
	 * 
	 */
	private static final long serialVersionUID = 8128842985866887954L;

	public UsuarioNExiste(String string) {
		super("Usuario nao existe" + string);
	}

}
