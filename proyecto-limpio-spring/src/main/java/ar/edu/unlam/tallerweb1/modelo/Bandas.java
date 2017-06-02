package ar.edu.unlam.tallerweb1.modelo;

/*import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;*/

//@Entity
public class Bandas {
	//@Id 
	//@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	private String nombre;
	private String imagen;
	private String genero;
	private Integer cantidadAdeheridos;
	
	public Bandas(){

	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public Integer getCantidadAdeheridos() {
		return cantidadAdeheridos;
	}
	public void setCantidadAdeheridos(Integer cantidadAdeheridos) {
		this.cantidadAdeheridos = cantidadAdeheridos;
	}

	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}
