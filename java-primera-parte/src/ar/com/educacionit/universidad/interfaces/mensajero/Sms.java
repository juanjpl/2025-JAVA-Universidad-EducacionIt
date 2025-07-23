package ar.com.educacionit.universidad.interfaces.mensajero;

public class Sms implements IMensajero {

	//Aca puedo tener la cantidad de atributos que necesite
	
	private String numeroDestino;
	private String numeroOrigen;

	@Override
	public void enviar(Mensaje msj) {
		// TODO Auto-generated method stub
		System.out.println("Enviando SMS: "+ msj);
	}

	@Override
	public void setMensaje(Mensaje mensaje) {
		// TODO Auto-generated method stub
		
	}
}
