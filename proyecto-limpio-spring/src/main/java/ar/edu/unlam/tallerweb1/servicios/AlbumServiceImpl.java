package ar.edu.unlam.tallerweb1.servicios;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import ar.edu.unlam.tallerweb1.dao.AlbumDao;
import ar.edu.unlam.tallerweb1.modelo.Album;

@Service("AlbumService")
@Transactional
public class AlbumServiceImpl implements AlbumService {
	
	@Inject
	private AlbumDao servicioAlbumDao;
	
	@Override
	public List<Album> traerAlbumesDeUnaBanda(Long id) {
		
		return servicioAlbumDao.traerAlbumesDeUnaBanda(id);
	}
		
}
