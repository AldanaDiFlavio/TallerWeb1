package ar.edu.unlam.tallerweb1.controladores;

import javax.inject.Inject;

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
	
	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public ModelAndView Login() {
		ModelMap model = new ModelMap();
		Usuario usuario = new Usuario();
		model.put("usuario", usuario);
		return new ModelAndView("login", model);
	}
	
	
	@RequestMapping(path = "/home", method = RequestMethod.POST)
	public ModelAndView ingresarUsuario(@ModelAttribute("usuario") Usuario usuario) {
		ModelMap model = new ModelMap();
		model.put("user", usuario.getUser());
		model.put("password", usuario.getPassword());
		return new ModelAndView("home", model);
	}
	

	
	@RequestMapping(path = "/validar-login", method = RequestMethod.POST)
	public ModelAndView validarLogin(@ModelAttribute("usuario") Usuario usuario) {
		ModelMap model = new ModelMap();

		if (servicioLogin.consultarUsuario(usuario) != null) {
			return new ModelAndView("redirect:/home");
		} else {
			model.put("error", "Usuario o clave incorrecta");
		}
		return new ModelAndView("login", model);
	}
}
