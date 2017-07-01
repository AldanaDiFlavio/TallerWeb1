package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.modelo.Usuario;

public interface RegistroService {

	Usuario buscarUsuario(Usuario usuario);
	void guardarUsuario(Usuario usuario);
	Usuario traerUnUsuario(Long id);
	void editarUsuario(Usuario usuario);
}
