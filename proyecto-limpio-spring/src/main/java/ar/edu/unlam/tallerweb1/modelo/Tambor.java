package ar.edu.unlam.tallerweb1.modelo;

import java.util.concurrent.ThreadLocalRandom;

public class Tambor {

	//atributos
	private Integer valorActual;
	
	//metodos
	public void girar() {
		this.valorActual=ThreadLocalRandom.current().nextInt(1,8);	
	}
	
	//Getters y setters
	public Integer getPosicion() {
		return this.valorActual;
	}

	public void setPosicion(Integer valorActual) {
		this.valorActual = valorActual;
	}
}
