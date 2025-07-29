package ar.com.educacionit.universidad.exceptions;

//nuestra primera exception = checkedException
public class NetworkException extends Exception {

	//atributos propios 
	
	private static final long serialVersionUID = 1L;
	
	private String status;
	public NetworkException(String msj) {
		super(msj);
	}
	
	public void setEstado(String status) {
		if(status == null || "".equals(status)) {
			this.status="N/A";
		}else {
			this.status = status;
		}
		
		
	}

	public String getStatus() {
		return status;
	}
}
