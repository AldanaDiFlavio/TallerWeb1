package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;
import java.util.Set;

import ar.edu.unlam.tallerweb1.modelo.Bandas;

public interface BandasService {
	
	Bandas traerUnaBanda(Long id);
		
	List<Bandas> bandasRecomendadas(List<Bandas> todasLasBandas);
	
	List<Bandas> traerListaBandas();
	
	List<Bandas> traerBandaGeneroRockNacional(Long id);
	
	List<Bandas> CantidadBandasPorGenero();

	List<Bandas> traerEnListaBandasDeUsuario(Set<Bandas> bandas);
	
}
