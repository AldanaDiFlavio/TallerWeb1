package ar.edu.unlam.tallerweb1.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.BandasDao;
import ar.edu.unlam.tallerweb1.modelo.Bandas;


@Service("BandasService")
@Transactional
public class BandasServiceImpl implements BandasService {
	
	@Inject
	private BandasDao servicioBandasDao;
	
	@Override
	public List<Bandas> bandasRecomendadas(List<Bandas> todasLasBandas){
		return servicioBandasDao.bandasRecomendadas(todasLasBandas);
		
	}


	@Override
	public List<Bandas> traerListaBandas() {
		return servicioBandasDao.traerListaBandas();
	}
	
	@Override
	public List<Bandas> traerBandaGeneroRockNacional(Long id) {
		return servicioBandasDao.traerBandaGeneroRockNacional(id);
	}


	@Override
	public List<Bandas> CantidadBandasPorGenero() {
		return servicioBandasDao.CantidadBandasPorGenero();
	}


	@Override
	public Bandas traerUnaBanda(Long id) {
		return servicioBandasDao.traerUnaBanda(id);
	}


	@Override
	public List<Bandas> traerEnListaBandasDeUsuario(Set<Bandas> b) {
		List<Bandas> bandas = new ArrayList<Bandas>();
		  for ( Bandas banda : b ) {			 			
				bandas.add(banda);
		  		}
		  return bandas;
	}
	
	@Override
	public void editarBanda(Bandas banda) {
		servicioBandasDao.editarBandas(banda);			
	}
}
