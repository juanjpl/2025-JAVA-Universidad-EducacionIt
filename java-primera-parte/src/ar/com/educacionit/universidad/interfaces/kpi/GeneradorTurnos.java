package ar.com.educacionit.universidad.interfaces.kpi;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;


public class GeneradorTurnos {

	public static Turno[] generarTurnos() {
		
		
		 String dni;
		 String tipoTramite;
		 int sucursal;
		 
		 ArrayList<Turno> turnos = new ArrayList<>();
		
		Scanner teclado = new Scanner(System.in);
		//Cargar turnos mientras no indique dni 0
		System.out.println("Ingrese DNI:");
		dni = teclado.next();
		
		while(!dni.trim().equals("0")) {
			
			System.out.println("Tipo de tramite:");
			tipoTramite = teclado.next();
			
			System.out.println("Ingrese Sucursal:");
			sucursal = teclado.nextInt();
			
			LocalDateTime now = LocalDateTime.now();
			Turno turno = new Turno(dni, tipoTramite,now,null, sucursal);
			
			turnos.add(turno);
			
			System.out.println("Ingrese DNI:");
			dni = teclado.next();
			
		}
		
		teclado.close();
		return turnos.toArray(new Turno[turnos.size()]);
	}
}
