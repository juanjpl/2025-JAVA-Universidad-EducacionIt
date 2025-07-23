package ar.com.educacionit.universidad.interfaces.mensajero;

public class Consola implements IMensajero {

	@Override
	public void enviar(Mensaje msj) {
		System.out.println("Enviando email: " + msj);
	}

	@Override
	public void setMensaje(Mensaje mensaje) {
		// TODO Auto-generated method stub
		
	}

	
}
