package ar.edu.unlam.tallerweb1.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import ar.edu.unlam.tallerweb1.modelo.Tema;

@Service("temaDao")
public class TemaDaoImpl implements TemaDao{
		
	@Inject
    private SessionFactory sessionFactory;
	

		@SuppressWarnings("unchecked")
		@Override
		public List<Tema> traerUnTema(Long id) {
			
			return (List<Tema>) ( sessionFactory.getCurrentSession()
					.createCriteria(Tema.class)
					.add(Restrictions.eq("album.id", id))
					.list());
		}
			
		@Override
		public void guardarTemaConLista(List<Tema> temas) {
			final Session session = sessionFactory.getCurrentSession();
			session.save(temas);		
			
		}
		
		@Override
		public void guardarTema(Tema tema) {
			final Session session = sessionFactory.getCurrentSession();
			session.save(tema);					
		}
}
