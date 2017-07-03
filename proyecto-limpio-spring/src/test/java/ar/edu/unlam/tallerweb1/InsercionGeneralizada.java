package ar.edu.unlam.tallerweb1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import org.hibernate.Session;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.AlbumDao;
import ar.edu.unlam.tallerweb1.dao.BandasDao;
import ar.edu.unlam.tallerweb1.dao.EventosDao;
import ar.edu.unlam.tallerweb1.dao.GeneroDao;
import ar.edu.unlam.tallerweb1.dao.TemaDao;
import ar.edu.unlam.tallerweb1.dao.UsuarioDao;
import ar.edu.unlam.tallerweb1.modelo.Album;
import ar.edu.unlam.tallerweb1.modelo.Bandas;
import ar.edu.unlam.tallerweb1.modelo.Eventos;
import ar.edu.unlam.tallerweb1.modelo.Genero;
import ar.edu.unlam.tallerweb1.modelo.Tema;
import ar.edu.unlam.tallerweb1.modelo.Usuario;

public class InsercionGeneralizada extends SpringTest {

	@Inject
	private BandasDao bandasDao;
	
	@Inject
	private EventosDao eventosDao;
	
	@Inject
	private AlbumDao albumDao;
	
	@Inject
	private TemaDao temaDao;
	
	@Inject
	private GeneroDao generoDao;
	
	@Inject
	private UsuarioDao usuarioDao;

	@Test
	@Transactional
	@Rollback(false)
	public void insertarBanda1() {
		// Bueno definitivamente no funciona lo de genero o lo estoy implementando mal	
		Genero genero1 = new Genero();
		genero1.setGenero("Rock Nacional");	
		
		Bandas banda = new Bandas();
		banda.setNombre("La beriso");
		banda.setImagen("laberiso.jpg");
		banda.setCantidadAdheridos(70);
		banda.setGenero(genero1);
		
		generoDao.guardarGenero(genero1);
				
		List<Album> albums = new ArrayList<Album>();
		
		Album album1 = new Album();
		album1.setNombre("Pecado Capital");
		album1.setAnio(2016);
		album1.setImagen("pecadocapital.jpg");
			
		album1.setIdBandas(banda);
		albumDao.guardarAlbum(album1);
		
		List<Tema> temasalbum1 = new ArrayList<Tema>();
		
		Tema album1tema1 = new Tema();
		album1tema1.setNombre("Legui");
		album1tema1.setPosicion(1);
		album1tema1.setDuracion("2:57");
		album1tema1.setLink("www.youtube.com/watch?v=hC-EGGrxVHY");
		album1tema1.setIdAlbum(album1);
		temasalbum1.add(album1tema1);
		temaDao.guardarTema(album1tema1);
		
		Tema album1tema2 = new Tema();
		album1tema2.setNombre("Realidad");
		album1tema2.setPosicion(2);
		album1tema2.setDuracion("3:37");
		album1tema2.setLink("www.youtube.com/watch?v=UJjP_BIaDmU");
		album1tema2.setIdAlbum(album1);
		temasalbum1.add(album1tema2);
		temaDao.guardarTema(album1tema2);
		
		Tema album1tema3 = new Tema();
		album1tema3.setNombre("Tres mujeres y ella");
		album1tema3.setPosicion(3);
		album1tema3.setDuracion("3:59");
		album1tema3.setLink("www.youtube.com/watch?v=7wUSb6ygxDs");
		album1tema3.setIdAlbum(album1);
		temasalbum1.add(album1tema3);
		temaDao.guardarTema(album1tema3);
		
		album1.setListaTemas(temasalbum1); 	
		album1.setIdBandas(banda);
		albumDao.guardarAlbum(album1);
		
				
		Album album2 = new Album();
		album2.setNombre("Historias");
		album2.setAnio(2014);
		album2.setImagen("historias.jpg");
				
		album2.setIdBandas(banda);
		albumDao.guardarAlbum(album2);
		
		List<Tema> temasalbum2 = new ArrayList<Tema>();
		
		Tema album2tema1 = new Tema();
		album2tema1.setNombre("No me olvides");
		album2tema1.setPosicion(1);
		album2tema1.setDuracion("3:34");
		album2tema1.setLink("www.youtube.com/watch?v=-2oZk8h0Rmw");
		album2tema1.setIdAlbum(album2);
		temasalbum2.add(album2tema1);
		temaDao.guardarTema(album2tema1);
		
		Tema album2tema2 = new Tema();
		album2tema2.setNombre("Ella");
		album2tema2.setPosicion(2);
		album2tema2.setDuracion("4:51");
		album2tema2.setLink("www.youtube.com/watch?v=XzML0hT1dRA");
		album2tema2.setIdAlbum(album2);
		temasalbum2.add(album2tema2);
		temaDao.guardarTema(album2tema2);
		
		Tema album2tema3 = new Tema();
		album2tema3.setNombre("Te burlaste");
		album2tema3.setPosicion(3);
		album2tema3.setDuracion("3:35");
		album2tema3.setLink("www.youtube.com/watch?v=NZWNLcKw0h0");
		album2tema3.setIdAlbum(album2);
		temasalbum2.add(album2tema3);
		temaDao.guardarTema(album2tema3);
		
		album2.setListaTemas(temasalbum2); // Estos sos los temas del album 2 de la banda callejeros	
		album2.setIdBandas(banda);
		albumDao.guardarAlbum(album2);
		
		albums.add(album2);

		banda.setListaAlbum(albums);
		
		bandasDao.guardarBandas(banda);
						
		Session currentSession = sessionFactory.getCurrentSession();
		Bandas bandas2 = currentSession.get(Bandas.class, banda.getId());
		Assert.assertNotNull(bandas2);
	}

