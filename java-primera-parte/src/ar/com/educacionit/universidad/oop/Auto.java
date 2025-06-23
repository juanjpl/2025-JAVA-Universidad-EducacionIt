package ar.com.educacionit.universidad.oop;

public class Auto {
		
	/*
	 * Atributos
	 */
	String marca;
	String modelo;
	int anio;
	String color;
	String patente;
	float velocidad;
	
	
	/*
	 * Consttructor --- es lo primero que se ejecuta cuando nace un auto
	 */
	
	public Auto(String marca, String modelo, int anio, String color, String patente) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.color = color;
		this.patente = patente;
		this.velocidad = 0;
	}
	
	/*
	 * Metodos
	 */
	void acelerar() {
		
	
		
	}
	void frenar() {
		
	
		
	}
	void encender() {
		
	}

	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", color=" + color + ", patente="
				+ patente + ", velocidad=" + velocidad + "]";
	}
	
	//Cambiar el comportamiento por defecto
	
		
			
		}
	


