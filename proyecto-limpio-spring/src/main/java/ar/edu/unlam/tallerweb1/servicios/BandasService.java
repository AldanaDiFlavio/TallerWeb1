package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Bandas;

public interface BandasService {
		
	List<Bandas> bandasRecomendadas(List<Bandas> todasLasBandas);
	
	List<Bandas> traerListaBandas();
	
	List<Bandas> traerBandaGeneroRockNacional(Long id);
	
	List<Bandas> CantidadBandasPorGenero();
	
}
