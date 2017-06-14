package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Genero {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	private String descripcion;
	@ManyToOne(optional=false, cascade=CascadeType.ALL)
	@JoinColumn(name="idBandas")
	private Bandas idBandas;
	
	public Genero() {
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Bandas getIdBandas() {
		return idBandas;
	}
	public void setIdBandas(Bandas idBandas) {
		this.idBandas = idBandas;
	}
	
	

}
