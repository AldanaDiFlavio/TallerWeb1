package ar.edu.unlam.tallerweb1.controladores;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Eventos;

@Controller
public class EventosController {
	
	@RequestMapping(path = "/eventos", method = RequestMethod.GET)
	public ModelAndView eventos() {
		ModelMap miMapa = new ModelMap();
		List<Eventos> eventos = new LinkedList<Eventos>();
		
		Eventos e1 = new Eventos();
		e1.setBanda("Babasónicos");
		e1.setImagen("images/eventos/evento1.jpg");
		e1.setLugar("Teatro Gran Rex");
		e1.setFecha("2017-05-12");
		eventos.add(e1);
		
		Eventos e2 = new Eventos();
		e2.setBanda("Rhapsody");
		e2.setImagen("images/eventos/evento2.jpg");
		e2.setLugar("Teatro Flores");
		e2.setFecha("2017-05-14");
		eventos.add(e2);
		
		Eventos e3 = new Eventos();
		e3.setBanda("La Beriso");
		e3.setImagen("images/eventos/evento3.jpg");
		e3.setLugar("Plaza de la música");
		e3.setFecha("2017-05-12");
		eventos.add(e3);
		
		Eventos e4 = new Eventos();
		e4.setBanda("No te va gustar");
		e4.setImagen("images/eventos/evento4.jpg");
		e4.setLugar("Estadio Belgrano");
		e4.setFecha("2017-05-12");
		eventos.add(e4);
		
		Eventos e5 = new Eventos();
		e5.setBanda("Carajo");
		e5.setImagen("images/eventos/evento5.jpg");
		e5.setLugar("Pinar de Rocha");
		e5.setFecha("2017-05-13");
		eventos.add(e5);
		
		Eventos e6 = new Eventos();
		e6.setBanda("La 25");
		e6.setImagen("images/eventos/evento6.jpg");
		e6.setLugar("GAP");
		e6.setFecha("2017-05-13");
		eventos.add(e6);
		
		Eventos e7 = new Eventos();
		e7.setBanda("Cabezones");
		e7.setImagen("images/eventos/evento7.jpg");
		e7.setLugar("Refugio Gernica");
		e7.setFecha("2017-05-12");
		eventos.add(e7);
		
		Eventos e8 = new Eventos();
		e8.setBanda("Los Cafres");
		e8.setImagen("images/eventos/evento8.jpg");
		e8.setLugar("AcercArte");
		e8.setFecha("2017-05-14");
		eventos.add(e8);

		miMapa.put("eventos", eventos);
		
		ModelAndView modelAndView = new ModelAndView("eventos", miMapa);
		return modelAndView;
	}
}