	@Test
	@Transactional
	@Rollback(false)
	public void insertarBanda2() {
		
		Genero genero2 = new Genero();
		genero2.setGenero("Rock Internacional");	

		Bandas banda = new Bandas();
		banda.setNombre("Callejeros");
		banda.setImagen("callejeros.jpg");
		banda.setCantidadAdheridos(70);
		banda.setGenero(genero2);
		
		generoDao.guardarGenero(genero2);
			
		List<Album> albums = new ArrayList<Album>();
		
		Album album1 = new Album();
		album1.setNombre("Disco escultura");
		album1.setAnio(2008);
		album1.setImagen("discoescultura.jpg");

		
	//	album1.setListaTemas(temasalbum1); // Estos sos los temas del album 1 de la banda callejeros	
		album1.setIdBandas(banda);
		albumDao.guardarAlbum(album1);
		
		List<Tema> temasalbum1 = new ArrayList<Tema>();
		
		Tema album1tema1 = new Tema();
		album1tema1.setNombre("Guiños");
		album1tema1.setPosicion(1);
		album1tema1.setDuracion("3:59");
		album1tema1.setLink("www.youtube.com/watch?v=d6OgifBl4KA");
		album1tema1.setIdAlbum(album1);
		temasalbum1.add(album1tema1);
		temaDao.guardarTema(album1tema1);
		
		Tema album1tema2 = new Tema();
		album1tema2.setNombre("Esa invisible línea");
		album1tema2.setPosicion(2);
		album1tema2.setDuracion("3:02");
		album1tema2.setLink("www.youtube.com/watch?v=cC65O5YnTf4");
		album1tema2.setIdAlbum(album1);
		temasalbum1.add(album1tema2);
		temaDao.guardarTema(album1tema2);
		
		Tema album1tema3 = new Tema();
		album1tema3.setNombre("El ignorante");
		album1tema3.setPosicion(3);
		album1tema3.setDuracion("6:19");
		album1tema3.setLink("www.youtube.com/watch?v=1m4U9kuTNNQ");
		album1tema3.setIdAlbum(album1);
		temasalbum1.add(album1tema3);
		temaDao.guardarTema(album1tema3);
		
		album1.setListaTemas(temasalbum1); // Estos sos los temas del album 1 de la banda callejeros	
		album1.setIdBandas(banda);
		albumDao.guardarAlbum(album1);
//		albums.add(album1); // NO FUNCO POR LISTA // Aca agregamos el album1 a la lista de albums de callejeros
		
		
		// Ingresamos un segundo album con sus respectivos temas para la banda callejeros
		
		Album album2 = new Album();
		album2.setNombre("Señales");
		album2.setAnio(2006);
		album2.setImagen("senales.jpg");
		
		
		
	//	album2.setListaTemas(temasalbum2); // Estos sos los temas del album 2 de la banda callejeros	
		album2.setIdBandas(banda);
		albumDao.guardarAlbum(album2);
		
		List<Tema> temasalbum2 = new ArrayList<Tema>();
		
		Tema album2tema1 = new Tema();
		album2tema1.setNombre("Daños");
		album2tema1.setPosicion(1);
		album2tema1.setDuracion("4:55");
		album2tema1.setLink("www.youtube.com/watch?v=wl0vdPRCYKc");
		album2tema1.setIdAlbum(album2);
		temasalbum2.add(album2tema1);
		temaDao.guardarTema(album2tema1);
		
		Tema album2tema2 = new Tema();
		album2tema2.setNombre("Frente al Río");
		album2tema2.setPosicion(2);
		album2tema2.setDuracion("3:59");
		album2tema2.setLink("www.youtube.com/watch?v=1O5aPQMVOmo");
		album2tema2.setIdAlbum(album2);
		temasalbum2.add(album2tema2);
		temaDao.guardarTema(album2tema2);
		
		Tema album2tema3 = new Tema();
		album2tema3.setNombre("Hoy");
		album2tema3.setPosicion(3);
		album2tema3.setDuracion("4:07");
		album2tema3.setLink("www.youtube.com/watch?v=Aav6XfSvKg4");
		album2tema3.setIdAlbum(album2);
		temasalbum2.add(album2tema3);
		temaDao.guardarTema(album2tema3);
		
		album2.setListaTemas(temasalbum2); // Estos sos los temas del album 2 de la banda callejeros	
		album2.setIdBandas(banda);
		albumDao.guardarAlbum(album2);
		
		albums.add(album2);
			
		banda.setListaAlbum(albums);
		
		bandasDao.guardarBandas(banda);
						
		Session currentSession = sessionFactory.getCurrentSession();
		Bandas bandas2 = currentSession.get(Bandas.class, banda.getId());
		Assert.assertNotNull(bandas2);
	}
	
