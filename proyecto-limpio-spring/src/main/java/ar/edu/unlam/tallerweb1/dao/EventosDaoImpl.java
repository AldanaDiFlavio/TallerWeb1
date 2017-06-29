package ar.edu.unlam.tallerweb1.dao;

import java.util.List;
import java.util.Set;

import javax.inject.Inject;

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

		@Override
		public List<Eventos> traerListaEventos() {
			return( sessionFactory.getCurrentSession()
					.createCriteria(Eventos.class)
					.list());	
		}

		@Override
		public Eventos traerUnEvento(Long id) {
			
			return (Eventos) ( sessionFactory.getCurrentSession()
					.createCriteria(Eventos.class)
					.add(Restrictions.eq("id", id))
					.uniqueResult());	
			
		}

		@Override
		public List<Bandas> traerBandasDeUnEvento(Set<Bandas> bandasdelevento) {
			return (List<Bandas>) ( sessionFactory.getCurrentSession()
					.createCriteria(Bandas.class)
					.add(Restrictions.eq("id", bandasdelevento))
					.list());
		}	
		
}
