package ar.edu.unlam.tallerweb1.dao;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import ar.edu.unlam.tallerweb1.modelo.Administrador;

@Service("administradorDao")
public class AdministradorDaoImpl implements AdministradorDao {
	
	@Inject
    private SessionFactory sessionFactory;

	@Override
	public Administrador consultarAdministrador(Administrador administrador) {

		final Session session = sessionFactory.getCurrentSession();
		
		return (Administrador) session.createCriteria(Administrador.class)
				.add(Restrictions.eq("user", administrador.getUser()))
				.add(Restrictions.eq("password", administrador.getPassword()))
				.uniqueResult();

	}

	@Override
	public void guardarAdministrador(Administrador administrador) {
		final Session session = sessionFactory.getCurrentSession();
		session.save(administrador);
		
	}
	
	
}
