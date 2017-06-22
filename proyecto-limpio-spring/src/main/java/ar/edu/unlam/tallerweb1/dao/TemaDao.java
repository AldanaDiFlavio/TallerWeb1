package ar.edu.unlam.tallerweb1.dao;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Tema;

public interface TemaDao {

	List<Tema> traerUnTema(Long id);

	void guardarTemaConLista(List<Tema> temas);
	
	void guardarTema(Tema tema);
}
