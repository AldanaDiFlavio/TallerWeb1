package ar.edu.unlam.tallerweb1.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	
	@ManyToOne(optional=false, cascade=CascadeType.ALL)
	@JoinColumn(name="id")
    private Genero genero;
	
	//Constructor 
	public Bandas(){
		super();
        listaAlbum =new ArrayList<Album>();
	}
	
	//Getters y setters
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
	
	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

}
