package ar.com.educacionit.universidad.oop.polimorfismo;

public class DiscoExterno extends Object {

	private String nombre;
	private int capacidad;
	
	
	public DiscoExterno(String nombre, int capacidad) {
		super();
		this.nombre = nombre;
		this.capacidad = capacidad;
	}


	public String getNombre() {
		return nombre;
	}


	public int getCapacidad() {
		return capacidad;
	}


	@Override
	public String toString() {
		return "DiscoExterno [nombre=" + nombre + ", capacidad=" + capacidad + "]";
	}
	
	
	
}
