package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.EventosDao;
import ar.edu.unlam.tallerweb1.modelo.Bandas;
import ar.edu.unlam.tallerweb1.modelo.Eventos;

@Service("EventosService")
@Transactional
public class EventosServiceImpl  implements EventosService {
	
	@Inject
	private EventosDao servicioEventosDao;
	
	@Override
	public void guardarEvento(Eventos evento) {
		servicioEventosDao.guardarEvento(evento);		
	}

	@Override
	public List<Eventos> eventosAnteriores(List<Eventos> todosLosEventos){
		return servicioEventosDao.eventosAnteriores(todosLosEventos);
		
	}

	@Override
	public List<Eventos> traerListaEventos() {
		return servicioEventosDao.traerListaEventos();
	}

	@Override
	public Eventos traerUnEvento(Long id) {
		return servicioEventosDao.traerUnEvento(id);
	}

	@Override
	public List<Bandas> traerBandasDeUnEvento(Set<Bandas> bandasdelevento) {
		return servicioEventosDao.traerBandasDeUnEvento(bandasdelevento);
	}

}
