package Excepions;

public class ErroDeEntrada extends Exception{

	public ErroDeEntrada(String string) {
		super("Erro leve: entrada n é valida");
	}

}
