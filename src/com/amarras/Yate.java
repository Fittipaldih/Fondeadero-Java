package com.amarras;

import java.util.Objects;

public abstract class Yate {
	private String nombre, dueno;
	private double manga, calado, eslora, peso;
	private int tripulacion;
	private ePropulsion propulsion;
	private boolean estaAmarrado;
	
	public Yate(String nombre, String dueno, double manga, double calado, double eslora, double peso,int tripulacion, ePropulsion propulsion) {
		this.nombre = nombre;
		this.dueno = dueno;
		this.manga = manga;
		this.calado = calado;
		this.eslora = eslora;
		this.peso = peso;
		this.tripulacion = tripulacion;
		this.propulsion = propulsion;
		this.estaAmarrado = false;
	}


	public void pagarAmarre(Fondeadero fondedero) {
		int costoAmarre = fondedero.obtenerPrecioDeAmarre(this);
		fondedero.aumentarRecaudacionTotal(costoAmarre);	
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Yate other = (Yate) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		String retornoAmarre;
		if (this.estaAmarrado== true) {
			retornoAmarre="está amarrado";
		}
		else {
			retornoAmarre="NO está amarrado";
		}
		
		return "Yate [nombre=" + nombre + ", dueño=" + dueno + ", manga=" + manga + "m, calado=" + calado + "m, eslora="
				+ eslora + "m, peso=" + peso + "Kg, tripulacion=" + tripulacion + ", propulsion=" + propulsion + ", " + retornoAmarre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDueno() {
		return dueno;
	}

	public void setDueno(String dueno) {
		this.dueno = dueno;
	}

	public double getManga() {
		return manga;
	}

	public void setManga(double manga) {
		this.manga = manga;
	}

	public double getCalado() {
		return calado;
	}

	public void setCalado(double calado) {
		this.calado = calado;
	}

	public double getEslora() {
		return eslora;
	}

	public void setEslora(double eslora) {
		this.eslora = eslora;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getTripulacion() {
		return tripulacion;
	}

	public void setTripulacion(int tripulacion) {
		this.tripulacion = tripulacion;
	}

	public ePropulsion getPropulsion() {
		return propulsion;
	}

	public void setPropulsion(ePropulsion propulsion) {
		this.propulsion = propulsion;
	}

	public boolean getEstaAmarrado() {
		return estaAmarrado;
	}

	public void setEstaAmarrado(boolean estaAmarrado) {
		this.estaAmarrado = estaAmarrado;
	}
}
