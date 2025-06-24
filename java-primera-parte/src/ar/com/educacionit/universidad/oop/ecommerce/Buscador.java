package ar.com.educacionit.universidad.oop.ecommerce;

import java.util.Arrays;

public class Buscador {

	//Atributos
	private String clave;
	private Resultado[] resultados;
	private int Cantidad;
	
	
	//Constructor
	public Buscador() {
		
		//Asi nace el buscador
		this.resultados = new Resultado[0];
		this.clave="";
		
	}
	
	//Metodo
	public void buscar() {
		//Cuando usamos String
		//casA == casaA
		//boolean iguales = "casA".equals(cadena);
		/*
		if("".equals(clave)) {
			
		}
		
		if(clave == clave) {
			
		}
		*/
		
		//Guard
		if(claveVacia()) {
			System.out.println("No ha ingresado clave de busqueda.");
			return;
		}
		// Acá se llama al metodo actualizarResultados(Lista)
		//Simular que la consulta encuentra 3 resultados
		//Creando 3 ojetos de la clase Resultado
		
		Resultado res1 = new Resultado("NEON GENESIS EVANGELION - EDICION DELUXE 1","https://acdn-us.mitiendanube.com/stores/004/088/117/products/612773-5b0931a5151f09f0f617274474760460-1024-1024.webp",8900.00f,"Yoshiyuki Sadamoto");
		Resultado res2 = new Resultado("NEON GENESIS EVANGELION - EDICION DELUXE 2","https://acdn-us.mitiendanube.com/stores/004/088/117/products/612770-be12c618ff4f08973d17274474558359-1024-1024.webp",8900.00f,"Yoshiyuki Sadamoto");
		Resultado res3 = new Resultado("NEON GENESIS EVANGELION - EDICION DELUXE 3","https://acdn-us.mitiendanube.com/stores/004/088/117/products/537617-18ef6e01253d250ea617273561747912-1024-1024.webp",8900.00f,"Yoshiyuki Sadamoto");

		//Agregar los resultados al arraeglo
		this.agregarResultado(res1);
		this.agregarResultado(res2);
		this.agregarResultado(res3);
	}
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public String getClave() {
		return this.clave;
	}
	private boolean claveVacia() {
		return "".equals(this.clave.trim());
	}
	
	public void agregarResultado(Resultado res) {
		
		var aux = new Resultado[this.resultados.length + 1];
		
		for(int i=0; i<this.resultados.length; i++) {
			aux[i] = this.resultados[i];
		}
		aux[aux.length] = res;
		
		setResultados(aux);
	}
	
	private void setResultados(Resultado[] res) {
		this.resultados = res;
	}
	
	//Getter
	public Resultado[] obtenerResultados() {
	
		return this.resultados;
	}
	
	private void actualizarResultados(Resultado[] res) {
		
		if(res==null) {
			this.resultados = new Resultado[0];
		}else {
			this.resultados = res;
		}
	}
	
	public int getCantidad() {
		return this.resultados.length;
	}

	@Override
	public String toString() {
		return "Buscador [clave=" + clave + ", resultados=" + Arrays.toString(resultados) + ", Cantidad=" + Cantidad
				+ "]";
	}
	
	
}
