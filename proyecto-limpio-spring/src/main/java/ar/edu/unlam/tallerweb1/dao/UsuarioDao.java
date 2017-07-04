package ar.edu.unlam.tallerweb1.dao;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Usuario;

public interface UsuarioDao {
	
	Usuario consultarUsuario (Usuario usuario);
	
	void guardarUsuario(Usuario usuario);
	
	Usuario buscarUsuario(Usuario usuario);
	
	Usuario traerUnUsuarioPorUser(String user);

	void editarUsuario(Usuario usuario);

	List<Usuario> traerListaUsuario();
}
