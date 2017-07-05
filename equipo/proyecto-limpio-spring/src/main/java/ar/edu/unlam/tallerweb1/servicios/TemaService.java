package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Tema;

public interface TemaService {

	List<Tema> traerUnTema(Long id);
}