	@Test
	@Transactional
	@Rollback(false)
	public void insertarBanda3() {
		
		Genero genero = new Genero();
		genero.setGenero("Pop");	

		Bandas b = new Bandas();
		b.setNombre("La Renga");
		b.setImagen("larenga.jpg");
		b.setCantidadAdheridos(135);
		b.setGenero(genero);
		
		generoDao.guardarGenero(genero);
		
		bandasDao.guardarBandas(b);

		Session currentSession = sessionFactory.getCurrentSession();
		Bandas bandas2 = currentSession.get(Bandas.class, b.getId());
		Assert.assertNotNull(bandas2);
	}

	@Test
	@Transactional
	@Rollback(false)
	public void insertarBanda4() {
		
		Long id ;
		id = (long) 1;
		Genero genero = generoDao.traerUnGenero(id);	
		
		Bandas b = new Bandas();
		b.setNombre("Cielo Razzo");
		b.setImagen("cielorazzo.jpg");
		b.setCantidadAdheridos(80);
		b.setGenero(genero);
		
		generoDao.guardarGenero(genero);
		
		bandasDao.guardarBandas(b);

		Session currentSession = sessionFactory.getCurrentSession();
		Bandas bandas2 = currentSession.get(Bandas.class, b.getId());
		Assert.assertNotNull(bandas2);
	}
	
