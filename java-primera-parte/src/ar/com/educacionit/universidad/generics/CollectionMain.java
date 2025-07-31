package ar.com.educacionit.universidad.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class CollectionMain {

	public static void main(String[] args) {
		
		
		// java collection framework
		Collection<Integer> alumnos = new ArrayList<>();
		
		alumnos.add(10);
		alumnos.add(20);
		alumnos.add(30);
		alumnos.add(40);
		alumnos.add(50);
		alumnos.add(40);
		alumnos.add(20);
		
		System.out.println(alumnos);
		
		//Filtamos
		
			alumnos = new HashSet<>(alumnos);
			System.out.println(alumnos);
		
	}

}
