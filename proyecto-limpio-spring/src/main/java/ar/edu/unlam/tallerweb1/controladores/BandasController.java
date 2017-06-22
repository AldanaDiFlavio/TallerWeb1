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
import ar.edu.unlam.tallerweb1.servicios.AlbumService;
import ar.edu.unlam.tallerweb1.servicios.BandasService;
import ar.edu.unlam.tallerweb1.servicios.TemaService;

@Controller
public class BandasController {
	
	@Inject
	private BandasService servicioBandas; 
	
	@Inject
	private AlbumService servicioAlbum; 
	
	@Inject
	private TemaService servicioTema; 
	
	@RequestMapping(path = "/bandas", method = RequestMethod.GET)
	public ModelAndView bandas() {
		ModelMap miMapa = new ModelMap();	
		List<Bandas> listaBandas = servicioBandas.traerListaBandas();

		miMapa.put("bandas", listaBandas);	
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
	
}
