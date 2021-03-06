package ar.edu.unlam.tallerweb1.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import ar.edu.unlam.tallerweb1.modelo.Bandas;
import ar.edu.unlam.tallerweb1.modelo.Genero;

@Service("bandasDao")
public class BandasDaoImpl implements BandasDao{
	
	@Inject
    private SessionFactory sessionFactory;
	
		@SuppressWarnings("unchecked")
		@Override
		public List<Bandas> traerListaBandas() {
			
			return( sessionFactory.getCurrentSession()
					.createCriteria(Bandas.class)
					.setFetchMode("usuarios_bandas", FetchMode.JOIN)
					.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
					.list());	
		}

		@Override
		public void guardarBandas(Bandas bandas) {
			final Session session = sessionFactory.getCurrentSession();
			session.save(bandas);		
			
		}	
		
		@Override
		public Bandas traerUnaBanda(Long id) {

			return (Bandas) ( sessionFactory.getCurrentSession()
					.createCriteria(Bandas.class)
					.add(Restrictions.eq("id", id))
					.uniqueResult());		
		}
		
		@SuppressWarnings("unchecked")
		@Override
		public List<Bandas> traerBandaGeneroRockNacional(Long id) {
			return (List<Bandas>) ( sessionFactory.getCurrentSession()
					.createCriteria(Bandas.class)
					.add(Restrictions.eq("genero.id", id))			
					.list());
		}

		
		
		@SuppressWarnings("unchecked")
		@Override
		public List<Bandas> CantidadBandasPorGenero() {
				return (List<Bandas>) ( sessionFactory.getCurrentSession()
					.createCriteria(Bandas.class)
					.setProjection(Projections.rowCount())
					.list());
		}
		
		@Override
		public List<Bandas> buscarPor(Genero rock) {
			// TODO Auto-generated method stub
			return null;
		}

		@SuppressWarnings("unchecked")
		@Override
		public List<Bandas> bandasRecomendadas(List<Bandas> todasLasBandas) {
			return ( sessionFactory.getCurrentSession()
					.createCriteria(Bandas.class)
					.setFetchMode("usuarios_bandas", FetchMode.JOIN)
					.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
					.add(Restrictions.ge("cantidadAdheridos", 80))
					.list());
		}
		
		@Override
		public void editarBandas(Bandas bandas) {			
			final Session session = sessionFactory.getCurrentSession();
			session.saveOrUpdate(bandas);		
		}
}
