package ar.edu.unlam.tallerweb1.modelo;

public class Tragamonedas {
	
	//atributos
	private Tambor tambor1;
	private Tambor tambor2;
	private Tambor tambor3;
	
	//constructores
	public Tragamonedas(){
		
	}
	
	public Tragamonedas(Tambor t1, Tambor t2, Tambor t3) {
		this.tambor1=t1;
		this.tambor2=t2;
		this.tambor3=t3;
	}
	
	//metodos
	public Boolean entregaPremio(){
		if(tambor1.getPosicion()==tambor2.getPosicion() && tambor2.getPosicion()==tambor3.getPosicion())
			return true;
		else
			return false;
	}
	
	public void activar() {
		tambor1.girar();
		tambor2.girar();
		tambor3.girar();
	}

	//Getters y setters
	public Tambor getTambor1() {
		return tambor1;
	}

	public void setTambor1(Tambor tambor1) {
		this.tambor1 = tambor1;
	}

	public Tambor getTambor2() {
		return tambor2;
	}

	public void setTambor2(Tambor tambor2) {
		this.tambor2 = tambor2;
	}

	public Tambor getTambor3() {
		return tambor3;
	}

	public void setTambor3(Tambor tambor3) {
		this.tambor3 = tambor3;
	}
	
	
}
