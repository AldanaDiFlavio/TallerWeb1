package ar.edu.unlam.tallerweb1.servicios;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.AdministradorDao;
import ar.edu.unlam.tallerweb1.dao.UsuarioDao;
import ar.edu.unlam.tallerweb1.modelo.Administrador;
import ar.edu.unlam.tallerweb1.modelo.Usuario;

@Service("loginService")
@Transactional
public class ServicioLoginImpl implements ServicioLogin{

		@Inject
		private UsuarioDao usuarioDao;
		@Inject
		private AdministradorDao administradorDao;

		@Override
		public Usuario consultarUsuario(Usuario usuario) {
			return usuarioDao.consultarUsuario(usuario);
		}

		@Override
		public Administrador consultarAdministrador(Administrador administrador) {
			return administradorDao.consultarAdministrador(administrador);
		}
}
