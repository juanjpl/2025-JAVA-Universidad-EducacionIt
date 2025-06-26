package ar.com.educacionit.universidad.oop.polimorfismo;

public class Consola {
	
	//atributos
	
	private String serie;
	protected String color;
	public String fabricante;
	protected String nombre;
	
	
	//Tiene que nacer ... CONSTRUCTOR
	
	public Consola(String serie, String color, String fabricante, String nombre) {
	
		this.serie = serie;
		this.color = color;
		this.fabricante = fabricante;
		this.nombre = nombre;
	}
	
	
	//Metodos
	public String getNumeroDeSerie() {
		return this.getNumeroDeSerie();
	}
	
	public String getFabricante() {
		return this.fabricante;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getColor() {
		return this.color;
		
	}
	
	public void play() {
		System.out.println("Soy una consola Naciendo.....");
	}
	

}
