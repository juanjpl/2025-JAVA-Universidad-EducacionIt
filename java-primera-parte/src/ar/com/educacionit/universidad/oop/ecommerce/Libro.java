package ar.com.educacionit.universidad.oop.ecommerce;

public class Libro extends Resultado {
	
	private String isbn;
	private int numeropaginas;
	private String sinopsis;
	
	

	public Libro(String titulo, String imagen, float precio, String autor, String isbn, int numeropaginas, String sinopsis) {
		super(titulo, imagen, precio, autor);
		// TODO Auto-generated constructor stub
		
		this.isbn = isbn;
		this.numeropaginas = numeropaginas;
		this.sinopsis = sinopsis;
	}



	public String getIsbn() {
		return isbn;
	}



	public int getNumeropaginas() {
		return numeropaginas;
	}



	public String getSinopsis() {
		return sinopsis;
	}



	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", numeropaginas=" + numeropaginas + ", sinopsis=" + sinopsis + "]";
	}
	
	
	
	
	
	
	

}
