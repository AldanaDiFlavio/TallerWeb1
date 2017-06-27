package ar.edu.unlam.tallerweb1.modelo;

import java.util.HashSet;
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

@Entity
public class Usuario {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Usuario")
	private Long id;
	private String nombreCompleto;
	private float ubicacionLongitud;
	private float ubicacionLatitud;
	private String user;
	private String password;
	private Integer aprobacion = 1; /* está aprobado */ 
	private Integer seguidores = 0;
	private Integer siguiendo = 0;
	
	@ManyToMany(fetch = FetchType.LAZY)
	 @JoinTable(name = "usuarios_bandas", 
	             joinColumns = { @JoinColumn(name = "id_Usuario") }, 
	             inverseJoinColumns = { @JoinColumn(name = "id_Banda") })
	 private Set<Bandas> bandas = new HashSet<Bandas>(0);
		
		public Set<Bandas> getBandas() {
			return this.bandas;
		}
		
		public void setBandas(Set<Bandas> bandas) {
			this.bandas = bandas;
		}
	
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

	/*public Set <Usuario> getUsuarios() {
		return usuarios;
	}
	
	public void setUsuarios(Set <Usuario> usuarios) {
		this.usuarios = usuarios;
	}*/
	
}
