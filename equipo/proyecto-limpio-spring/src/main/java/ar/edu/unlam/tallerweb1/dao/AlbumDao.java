package ar.edu.unlam.tallerweb1.dao;

import java.util.List;
import ar.edu.unlam.tallerweb1.modelo.Album;

public interface AlbumDao {
	
	Album traerUnAlbum(Long id);
	
	List<Album> traerAlbumesDeUnaBanda(Long id);

	void guardarAlbum(Album album);
	
	void editarAlbum(Album alb);

	void guardarAlbumConLista(List<Album> albums);

}
