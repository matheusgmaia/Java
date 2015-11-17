package Excepions;

public class ErroDeEntrada extends Exception{

    /* 114210417 - Matheus Gomes Maia: LAB 6 - Turma 1 */

	/**
	 * 
	 */
	private static final long serialVersionUID = 3052470695145812439L;

	public ErroDeEntrada(String string) {
		super("Erro leve: entrada n é valida");
	}

}
