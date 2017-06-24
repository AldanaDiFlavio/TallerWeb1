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
	private String genero;
	@ManyToOne(optional=false, cascade=CascadeType.ALL)
//	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_Banda")
	private Bandas banda;
	
	public Genero() {
		
	}
	
	public Bandas getIdBanda() {
		return this.banda;
	}

	public void setIdBanda(Bandas b) {
		this.banda = b;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

}
