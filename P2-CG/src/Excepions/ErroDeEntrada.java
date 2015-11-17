package Excepions;

public class ErroDeEntrada extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3052470695145812439L;

	public ErroDeEntrada(String string) {
		super("Erro leve: entrada n é valida");
	}

}
