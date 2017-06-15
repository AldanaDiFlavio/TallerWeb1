package ar.edu.unlam.tallerweb1.modelo;

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
public class Usuario {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUsuario")
	private Long id;
	private String nombreCompleto;
	private float ubicacionLongitud;
	private float ubicacionLatitud;
	private String user;
	private String password;
	private Integer aprobacion = 2; /* no esta aprobado */ 
	private Integer rol = 2; /* por defecto es usuario */
	private Integer seguidores;
	private Integer siguiendo;
	
	/*Relación N a N entre usuarios y usuarios*/
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(	name = "Seguidor-Siguiendo",
				joinColumns = { @JoinColumn(name = "idSeguidor") }, 
				inverseJoinColumns = {@JoinColumn(name = "idSiguiendo")})
	private Set <Usuario> usuarios = new HashSet <Usuario>(0);


	public Usuario(){
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public float getUbicacionLongitud() {
		return ubicacionLongitud;
	}

	public void setUbicacionLongitud(float ubicacionLongitud) {
		this.ubicacionLongitud = ubicacionLongitud;
	}

	public float getUbicacionLatitud() {
		return ubicacionLatitud;
	}

	public void setUbicacionLatitud(float ubicacionLatitud) {
		this.ubicacionLatitud = ubicacionLatitud;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAprobacion() {
		return aprobacion;
	}

	public void setAprobacion(Integer aprobacion) {
		this.aprobacion = aprobacion;
	}
	
	public Integer getRol() {
		return rol;
	}

	public void setRol(Integer rol) {
		this.rol = rol;
	}

	public Integer getSeguidores() {
		return seguidores;
	}

	public void setSeguidores(Integer seguidores) {
		this.seguidores = seguidores;
	}

	public Integer getSiguiendo() {
		return siguiendo;
	}

	public void setSiguiendo(Integer siguiendo) {
		this.siguiendo = siguiendo;
	}

	public Set <Usuario> getUsuarios() {
		return usuarios;
	}
	
	public void setUsuarios(Set <Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
}
