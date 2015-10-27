package codigo;

public class CursoSueco extends Curso {
	public CursoSueco(String string, double d, double e, double f, double g) {
		super(string, d, e, f, g);
		super.setCumprimento("Hej hej! Jag heter %s. Trevligt att träffas.");
	}

}
