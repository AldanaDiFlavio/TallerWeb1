package ar.edu.unlam.tallerweb1.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import ar.edu.unlam.tallerweb1.modelo.Cuenta;

@Service("cuentaDao")
public class CuentaDaoImpl implements CuentaDao{
	
	@Inject
    private SessionFactory sessionFactory;
	
	@Override
	public void guardarCuenta(List<Cuenta> cuentas) {
		final Session session = sessionFactory.getCurrentSession();
		session.save(cuentas);
		
	}

}
