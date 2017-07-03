package ar.edu.unlam.tallerweb1.servicios;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import ar.edu.unlam.tallerweb1.dao.TemaDao;
import ar.edu.unlam.tallerweb1.modelo.Tema;

@Service("TemaService")
@Transactional
public class TemaServiceImpl implements TemaService {
	
	@Inject
	private TemaDao servicioTemaDao;
	
	@Override
	public List<Tema> traerUnTema(Long id) {

		return servicioTemaDao.traerUnTema(id);
	}
}
