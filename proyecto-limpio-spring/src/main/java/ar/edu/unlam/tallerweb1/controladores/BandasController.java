package ar.edu.unlam.tallerweb1.controladores;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Bandas;

@Controller
public class BandasController {
	
	@RequestMapping(path = "/bandas", method = RequestMethod.GET)
	public ModelAndView bandas() {
		ModelMap miMapa = new ModelMap();
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
		
		miMapa.put("bandas", bandas);
		
		ModelAndView modelAndView = new ModelAndView("bandas", miMapa);
		return modelAndView;
	}
	
}
