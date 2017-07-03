package ar.edu.unlam.tallerweb1.servicios;

import java.util.HashSet;

import java.util.Set;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.UsuarioDao;
import ar.edu.unlam.tallerweb1.modelo.Bandas;
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
	public Usuario traerUnUsuarioPorUser(String User) {
		return registroDao.traerUnUsuarioPorUser(User);
	}
	
	@Override
	public void editarUsuario(Usuario usuario) {
		registroDao.editarUsuario(usuario);		
	}

	@Override
	public void adherirUsuarioABanda(String user, Bandas banda) {
		Usuario usuarioCompleto = traerUnUsuarioPorUser(user);
		
		Set<Bandas> bandas = new HashSet<Bandas>();
	//	List<Bandas> bandas = new ArrayList<Bandas>();
		
		bandas.add(banda);
		
		Set<Bandas> bandasquetiene = usuarioCompleto.getBandas();
	//	List<Bandas> bandasquetiene = usuarioCompleto.getBandas();
		bandasquetiene.addAll(bandas);
		
		usuarioCompleto.setBandas(bandasquetiene);
		
		editarUsuario(usuarioCompleto);		
	}
}
