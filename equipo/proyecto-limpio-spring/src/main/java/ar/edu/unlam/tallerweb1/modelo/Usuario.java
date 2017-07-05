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
public class Usuario {
	//Atributos
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Usuario")
	private Long id;
	private String user;
	private String password;
	private Integer aprobacion = 1; 
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "usuarios_bandas", joinColumns = { @JoinColumn(name = "id_Usuario") }, inverseJoinColumns = { @JoinColumn(name = "id_Banda") })
	private Set<Bandas> bandas = new HashSet<Bandas>();
		
	//Constructor
	public Usuario(){
	}

	//Getters y setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	
	public Set<Bandas> getBandas() {
		return this.bandas;
	}
	
	public void setBandas(Set<Bandas> bandas) {
		this.bandas = bandas;
	}	
}
