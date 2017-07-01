package ar.edu.unlam.tallerweb1.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import ar.edu.unlam.tallerweb1.modelo.Genero;

@Service("generoDao")
public class GeneroDaoImpl implements GeneroDao {
	
	@Inject
    private SessionFactory sessionFactory;
	
	@Override
	public Genero traerUnGenero(Long id) {

		return (Genero) ( sessionFactory.getCurrentSession()
				.createCriteria(Genero.class)
				.add(Restrictions.eq("id", id))
				.uniqueResult());		
	}

	@Override
	public void guardarGenero(Genero genero) {
		final Session session = sessionFactory.getCurrentSession();
		session.save(genero);
		
	}
	
	@Override
	public List<Genero> traerListaGenero() {
		
		return( sessionFactory.getCurrentSession()
				.createCriteria(Genero.class)
				.list());	
	}

	@Override
	public List<Genero> traerBandaDeUnGenero(Long id) {
		return (List<Genero>) ( sessionFactory.getCurrentSession()
				.createCriteria(Genero.class)
				.add(Restrictions.eq("id", id))
				.list());
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
