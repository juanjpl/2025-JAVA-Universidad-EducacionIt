package ar.com.educacionit.universidad.interfaces.mensajero;

public class  Network extends Mensaje {
	
	private String destino;
	private String origen;

	public Network(String mensaje, String destino, String origen) {
		
		this.setDestino(destino);
		this.setOrigen(origen);
		
		
	}
	
	//Setters

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	//Getters
	public String getDestino() {
		return destino;
	}

	public String getOrigen() {
		return origen;
	}
	
}
