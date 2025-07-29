package ar.com.educacionit.universidad.exceptions;

public class MercadoPago implements IMetodoPago , IConfigurable {
	
	private String urlMP;
	private String user;
	private String password;
	
	
	
	public MercadoPago() {
		
	}

	public MercadoPago (String urlMP, String user, String password) {
		this.urlMP = urlMP;
		this.user = user;
		this.password = password;
	}

	@Override
	public ResultadoPago pagar(Pago pago) throws NetworkException, SinSaldoException, TimeOutException {
		// TODO Auto-generated method stub
		
		System.out.println("Conectando a mercado pago...");
		System.out.println("Usuario: " + user);
		System.out.println("Conexion ok...");
		
		
		System.out.println("Realizando pago...");
		
		if(pago.getMonto() >10 && pago.getMonto() < 20) {
			throw new TimeOutException();
			
		}
		
		if(pago.getMonto() >20 && pago.getMonto() < 40) {
			throw new SinSaldoException();
			
		}
		
		if(pago.getMonto() >40 && pago.getMonto() < 50) {
			throw new NetworkException("Error al consultar el servidor de MP");
			
		}
		
		
		
		return new ResultadoPago(true, "PAGO_EXITOSO");
	}

	@Override
	public void pagar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configurar(String... args) {
		if (args.length == 0 || args.length >3) {
			throw new IllegalArgumentException("Argumentos invalidos");
		}
		this.password = args[0];
		this.urlMP=args[1];
		this.urlMP = args[2];
	}


}
