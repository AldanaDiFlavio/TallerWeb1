package ar.edu.unlam.tallerweb1.modelo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Bandas {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Banda")
	private Long id;
	private String nombre;
	private String imagen;
	private Integer cantidadAdheridos;
	
	public Bandas(){
		super();
        listaAlbum =new ArrayList<Album>();
	}
			
	/*Relación N a N entre banda y evento
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(	name = "Eventos-Bandas",
				joinColumns = { @JoinColumn(name = "idBanda") }, 
				inverseJoinColumns = {@JoinColumn(name = "idEvento")})
	private Set <Eventos> eventos = new HashSet <Eventos>(0);
	
	/*Relación N a N entre banda usuario
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(	name = "Usuarios-Bandas",
				joinColumns = { @JoinColumn(name = "idBanda") }, 
				inverseJoinColumns = {@JoinColumn(name = "idUsuario")})
	private Set <Usuario> usuarios = new HashSet <Usuario>(0); */
	
	@ManyToOne(optional=false, cascade=CascadeType.ALL)
	@JoinColumn(name="id")
    private Genero genero;
	
	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}	
	
	@OneToMany(mappedBy="bandas" )
    private List<Album> listaAlbum;

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
	/*
	public Set <Eventos> getEventos() {
		return eventos;
	}
	
	public void setEventos(Set <Eventos> eventos) {
		this.eventos = eventos;
	}
	
	public Set <Usuario> getUsuarios() {
		return usuarios;
	}
	
	public void setUsuarios(Set <Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	*/
	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

}
