package lab04;

import java.util.ArrayList;
import java.util.List;

public class Perfil {

	@SuppressWarnings("unused")
	private String nome;
	List<Album> albuns;
	List<Album> albunsFavoritos;
	List<Playlist> playlists;
	
	public Perfil(String Nome) {
		this.nome = Nome;
		this.albuns = new ArrayList<Album>();
		this.albunsFavoritos = new ArrayList<Album>();
		this.playlists = new ArrayList<Playlist>();
	}

	public void adicionaAlbum(Album album) {
		albuns.add(album);
	}

	public void adicionaAlbumfavorito(Album album) {
		albunsFavoritos.add(album);
	}

	public void adicionaPlaylist(String nomePlaylist, Album album, int faixa) throws Exception {
		Playlist playlistAdicionar;
		//Se a playlist ja existe
		if (verificaPlaylist(nomePlaylist) == true){
			playlistAdicionar = pegaPlaylist(nomePlaylist);
			playlistAdicionar.adicionar(album, faixa, this);
			
		}
		//Se ainda n foi feita
		else{
			playlistAdicionar = new Playlist(nomePlaylist);
			playlistAdicionar.adicionar(album, faixa, this);
		}
		//Colocar a playlist na lista do perfil
		playlists.add(playlistAdicionar);
		
		}
	//Pega a plylist na arry do perfil
	private Playlist pegaPlaylist(String nomePlaylist) {
		for(Playlist playlist : playlists){
			if((playlist.getNome()) == nomePlaylist){
				return playlist;
			}
		}
		return null;
	}
	//Verifica se a playlist exite
	public boolean verificaPlaylist(String nomePlaylist){
		for(Playlist playlist : playlists){
			if((playlist.getNome()) == nomePlaylist){
				return true;
			}
		}
		return false;
	}
	
}
