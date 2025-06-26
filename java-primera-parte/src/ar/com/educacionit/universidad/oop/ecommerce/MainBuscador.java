package ar.com.educacionit.universidad.oop.ecommerce;


public class MainBuscador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Buscador buscador = new Buscador();
		
		String claveBuscadaPorElUSuario = "iron man";
		
		buscador.setClave(claveBuscadaPorElUSuario);
		buscador.buscar();
		
		System.out.println("Hemos encontrado "+ buscador.getCantidad()+ "resultados para "+ buscador.getClave() + "");
			
		
		//Recorro los resultados
		Resultado[] res= buscador.obtenerResultados();
		
		for(Resultado resultado : res) {
			System.out.println(resultado);
		}

	}

}
