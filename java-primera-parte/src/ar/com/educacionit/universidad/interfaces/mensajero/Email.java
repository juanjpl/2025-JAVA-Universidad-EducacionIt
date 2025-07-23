package ar.com.educacionit.universidad.interfaces.mensajero;

public class Email implements IMensajero {

	@Override
	public void enviar(Mensaje msj) {
		System.out.println("Enviando EMAIL: "+ msj);
	}

	@Override
	public void setMensaje(Mensaje mensaje) {
		// TODO Auto-generated method stub
		
	}
}
