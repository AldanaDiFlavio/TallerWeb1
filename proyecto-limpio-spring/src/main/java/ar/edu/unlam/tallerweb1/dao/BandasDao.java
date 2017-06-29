package ar.edu.unlam.tallerweb1.dao;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Bandas;

public interface BandasDao {

	List<Bandas> traerListaBandas();
	
	void guardarBandas(Bandas bandas);
	
	Bandas traerUnaBanda(Long id);

}
