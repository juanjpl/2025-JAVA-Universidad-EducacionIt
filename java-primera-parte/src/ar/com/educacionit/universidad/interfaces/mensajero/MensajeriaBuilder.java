package ar.com.educacionit.universidad.interfaces.mensajero;

public class MensajeriaBuilder {

	public static IMensajero buildMensajeria(String tipo) {
		
		if(tipo == null) {
			System.err.println("No se ha especificado tipo.");
			return null;
		}
		
		IMensajero mensajeria;

		switch (tipo) {
		case "sms":
			mensajeria = new Sms();
			break;
		case "email":
			mensajeria = new Email();
			break;
		case "File System":
			mensajeria = new FileSystem();
			break;
		default:
			mensajeria = new Consola();
		
	}
		return mensajeria;
	}

	public static Mensaje buildMensaje(String tipo, String origen, String destino, String path, String mensajeAEnviar) {
		// TODO Auto-generated method stub
		Mensaje mensaje;

		switch (tipo) {
		case "sms":
			mensaje = new Network(path,destino,origen);
			break;
		case "email":
			mensaje = new FS(destino,path);
			break;
		case "File System":
			mensaje = new Network(path,destino,origen);
			break;
		default:
			mensaje = new Default();
		
	}
		mensaje.setContenido(mensajeAEnviar);
		return mensaje;
	
	}
}
