package ar.edu.unlam.tallerweb1;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.AlbumDao;
import ar.edu.unlam.tallerweb1.dao.BandasDao;
import ar.edu.unlam.tallerweb1.modelo.Album;
import ar.edu.unlam.tallerweb1.modelo.Bandas;
import ar.edu.unlam.tallerweb1.modelo.Tema;

public class InsercionesTest extends SpringTest {

	@Inject
	private BandasDao bandasDao;
	@Inject
	private AlbumDao albumDao;

	@Test
	@Transactional
	@Rollback(false)
	public void insertarBanda1() {
		
		Bandas b = new Bandas();
		b.setNombre("La Beriso");
		b.setImagen("images/bandas/banda1.jpg");
		b.setCantidadAdheridos(70);
		bandasDao.guardarBandas(b);

		Session currentSession = sessionFactory.getCurrentSession();
		Bandas bandas2 = currentSession.get(Bandas.class, b.getId());
		Assert.assertNotNull(bandas2);
	}

	@Test
	@Transactional
	@Rollback(false)
	public void insertarBanda2() {
		
		Bandas b = new Bandas();
		b.setNombre("Callejeros");
		b.setImagen("images/bandas/banda2.jpg");
		b.setCantidadAdheridos(130);
		
		bandasDao.guardarBandas(b);

		Session currentSession = sessionFactory.getCurrentSession();
		Bandas bandas2 = currentSession.get(Bandas.class, b.getId());
		Assert.assertNotNull(bandas2);
	}

	@Test
	@Transactional
	@Rollback(false)
	public void insertarBanda3() {
		
		Bandas b = new Bandas();
		b.setNombre("La Renga");
		b.setImagen("images/bandas/banda3.jpg");
		b.setCantidadAdheridos(135);
		
		bandasDao.guardarBandas(b);

		Session currentSession = sessionFactory.getCurrentSession();
		Bandas bandas2 = currentSession.get(Bandas.class, b.getId());
		Assert.assertNotNull(bandas2);
	}

	@Test
	@Transactional
	@Rollback(false)
	public void insertarBanda4() {
		
		Bandas b = new Bandas();
		b.setNombre("Cielo Razzo");
		b.setImagen("images/bandas/banda4.jpg");
		b.setCantidadAdheridos(80);
		
		bandasDao.guardarBandas(b);

		Session currentSession = sessionFactory.getCurrentSession();
		Bandas bandas2 = currentSession.get(Bandas.class, b.getId());
		Assert.assertNotNull(bandas2);
	}
	
	@Test
	@Transactional
	@Rollback(false)
	public void insertarBanda5() {
		
		Bandas b = new Bandas();
		b.setNombre("AC DC");
		b.setImagen("images/bandas/banda5.jpg");
		b.setCantidadAdheridos(85);
		
		bandasDao.guardarBandas(b);

		Session currentSession = sessionFactory.getCurrentSession();
		Bandas bandas2 = currentSession.get(Bandas.class, b.getId());
		Assert.assertNotNull(bandas2);
	}
	
	@Test
	@Transactional
	@Rollback(false)
	public void insertarBanda6() {
		
		Bandas b = new Bandas();
		b.setNombre("Metallica");
		b.setImagen("images/bandas/banda6.jpg");
		b.setCantidadAdheridos(150);
		
		bandasDao.guardarBandas(b);

		Session currentSession = sessionFactory.getCurrentSession();
		Bandas bandas2 = currentSession.get(Bandas.class, b.getId());
		Assert.assertNotNull(bandas2);
	}
		
	@Test
	@Transactional
	@Rollback(false)
	public void insertarBanda7() {
		
		Bandas b = new Bandas();
		b.setNombre("System Of A Down");
		b.setImagen("images/bandas/banda7.jpg");
		b.setCantidadAdheridos(120);
		
		bandasDao.guardarBandas(b);

		Session currentSession = sessionFactory.getCurrentSession();
		Bandas bandas2 = currentSession.get(Bandas.class, b.getId());
		Assert.assertNotNull(bandas2);
	}
		
	@Test
	@Transactional
	@Rollback(false)
	public void insertarBanda8() {
		
		Bandas b = new Bandas();
		b.setNombre("Iron Maiden");
		b.setImagen("images/bandas/banda8.jpg");
		b.setCantidadAdheridos(100);
		
		bandasDao.guardarBandas(b);

		Session currentSession = sessionFactory.getCurrentSession();
		Bandas bandas2 = currentSession.get(Bandas.class, b.getId());
		Assert.assertNotNull(bandas2);
	}

	@Test
	@Transactional
	@Rollback(false)
	public void insertarAlbunesAUnaBanda() { 
				
		Long id ;
		id = (long) 1;	
		Bandas banda = bandasDao.traerUnaBana(id);
		
		Album nalbum = new Album();
		nalbum.setNombre("Pecado Capital");
		nalbum.setAno(2016);
		nalbum.setImagen("images/bandas/banda1.jpg");
		nalbum.setIdBandas(banda);
		albumDao.registrarAlbum(nalbum);
				
		/*
		Long id ;
		id = (long) 1;		
		id = nalbum.getIdBandas().getId();	// GUARDO EL ALBUM_ID EN UNA VARIABLE		
		Album album = albumDao.traerUnoAlbum(id);
		*/		
		
		Session currentSession = sessionFactory.getCurrentSession();
		Album albu = currentSession.get(Album.class, nalbum.getId());
		Assert.assertNotNull(albu);
		
	}
	
	/*
	@Test
	@Transactional
	@Rollback(false)
	public void insertarTemasAUnAlbum() { 
				
		Long id ;
		id = (long) 1;	
		Bandas banda = bandasDao.traerUnaBana(id);
		banda.getListaAlbum();
		
		Album alb = new Album();
		List<Album> albu = albumDao.traerAlbumesDeUnaBanda(id);
		banda.getListaAlbum();
		
		Tema tema = new Tema();
		tema.setNombre("Pecado Capital");
		tema.setDuracion("");
		tema.setLink("images/bandas/banda1.jpg");
		
		tema.setIdAlbum(albu.id));
		
		nalbum.setListaTemas(listaTemas);
		nalbum.setIdBandas(banda);
		albumDao.registrarAlbum(nalbum);
				
		/*
		Long id ;
		id = (long) 1;		
		id = nalbum.getIdBandas().getId();	// GUARDO EL ALBUM_ID EN UNA VARIABLE		
		Album album = albumDao.traerUnoAlbum(id);
		*/		
		/*
		Session currentSession = sessionFactory.getCurrentSession();
		Album albu = currentSession.get(Album.class, nalbum.getId());
		Assert.assertNotNull(albu);
		*/	
	// }

	
}