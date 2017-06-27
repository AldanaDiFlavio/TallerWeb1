package ar.edu.unlam.tallerweb1.modelo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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
public class Eventos {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Evento")
	private Long id;
	private String nombre;
	private String imagen;
	private String descripcion;
	private	float latitud;
	private float longitud;
	private Date fecha;
	private Integer comienzo;
	private Integer finalizacion;
	
	 @ManyToMany(fetch = FetchType.LAZY)
	 @JoinTable(name = "eventos_bandas", 
	             joinColumns = { @JoinColumn(name = "id_Evento") }, 
	             inverseJoinColumns = { @JoinColumn(name = "id_Banda") })
	 private Set<Bandas> bandas = new HashSet<Bandas>(0);
		
		public Set<Bandas> getBandas() {
			return this.bandas;
		}
		
		public void setBandas(Set<Bandas> bandas) {
			this.bandas = bandas;
		}
		
		 @ManyToMany(fetch = FetchType.LAZY)
		 @JoinTable(name = "eventos_usuarios", 
		             joinColumns = { @JoinColumn(name = "id_Evento") }, 
		             inverseJoinColumns = { @JoinColumn(name = "id_Usuario") })
		 private Set<Usuario> usuario = new HashSet<Usuario>(0);
			
			public Set<Usuario> getUsuarios() {
				return this.usuario;
			}
			
			public void setUsuario(Set<Usuario> usuario) {
				this.usuario = usuario;
			}
	
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
	/*
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
