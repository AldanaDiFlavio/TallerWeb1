package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bandas {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	private String nombre;
	private String urlYtb;
	private Integer cantidadAdheridos;
	
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

	public String getUrlYtb() {
		return urlYtb;
	}

	public void setUrlYtb(String urlYtb) {
		this.urlYtb = urlYtb;
	}

	public Integer getCantidadAdheridos() {
		return cantidadAdheridos;
	}

	public void setCantidadAdheridos(Integer cantidadAdheridos) {
		this.cantidadAdheridos = cantidadAdheridos;
	}
	
}
