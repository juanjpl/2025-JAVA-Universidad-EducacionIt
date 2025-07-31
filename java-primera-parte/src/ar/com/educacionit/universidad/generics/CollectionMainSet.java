package ar.com.educacionit.universidad.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionMainSet {

	public static void main(String[] args) {
		
		
		// java collection framework
		Collection<Alumno> alumnos = new ArrayList<>();
		

		//Agregar datos 
		alumnos.add(new Alumno("24000000","Apellido","Nombre","Curso"));
		alumnos.add(new Alumno("24000000","Apellido","Nombre","Curso"));
		alumnos.add(new Alumno("24000000","Apellido","Nombre","Curso"));
		
		//size
		System.out.println(alumnos.size());		
		
		//Tiene elementos?
		System.out.println("Vacio ? " +  alumnos.isEmpty());

		//limpiar la colection
		alumnos.clear();
		System.out.println("Vacio ? " +  alumnos.isEmpty());
		
		//Agregar datos 
				alumnos.add(new Alumno("50000000","Apellido","Nombre","Curso"));
				alumnos.add(new Alumno("51000000","Apellido","Nombre","Curso"));
				alumnos.add(new Alumno("52000000","Apellido","Nombre","Curso"));
				
		//Eliminar mal los elementos
		/*
		for(var alumno : alumnos) {
			if(alumno.getDni().equals("50000000") || alumno.getDni().equals("52000000")) {
				alumnos.remove(alumno);
			}
		} 
		*/
				
		//USar el iterator
				Iterator<Alumno> itAlumno =  alumnos.iterator();
				while(itAlumno.hasNext()) {
					var alumno = itAlumno.next();
					
					if(alumno.getDni().equals("50000000") || alumno.getDni().equals("52000000")) {
						itAlumno.remove();
						System.out.println("Se elimino " + alumno);
					}
					
					
				}
				
		
	}

}
