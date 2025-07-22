package ar.com.educacionit.universidad.interfaces;

public class MainInterfaces {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IIdioma idioma = new Espaniol();
		
		var persona = new Persona("Carlos", idioma);
		
		String palabra = "Hola";
		persona.decir(palabra);
		
		//persona.decir(palabra;
		
		persona.decir(palabra, new Espaniol());
		
		//aprende un nuevo idioma
		idioma = new Espaniol();
		persona.aprender(idioma);
		persona.decir(palabra, new Espaniol());
	}

}
