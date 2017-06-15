package ar.edu.unlam.tallerweb1.modelo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Eventos {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idEvento")
	private Long id;
	private String nombre;
	private String descripcion;
	private	float latitud;
	private float longitud;
	private Date fecha;
	private Integer comienzo;
	private Integer finalizacion;
	
	/*Relación N a N entre usuarios y eventos*/
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(	name = "Usuarios-Eventos",
				joinColumns = { @JoinColumn(name = "idEvento") }, 
				inverseJoinColumns = {@JoinColumn(name = "idUsuario")})
	private Set <Usuario> usuarios = new HashSet <Usuario>(0);
	
	public Eventos(){
		
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
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Integer getComienzo() {
		return comienzo;
	}
	
	public void setComienzo(Integer comienzo) {
		this.comienzo = comienzo;
	}
	
	public Integer getFinalizacion() {
		return finalizacion;
	}
	
	public void setFinalizacion(Integer finalizacion) {
		this.finalizacion = finalizacion;
	}
	
	public Date getFecha() {
		return fecha;
	}
	
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public float getLatitud() {
		return latitud;
	}
	
	public void setLatitud(float latitud) {
		this.latitud = latitud;
	}
	
	public float getLongitud() {
		return longitud;
	}
	
	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}
	
	public Set <Usuario> getUsuarios() {
		return usuarios;
	}
	
	public void setUsuarios(Set <Usuario> usuarios) {
		this.usuarios = usuarios;
	}
}
