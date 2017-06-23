package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Administrador;

@Controller
public class AdminController {
	
	@RequestMapping(path = "/panel-admin")
	public ModelAndView panelAdmin() {
		ModelMap model = new ModelMap();
		Administrador administrador = new Administrador();
		model.put("administrador", administrador);
		return new ModelAndView("administrador", model);
	}
}
