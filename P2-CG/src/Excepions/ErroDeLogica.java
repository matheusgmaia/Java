package Excepions;

public class ErroDeLogica extends Exception {
	/* 114210417 - Matheus Gomes Maia: LAB 6 - Turma 1 */

	/**
	 * 
	 */
	private static final long serialVersionUID = -1481848059916877641L;

	public ErroDeLogica(String string) {
		super("Erro gave: " + string);
	}

}
