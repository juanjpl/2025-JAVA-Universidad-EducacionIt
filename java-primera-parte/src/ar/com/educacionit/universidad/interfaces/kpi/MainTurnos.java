package ar.com.educacionit.universidad.interfaces.kpi;

import java.util.Scanner;

public class MainTurnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Turno[] turnos = GeneradorTurnos.generarTurnos();
		
		Scanner teclado = new Scanner(System.in);
	
	for(var turno : turnos) {
		int opcion;
	
		
		
		do {
			System.out.println("Gestionar Turnos: ");
			System.out.println("1 - Atender");
			System.out.println("2 - Finalizar");
			System.out.println("3 - Derivar");
			System.out.println("0 - Finalizar");
			opcion=teclado.nextInt();
			
			
			IGestiones gestor = null;
			switch	(opcion) {
			case 1:
				gestor = new AtenderTurno();
				break;
			case 2:
				gestor = new FinalizarTurno();
				break;
			case 3:
				gestor = new DerivarTurno();
				break;
			
			default:
				break;
			}
			
			((GestionBase)gestor).setTurno(turno);
			gestor.gestionar();
			
			}while (opcion != 0);
	}
	
	teclado.close();
		
		IKpi[] kpis = new IKpi[] {new CantidadTotal(), new Atendidos(), new PorcentajeAtendidos(), new IKpi() {
			
			public Result execute (Turno[] turnos) {
				
				int abandonados = 0;
				
				for(var ikpi : turnos) {
					abandonados += ikpi.getFechaAbandono() != null ? 1 : 0;
				}
				return new Result("Abandonados: ", abandonados);
			}
		}};
				
		for(var kpi : kpis) {
		Result res = kpi.execute(turnos);
		System.out.println(res.getText() + " " + res.getValue());
		}

	}

}
