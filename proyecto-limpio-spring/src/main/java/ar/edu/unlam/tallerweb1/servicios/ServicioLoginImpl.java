package ar.edu.unlam.tallerweb1.servicios;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.UsuarioDao;

import ar.edu.unlam.tallerweb1.modelo.Usuario;

@Service("loginService")
@Transactional
public class ServicioLoginImpl implements ServicioLogin{

		@Inject
		private UsuarioDao usuarioDao;


		@Override
		public Usuario consultarUsuario(Usuario usuario) {
			return usuarioDao.consultarUsuario(usuario);
		}


		@Override
		public Usuario buscarUsuario(Usuario usuario) {
			return usuarioDao.buscarUsuario(usuario);
		}

}
