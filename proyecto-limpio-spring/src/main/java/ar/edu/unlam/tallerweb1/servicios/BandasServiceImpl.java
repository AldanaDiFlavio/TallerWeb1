package ar.edu.unlam.tallerweb1.servicios;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.modelo.Bandas;


@Service("BandasService")
@Transactional
public class BandasServiceImpl implements BandasService {
	
	@Override
	public List<Bandas> obtenerGenero(List<Bandas> todasLasBandas, String genero){
		List<Bandas> generoBandas = new LinkedList<Bandas>();
		for (Bandas banda: todasLasBandas){
			/*if(banda.getGenero() == genero){ 
				generoBandas.add(banda);
			}*/
		}
		
		return generoBandas;
	}
	
	
	@Override
	public List<Bandas> bandasRecomendadas(List<Bandas> todasLasBandas){
		
		List<Bandas> generoBandas = new LinkedList<Bandas>();
		for (Bandas banda: todasLasBandas){
			/*if(banda.getCantidadAdheridos() >= 100){
				generoBandas.add(banda);
			}*/
		}
		
		return generoBandas;
	}
}
