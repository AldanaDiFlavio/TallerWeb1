package ar.edu.unlam.tallerweb1.controladores;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Album;
import ar.edu.unlam.tallerweb1.modelo.Bandas;
import ar.edu.unlam.tallerweb1.modelo.Genero;
import ar.edu.unlam.tallerweb1.modelo.Tema;
import ar.edu.unlam.tallerweb1.modelo.Usuario;
import ar.edu.unlam.tallerweb1.servicios.AlbumService;
import ar.edu.unlam.tallerweb1.servicios.BandasService;
import ar.edu.unlam.tallerweb1.servicios.GeneroService;
import ar.edu.unlam.tallerweb1.servicios.RegistroService;
import ar.edu.unlam.tallerweb1.servicios.TemaService;

@Controller
public class BandasController {
	
	@Inject
	private BandasService servicioBandas; 
	
	@Inject
	private AlbumService servicioAlbum; 
	
	@Inject
	private TemaService servicioTema; 
	
	@Inject
	private GeneroService servicioGenero; 
	
	@Inject
	private RegistroService servicioRegistro;
	
	@RequestMapping(path = "/bandas", method = RequestMethod.GET)
	public ModelAndView bandas(HttpServletRequest request) {
		
		ModelMap miMapa = new ModelMap();	
		
		if ( request.getSession().getAttribute("usuario") != null )
		{
			Usuario usuario = (Usuario)request.getSession().getAttribute("usuario");
			String User = usuario.getUser();
			
			Usuario UsuarioC = servicioRegistro.traerUnUsuarioPorUser(User);
			
			List<Bandas> listaBUser = servicioBandas.traerEnListaBandasDeUsuario(UsuarioC.getBandas());
			
			miMapa.put("uadherido", listaBUser);
		}	
	
		List<Bandas> listaBandas = servicioBandas.traerListaBandas();
		List<Genero> listaGenero = servicioGenero.traerListaGenero();

		List<Bandas> cantbanxgen = servicioBandas.CantidadBandasPorGenero();
		
		int cantidadentotal = listaBandas.size();
		
		miMapa.put("cantidadentotal", cantidadentotal);	
		miMapa.put("genero", listaGenero);	
		miMapa.put("bandas", listaBandas);	
		miMapa.put("cantidad", cantbanxgen);
		ModelAndView modelAndView = new ModelAndView("bandas", miMapa);
		return modelAndView;
	}
	
	@RequestMapping(value="/infobandas")
	public ModelAndView mostrarAlbum(@RequestParam("id") Long id, HttpServletRequest request){
	
		Bandas banda = servicioBandas.traerUnaBanda(id);
		
		List<Album> album = servicioAlbum.traerAlbumesDeUnaBanda(id);

		ModelMap miMapa = new ModelMap();
		
		miMapa.put("banda", banda);	
		miMapa.put("album", album);	
		
		if ( request.getSession().getAttribute("usuario") != null ){
			Usuario usuario = (Usuario)request.getSession().getAttribute("usuario");
			String User = usuario.getUser();
						
			boolean usuarioYaAdherido = false;
			
			usuarioYaAdherido = servicioRegistro.consultarSiUsuarioEstaAdheridoAUnaBanda(User,id);

			if (usuarioYaAdherido == true){
					miMapa.put("error", "Estas adherido");
					return new ModelAndView("infobandas", miMapa);
					}else{	
						ModelAndView modelAndView = new ModelAndView("infobandas", miMapa);
						return modelAndView;
					}
		}
		ModelAndView modelAndView = new ModelAndView("infobandas", miMapa);
		return modelAndView;
		}
	
	@RequestMapping(value="/escucharalbum")
	public ModelAndView mostrarEscucharUnAlbum(@RequestParam("id") Long id){
		
		List<Tema> tema = servicioTema.traerUnTema(id);

		ModelMap miMapa = new ModelMap();
			
		miMapa.put("tema", tema);	
		ModelAndView modelAndView = new ModelAndView("escucharalbum", miMapa);
		return modelAndView;
	}

	public void setServicioAlbum(AlbumService servicioAlbum) {
		this.servicioAlbum = servicioAlbum;
	}	
	
	@RequestMapping(value="/generob")
	public ModelAndView mostrarBandaxGenero(@RequestParam("id") Long id){
		List<Bandas> listaBandas = servicioBandas.traerListaBandas();
		
		List<Genero> listaGenero = servicioGenero.traerListaGenero();

	//	List<Bandas> cantbanxgen = servicioBandas.CantidadBandasPorGenero();
		
		List<Bandas> bandas = servicioBandas.traerBandaGeneroRockNacional(id);
		Long Cant = (long) bandas.size();
		
	//	List<Bandas> listaGeneroB  = (List<Bandas>) bandas.get(0).getGenero();		
		
		ModelMap miMapa = new ModelMap();
		
		int cantidadentotal = listaBandas.size();
		
		miMapa.put("cantidadentotal", cantidadentotal);	
		miMapa.put("bandas", bandas);	
		miMapa.put("genero", listaGenero);	
		miMapa.put("cantidad", Cant);
		ModelAndView modelAndView = new ModelAndView("bandas", miMapa);
		return modelAndView;
	}
	
	@RequestMapping(path = "/mis-bandas", method = RequestMethod.GET)
	public ModelAndView misBandas(HttpServletRequest request) {
		
		if ( request.getSession().getAttribute("usuario") != null )
		{
			Usuario usuario = (Usuario)request.getSession().getAttribute("usuario");
			String User = usuario.getUser();
			
			ModelMap miMapa = new ModelMap();
			
			Usuario UsuarioC = servicioRegistro.traerUnUsuarioPorUser(User);
			
			miMapa.put("ubandas", UsuarioC.getBandas());			
			return new ModelAndView("misBandas", miMapa);
	}
		return new ModelAndView("redirect:/login");
	}
		
	@RequestMapping(path = "/adherirse-bandas")
	public ModelAndView adherirseBandas(@RequestParam("id") Long id, HttpServletRequest request) {
		
		if ( request.getSession().getAttribute("usuario") != null ){
			Usuario usuario = (Usuario)request.getSession().getAttribute("usuario");
			String User = usuario.getUser();
						
			servicioRegistro.adherirUsuarioABanda(User,id);
			
			ModelMap miMapa = new ModelMap();
			
			Usuario UsuarioC = servicioRegistro.traerUnUsuarioPorUser(User);
			
			miMapa.put("ubandas", UsuarioC.getBandas());
			
		return new ModelAndView("misBandas", miMapa);
	}
		return new ModelAndView("redirect:/login");
	}
	
	@RequestMapping(path = "/desadherirse")
	public ModelAndView desadherirseBandas(@RequestParam("id") Long id, HttpServletRequest request) {
		
		if ( request.getSession().getAttribute("usuario") != null ){
			Usuario usuario = (Usuario)request.getSession().getAttribute("usuario");
			String User = usuario.getUser();
					
			servicioRegistro.desadherirUsuarioABanda(User,id);
			
			ModelMap miMapa = new ModelMap();
			
			Usuario UsuarioC = servicioRegistro.traerUnUsuarioPorUser(User);
			
			miMapa.put("ubandas", UsuarioC.getBandas());
			
		return new ModelAndView("misBandas", miMapa);
	}
		return new ModelAndView("redirect:/login");
	}
}
