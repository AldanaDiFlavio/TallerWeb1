package ar.edu.unlam.tallerweb1;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import static org.mockito.Mockito.*;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.controladores.BandasController;
import ar.edu.unlam.tallerweb1.modelo.Album;
import ar.edu.unlam.tallerweb1.servicios.AlbumService;

public class BandasControllerTest {
	
	@Inject
	private AlbumService servicioAlbumMock;
	
	@Test
	public void mostrarAlbumApartirDeUnaBanda() {
		/*Inicialización*/
		Long id ;
		id = (long) 1;
		List<Album> listaEsperada = new ArrayList<>();
		Album album = new Album();
		album.setNombre("ACDC");
		album.setId(id);
		listaEsperada.add(album);

		BandasController controlador = new BandasController();

		servicioAlbumMock = mock(AlbumService.class);
		controlador.setServicioAlbum(servicioAlbumMock);
		when(servicioAlbumMock.traerAlbumesDeUnaBanda(id)).thenReturn(listaEsperada);
		
		/*Operación*/
		ModelAndView resultado = controlador.mostrarAlbum(id);
		
		/*Verificación*/
		List<Album> listaAlbum = (List<Album>) resultado.getModel().get("album");
		Assertions.assertThat(listaAlbum.get(0).getId()).isEqualTo(id);
		
	}

}
