package ar.com.educacionit.universidad.oop.polimorfismo;

public class Playstation extends Consola {
	
	private boolean tieneConexionAInternet;
	private int memoria;
	private boolean digital;
	private int version;
	private String modelo;
	private DiscoExterno discoExterno;
	

	//La play debe tener su constructor 
	//debe llamar al del padre
	
	public Playstation(String serie, 
			String color, 
			int version, 
			boolean tieneConexion, 
			int memoria,
			boolean digital
			) {
		//super hace referencia al padre
		//super(): invocar al constructor de ese padre;
		super(serie,"Sony","Playstation"+version, color);
		
		//despues nace el hijo con atributos propios 
		this.version = version;
		this.tieneConexionAInternet=tieneConexion;
		this.digital = digital;

	}

	@Override
	public void play() {
		System.out.println("Jugando con la Xbox 360");
	}


	public boolean isTieneConexionAInternet() {
		return tieneConexionAInternet;
	}


	public void setTieneConexionAInternet(boolean tieneConexionAInternet) {
		this.tieneConexionAInternet = tieneConexionAInternet;
	}


	public int getMemoria() {
		return memoria;
	}


	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}


	public boolean isDigital() {
		return digital;
	}


	public void setDigital(boolean digital) {
		this.digital = digital;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public DiscoExterno getDiscoExterno() {
		return discoExterno;
	}


	public void setDiscoExterno(DiscoExterno discoExterno) {
		this.discoExterno = discoExterno;
	}
	
	
}
