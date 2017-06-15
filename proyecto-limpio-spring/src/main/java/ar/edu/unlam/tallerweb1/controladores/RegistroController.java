package ar.edu.unlam.tallerweb1.controladores;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Usuario;
import ar.edu.unlam.tallerweb1.servicios.RegistroService;


@Controller
public class RegistroController {	
	
	@Inject
	private RegistroService registroService;
	
	@RequestMapping(path = "/registro")
	public ModelAndView Registro() {
		ModelMap model = new ModelMap();
		Usuario usuario = new Usuario();
		model.put("usuario", usuario);
		return new ModelAndView("registro", model);
	}
	
	@RequestMapping(path = "/validar-registro", method = RequestMethod.POST)
	public ModelAndView validarRegistro(@ModelAttribute("usuario") Usuario usuario){
		ModelMap model = new ModelMap();
		
		if (registroService.buscarUsuario(usuario) != null){
			model.put("error", "El usuario se encuentra registrado!");
			return new ModelAndView("registro", model);
		}
		else{
			registroService.guardarUsuario(usuario);
			model.put("nuevoUsuario", usuario);
			return new ModelAndView("login", model);
		}
		
	}	
}
