package ar.edu.unlam.tallerweb1.dao;

import java.util.List;


import ar.edu.unlam.tallerweb1.modelo.Genero;

public interface GeneroDao {

	void guardarGenero(Genero genero);

	List<Genero> traerBandaDeUnGenero(Long id);

	List<Genero> traerListaGenero();

	Genero traerUnGenero(Long id);



}
