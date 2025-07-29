package ar.com.educacionit.universidad.exceptions;

import java.time.LocalDate;

public class PagoMain {

	public static void main(String[] args) throws SinSaldoException {
		// TODO Auto-generated method stub

		double montoAPagar = 150;
		String metodoDePagoSel ="MP";
		
		IMetodoPago metodoDePago = EnumMain.getMetodoEnum(metodoDePagoSel).getValor();
		
		if(metodoDePago instanceof MercadoPago mp) {
			((IConfigurable) metodoDePago).configurar( new String[] {
			"User","password","HTTTPS://mercadopago.com.ar"});
		}
		
		//Cuando quiero pagar puede pasar que 
		
		//1	-----> NetworkException
		//2	-----> SinSaldoException
		//3	-----> TimeOutException
		
		int reintentos = 3;
		ResultadoPago resultado = null;
		
		Pago pago = new Pago(montoAPagar, LocalDate.now(), ""+Math.random(), "Vendedor", "comprador");
		
		do {
			
			try {
				resultado = metodoDePago.pagar(pago);
				//Aca se ejecuto correctamente
	
			}catch(NetworkException | SinSaldoException e) {
				e.printStackTrace();
			}catch (TimeOutException te) {
				reintentos--;
			}finally {
				System.out.println("Se ejecuta siempre !! Ya sea por try o por catch");
			}
		}while(resultado == null && reintentos>0);
		
		//Ya pagó, 
		System.out.println(resultado);
	}

}
