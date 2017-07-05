package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;
import java.util.Set;

import ar.edu.unlam.tallerweb1.modelo.Bandas;
import ar.edu.unlam.tallerweb1.modelo.Eventos;

public interface EventosService {

	void guardarEvento(Eventos evento);
	
	Eventos traerUnEvento(Long id);
	
	List<Eventos> eventosAnteriores(List<Eventos> todosLosEventos);
	
	List<Eventos> traerListaEventos();

	List<Bandas> traerBandasDeUnEvento(Set<Bandas> bandasdelevento);
	
}
