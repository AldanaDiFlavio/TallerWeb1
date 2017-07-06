package ar.edu.unlam.tallerweb1.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Album {
	//Atributos
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Album") // LO AGREGUE CUANDO HICE ONETOoMANY
	private Long id;
	private String nombre;
	private Integer anio;
	private String imagen;
	
	@OneToMany(mappedBy="album" ) 	// RELACION 1 A N ENTRE ALBUMS Y TEMAS
	private List<Tema> listaTemas;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_Banda", nullable = true)
	private Bandas bandas;
	
	
	//Getters y setters
	public Bandas getBandas() {
		return this.bandas;
	}

	public void setBandas(Bandas b) {
		this.bandas = b;
	}
	
	public Album() {

	}

	public List<Tema> getListaTemas() {
        return listaTemas;
	}
 
	public void addTemas(Tema te) {
 
		listaTemas.add(te);
	}
 
	public void setListaTemas(List<Tema> listaTemas) {
		this.listaTemas = listaTemas;
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

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}
			
}
