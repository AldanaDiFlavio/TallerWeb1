package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Album {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	private String nombre;
	private Integer cantidadCanciones;
	private String urlSpotify;
	@ManyToOne(optional=false, cascade=CascadeType.ALL)
	@JoinColumn(name="idBandas")
	private Bandas idBandas;
	
	public Album() {
		
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
	
	public Integer getCantidadCanciones() {
		return cantidadCanciones;
	}

	public void setCantidadCanciones(Integer cantidadCanciones) {
		this.cantidadCanciones = cantidadCanciones;
	}

	public String getUrlSpotify() {
		return urlSpotify;
	}

	public void setUrlSpotify(String urlSpotify) {
		this.urlSpotify = urlSpotify;
	}

	public Bandas getIdBandas() {
		return idBandas;
	}
	public void setIdBandas(Bandas idBandas) {
		this.idBandas = idBandas;
	}
	
	
}
