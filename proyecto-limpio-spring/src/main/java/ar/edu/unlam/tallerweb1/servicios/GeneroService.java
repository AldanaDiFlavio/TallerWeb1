package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Genero;

public interface GeneroService {

	List<Genero> traerBandaDeUnGenero(Long id);
	List<Genero> traerListaGenero();
}
