package Excepions;

public class ErroDeLogica extends Exception {

	public ErroDeLogica(String string) {
		super("Erro gave: " + string);
	}
	
	}


