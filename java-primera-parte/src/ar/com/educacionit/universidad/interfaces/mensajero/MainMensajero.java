package ar.com.educacionit.universidad.interfaces.mensajero;

public class MainMensajero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mensajeAEnviar = "Quiero comer pizza de jamon y morron";
		String origen = "Origen....";
		String destino = "Destino ....";
		String path = "Path....";

		DB db = new DB();
		String tipo = db.getTipo();

		IMensajero mensajeria =MensajeriaBuilder.buildMensajeria(tipo);
		
		Mensaje mensaje = MensajeriaBuilder.buildMensaje(tipo,origen,destino,path,mensajeAEnviar);
		
		

		Mensajero mensajero = new Mensajero();
		mensajero.setMensajeria(mensajeria);		
		mensajero.enviarMensaje(mensaje);

	}

}
