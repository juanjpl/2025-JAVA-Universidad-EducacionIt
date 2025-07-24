package ar.com.educacionit.universidad.interfaces.kpi;

public class Atendidos implements IKpi{

	@Override
	public Result execute(Turno[] turnos) {
		// TODO Auto-generated method stub
		
		int atendidos = 0;
		
		for(var turno : turnos) {
			if(turno.getFechaAtencion()!=null) {
				atendidos++;
			}
		}
		
		
		return new Result("Atendidos: ", atendidos);
	}

	
}
