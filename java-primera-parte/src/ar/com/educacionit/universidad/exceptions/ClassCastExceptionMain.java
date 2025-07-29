package ar.com.educacionit.universidad.exceptions;



public class ClassCastExceptionMain {

	public static void main(String[] args) {
		
		String a = "Hola";
		
		Object o = 100;
		
		//error en tiempo de compilacion
		
		a = (String)o;
		
		System.out.println(a);
	
		
	}
}
