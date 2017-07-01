package ar.edu.unlam.tallerweb1.servicios;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.UsuarioDao;
import ar.edu.unlam.tallerweb1.modelo.Usuario;

@Service("registroService")
@Transactional
public class RegistroServiceImpl implements RegistroService{

	@Inject
	private UsuarioDao registroDao;
	
	@Override
	public Usuario buscarUsuario(Usuario usuario) {
		return registroDao.buscarUsuario(usuario);
	}

	@Override
	public void guardarUsuario(Usuario usuario) {
		registroDao.guardarUsuario(usuario);
		
	}

	@Override
	public Usuario traerUnUsuario(Long id) {
		return registroDao.traerUnUsuario(id);
	}

	@Override
	public void editarUsuario(Usuario usuario) {
		registroDao.editarUsuario(usuario);		
	}

}
