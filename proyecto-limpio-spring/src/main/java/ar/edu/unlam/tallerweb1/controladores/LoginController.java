package ar.edu.unlam.tallerweb1.controladores;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Administrador;
import ar.edu.unlam.tallerweb1.modelo.Usuario;
import ar.edu.unlam.tallerweb1.servicios.ServicioLogin;

@Controller
public class LoginController {
	
	@Inject
	private ServicioLogin servicioLogin;
	
	@RequestMapping(path = "/login")
	public ModelAndView Login() {
		ModelMap model = new ModelMap();
		Usuario usuario = new Usuario();
		model.put("usuario", usuario);
		return new ModelAndView("login", model);
	}
	
	@RequestMapping(path = "/validar-login", method = RequestMethod.POST)
	public ModelAndView validarLogin(@ModelAttribute("usuario") Usuario usuario, Administrador administrador) {
		ModelMap model = new ModelMap();
		
		//Verificar el usuario
		if (servicioLogin.consultarUsuario(usuario) != null) {
			model.put("user", usuario.getUser());
			model.put("password", usuario.getPassword());
			model.put("aprobacion", usuario.getAprobacion());
			return new ModelAndView("panelUser", model);
		} else if (servicioLogin.consultarAdministrador(administrador) != null){
			model.put("user", administrador.getUser());
			model.put("password", administrador.getPassword());
			return new ModelAndView("panelAdmin", model);
		} else {
			model.put("error", "Error al ingresar los datos. Intente nuevamente.");
		}
		return new ModelAndView("login", model);
	}

}
