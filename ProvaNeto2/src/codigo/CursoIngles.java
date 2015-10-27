package codigo;

public class CursoIngles extends Curso {

	public CursoIngles(String string, double d, double e, double f, double i) {
		super(string, d, e, f, i);
		super.setCumprimento("Hello! I am %s. Nice to meet you.");
	}

}
