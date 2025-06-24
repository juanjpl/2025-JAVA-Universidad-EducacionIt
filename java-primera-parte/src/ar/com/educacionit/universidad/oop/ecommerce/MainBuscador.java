package ar.com.educacionit.universidad.oop.ecommerce;

import java.util.Scanner;

public class MainBuscador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Buscador buscador = new Buscador();
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Buscando....");
		String claveBuscadaPorElUsuario = teclado.next();
		
		buscador.buscar();
		
		System.out.println("Hemos encontrado "+ buscador.getCantidad()+ "resultados para "+ buscador.getClave() + "");
			
		//Recorro los resultados
		Resultado[] res= buscador.obtenerResultados();
		
		for(Resultado resultado : res) {
			System.out.println(resultado);
		}

	}

}
