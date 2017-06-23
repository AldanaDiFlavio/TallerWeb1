package ar.edu.unlam.tallerweb1.dao;

import ar.edu.unlam.tallerweb1.modelo.Administrador;

public interface AdministradorDao {

	Administrador consultarAdministrador(Administrador administrador);

	void guardarAdministrador(Administrador administrador);

}
