package ar.edu.unlam.tallerweb1.controladores;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DashboardController {
	
	
	@RequestMapping("/dashboard")
	public ModelAndView Dashboard(HttpServletRequest request) {
		
		if( request.getSession().getAttribute("usuario") != null)
			return new ModelAndView("dashboard");
		
		return new ModelAndView("redirect:/login");
	}
	
	@RequestMapping("/notificaciones")
	public ModelAndView Notificaciones(HttpServletRequest request) {
		
		if( request.getSession().getAttribute("usuario") != null)
			return new ModelAndView("notificaciones");
		
		return new ModelAndView("redirect:/login");
	}
}
