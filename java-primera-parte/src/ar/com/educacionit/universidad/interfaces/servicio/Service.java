package ar.com.educacionit.universidad.interfaces.servicio;

public class Service {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ws = "1";
		
		//Crear el servicio que realiza la consulta
		IQuery query = ServiceBuilder.buildService(ws);
		
		//obtener el DTO = User
		User user = query.find();
		
		//Retornar al cliente la data 
		System.out.println(user);
		
		//fin
	}

}
