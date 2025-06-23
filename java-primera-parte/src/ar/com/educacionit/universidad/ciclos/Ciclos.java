package ar.com.educacionit.universidad.ciclos;

public class Ciclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ciclo for
		
		for(int i=0; i<10;i++) {
			System.out.println(i);
		}

		//While
		int i = 10;
		while(i<21) {
			System.out.println("================");
			System.out.println(i);
			i++;
		}
		
		//Do-while
		int j = 0;
		do {
			System.out.println(j++);
		}while(j<10);
		
		//arrays
		int[] edades = {0,1,2,3,4,5};
		int[] edades_dos= new int[6];
		
		for(int k : edades) {
			edades_dos[k] = k+10;
			System.out.println(edades_dos[k]);

		}
		
		for(int m=0 ; m < edades_dos.length ; m++) {
			edades_dos[m] = edades[m] +100;
			System.out.println(edades_dos[m]);

		}
		
		
}

}
