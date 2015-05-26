/* 114210417 - Matheus Gomes Maia: LAB 4 - Turma 1 */
package lab04;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

	private String nome;	
	List<Musica> musicas;

	public Playlist(String nomePlaylist) {
		this.musicas = new ArrayList<Musica>();
		this.nome = nomePlaylist;
	}



	public Object getNome() {
		return nome;
	}


	public void adicionar(Album album, int faixa, Perfil perfil) throws Exception {
		if (perfil.albuns.contains(album)){
			this.musicas.add(album.getFaixa(faixa));
		}
		else{
			throw new Exception("Nao existe esse album no perfil.");
		}
	}
	
}
