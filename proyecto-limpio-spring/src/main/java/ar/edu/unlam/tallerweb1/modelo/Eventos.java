package ar.edu.unlam.tallerweb1.modelo;

public class Eventos {
	
	private Long id;
	private String nombre;
	private String banda;
	private String imagen;
	private String descripcion;
	private String lugar;
	private String fecha;
	private Integer comienzo;
	private Integer finalizacion;
	private Usuario organizador; /*id del usuario que lo organice*/
	private int cantidadAsistencias;
	
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
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
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
	public Usuario getOrganizador() {
		return organizador;
	}
	public void setOrganizador(Usuario organizador) {
		this.organizador = organizador;
	}
	public int getCantidadAsistencias() {
		return cantidadAsistencias;
	}
	public void setCantidadAsistencias(int cantidadAsistencias) {
		this.cantidadAsistencias = cantidadAsistencias;
	}
	public String getBanda() {
		return banda;
	}
	public void setBanda(String banda) {
		this.banda = banda;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}	
}
