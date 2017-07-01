package ar.edu.unlam.tallerweb1.controladores;


import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Usuario;
import ar.edu.unlam.tallerweb1.servicios.ServicioLogin;

public class LoginControllerTest {
	
	@Inject
	private ServicioLogin servicioLoginFake;
	@Test
	public  void validarLoginUsuario() {
		Usuario usuarioFake = mock(Usuario.class);
		servicioLoginFake = mock(ServicioLogin.class);
		HttpServletRequest requestFake = mock(HttpServletRequest.class);
		HttpSession sessionFake = mock(HttpSession.class);
		LoginController loginControllerFake = new LoginController();
		
		when(servicioLoginFake.consultarUsuario(usuarioFake)).thenReturn(usuarioFake);
		when(requestFake.getSession()).thenReturn(sessionFake);
		
		loginControllerFake.setServicioLogin(servicioLoginFake);
		ModelAndView mv = loginControllerFake.validarLogin(usuarioFake, requestFake);

assertThat(mv.getViewName()).isEqualTo("dashboard");
}
	
}
