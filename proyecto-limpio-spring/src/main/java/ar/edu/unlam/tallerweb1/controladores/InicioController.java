package ar.edu.unlam.tallerweb1.controladores;

import java.util.LinkedList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Bandas;
import ar.edu.unlam.tallerweb1.modelo.Eventos;
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

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public ModelAndView Inicio() {

		return new ModelAndView("redirect:/home");
	}

	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public ModelAndView bandasRecomendadas() {
		ModelMap miMapa = new ModelMap();
		miMapa.put("bandas", this.buscarBandas());
		miMapa.put("eventos", this.buscarEventos());
		ModelAndView modelAndView = new ModelAndView("home", miMapa);
		return modelAndView;
	}

	public List<Bandas> buscarBandas() {
		List<Bandas> bandas = new LinkedList<Bandas>();

		Bandas b1 = new Bandas();
		b1.setNombre("La Beriso");
		b1.setImagen("images/bandas/banda1.jpg");
		b1.setGenero("Rock Nacional");
		b1.setCantidadAdeheridos(70);
		bandas.add(b1);

		Bandas b2 = new Bandas();
		b2.setNombre("Callejeros");
		b2.setImagen("images/bandas/banda2.jpg");
		b1.setGenero("Rock Nacional");
		b2.setCantidadAdeheridos(130);
		bandas.add(b2);

		Bandas b3 = new Bandas();
		b3.setNombre("La Renga");
		b3.setImagen("images/bandas/banda3.jpg");
		b1.setGenero("Rock Nacional");
		b3.setCantidadAdeheridos(135);
		bandas.add(b3);

		Bandas b4 = new Bandas();
		b4.setNombre("Cielo Razzo");
		b4.setImagen("images/bandas/banda4.jpg");
		b1.setGenero("Rock Nacional");
		b4.setCantidadAdeheridos(80);
		bandas.add(b4);

		Bandas b5 = new Bandas();
		b5.setNombre("AC DC");
		b5.setImagen("images/bandas/banda5.jpg");
		b1.setGenero("Rock Internacional");
		b5.setCantidadAdeheridos(85);
		bandas.add(b5);

		Bandas b6 = new Bandas();
		b6.setNombre("Metallica");
		b6.setImagen("images/bandas/banda6.jpg");
		b1.setGenero("Rock Internacional");
		b6.setCantidadAdeheridos(150);
		bandas.add(b6);

		Bandas b7 = new Bandas();
		b7.setNombre("System Of A Down");
		b7.setImagen("images/bandas/banda7.jpg");
		b1.setGenero("Rock Internacional");
		b7.setCantidadAdeheridos(120);
		bandas.add(b7);

		Bandas b8 = new Bandas();
		b8.setNombre("Iron Maiden");
		b8.setImagen("images/bandas/banda8.jpg");
		b1.setGenero("Rock Internacional");
		b8.setCantidadAdeheridos(100);
		bandas.add(b8);

		return bandasService.bandasRecomendadas(bandas);

	}

	public List<Eventos> buscarEventos() {
		List<Eventos> eventos = new LinkedList<Eventos>();

		Eventos e1 = new Eventos();
		e1.setBanda("Babasónicos");
		e1.setImagen("images/eventos/evento1.jpg");
		e1.setLugar("Teatro Gran Rex");
		e1.setFecha("2017-05-12");
		e1.setCantidadAsistencias(150);
		eventos.add(e1);

		Eventos e2 = new Eventos();
		e2.setBanda("Rhapsody");
		e2.setImagen("images/eventos/evento2.jpg");
		e2.setLugar("Teatro Flores");
		e2.setFecha("2017-05-14");
		e2.setCantidadAsistencias(196);
		eventos.add(e2);

		Eventos e3 = new Eventos();
		e3.setBanda("La Beriso");
		e3.setImagen("images/eventos/evento3.jpg");
		e3.setLugar("Plaza de la música");
		e3.setFecha("2017-05-12");
		e3.setCantidadAsistencias(250);
		eventos.add(e3);

		Eventos e4 = new Eventos();
		e4.setBanda("No te va gustar");
		e4.setImagen("images/eventos/evento4.jpg");
		e4.setLugar("Estadio Belgrano");
		e4.setFecha("2017-05-12");
		e4.setCantidadAsistencias(305);
		eventos.add(e4);

		Eventos e5 = new Eventos();
		e5.setBanda("Carajo");
		e5.setImagen("images/eventos/evento5.jpg");
		e5.setLugar("Pinar de Rocha");
		e5.setFecha("2017-05-13");
		e5.setCantidadAsistencias(86);
		eventos.add(e5);

		Eventos e6 = new Eventos();
		e6.setBanda("La 25");
		e6.setImagen("images/eventos/evento6.jpg");
		e6.setLugar("GAP");
		e6.setFecha("2017-05-13");
		e6.setCantidadAsistencias(300);
		eventos.add(e6);

		Eventos e7 = new Eventos();
		e7.setBanda("Cabezones");
		e7.setImagen("images/eventos/evento7.jpg");
		e7.setLugar("Refugio Gernica");
		e7.setFecha("2017-05-12");
		e7.setCantidadAsistencias(431);
		eventos.add(e7);

		Eventos e8 = new Eventos();
		e8.setBanda("Los Cafres");
		e8.setImagen("images/eventos/evento8.jpg");
		e8.setLugar("AcercArte");
		e8.setFecha("2017-05-14");
		e8.setCantidadAsistencias(500);
		eventos.add(e8);

		return eventosService.eventosRecomendados(eventos);
	}

}
