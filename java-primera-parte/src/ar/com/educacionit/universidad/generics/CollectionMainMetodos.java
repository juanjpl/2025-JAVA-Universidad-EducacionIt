package ar.com.educacionit.universidad.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionMainMetodos {

	public static void main(String[] args) {
		
		
		// java collection framework
		int [ ] Alumno = new int[2];
		
		Iterable<Alumno> alumnosIterable = new ArrayList<>();
		
		Collection<Alumno> alumnos = new ArrayList<>();
		
		List<Alumno> alumnosList = new ArrayList<>();
		
		ArrayList<Alumno> alumnosArrayList = new ArrayList<>();
		
		var list = new ArrayList<Alumno>();
		//Agregar datos 
		alumnos.add(new Alumno("24000000","Apellido","Nombre","Curso"));
		alumnos.add(new Alumno("24000000","Apellido","Nombre","Curso"));
		alumnos.add(new Alumno("24000000","Apellido","Nombre","Curso"));
		
		System.out.println(alumnos);

	}

}
