package ar.com.educacionit.universidad.generics;

import java.util.Objects;

public class Alumno {

	private String dni;
	private String apellido;
	private String nombre;
	private String curso;
	
	public Alumno(String dni, String apellido, String nombre, String curso) {
		super();
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
		this.curso = curso;
	}
	public String getDni() {
		return dni;
	}
	public String getApellido() {
		return apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public String getCurso() {
		return curso;
	}
	
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", apellido=" + apellido + ", nombre=" + nombre + ", curso=" + curso + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(apellido, curso, dni, nombre);
	}
	
	
	public boolean equals(Object obj) {
		
		if (obj == null) {
			return false;
		}
			
		if (this == obj) {
			return true;
		}
			
		
	if(!(obj instanceof Alumno)) {
		return false;
	}
	
	//igualdad a nivel de negocio
	if (!this.getDni().equals(((Alumno)obj).getDni())) {
		return false;
	}
	return true;
	}
	
	
	
}
