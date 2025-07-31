package ar.com.educacionit.universidad.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class CollectionMainSet2 {

	public static void main(String[] args) {
		
		
		// java collection framework
		//Collection<Alumno> alumnos = new HashSet<>();
		
		// Opcion al Hashset
		Collection<Alumno> alumnos = new TreeSet<>();
		
		
		Alumno a = new Alumno ("10000000","Apellido","Nombre","Curso");
		Alumno b = new Alumno ("20000000","Apellido","Nombre","Curso");
		
		alumnos.add(a);
		alumnos.add(b);
		
		System.out.println(alumnos);
		
		
	}

}
