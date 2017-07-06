package ar.edu.unlam.tallerweb1.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Bandas;
import ar.edu.unlam.tallerweb1.servicios.BandasService;
import ar.edu.unlam.tallerweb1.servicios.EventosService;

@Controller
public class InicioController {

	@Inject
	private BandasService bandasService;

	@Inject
	private EventosService eventosService;
	

	@RequestMapping("/home")
	public ModelAndView Index() {		
		return new ModelAndView("home");
	}
	
	@RequestMapping("/contacto")
	public ModelAndView Contacto() {
		return new ModelAndView("contacto");
	}

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public ModelAndView Inicio() {

		return new ModelAndView("redirect:/home");
	}

	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public ModelAndView BandasyEventos() {
		ModelMap miMapa = new ModelMap();
		List<Bandas> listaB = new ArrayList<Bandas>();
		miMapa.put("bandas", bandasService.bandasRecomendadas(listaB));
		//no funca aca tiene problemas con la propeidad banda, dice que no la encuentra
		//queria mostras los eventos proximos apartir de la fecha actual
		//pero en el dao implement no se como sacar la fecha de hoy
		miMapa.put("eventos", eventosService.traerEventosProximosACompletarse());
		ModelAndView modelAndView = new ModelAndView("home", miMapa);
		return modelAndView;
	}
}
