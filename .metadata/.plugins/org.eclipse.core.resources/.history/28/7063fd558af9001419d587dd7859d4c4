package lab04;

public class Album {

	private String nome;
	private String artista;
	private int ano;
	private static int prxFaixa = 1 ;
	private int faixa;
	private int duracaoTotal;
	
	private Musica[] faixas = new Musica[10];
	
	public Album(String string, String string2, int i) {
		setNome(string);
		setAno(i);
		setArtista(string2);
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getArtista() {
		return artista;
	}


	public void setArtista(String artista) {
		this.artista = artista;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}


	public int getFaixa() {
		return faixa;
	}


	public void setFaixa(int faixa) {
		this.faixa = faixa;
	}


	public void adicionaMusica(Musica musica) {
		faixas[prxFaixa] = musica;
		musica.setFaixa(prxFaixa);
		prxFaixa += 1;

		
	}



	public void atualizaDuracaoTotal(int duracaoTotal) {
		//fazer depois
	}
	
}
