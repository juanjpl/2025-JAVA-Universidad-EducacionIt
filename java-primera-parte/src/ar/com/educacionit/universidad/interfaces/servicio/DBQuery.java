package ar.com.educacionit.universidad.interfaces.servicio;

public class DBQuery implements IQuery {

	
	@Override
	public User find() {
		System.out.println("Consultadon base de datos de usuarios DB...");
		
		var user = new User();
		
		return null;
	}
}
