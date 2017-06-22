package ar.edu.unlam.tallerweb1.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import ar.edu.unlam.tallerweb1.modelo.Bandas;

@Service("bandasDao")
public class BandasDaoImpl implements BandasDao{
	
	@Inject
    private SessionFactory sessionFactory;
	
		@Override
		public List<Bandas> traerListaBandas() {
			
			return( sessionFactory.getCurrentSession()
					.createCriteria(Bandas.class)
					.list());	
		}

		@Override
		public void guardarBandas(Bandas bandas) {
			final Session session = sessionFactory.getCurrentSession();
			session.save(bandas);		
			
		}	
		
		@Override
		public Bandas traerUnaBana(Long id) {

			return (Bandas) ( sessionFactory.getCurrentSession()
					.createCriteria(Bandas.class)
					.add(Restrictions.eq("id", id))
					.uniqueResult());		
		}
			
}
