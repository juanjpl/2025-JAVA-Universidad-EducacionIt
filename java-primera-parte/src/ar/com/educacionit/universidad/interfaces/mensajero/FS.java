package ar.com.educacionit.universidad.interfaces.mensajero;

public class FS extends Storage {
	
	private String path;

	public FS(String contenido, String path) {
		// TODO Auto-generated constructor stub
		super(contenido);
		
		this.setPath(path);
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	
	

}
