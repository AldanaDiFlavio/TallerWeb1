package ar.edu.unlam.tallerweb1.modelo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Bandas {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idBanda")
	private Long id;
	private String nombre;
	private String urlYtb;
	private Integer cantidadAdheridos;
	
	/*Relación N a N entre banda y evento*/
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(	name = "Eventos-Bandas",
				joinColumns = { @JoinColumn(name = "idBanda") }, 
				inverseJoinColumns = {@JoinColumn(name = "idEvento")})
	private Set <Eventos> eventos = new HashSet <Eventos>(0);
	
	/*Relación N a N entre banda usuario*/
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(	name = "Usuarios-Bandas",
				joinColumns = { @JoinColumn(name = "idBanda") }, 
				inverseJoinColumns = {@JoinColumn(name = "idUsuario")})
	private Set <Usuario> usuarios = new HashSet <Usuario>(0);
	
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
}
