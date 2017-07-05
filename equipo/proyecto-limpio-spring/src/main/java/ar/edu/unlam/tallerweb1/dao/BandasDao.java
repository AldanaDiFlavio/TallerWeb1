package ar.edu.unlam.tallerweb1.dao;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Bandas;
import ar.edu.unlam.tallerweb1.modelo.Genero;

public interface BandasDao {

	List<Bandas> traerListaBandas();
	
	void guardarBandas(Bandas bandas);
	
	Bandas traerUnaBanda(Long id);
	
	List<Bandas> traerBandaGeneroRockNacional(Long id);

	List<Bandas> CantidadBandasPorGenero();

	List<Bandas> buscarPor(Genero rock);

	List<Bandas> bandasRecomendadas(List<Bandas> todasLasBandas);

}
