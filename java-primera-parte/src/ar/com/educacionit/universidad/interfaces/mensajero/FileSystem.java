package ar.com.educacionit.universidad.interfaces.mensajero;

public class FileSystem implements IMensajero{


	
	@Override
	public void enviar (Mensaje msj) {
		
		Storage storageDentroDelMsj = ((Storage)msj);
		
		FS fileSystemDentroDelStorage = (FS)storageDentroDelMsj;
		
		System.out.println("Grabando mensaje en disco: "+ storageDentroDelMsj.getContenido() + ""+ fileSystemDentroDelStorage.getPath());
	}

	@Override
	public void setMensaje(Mensaje mensaje) {
		// TODO Auto-generated method stub
		
	}
}
