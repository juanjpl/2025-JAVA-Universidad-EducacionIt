package ar.com.educacionit.universidad.exceptions;

import java.util.Scanner;

public class EnumMain {

	public static void main(String[] arg) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Seleccione metodo de pago" + "MP ---> MERCADO PAGO\n"+ "TC ---> TARJETA CREDITO\\n"+"TD ---> TARJETA DEBITO\\n" + "TRA ---> TRANSFERENCIA\\n");
		String metodoDesdeFrontEnd = teclado.next();
		
		MetodoPagoEnum elEnum = getMetodoEnum(metodoDesdeFrontEnd);
		IMetodoPago metodoDePagoImpl = elEnum.getValor();
		
		System.out.println(metodoDePagoImpl);
	}

	public static MetodoPagoEnum getMetodoEnum(String metodoDelFrontEnd) {

		if (metodoDelFrontEnd == null) {
			throw new IllegalArgumentException(metodoDelFrontEnd + " no es válido.");
		}

		MetodoPagoEnum metodoEnum = null;
		switch (metodoDelFrontEnd) {
		case "MP":
			metodoEnum = MetodoPagoEnum.MERCADO_PAGO;
			break;
		case "TC":
			metodoEnum = MetodoPagoEnum.TARJETA_CREDITO;
			break;
		case "TD":
			metodoEnum = MetodoPagoEnum.TARJETA_DEBIDO;
			break;
		case "TRA":
			metodoEnum = MetodoPagoEnum.TRANSFERENCIA;
			break;
		}

		if (metodoEnum == null) {
			throw new IllegalArgumentException(metodoDelFrontEnd + " no es válido.");
		}

		return metodoEnum;
	}

	public static IMetodoPago getMetodo(MetodoPagoEnum _metodoEnum) {

		if (_metodoEnum == null) {
			throw new IllegalArgumentException("MetodoEnum no es válido.");
		}

		return _metodoEnum.getValor();
	}
}
