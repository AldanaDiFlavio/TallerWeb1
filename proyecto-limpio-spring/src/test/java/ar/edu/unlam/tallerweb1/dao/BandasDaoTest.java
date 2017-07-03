package ar.edu.unlam.tallerweb1.dao;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.SpringTest;
import ar.edu.unlam.tallerweb1.modelo.Bandas;
import ar.edu.unlam.tallerweb1.modelo.Genero;

import static org.assertj.core.api.Assertions.*;

public class BandasDaoTest extends SpringTest{

	@Inject
	private BandasDao dao;
	
	@Test
	@Transactional @Rollback(true)
	public void buscarPorGeneroDeberiaDevolverSoloLasBandasDeEseGenero(){
	
		// preparacion
		Genero rock = new Genero();
		rock.setGenero("Rock Nacional");
		getSession().save(rock);
		
		Genero tango = new Genero();
		tango.setGenero("Tango");
		getSession().save(tango);
		
		Bandas bersuit = new Bandas();
		bersuit.setNombre("Bersuit");
		bersuit.setGenero(rock);
		getSession().save(bersuit);
		
		Bandas larenga = new Bandas();
		larenga.setNombre("La Renga");
		larenga.setGenero(rock);
		getSession().save(larenga);
		
		Bandas carlosgardel = new Bandas();
		carlosgardel.setNombre("Carlos Gardel");
		carlosgardel.setGenero(tango);
		getSession().save(carlosgardel);
		
		// ejecucion
		List<Bandas> bandas = dao.buscarPor(rock);
		
		
		// verificacion
		assertThat(bandas).hasSize(2);
		for(Bandas banda : bandas){
			assertThat(banda.getGenero().getGenero()).isEqualTo(rock.getGenero());
		}
		//assertThat(bandas).contains(bersuit);
		//assertThat(bandas).contains(larenga);
	}
}
