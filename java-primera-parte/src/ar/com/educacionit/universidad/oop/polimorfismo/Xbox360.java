package ar.com.educacionit.universidad.oop.polimorfismo;

public final class Xbox360 extends Consola {
	
	private boolean tieneConexionAInternet;
	private int memoria;
	private boolean digital;
	private DiscoExterno discoExterno;
	

	//La play debe tener su constructor 
	//debe llamar al del padre
	
	public Xbox360(String serie, 
			String color, 
			boolean tieneConexion, 
			int memoria,
			boolean digital
			) {
		//super hace referencia al padre
		//super(): invocar al constructor de ese padre;
		super(serie,"Microsoft","Xbox360", color);
		
		//despues nace el hijo con atributos propios 
		this.tieneConexionAInternet=tieneConexion;
		this.digital = digital;

	}
	
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


	public DiscoExterno getDiscoExterno() {
		return discoExterno;
	}


	public void setDiscoExterno(DiscoExterno discoExterno) {
		this.discoExterno = discoExterno;
	}
	
	
}
