package ar.com.educacionit.universidad.ciclos;

import java.util.Scanner;

public class Ejercicio001 {
	
	public static void main(String[] args) {
		
		//Ingresar la cantidad de pediddos y su valor
		//Calcular el promedio de los pedidos
		
		Scanner teclado = new Scanner(System.in);//Leer desde teclado
		System.out.println("Ingrese la cantidad de pedidos: ");
		
		int cantidadPedidos= teclado.nextInt(); //enteros
		
		System.out.println(cantidadPedidos);
		float total=0;
		
		for(int i=0; i<cantidadPedidos; i++) {
			System.out.println("Ingrese el costo del pedido: " + (i+1));
			total += teclado.nextFloat();
		}

		//Cierro el teclado
		teclado.close();
		float promedio = total / cantidadPedidos;
		System.out.println("El promedio del costo del pedido es: "+ promedio);
		
	}

}
