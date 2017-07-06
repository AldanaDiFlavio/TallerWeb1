package ar.edu.unlam.tallerweb1.modelo;

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
public class Eventos implements Comparable<Eventos> {
	//Atributos
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Evento")
	private Long id;
	private String nombre;
	private String imagen;
	private String descripcion;
	private String fecha;
	private Integer capacidad;
	private Integer cantactual;
	
	@ManyToMany(fetch = FetchType.EAGER) // Si no le pongo EAGER por ej en eventos no me trae el getBandas.
	@JoinTable(name = "eventos_bandas", joinColumns = { @JoinColumn(name = "id_Evento") }, inverseJoinColumns = { @JoinColumn(name = "id_Banda") })
	private Set<Bandas> bandas = new HashSet<Bandas>();
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "eventos_usuarios", joinColumns = { @JoinColumn(name = "id_Evento") }, inverseJoinColumns = { @JoinColumn(name = "id_Usuario") })
	private Set<Usuario> usuario = new HashSet<Usuario>();
	
	//Constructor
	public Eventos(){
		
	}
	
	//Getters y setters
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
		
	public Set<Bandas> getBandas() {
		return bandas;
	}

	public void setBandas(Set<Bandas> bandas) {
		this.bandas = bandas;
	}		
		
	public Set<Usuario> getUsuarios() {
		return this.usuario;
	}
		
	public void setUsuario(Set<Usuario> usuario) {
		this.usuario = usuario;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	public Integer getCantactual() {
		return cantactual;
	}

	public void setCantactual(Integer cantactual) {
		this.cantactual = cantactual;
	}

	@Override
	public int compareTo(Eventos o) {
		  int resultado=0;
	        if (this.cantactual<o.cantactual) {   resultado = -1;      }
	        else if (this.cantactual>o.cantactual) {    resultado = 1;      }
	        else {
	            if (this.capacidad<o.capacidad) {  resultado = -1;    }
	            else if (this.capacidad>o.capacidad) {   resultado = 1;   }
	            else {   resultado = 0;   }
	        }
	        return resultado;
	    }
	
}
