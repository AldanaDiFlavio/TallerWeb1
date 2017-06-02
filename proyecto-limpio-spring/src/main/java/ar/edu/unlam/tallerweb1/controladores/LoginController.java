package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Usuario;

@Controller
public class LoginController {

	
	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public ModelAndView Login() {
		ModelMap model = new ModelMap();
		Usuario usuario = new Usuario();
		model.put("usuario", usuario);
		return new ModelAndView("login", model);
	}
	//validacion del login
	/*@RequestMapping(path = "/validar-login", method = RequestMethod.POST)
	public ModelAndView validarLogin(@ModelAttribute("usuario") Usuario usuario) {
		ModelMap model = new ModelMap();
		//Logica de negocio en Servicio
		
		if (servicioLogin.consultarUsuario(usuario) == true){
			return new ModelAndView("home", model);
		}
		else{
			model.put("error", "Email o Contraseña Incorrecta.");
			return new ModelAndView("loginUsuario", model);
		}
	}*/
	@RequestMapping(path = "/home", method = RequestMethod.POST)
	public ModelAndView ingresarUsuario(@ModelAttribute("usuario") Usuario usuario) {
		ModelMap model = new ModelMap();
		model.put("user", usuario.getUser());
		model.put("password", usuario.getPassword());
		return new ModelAndView("home", model);
	}
}
