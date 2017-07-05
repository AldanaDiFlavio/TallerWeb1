package ar.edu.unlam.tallerweb1.servicios;

import java.util.HashSet;
import java.util.List;
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
	
	@Inject
	private BandasService servicioBandas;
	
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
	public void adherirUsuarioABanda(String user, Long id) {
		
		Usuario usuarioCompleto = traerUnUsuarioPorUser(user);
		
		Bandas banda = servicioBandas.traerUnaBanda(id);
		
		Set<Bandas> bandas = new HashSet<Bandas>();
	//	List<Bandas> bandas = new ArrayList<Bandas>();
		
		bandas.add(banda);
		
		Set<Bandas> bandasquetiene = usuarioCompleto.getBandas();
	//	List<Bandas> bandasquetiene = usuarioCompleto.getBandas();
		bandasquetiene.addAll(bandas);
		
		usuarioCompleto.setBandas(bandasquetiene);
		
		editarUsuario(usuarioCompleto);	
		
		Integer cantadh = banda.getCantidadAdheridos();
		cantadh = cantadh + 1; 
		banda.setCantidadAdheridos(cantadh);
		
		servicioBandas.editarBanda(banda);
	}

	@Override
	public List<Usuario> traerListaUsuario() {
		return registroDao.traerListaUsuario();
	}

	@Override
	public void eliminarAdhesion(Usuario usuario) {
		registroDao.eliminarAdhesion(usuario);		
	}

	@Override
	public void desadherirUsuarioABanda(String user, Long id) {
		
		Bandas banda = servicioBandas.traerUnaBanda(id);
		
		Usuario usuarioCompleto = traerUnUsuarioPorUser(user);
			
		Set<Bandas> bandasquetiene = usuarioCompleto.getBandas();
		
		bandasquetiene.remove(banda);
		
		usuarioCompleto.setBandas(bandasquetiene);
				
		editarUsuario(usuarioCompleto);	
		
		Integer cantadh = banda.getCantidadAdheridos();
		cantadh = cantadh - 1; 
		banda.setCantidadAdheridos(cantadh);
		
		servicioBandas.editarBanda(banda);
		
	}
}
