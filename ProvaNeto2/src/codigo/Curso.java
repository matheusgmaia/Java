package codigo;

public abstract class Curso {
	public String nome;
	public double leitura;
	public double escrita;
	public double fala;
	public double escuta;
	public String cumprimento;
	static Curso sueco = new CursoSueco("Sueco", 0.1, 0.1, 0.3, 0.5);
	static Curso ingles = new CursoIngles("Ingles", 0.1, 0.5, 0.4, 0);
	static Curso japones = new CursoJapones("Japones", 0.4, 0.6, 0, 0);

	public Curso(String nome, double leitura, double escrita, double fala, double escuta) {
		this.nome = nome;
		this.leitura = leitura;
		this.escrita = escrita;
		this.fala = fala;
		this.escuta = escuta;
	}

	public static Curso matricula(String string) {
		if (string.equals("Japones")) {
			return japones;
		} else if (string.equals("Sueco")) {
			return sueco;
		} else if (string.equals("Ingles")) {
			return ingles;
		}
		return null;
	}

	public double calculaFacilidade(Aluno aluno) {
		return (aluno.getLeitura() * this.leitura) + (aluno.getEscrita() * this.escrita) + (aluno.getFala() * this.fala)
				+ (aluno.getEscuta() * this.escuta);
	}

	public String cumprimentar(String nome2) {

		return (String.format(cumprimento, nome2));
	}

	public String getCumprimento() {
		return cumprimento;
	}

	public void setCumprimento(String cumprimento) {
		this.cumprimento = cumprimento;
	}
}
