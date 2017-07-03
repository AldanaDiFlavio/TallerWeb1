package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.GeneroDao;
import ar.edu.unlam.tallerweb1.modelo.Genero;


@Service("GeneroService")
@Transactional
public class GeneroServiceImpl implements GeneroService {

	@Inject
	private GeneroDao servicioGeneroDao;
		
	@Override
	public List<Genero> traerBandaDeUnGenero(Long id) {
	
		return servicioGeneroDao.traerBandaDeUnGenero(id);
	}

	@Override
	public List<Genero> traerListaGenero() {
		return servicioGeneroDao.traerListaGenero();
	}
}
