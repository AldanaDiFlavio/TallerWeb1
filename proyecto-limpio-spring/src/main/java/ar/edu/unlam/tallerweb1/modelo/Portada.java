package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Portada {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	private byte[] path;
	@ManyToOne(optional=false, cascade=CascadeType.ALL)
	@JoinColumn(name="idBandas")
	private Bandas bandas;
	
	public Portada(){
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public byte[] getPath() {
		return path;
	}
	
	public void setPath(byte[] path) {
		this.path = path;
	}
	public Bandas getBandas() {
		return bandas;
	}
	public void setBandas(Bandas bandas) {
		this.bandas = bandas;
	}
	
	
}
