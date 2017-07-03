package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.modelo.Bandas;
import ar.edu.unlam.tallerweb1.modelo.Usuario;

public interface RegistroService {

	Usuario buscarUsuario(Usuario usuario);
	
	void guardarUsuario(Usuario usuario);
	
	Usuario traerUnUsuarioPorUser(String User);
	
	void adherirUsuarioABanda(String user, Bandas banda);
	
	void editarUsuario(Usuario usuario);
}
