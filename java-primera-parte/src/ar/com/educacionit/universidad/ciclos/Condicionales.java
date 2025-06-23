package ar.com.educacionit.universidad.ciclos;

public class Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean llueve = true;
		
		if(llueve) {
			System.out.println("Llueve");
		}else {
			System.out.println("no llueve");
		}
		
		
		//if/elseif.../else
		int edad = 37;
		if(edad==18) {
			System.out.println("18");
		}else if(edad == 35) {
			System.out.println("35");
		}else if(edad > 36 && edad <= 37) {
			System.out.println("> 36 y <=37");
		}else if (llueve){
			System.out.println("Llueve");
		}else {
			System.out.println("Ninguna");
		}
		
		//Switch
		int nota = 10;
		switch(nota) {
			case 4:{
				System.out.println("A");
				break;
			}
			case 9:
			case 10:{
				System.out.println("18");
			
			}
			default:{
				System.out.println("default");
				break;
			}
		}
		
		boolean aprobado = (nota >= 7) ? true : false;
		String aprobado_dos = (nota >=7) ? "Aprobado" : "Reprobado";
		
		System.out.println(aprobado_dos);

	}

}
