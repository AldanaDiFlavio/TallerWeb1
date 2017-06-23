package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Usuario;

@Controller
public class PerfilController {
	@RequestMapping("/perfil")
	public ModelAndView Perfil() {
		ModelMap model = new ModelMap();
		Usuario usuario = new Usuario();
		model.put("nombre", usuario.getNombreCompleto());
		model.put("user", usuario.getUser());
		model.put("passowrd", usuario.getPassword());
		model.put("aprobacion", usuario.getAprobacion());
		return new ModelAndView("perfil", model);
	}
}
