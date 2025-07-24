package ar.com.educacionit.universidad.interfaces.kpi;

public class PorcentajeAtendidos implements IKpi {

	@Override
	public Result execute(Turno[] turnos) {
		// TODO Auto-generated method stub
		
		Atendidos atendidos = new Atendidos();
		Result res = atendidos.execute(turnos);

	
		return new Result("%Atendidos;", (res.getValue()*100)/turnos.length);
		
	
	}

}
