package ar.edu.unlam.tallerweb1;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.CuentaDao;
import ar.edu.unlam.tallerweb1.dao.UsuarioDao;
import ar.edu.unlam.tallerweb1.modelo.Cuenta;
import ar.edu.unlam.tallerweb1.modelo.Usuario;

public class PersistenciaTest extends SpringTest {

	@Inject
	private UsuarioDao usuarioDao;
	@Inject
	private CuentaDao cuentaDao;

	@Test
	@Transactional
	@Rollback(false)
	public void insertarUsuario() {
		Usuario usuario = new Usuario();		
		usuario.setUser("Juan");
		usuario.setPassword("1234");
		/* este test es rojo xq no esta insertando el CBU xq no es null
		 da verde en caso q admita null*/

		usuarioDao.guardarUsuario(usuario);

		Session currentSession = sessionFactory.getCurrentSession();
		Usuario usuario2 = currentSession.get(Usuario.class, usuario.getId());
		Assert.assertNotNull(usuario2);
	}
	
	@Test
	@Transactional
	@Rollback(false)
	public void insertarCBUaUsuario() {
		Usuario usuario = new Usuario();
		
		
		usuario.setUser("Juan");
		usuario.setPassword("1234");
		

		usuarioDao.guardarUsuario(usuario);

		Session currentSession = sessionFactory.getCurrentSession();
		Usuario usuario2 = currentSession.get(Usuario.class, usuario.getId());
		Assert.assertNotNull(usuario2);
	}
	
	@Test
	@Transactional
	@Rollback(false)
	public void asociarCuentasAUnUsuario() {
		
		
		Usuario usuario = new Usuario();
		usuario.setUser("Juan");
		usuario.setPassword("1234");
		

		List<Cuenta> cuentas = new ArrayList<Cuenta>();
		
		Cuenta c1 = new Cuenta();
		c1.setSaldo(12345.25f);
		c1.setUsuario(usuario);
		cuentas.add(c1);
		
		Cuenta c2 = new Cuenta();
		c2.setSaldo(100.25f);
		c2.setUsuario(usuario);
		cuentas.add(c2);
		
		cuentaDao.guardarCuenta(cuentas);
		

		//Session currentSession = sessionFactory.getCurrentSession();
		//List<Cuenta> cuenta = currentSession.get(Cuenta.class, cuentas.getId());
		//Assert.assertNotNull(cuenta);
	}
}
