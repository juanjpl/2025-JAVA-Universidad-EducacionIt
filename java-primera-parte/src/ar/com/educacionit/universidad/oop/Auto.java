package ar.com.educacionit.universidad.oop;

public class Auto {
		
	/*
	 * Atributos
	 */
	public String marca;
	public String modelo;
	public int anio;
	public String color;
	public String patente;
	public float velocidad;
	
	
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
	
	//polimorfismo por sobrecarga con el metodo acelerar
	//dos o mas metodos con el mismo nombre, pero distintos argumentos
	public void acelerar() {
		
		this.velocidad++;
		
	}
	public void acelerar(float v) {
		
		this.velocidad += v ;
		
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

	public float getVelocidad() {
		return velocidad;
	}

	
	
	//Cambiar el comportamiento por defecto
	
		
			
		}
	


