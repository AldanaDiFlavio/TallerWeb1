package ar.edu.unlam.tallerweb1.controladores;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Bandas;
import ar.edu.unlam.tallerweb1.modelo.Eventos;
import ar.edu.unlam.tallerweb1.modelo.Usuario;
import ar.edu.unlam.tallerweb1.servicios.BandasService;
import ar.edu.unlam.tallerweb1.servicios.EventosService;
import ar.edu.unlam.tallerweb1.servicios.RegistroService;

@Controller
public class EventosController {
	
	@Inject
	private BandasService servicioBandas; 
	
	@Inject
	private EventosService servicioEventos; 
	
	@Inject
	private RegistroService servicioRegistro;
	
	@RequestMapping(path = "/eventos", method = RequestMethod.GET)
	public ModelAndView eventos() {
		ModelMap miMapa = new ModelMap();	
		
		List<Eventos> listaEventos = servicioEventos.traerListaEventos();
	
		miMapa.put("eventos", listaEventos);	
		ModelAndView modelAndView = new ModelAndView("eventos", miMapa);
		return modelAndView;	
	}
	
	@RequestMapping("/abmeventos")
	public ModelAndView altaEventos(){

		Eventos evento = new Eventos();
		ModelMap modelo = new ModelMap();
		
		List<Bandas> listaBandas = servicioBandas.traerListaBandas();		
		 	 
		modelo.put("bandas", listaBandas);
		modelo.put("evento", evento);
		return new ModelAndView("abmeventos", modelo);			
	}	
	
	@RequestMapping(path = "/validar-evento", method = RequestMethod.POST)
	public ModelAndView validarEvento(@ModelAttribute("evento") Eventos event){	 
			
		servicioEventos.guardarEvento(event);
		
		ModelMap modelo = new ModelMap();				
		return new ModelAndView("registrook", modelo);
	}
	
	@RequestMapping(path = "/infoeventos", method = RequestMethod.GET)
	public ModelAndView infoEventos(@RequestParam("id") Long id, HttpServletRequest request) {
		
		Eventos evento = servicioEventos.traerUnEvento(id);
		Integer capacidad = evento.getCapacidad();
		Integer cantactual = evento.getCantactual();
		
		ModelMap miMapa = new ModelMap();	

		miMapa.put("nombre", evento.getNombre());
		miMapa.put("imagen", evento.getImagen());
		miMapa.put("descripcion", evento.getDescripcion());
		miMapa.put("fecha", evento.getFecha());	
		miMapa.put("capacidad", evento.getCapacidad());		
		miMapa.put("comienzo", evento.getComienzo());			
		miMapa.put("evento", evento);	
		miMapa.put("bandasdelevento", evento.getBandas());
		
		
		if ( request.getSession().getAttribute("usuario") != null ){
			Usuario usuario = (Usuario)request.getSession().getAttribute("usuario");
			String User = usuario.getUser();
						
			boolean usuarioYaContenido = false;
			
		    usuarioYaContenido = servicioRegistro.consultarSiUsuarioPerteneceAEvento(User,id);

			if (usuarioYaContenido == true){
					miMapa.put("error", "YA SOLICITADO");
					return new ModelAndView("infoeventos", miMapa);
					}else{
						if(capacidad.equals(cantactual)){							
						miMapa.put("error", "AGOTADO");
						return new ModelAndView("infoeventos", miMapa);
						}else{
							ModelAndView modelAndView = new ModelAndView("infoeventos", miMapa);
							return modelAndView;
							}
					}
			}else{
				if (capacidad.equals(cantactual)){
					miMapa.put("error", "AGOTADO");
					ModelAndView modelAndView = new ModelAndView("infoeventos", miMapa);
					return modelAndView;	
				}else{
				ModelAndView modelAndView = new ModelAndView("infoeventos", miMapa);
				return modelAndView;
				}
			}
			
	}	
			
	@RequestMapping(path = "/solicitarEvento")
	public ModelAndView adherirseBandas(@RequestParam("id") Long id, HttpServletRequest request) {
			Eventos evento = servicioEventos.traerUnEvento(id);
			ModelMap miMapa = new ModelMap();
			Integer capacidad = evento.getCapacidad();
			Integer cantactual = evento.getCantactual();
			
		if ( request.getSession().getAttribute("usuario") != null ){
			Usuario usuario = (Usuario)request.getSession().getAttribute("usuario");
			String User = usuario.getUser();
			
			boolean usuarioYaContenido = false;
			
		    usuarioYaContenido = servicioRegistro.consultarSiUsuarioPerteneceAEvento(User,id);

			if (usuarioYaContenido == false){
				if (!(capacidad.equals(cantactual))){
					servicioRegistro.reservarUsuarioEnEvento(User,id);
					}else{
						miMapa.put("error", "AGOTADO");
						return new ModelAndView("infoeventos", miMapa);
					}
			}else{
				miMapa.put("error", "YA SOLICITADO");
				return new ModelAndView("infoeventos", miMapa);
			}
			
			Usuario UsuarioU = servicioRegistro.traerUnUsuarioPorUser(User);
			
			miMapa.put("ueventos", UsuarioU.getEventos());
			
		return new ModelAndView("misEventos", miMapa);
	}
		return new ModelAndView("redirect:/login");
	}

	@RequestMapping(path = "/mis-eventos", method = RequestMethod.GET)
	public ModelAndView misEventos(HttpServletRequest request) {
		
		if ( request.getSession().getAttribute("usuario") != null )
		{
			Usuario usuario = (Usuario)request.getSession().getAttribute("usuario");
			String User = usuario.getUser();
			
			ModelMap miMapa = new ModelMap();
			
			Usuario UsuarioC = servicioRegistro.traerUnUsuarioPorUser(User);
			
			miMapa.put("ueventos", UsuarioC.getEventos());			
			return new ModelAndView("misEventos", miMapa);
	}
		return new ModelAndView("redirect:/login");
	}
	
	@RequestMapping(path = "/desvinculardelevento")
	public ModelAndView desvincularDelEvento(@RequestParam("id") Long id, HttpServletRequest request) {
		
		if ( request.getSession().getAttribute("usuario") != null ){
			Usuario usuario = (Usuario)request.getSession().getAttribute("usuario");
			String User = usuario.getUser();
					
			servicioRegistro.desvincularUsuarioDelEvento(User,id);
			
			ModelMap miMapa = new ModelMap();
			
			Usuario UsuarioC = servicioRegistro.traerUnUsuarioPorUser(User);
			
			miMapa.put("ueventos", UsuarioC.getEventos());
			
		return new ModelAndView("misEventos", miMapa);
	}
		return new ModelAndView("redirect:/login");
	}
	
}
