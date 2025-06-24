package ar.com.educacionit.universidad.oop.ecommerce;

public class Resultado {
	
	private String titulo;
	private String imagen;
	private float precio;
	private String autor;
	
	public Resultado(String titulo, String imagen, float precio, String autor) {
		super();
		this.titulo = titulo;
		this.imagen = imagen;
		this.precio = precio;
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Resultado [titulo=" + titulo + ", imagen" + imagen + ", precio=" + precio + ", autor=" + autor + "]";
	}
	
	public String obtenerImagen() {
		//Ya estoy dentro de la clase
		return this.imagen;
	}
	
	public String obtenerTitulo() {
		return this.titulo;
	}
	
	public float obtenerPrecio() {
		return this.precio;
	}
	
	public String obtenerAuto() {
		return this.autor;
	}
	
	public void actualizarImagen(String imagen) {
		//Aca aprovecho el encapsulamiento
		if(imagen == null) {
			this.imagen="https://sin-imagen.jpg";
		}
		
		this.imagen=imagen;
	}
	
	public void actualizarPrecio(float precio) {
		if(precio <0) {
			precio = 0;
		}
		
		this.precio = precio;
	}
	
	

}
