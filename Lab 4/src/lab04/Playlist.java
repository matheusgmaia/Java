package lab04;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

	private String nome;	
	List<Musica> musicas;

	public Playlist(String nomePlaylist, Album album, int faixa) {
		musicas = new ArrayList<Musica>();
	}



	public Object getNome() {
		return nome;
	}


	public void adicionar(Album album, int faixa, Perfil perfil) throws Exception {
		if (perfil.albuns.contains(album)){
			musicas.add(album.getFaixa(faixa));
		}
		else{
			throw new Exception("Não existe esse album n perfil");
		}
	}
	
}
