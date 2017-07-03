package ar.edu.unlam.tallerweb1.dao;

import java.util.List;
import java.util.Set;

import ar.edu.unlam.tallerweb1.modelo.Bandas;

import ar.edu.unlam.tallerweb1.modelo.Eventos;

public interface EventosDao {

	void guardarEvento(Eventos evento);

	List<Eventos> traerListaEventos();

	List<Bandas> traerBandasDeUnEvento(Set<Bandas> bandasdelevento);

	Eventos traerUnEvento(Long id);

	List<Eventos> eventosAnteriores(List<Eventos> todosLosEventos);

}
