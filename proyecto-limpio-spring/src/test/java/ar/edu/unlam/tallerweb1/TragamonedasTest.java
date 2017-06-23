package ar.edu.unlam.tallerweb1;

import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;

import ar.edu.unlam.tallerweb1.modelo.Tambor;
import ar.edu.unlam.tallerweb1.modelo.Tragamonedas;
public class TragamonedasTest {
	
	@Test
	public void testGirarUnTambor(){
		Tambor miTambor = new Tambor();
		miTambor.girar();
		miTambor.setPosicion(8);
		assertThat(miTambor.getPosicion()).isBetween(1, 8);
	}
		
	@Test
	public void testQueEntregaPremio() {

		Tragamonedas miTragamonedas = new Tragamonedas();
		
		miTragamonedas.getTambor1().setPosicion(1);
		miTragamonedas.getTambor2().setPosicion(1);
		miTragamonedas.getTambor3().setPosicion(1);
		miTragamonedas.activar();
		assertThat(miTragamonedas.entregaPremio());
	
	}
	
	@Test
	public void testQueNoEntregaPremio() {

		Tragamonedas miTragamonedas = new Tragamonedas();
		miTragamonedas.getTambor1().setPosicion(1);
		miTragamonedas.getTambor2().setPosicion(2);
		miTragamonedas.getTambor3().setPosicion(3);
		miTragamonedas.activar();
		assertThat(miTragamonedas.entregaPremio()).isFalse();
	
	}
	
	@Test
	public void testQueEntregaPremioConMockito() {

		Tambor t1Fake = mock(Tambor.class);
		Tambor t2Fake = mock(Tambor.class);
		Tambor t3Fake = mock(Tambor.class);
		
		when(t1Fake.getPosicion()).thenReturn(4);
		when(t2Fake.getPosicion()).thenReturn(4);
		when(t3Fake.getPosicion()).thenReturn(4);
		
		Tragamonedas miTragamonedas = new Tragamonedas(t1Fake, t2Fake, t3Fake);
		miTragamonedas.activar();
		assertThat(miTragamonedas.entregaPremio()).isTrue();
	
	}
	
	@Test
	public void testQueNoEntregaPremioConMockito() {

		Tambor t1Fake = mock(Tambor.class);
		Tambor t2Fake = mock(Tambor.class);
		Tambor t3Fake = mock(Tambor.class);
		
		when(t1Fake.getPosicion()).thenReturn(4);
		when(t2Fake.getPosicion()).thenReturn(2);
		when(t3Fake.getPosicion()).thenReturn(4);
		
		Tragamonedas miTragamonedas = new Tragamonedas(t1Fake, t2Fake, t3Fake);
		miTragamonedas.activar();
		assertThat(miTragamonedas.entregaPremio()).isFalse();
	
	}
	
}