	@Test
	@Transactional
	@Rollback(false)
	public void insertarBanda5() {
		
		Long id ;
		id = (long) 1;
		Genero genero = generoDao.traerUnGenero(id);	
		
		Bandas b = new Bandas();
		b.setNombre("AC DC");
		b.setImagen("acdc.jpg");
		b.setCantidadAdheridos(85);
		b.setGenero(genero);
		
		generoDao.guardarGenero(genero);
		
		bandasDao.guardarBandas(b);

		Session currentSession = sessionFactory.getCurrentSession();
		Bandas bandas2 = currentSession.get(Bandas.class, b.getId());
		Assert.assertNotNull(bandas2);
	}
	
	@Test
	@Transactional
	@Rollback(false)
	public void insertarBanda6() {
		
		Long id ;
		id = (long) 1;
		Genero genero = generoDao.traerUnGenero(id);
		
		Bandas b = new Bandas();
		b.setNombre("Metallica");
		b.setImagen("metalica.jpg");
		b.setCantidadAdheridos(150);
		b.setGenero(genero);
		
		generoDao.guardarGenero(genero);
		
		bandasDao.guardarBandas(b);

		Session currentSession = sessionFactory.getCurrentSession();
		Bandas bandas2 = currentSession.get(Bandas.class, b.getId());
		Assert.assertNotNull(bandas2);
	}
		
	@Test
	@Transactional
	@Rollback(false)
	public void insertarBanda7() {
		
		Long id ;
		id = (long) 1;
		Genero genero = generoDao.traerUnGenero(id);
			
		Bandas b = new Bandas();
		b.setNombre("System Of A Down");
		b.setImagen("systemofadown.jpg");
		b.setCantidadAdheridos(120);
		b.setGenero(genero);
		
		generoDao.guardarGenero(genero);
		
		bandasDao.guardarBandas(b);

		Session currentSession = sessionFactory.getCurrentSession();
		Bandas bandas2 = currentSession.get(Bandas.class, b.getId());
		Assert.assertNotNull(bandas2);
	}
		
	@Test
	@Transactional
	@Rollback(false)
	public void insertarBanda8() {
		
		Long id ;
		id = (long) 1;
		Genero genero = generoDao.traerUnGenero(id);
		
		Bandas b = new Bandas();
		b.setNombre("Iron Maiden");
		b.setImagen("ironmaiden.jpg");
		b.setCantidadAdheridos(100);
		b.setGenero(genero);
		
		generoDao.guardarGenero(genero);
		
		bandasDao.guardarBandas(b);

		Session currentSession = sessionFactory.getCurrentSession();
		Bandas bandas2 = currentSession.get(Bandas.class, b.getId());
		Assert.assertNotNull(bandas2);
	}
	
	@Test
	@Transactional
	@Rollback(false)
	public void insertarUsuario() {
		
		Usuario u = new Usuario();
		u.setUser("pepe");
		u.setPassword("1234");
		u.setAprobacion(1);	
		
		usuarioDao.guardarUsuario(u);

		Session currentSession = sessionFactory.getCurrentSession();
		Usuario usuario2 = currentSession.get(Usuario.class, u.getId());
		Assert.assertNotNull(usuario2);
	}
			
	@Test
	@Transactional
	@Rollback(false)
	public void insertarEventos() {
		
		Eventos evento1 = new Eventos();
		evento1.setNombre("Evento 1");
		evento1.setImagen("evento1.jpg");
		evento1.setCapacidad(500);
		evento1.setComienzo("22:30");
		evento1.setFecha("14/07/2017");
		eventosDao.guardarEvento(evento1);
		
		Eventos evento2 = new Eventos();
		evento2.setNombre("Evento 2");
		evento2.setImagen("evento2.jpg");
		evento2.setCapacidad(1000);
		evento2.setComienzo("00:00");
		evento2.setFecha("24/07/2017");
		eventosDao.guardarEvento(evento2);
		
		Eventos evento3 = new Eventos();
		evento3.setNombre("Evento 3");
		evento3.setImagen("evento3.jpg");
		evento3.setCapacidad(400);
		evento3.setComienzo("23:00");
		evento3.setFecha("31/07/2017");
		eventosDao.guardarEvento(evento3);

		Session currentSession = sessionFactory.getCurrentSession();
		Eventos evento = currentSession.get(Eventos.class, evento1.getId());
		Assert.assertNotNull(evento);
	}
	
