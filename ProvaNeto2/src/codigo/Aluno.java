package codigo;

public class Aluno implements Comparable<Object> {

	private String nome;
	private double mensalidade;
	private double leitura;
	private double fala;
	private double escuta;
	private double escrita;
	private Curso cursoDoAluno;

	public Aluno(String string, double mensalidade, double escrita, double escuta, double fala, double leitura) {
		nome = string;
		this.mensalidade = mensalidade;
		this.escuta = escuta;
		this.fala = fala;
		this.leitura = leitura;
		this.escrita = escrita;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}

	public double getLeitura() {
		return leitura;
	}

	public void setLeitura(double leitura) {
		this.leitura = leitura;
	}

	public double getFala() {
		return fala;
	}

	public void setFala(double fala) {
		this.fala = fala;
	}

	public double getEscuta() {
		return escuta;
	}

	public void setEscuta(double escuta) {
		this.escuta = escuta;
	}

	public double getEscrita() {
		return escrita;
	}

	public void setEscrita(double escrita) {
		this.escrita = escrita;
	}

	public void matricula(String string) {
		this.cursoDoAluno = Curso.matricula(string);

	}

	public double calculaFacilidadeMedia() {
		return ((this.escrita + this.escuta + this.fala + this.leitura) / 4);
	}

	public double calculaFacilidade() {
		return cursoDoAluno.calculaFacilidade(this);
	}

	public String cumprimenta() {
		return cursoDoAluno.cumprimentar(this.getNome());
	}

	@Override
	public int compareTo(Object arg0) {
		Aluno outroObj = (Aluno) arg0;
		String outroNome = outroObj.nome;
		return this.nome.compareTo(outroNome);
	}

}
