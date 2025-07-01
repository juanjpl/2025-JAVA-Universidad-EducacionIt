package ar.com.educacionit.universidad.oop.ecommerce;

public class MainResultados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Buscador buscador = new Buscador();
		
		String claveBuscadaPorElUsuario = "Iron man";
		
		buscador.setClave(claveBuscadaPorElUsuario);
		
		buscador.buscar();
		
		System.out.println("Hemos encontrado"+ buscador.getCantidad() + " resultados para: "+ buscador.getClave());
		
		Resultado[] res = buscador.obtenerResultados();
		
		for(Resultado resultado : res) {
			System.out.println(resultado);
		}
		
		
	}

}
