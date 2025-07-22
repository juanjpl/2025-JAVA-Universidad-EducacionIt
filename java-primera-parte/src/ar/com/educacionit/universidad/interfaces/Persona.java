package ar.com.educacionit.universidad.interfaces;

import java.util.Arrays;

public class Persona extends Object {

	private String nombre;
	private IIdioma idiomaNativo;
	private IIdioma[] otrosIdiomas;

	public Persona(String nombre, IIdioma idiomaNativo) {

		setNombre(nombre);
		setIdiomaNativo(idiomaNativo);
		setOtrosIdiomas(new IIdioma[0]);

	}

	private void setOtrosIdiomas(IIdioma[] idiomas) {
		// TODO Auto-generated method stub
		this.otrosIdiomas = idiomas;

	}

	private void setIdiomaNativo(IIdioma idiomaNativo) {
		// TODO Auto-generated method stub
		if (idiomaNativo == null) {
			System.err.println("Dbe tener un idioma!");
		}

		this.idiomaNativo = idiomaNativo;
	}

	public void setNombre(String nombre) {

		if (nombre == null) {
			System.err.println("Dbe tener un nombre!");
		}

		this.nombre = nombre;

	}

	public String getNombre() {
		return nombre;
	}

	public IIdioma getIdiomaNativo() {
		return idiomaNativo;
	}

	public IIdioma[] getOtrosIdiomas() {
		return otrosIdiomas;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", idiomaNativo=" + idiomaNativo + ", otrosIdiomas="
				+ Arrays.toString(otrosIdiomas) + "]";
	}

	public void decir(String palabra) {
		if (this.idiomaNativo != null)

			this.idiomaNativo.decir(palabra);

	}

	public void decir(String palabra, IIdioma idioma) {
		if (idioma == null || !sabeHablarIdioma(idioma)) {
			
			if(idioma instanceof IdiomaBase aux) {
				System.err.println(this.nombre + " no sabe hablar en ... " + aux.getDescripcion());
			}else {
				System.err.println(this.nombre + " no sabe hablar en ... " + idioma.getClass().getSimpleName());
			}
			
			return;
		}

		idioma.decir(palabra);

	}

	public boolean sabeHablarIdioma(IIdioma idioma) {

		if (this.idiomaNativo.getClass().isAssignableFrom(idioma.getClass()))
			return true;

		boolean habla = false;

		for (int i = 0; !habla && i < this.otrosIdiomas.length; i++) {
			habla = this.otrosIdiomas[i].getClass().isAssignableFrom(idioma.getClass());
		}

		return habla;

	}

	public void aprender(IIdioma idioma) {
		// TODO Auto-generated method stub

		if (idioma == null) {
			System.out.println("Idioma nulo");
			return;
		}

		if (this.idiomaNativo.getClass().isAssignableFrom(idioma.getClass())) {
			System.out.println("Ya habla: " + idioma.getClass());
			return;
		}

		for (IIdioma aux : this.otrosIdiomas) {
			if (aux.getClass().isAssignableFrom(idioma.getClass())) {
				System.out.println("Ya habla este idioma");
				return;
			}
		}

		IIdioma[] aux = new IIdioma[this.otrosIdiomas.length + 1];
		for (int i = 0; i < this.otrosIdiomas.length; i++) {
			aux[i] = this.otrosIdiomas[i];
		}

		aux[this.otrosIdiomas.length] = idioma;
		this.setOtrosIdiomas(aux);
	}

}
