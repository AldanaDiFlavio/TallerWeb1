package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Bandas;

public interface BandasService {
	
	List<Bandas> obtenerGenero(List<Bandas> todasLasBandas, String genero);
	
	List<Bandas> bandasRecomendadas(List<Bandas> todasLasBandas);
	
	List<Bandas> traerListaBandas();
	
}
