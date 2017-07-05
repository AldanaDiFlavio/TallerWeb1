package ar.edu.unlam.tallerweb1.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import ar.edu.unlam.tallerweb1.modelo.Usuario;

@Service("usuarioDao")
public class UsuarioDaoImpl implements UsuarioDao {

	@Inject
    private SessionFactory sessionFactory;

	@Override
	public Usuario consultarUsuario(Usuario usuario) {

		final Session session = sessionFactory.getCurrentSession();
		
		return (Usuario) session.createCriteria(Usuario.class)
				.add(Restrictions.eq("user", usuario.getUser()))
				.add(Restrictions.eq("password", usuario.getPassword()))
				.add(Restrictions.eq("aprobacion", usuario.getAprobacion()))
				.uniqueResult();

	}

	@Override
	public void guardarUsuario(Usuario usuario) {
		final Session session = sessionFactory.getCurrentSession();
		session.save(usuario);		
	}

	@Override
	public Usuario buscarUsuario(Usuario usuario) {

		final Session session = sessionFactory.getCurrentSession();
		
		return (Usuario) session.createCriteria(Usuario.class)
				.add(Restrictions.eq("user", usuario.getUser()))
				.add(Restrictions.eq("password", usuario.getPassword()))
				.uniqueResult();

	}
	
	@Override
	public Usuario traerUnUsuarioPorUser(String user) {
		return (Usuario) ( sessionFactory.getCurrentSession()
				.createCriteria(Usuario.class)
				.add(Restrictions.eq("user", user))
				.uniqueResult());
	}

	@Override
	public void editarUsuario(Usuario usuario) {
		final Session session = sessionFactory.getCurrentSession();
		
		session.saveOrUpdate(usuario);		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> traerListaUsuario() {
		
		return( sessionFactory.getCurrentSession()
				.createCriteria(Usuario.class)
				.setFetchMode("usuarios_bandas", FetchMode.JOIN)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
				.list());	   
	}
	
	public void eliminarAdhesion(Usuario usuario) {

		final Session session = sessionFactory.getCurrentSession();
		
		Criteria crit = session.createCriteria(Usuario.class);
		crit.createAlias("bandas", "bandasAlias");
		crit.add(Restrictions.eq("bandasAlias.id", usuario.getId()));

	}
	
}
