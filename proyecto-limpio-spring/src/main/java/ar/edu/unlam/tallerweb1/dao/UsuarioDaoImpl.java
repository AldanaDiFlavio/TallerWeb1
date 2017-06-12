package ar.edu.unlam.tallerweb1.dao;

import javax.inject.Inject;

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
				.uniqueResult();

	}

	@Override
	public void guardarUsuario(Usuario usuario) {
		final Session session = sessionFactory.getCurrentSession();
		session.save(usuario);		
	}

}