package ar.com.educacionit.universidad.interfaces.kpi;

import java.time.LocalDateTime;

public class Turno {

	//1) atributos
	private LocalDateTime horario;
	private String dni;
	private String tipoTramite;
	private LocalDateTime fechaCreacionTurno;
	private LocalDateTime fechaAtencion;
	private LocalDateTime fechaFinAtencion;
	private LocalDateTime fechaAbandono;
	private int sucursal;
	private String asesor;
	
	
	//2) constructor
	public Turno(String dni, String tipoTramite, LocalDateTime fechaCreacionTurno, LocalDateTime fechaFinAtencion,
			int sucursal) {
		super();
		this.dni = dni;
		this.tipoTramite = tipoTramite;
		this.fechaCreacionTurno = fechaCreacionTurno;
		this.fechaFinAtencion = fechaFinAtencion;
		this.sucursal = sucursal;
	}

	
	//3)Getters

	public LocalDateTime getHorario() {
		return horario;
	}


	public String getDni() {
		return dni;
	}


	public String getTipoTramite() {
		return tipoTramite;
	}


	public LocalDateTime getFechaCreacionTurno() {
		return fechaCreacionTurno;
	}


	public LocalDateTime getFechaAtencion() {
		return fechaAtencion;
	}


	public LocalDateTime getFechaFinAtencion() {
		return fechaFinAtencion;
	}


	public LocalDateTime getFechaAbandono() {
		return fechaAbandono;
	}


	public int getSucursal() {
		return sucursal;
	}


	public String getAsesor() {
		return asesor;
	}

	//4)Setters

	public void setHorario(LocalDateTime horario) {
		this.horario = horario;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public void setTipoTramite(String tipoTramite) {
		this.tipoTramite = tipoTramite;
	}


	public void setFechaCreacionTurno(LocalDateTime fechaCreacionTurno) {
		this.fechaCreacionTurno = fechaCreacionTurno;
	}


	public void setFechaAtencion(LocalDateTime fechaAtencion) {
		this.fechaAtencion = fechaAtencion;
	}


	public void setFechaFinAtencion(LocalDateTime fechaFinAtencion) {
		this.fechaFinAtencion = fechaFinAtencion;
	}


	public void setFechaAbandono(LocalDateTime fechaAbandono) {
		this.fechaAbandono = fechaAbandono;
	}


	public void setSucursal(int sucursal) {
		this.sucursal = sucursal;
	}


	public void setAsesor(String asesor) {
		this.asesor = asesor;
	}
	
	
	
	

	

	
	
}
