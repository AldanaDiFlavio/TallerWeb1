package ar.edu.unlam.tallerweb1.dao;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Album;

@Service("albumDao")
public class AlbumDaoImpl implements AlbumDao{
		
	@Inject
    private SessionFactory sessionFactory;
	
		@Override
		public Album traerUnAlbum(Long id) {
		
			return (Album) ( sessionFactory.getCurrentSession()
					.createCriteria(Album.class)
					.add(Restrictions.eq("id", id))
					.uniqueResult());	
		}
	
		@SuppressWarnings("unchecked")
		@Override
		public List<Album> traerAlbumesDeUnaBanda(Long id) {
			
			return (List<Album>) ( sessionFactory.getCurrentSession()
					.createCriteria(Album.class)
					.add(Restrictions.eq("bandas.id", id))
					.list());
		}
		
		@Override
		public void guardarAlbum(Album album) {
			final Session session = sessionFactory.getCurrentSession();
			session.save(album);		
			
		}
		
		@Override
		public void editarAlbum (Album alb) {			
			final Session session = sessionFactory.getCurrentSession();
			session.saveOrUpdate(alb);		
		}
		
		@Override
		public void guardarAlbumConLista(List<Album> albums) {
			final Session session = sessionFactory.getCurrentSession();
			session.save(albums);		
			
		}

}
