package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Album;

public interface AlbumService {
	
	List<Album> traerAlbumesDeUnaBanda(Long id);
}
