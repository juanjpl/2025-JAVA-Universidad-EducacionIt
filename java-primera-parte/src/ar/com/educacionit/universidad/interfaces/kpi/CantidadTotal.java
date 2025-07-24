package ar.com.educacionit.universidad.interfaces.kpi;

public class CantidadTotal implements IKpi {
	
	@Override
	public Result execute(Turno[] turnos) {
		return new Result("Cantidad total: " , turnos.length);
	}

}
