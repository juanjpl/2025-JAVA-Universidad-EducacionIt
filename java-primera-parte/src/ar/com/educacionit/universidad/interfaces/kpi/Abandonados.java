package ar.com.educacionit.universidad.interfaces.kpi;

public class Abandonados implements IKpi {

	@Override
	public Result execute(Turno[] turnos) {
		// TODO Auto-generated method stub
		
		int atendidos = 0;
		
		for(int i=0; i <turnos.length; i++) {
			if(turnos[i].getFechaAtencion()!=null) {
				atendidos++;
			}
		}
		
		return new Result("Atendidos: ", atendidos);
	}

}
