package ar.com.educacionit.universidad.oop;

public class MainAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Forma de crear un objeto en java 
		//Clase nombreObjeto = new Clase();
		
		Auto clioUno = new Auto(
				"Renault",
				"Clio Uno",
				2016,
				"Rojo",
				"ABC123");

		Auto astraUno = new Auto(
				"Chevrolet",
				"Astra Uno",
				2016,
				"Rojo",
				"ABC123");
		
		System.out.println(clioUno.toString());
		System.out.println(astraUno);
		System.out.println("Son inguales?: " + (astraUno == clioUno));
	}

}
