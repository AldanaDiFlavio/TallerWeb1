package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.modelo.Administrador;
import ar.edu.unlam.tallerweb1.modelo.Usuario;

public interface ServicioLogin {
	
	Usuario consultarUsuario(Usuario usuario);

	Administrador consultarAdministrador(Administrador administrador);
}
