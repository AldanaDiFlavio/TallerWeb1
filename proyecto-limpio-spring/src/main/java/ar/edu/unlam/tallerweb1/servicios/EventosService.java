package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Eventos;

public interface EventosService {

	List<Eventos> eventosRecomendados(List<Eventos> todosLosEventos);
}
