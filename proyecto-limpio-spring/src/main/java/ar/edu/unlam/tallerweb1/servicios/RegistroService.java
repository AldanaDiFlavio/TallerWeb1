package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Usuario;

public interface RegistroService {

	Usuario buscarUsuario(Usuario usuario);
	
	void guardarUsuario(Usuario usuario);
	
	Usuario traerUnUsuarioPorUser(String User);
	
	void adherirUsuarioABanda(String user, Long id);
	
	void editarUsuario(Usuario usuario);
	
	void eliminarAdhesion(Usuario usuario);
	
	List<Usuario> traerListaUsuario();

	void desadherirUsuarioABanda(String user, Long id);

	void reservarUsuarioEnEvento(String user, Long id);

	void desvincularUsuarioDelEvento(String user, Long id);

	boolean consultarSiUsuarioPerteneceAEvento(String user, Long id);

	boolean consultarSiUsuarioEstaAdheridoAUnaBanda(String user, Long id);
}