	@Test
	@Transactional
	@Rollback(false)
	public void insertarEventoYAsignarBandas() {
		
		Eventos evento4 = new Eventos();
		evento4.setNombre("Evento 4");
		evento4.setImagen("evento4.jpg");
		evento4.setCapacidad(500);
		evento4.setComienzo("22:30");
		evento4.setFecha("14/07/2017");
		
		Set<Bandas> bandas = new HashSet<Bandas>();
			
		Long id ;
		id = (long) 1;
		Bandas banda1 = bandasDao.traerUnaBanda(id);
		
		bandas.add(banda1);
		
		Long id2 ;
		id2 = (long) 2;
		Bandas banda2 = bandasDao.traerUnaBanda(id2);
		
		bandas.add(banda2);
		
		Long id3 ;
		id3 = (long) 3;
		Bandas banda3 = bandasDao.traerUnaBanda(id3);
		
		bandas.add(banda3);
		
		
		evento4.setBandas(bandas);
		
		eventosDao.guardarEvento(evento4);

		

		Session currentSession = sessionFactory.getCurrentSession();
		Eventos evento = currentSession.get(Eventos.class, evento4.getId());
		Assert.assertNotNull(evento);
	}
	
	@Test
	@Transactional
	@Rollback(false)
	public void insertarEventoYAsignarLasMismasBandas() {
		
		Eventos evento = new Eventos();
		evento.setNombre("Evento 25");
		evento.setImagen("evento1.jpg");
		evento.setCapacidad(500);
		evento.setComienzo("22:30");
		evento.setFecha("14/07/2017");
		
		Set<Bandas> bandas = new HashSet<Bandas>();
			
		Long id ;
		id = (long) 1;
		Bandas banda1 = bandasDao.traerUnaBanda(id);
		
		bandas.add(banda1);
		
		Long id2 ;
		id2 = (long) 2;
		Bandas banda2 = bandasDao.traerUnaBanda(id2);
		
		bandas.add(banda2);
		
		Long id3 ;
		id3 = (long) 3;
		Bandas banda3 = bandasDao.traerUnaBanda(id3);
		
		bandas.add(banda3);
		
		
		evento.setBandas(bandas);
		
		eventosDao.guardarEvento(evento);

		

		Session currentSession = sessionFactory.getCurrentSession();
		Eventos eventox = currentSession.get(Eventos.class, evento.getId());
		Assert.assertNotNull(eventox);
	}
	
	@Test
	@Transactional
	@Rollback(false)
	public void insertarUsuarioYAdherirloABandas() {
		
		Usuario u = new Usuario();
		u.setUser("jmartinez");
		u.setPassword("1234");
		u.setAprobacion(1);
		
		Set<Bandas> bandas = new HashSet<Bandas>();
		
		Long id ;
		id = (long) 1;
		Bandas banda1 = bandasDao.traerUnaBanda(id);
		
		bandas.add(banda1);
		
		Long id2 ;
		id2 = (long) 2;
		Bandas banda2 = bandasDao.traerUnaBanda(id2);
		
		bandas.add(banda2);
		
		u.setBandas(bandas);
		
		usuarioDao.guardarUsuario(u);

		Session currentSession = sessionFactory.getCurrentSession();
		Usuario usuario2 = currentSession.get(Usuario.class, u.getId());
		Assert.assertNotNull(usuario2);
	}
	
}