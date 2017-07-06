package ar.edu.unlam.tallerweb1.servicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.GeneroDao;
import ar.edu.unlam.tallerweb1.modelo.Bandas;
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
		
		List<Genero> list = servicioGeneroDao.traerListaGenero();
		
	//	Set<Genero> nuvalista = new HashSet<Genero>();
	//	nuvalista.addAll(list);
		
	//	List<Genero> bandas = new ArrayList<Genero>();
	//	  for ( Genero banda : nuvalista) {			 			
	//			bandas.add(banda);
	//	  		}
		  
		  return list;		
	}

}
