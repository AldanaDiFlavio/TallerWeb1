package ar.edu.unlam.tallerweb1.modelo;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Bandas {
	//Atributos
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Banda")
	private Long id;
	private String nombre;
	private String imagen;
	private Integer cantidadAdheridos;
	
	@ManyToMany(fetch = FetchType.EAGER, mappedBy="bandas")
	private Set<Usuario> usuarios = new HashSet<Usuario>();
	
	@ManyToOne()
	@JoinColumn(name="id")
    private Genero genero;
	
	//Constructor 
	public Bandas(){

	}
	
	//Getters y setters
	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}	
	
	
	@OneToMany(mappedBy = "bandas", fetch = FetchType.LAZY, orphanRemoval = true)
	private List<Album> listaAlbum = new LinkedList<Album>();

	public void setListaAlbum(List<Album> listaAlbum) {
		this.listaAlbum = listaAlbum;
	}
	
	public List<Album> getListaAlbum() {
	        return listaAlbum;
	}
	 
	public void addAlbum(Album al) {
	 
	listaAlbum.add(al);
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

	public Integer getCantidadAdheridos() {
		return cantidadAdheridos;
	}

	public void setCantidadAdheridos(Integer cantidadAdheridos) {
		this.cantidadAdheridos = cantidadAdheridos;
	}
	
	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Set<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
}
