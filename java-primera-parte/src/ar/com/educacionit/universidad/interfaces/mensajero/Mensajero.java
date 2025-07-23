package ar.com.educacionit.universidad.interfaces.mensajero;

public class Mensajero {

	private IMensajero mensajeria;
	
	/*
	
	
	//composicion
	public Mensajero(IMensajero mensajeria) {
		this.mensajeria=mensajeria;
	}
	*/
	
	
	//agregacion
	public void enviarMensaje(Mensaje msj) {
		if(mensajeria == null) {
			System.err.println("No hay mensjaeria disponible!");
		}
		this.mensajeria.enviar(msj);
	}
	
	public void setMensajeria(IMensajero mensajeria) {
		this.mensajeria = mensajeria;
	}

}
