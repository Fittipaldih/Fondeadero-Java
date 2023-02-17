package com.amarras;

public class YateMotor extends Yate{

	private Integer desplazamiento, potencia, velocidad, autonomia;

	public YateMotor(String nombre, String dueno, Double manga, Double calado, Double eslora, Double peso,
			Integer tripulacion, Integer desplazamiento, Integer potencia, Integer velocidad,
			Integer autonomia) {
		super(nombre, dueno, manga, calado, eslora, peso, tripulacion, ePropulsion.MOTOR);
		this.desplazamiento = desplazamiento;
		this.potencia = potencia;
		this.velocidad = velocidad;
		this.autonomia = autonomia;
	}

	public Integer getDesplazamiento() {
		return desplazamiento;
	}

	public void setDesplazamiento(Integer desplazamiento) {
		this.desplazamiento = desplazamiento;
	}

	public Integer getPotencia() {
		return potencia;
	}

	public void setPotencia(Integer potencia) {
		this.potencia = potencia;
	}

	public Integer getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Integer velocidad) {
		this.velocidad = velocidad;
	}

	public Integer getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(Integer autonomia) {
		this.autonomia = autonomia;
	}

	@Override
	public String toString() {
		return super.toString() + ", desplazamiento de motor=" + desplazamiento + "t, potencia=" + potencia + "kw, velocidad max=" + velocidad
				+ "nudos, autonomia=" + autonomia + "mn]";
	}
}
