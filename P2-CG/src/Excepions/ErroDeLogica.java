package Excepions;

public class ErroDeLogica extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1481848059916877641L;

	public ErroDeLogica(String string) {
		super("Erro gave: " + string);
	}
	
	}


