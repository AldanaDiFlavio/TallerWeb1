package ar.edu.unlam.tallerweb1.controladores;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Usuario;
import ar.edu.unlam.tallerweb1.servicios.ServicioLogin;

@Controller
public class LoginController {
	
	@Inject
	private ServicioLogin servicioLogin;
	
	public ServicioLogin getServicioLogin() {
		return servicioLogin;
	}

	public void setServicioLogin(ServicioLogin servicioLogin) {
		this.servicioLogin = servicioLogin;
	}
	
	@RequestMapping(path = "/login")
	public ModelAndView Login() {
		ModelMap model = new ModelMap();
		Usuario usuario = new Usuario();
		model.put("usuario", usuario);
		return new ModelAndView("login", model);
	}
	
	@RequestMapping(path = "/validar-login", method = RequestMethod.POST)
	public ModelAndView validarLogin(@ModelAttribute("usuario") Usuario usuario, HttpServletRequest request, HttpServletResponse response) {
		ModelMap model = new ModelMap();
		Usuario user = servicioLogin.consultarUsuario(usuario);
		
		if (user != null) {
			request.getSession().setAttribute("usuario", usuario);
			return new ModelAndView("dashboard");
		} else {
			model.put("error", "Error al ingresar los datos. Intente nuevamente.");
			
		}
		return new ModelAndView("redirect:/login", model);
	}
	
	@RequestMapping("/cerrarSesion")
	protected ModelAndView cerrarSesion(HttpServletRequest request){
		request.getSession().removeAttribute("usuario");
		return new ModelAndView("redirect:/login");
	}

}
