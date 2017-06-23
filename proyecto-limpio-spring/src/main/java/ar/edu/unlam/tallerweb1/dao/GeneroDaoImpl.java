package ar.edu.unlam.tallerweb1.dao;

import java.util.LinkedList;
import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import ar.edu.unlam.tallerweb1.modelo.Bandas;
import ar.edu.unlam.tallerweb1.modelo.Genero;

@Service("generoDao")
public class GeneroDaoImpl implements GeneroDao {
	
	@Inject
    private SessionFactory sessionFactory;

	@Override
	public void guardarGenero(Genero genero) {
		final Session session = sessionFactory.getCurrentSession();
		session.save(genero);
		
	}
	
	/*@Override
	public List<Bandas> obtenerGenero(List<Bandas> todasLasBandas, String genero){
		List<Bandas> generoBandas = new LinkedList<Bandas>();
		for (Bandas banda: todasLasBandas){
			if(banda.getGenero() == genero){ 
				generoBandas.add(banda);
			}
		}
		
		return generoBandas;
	}*/
	

}
