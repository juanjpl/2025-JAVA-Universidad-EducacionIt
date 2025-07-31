package ar.com.educacionit.universidad.generics;

public class MainGeneric {

	//La ida es convertir en base a un argumento
	//un vector de datos.
	
	public static void main(String[] args) {
		
		String tipoQueVieneDeFrontEnd = "CSV";
		
		//Crear un alumno
		Alumno alumno = new Alumno("31752451","Perez","Juan","Java");
		
		//Creamos el parser
		
		IParser<String> parser = new CSVParser(alumno);
		
		//parseo		
		
		String dato = parser.parse();
		
		//Muestro 
		System.out.println(dato);
	}
}
