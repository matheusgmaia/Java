package codigo;

public class CursoJapones extends Curso {

	public CursoJapones(String string, double d, double e, double f, double g) {
		super(string, d, e, f, g);
		super.setCumprimento("Hajimemashite. Watashi ha %s desu.");
	}

}
