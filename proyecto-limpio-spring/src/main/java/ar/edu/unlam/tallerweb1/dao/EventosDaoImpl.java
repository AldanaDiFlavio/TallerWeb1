package ar.edu.unlam.tallerweb1.dao;

import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import ar.edu.unlam.tallerweb1.modelo.Bandas;
import ar.edu.unlam.tallerweb1.modelo.Eventos;

@Service("eventosDao")
public class EventosDaoImpl implements EventosDao{
	
	@Inject
    private SessionFactory sessionFactory;
	
		@Override
		public void guardarEvento(Eventos evento) {
			final Session session = sessionFactory.getCurrentSession();
			session.save(evento);		
			
		}

		@SuppressWarnings("unchecked")
		@Override
		public List<Eventos> traerListaEventos() {
			return( sessionFactory.getCurrentSession()
					.createCriteria(Eventos.class)
					.setFetchMode("eventos_bandas", FetchMode.JOIN)
					.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
					.list());	
		}

		@Override
		public Eventos traerUnEvento(Long id) {
			
			return (Eventos) ( sessionFactory.getCurrentSession()
					.createCriteria(Eventos.class)
					.add(Restrictions.eq("id", id))
					.uniqueResult());	
			
		}

		@SuppressWarnings("unchecked")
		@Override
		public List<Bandas> traerBandasDeUnEvento(Set<Bandas> bandasdelevento) {
			return (List<Bandas>) ( sessionFactory.getCurrentSession()
					.createCriteria(Bandas.class)
					.add(Restrictions.eq("id", bandasdelevento))
					.list());
		}

		@Override
		public List<Eventos> eventosAnteriores(List<Eventos> todosLosEventos) {
			
			return null;
		}	
		
}
