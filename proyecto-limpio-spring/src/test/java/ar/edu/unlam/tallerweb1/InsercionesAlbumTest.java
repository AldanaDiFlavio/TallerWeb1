package ar.edu.unlam.tallerweb1;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;

import ar.edu.unlam.tallerweb1.dao.AlbumDao;
import ar.edu.unlam.tallerweb1.modelo.Album;
import ar.edu.unlam.tallerweb1.modelo.Bandas;
import ar.edu.unlam.tallerweb1.modelo.CBU;
import ar.edu.unlam.tallerweb1.modelo.Cuenta;
import ar.edu.unlam.tallerweb1.modelo.Usuario;
import ar.edu.unlam.tallerweb1.servicios.AlbumService;
import ar.edu.unlam.tallerweb1.servicios.BandasService;

public class InsercionesAlbumTest extends SpringTest {

	@Inject
	private BandasService servicioBandas; 
	
	@Inject
	private AlbumService servicioAlbum; 	

	@Inject
	private AlbumDao albumDao;
	
	@Test
	@Transactional
	@Rollback(false)
	public void insertarAlbum1() {
		
		Album al = new Album();
		al.setNombre("Pecado Capital");
		al.setAno(2016);
		ArrayList<String> can = new ArrayList<String>();
		can.add("cancion1");
		can.add("cancion2");
		can.add("cancion3");
		can.add("cancion4");
		can.add("cancion5");
		can.add("cancion6");
		al.setCanciones(can);
		al.setImagen("images/bandas/banda1.jpg");
		al.setCantidadCanciones(20);
		al.setUrlSpotify("www.pepelepu.com.ar");
		
		Bandas b = new Bandas();
		b.setId((long) 1);
		al.setIdBandas(b
		albumDao.guardarAlbum(al);
		
		
		Session currentSession = sessionFactory.getCurrentSession();
		Album album2 = currentSession.get(Album.class, al.getId());
		Assert.assertNotNull(album2);
	}

	@Test
	@Transactional
	@Rollback(false)
	public void asociarAlbunesAUnaBanda() { //asociarCuentasAUnUsuario
		/*
		Bandas b = new Bandas();
		b.setNombre("La Beriso");
		b.setImagen("images/bandas/banda1.jpg");
		b.setUrlYtb("Rock Nacional");
		b.setCantidadAdheridos(70);
	
		Album al2 = new Album();
		al2.setNombre("Pecado Capital");
		al2.setAno(2016);
		al2.setImagen("images/bandas/banda1.jpg");
		al2.setCantidadCanciones(20);
		al2.setUrlSpotify("www.pepelepu.com.ar");
		al2.setIdBandas(b);
		*/
		
		List<Album> listaAlbum = albumDao.traerListaAlbum();
			
		Long id ;
		id = (long) 1;
		Album album = albumDao.traerUnoAlbum(id);
	
		Album al2 = new Album();
		al2.setNombre("Pecado Capital");
		al2.setAno(2016);
		al2.setImagen("images/bandas/banda1.jpg");
		al2.setCantidadCanciones(20);
		al2.setUrlSpotify("www.pepelepu.com.ar");
		album.add(al2);
		
		albumDao.guardarAlbumConLista(album);
				
		Session currentSession = sessionFactory.getCurrentSession();
		List<Album> albu = currentSession.get(Album.class, album);
		Assert.assertNotNull(albu);
		
	}
	
	@Test
	@Transactional
	@Rollback(false)
	public void asociarAlbunesAUnaBanda2() { //asociarCuentasAUnUsuario
		
		Bandas b = new Bandas();		
		b.setNombre("La Beriso");
		b.setImagen("images/bandas/banda1.jpg");
		b.setUrlYtb("Rock Nacional");
		b.setCantidadAdheridos(70);
	
		Album al1 = new Album();
		al1.setNombre("Pecado Capital");
		al1.setAno(2016);
		al1.setImagen("images/bandas/banda1.jpg");
		al1.setCantidadCanciones(20);
		al1.setUrlSpotify("www.pepelepu.com.ar");
		al1.setIdBandas((long) 1);
			
		albumDao.guardarAlbum(al1);
				
		Session currentSession = sessionFactory.getCurrentSession();
		Album album2 = currentSession.get(Album.class, al1.getId());
		Assert.assertNotNull(album2);
		
	}
	
	
	@Test
	@Transactional
	@Rollback(false)
	public void insertarAlbum2() {
		
		Album al = new Album();
		al.setNombre("Historias");
		al.setAno(2014);
		ArrayList<String> can = new ArrayList<String>();
		can.add("cancion1");
		can.add("cancion2");
		can.add("cancion3");
		can.add("cancion4");
		can.add("cancion5");
		can.add("cancion6");
		al.setCanciones(can);
		al.setImagen("images/bandas/banda1.jpg");
		al.setCantidadCanciones(20);
		al.setUrlSpotify("www.pepelepu.com.ar");
		Bandas b = new Bandas();
		b.setId(1);
		al.setIdBandas(b);
		/*
		Bandas b = new Bandas();
		b.setId((long) 1);
		al.setIdBandas(b);
		*/
		albumDao.guardarAlbum(al);
		
		
		Session currentSession = sessionFactory.getCurrentSession();
		Album album2 = currentSession.get(Album.class, al.getId());
		Assert.assertNotNull(album2);
	}
	
	@Test
	@Transactional
	@Rollback(false)
	public void insertarAlbum3() {
		
		Album al = new Album();
		al.setNombre("Vivo por la gloria");
		al.setAno(2014);
		/*
		ArrayList<String> can = new ArrayList<String>();
		can.add("cancion1");
		can.add("cancion2");
		can.add("cancion3");
		can.add("cancion4");
		can.add("cancion5");
		can.add("cancion6");
		al.setCanciones(can);
		*/
		al.setImagen("images/bandas/banda1.jpg");
		al.setCantidadCanciones(20);
		al.setUrlSpotify("www.pepelepu.com.ar");
		
		/*
		Bandas b = new Bandas();
		b.setId((long) 1);
		al.setIdBandas(b);
		*/
		
		albumDao.guardarAlbum(al);
		
		Session currentSession = sessionFactory.getCurrentSession();
		Album album2 = currentSession.get(Album.class, al.getId());
		Assert.assertNotNull(album2);
	}
	
}