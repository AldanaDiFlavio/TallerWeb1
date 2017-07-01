package ar.edu.unlam.tallerweb1.controladores;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Album;
import ar.edu.unlam.tallerweb1.modelo.Tema;
import ar.edu.unlam.tallerweb1.modelo.Bandas;
import ar.edu.unlam.tallerweb1.modelo.Genero;
import ar.edu.unlam.tallerweb1.servicios.AlbumService;
import ar.edu.unlam.tallerweb1.servicios.BandasService;
import ar.edu.unlam.tallerweb1.servicios.GeneroService;
import ar.edu.unlam.tallerweb1.servicios.TemaService;

@Controller
public class BandasController {
	
	@Inject
	private BandasService servicioBandas; 
	
	@Inject
	private AlbumService servicioAlbum; 
	
	@Inject
	private TemaService servicioTema; 
	
	@Inject
	private GeneroService servicioGenero; 
	
	@RequestMapping(path = "/bandas", method = RequestMethod.GET)
	public ModelAndView bandas() {
		ModelMap miMapa = new ModelMap();	
		List<Bandas> listaBandas = servicioBandas.traerListaBandas();
		List<Genero> listaGenero = servicioGenero.traerListaGenero();

		List<Bandas> cantbanxgen = servicioBandas.CantidadBandasPorGenero();
		
		miMapa.put("genero", listaGenero);	
		miMapa.put("bandas", listaBandas);	
		miMapa.put("cantidad", cantbanxgen);
		ModelAndView modelAndView = new ModelAndView("bandas", miMapa);
		return modelAndView;
	}
	
	@RequestMapping(value="/infobandas")
	public ModelAndView mostrarAlbum(@RequestParam("id") Long id){
		
		List<Album> album = servicioAlbum.traerAlbumesDeUnaBanda(id);

		ModelMap miMapa = new ModelMap();
			
		miMapa.put("album", album);	
		ModelAndView modelAndView = new ModelAndView("infobandas", miMapa);
		return modelAndView;
	}
	
	@RequestMapping(value="/escucharalbum")
	public ModelAndView mostrarEscucharUnAlbum(@RequestParam("id") Long id){
		
		List<Tema> tema = servicioTema.traerUnTema(id);

		ModelMap miMapa = new ModelMap();
			
		miMapa.put("tema", tema);	
		ModelAndView modelAndView = new ModelAndView("escucharalbum", miMapa);
		return modelAndView;
	}

	public void setServicioAlbum(AlbumService servicioAlbum) {
		this.servicioAlbum = servicioAlbum;
	}	
	
	@RequestMapping(value="/generob")
	public ModelAndView mostrarBandaxGenero(@RequestParam("id") Long id){
		
		List<Genero> listaGenero = servicioGenero.traerListaGenero();

	//	List<Bandas> cantbanxgen = servicioBandas.CantidadBandasPorGenero();
		
		List<Bandas> bandas = servicioBandas.traerBandaGeneroRockNacional(id);
		Long Cant = (long) bandas.size();
		
	//	List<Bandas> listaGeneroB  = (List<Bandas>) bandas.get(0).getGenero();		
		
		ModelMap miMapa = new ModelMap();
			
		miMapa.put("bandas", bandas);	
		miMapa.put("genero", listaGenero);	
		miMapa.put("cantidad", Cant);
		ModelAndView modelAndView = new ModelAndView("bandas", miMapa);
		return modelAndView;
	}
	
	@RequestMapping(path = "/mis-bandas", method = RequestMethod.GET)
	public ModelAndView misBandas() {
		ModelMap miMapa = new ModelMap();	
		//cambiar traerListaBandas por BandasALasQueMeAdheri()
		List<Bandas> listaBandas = servicioBandas.traerListaBandas();
		
	//	List<Genero> genero = listaBandas.get(1).getListaGenero();
		
	//	miMapa.put("genero", genero);	
		miMapa.put("bandas", listaBandas);	
		ModelAndView modelAndView = new ModelAndView("misBandas", miMapa);
		return modelAndView;
	}
	
}
