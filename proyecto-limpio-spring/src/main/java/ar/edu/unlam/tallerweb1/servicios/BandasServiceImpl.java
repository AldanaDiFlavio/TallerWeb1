package ar.edu.unlam.tallerweb1.servicios;

import java.util.LinkedList;
import java.util.List;

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
		
		List<Bandas> bandasRecomendadas = new LinkedList<Bandas>();
		for (Bandas banda: todasLasBandas){
			/*if(banda.getCantidadAdheridos() >= 100){
				generoBandas.add(banda);
			}*/
		}
		
		return bandasRecomendadas;
	}


	@Override
	public List<Bandas> traerListaBandas() {
		return servicioBandasDao.traerListaBandas();
	}
	
	
}
