/* 114210417 - Matheus Gomes Maia: LAB 4 - Turma 1 */
package lab04;

import java.util.ArrayList;
import java.util.List;

public class Album  {

	private String nome;
	private String artista;
	private int ano;
	private int duracaoTotal;
	
	public List<Musica> musicas = new ArrayList<Musica>();
	
	public Album(String Nome, String Tipo, int Ano) {
		setNome(Nome);
		setAno(Ano);
		setArtista(Tipo);
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

	
	public Musica getFaixa(int index){
		index -= 1;
		return musicas.get(index);
		
	}
	
	public void adicionaMusica(Musica musica) {
		musicas.add(musica);
	}



	public int atualizaDuracaoTotal() {
		for(Musica musica : musicas){
			this.duracaoTotal += musica.getDuracao();
		}
		return duracaoTotal;
	}


	public void removeMusica(Musica musica) {
		musicas.remove(musica);	
	}



	

}
