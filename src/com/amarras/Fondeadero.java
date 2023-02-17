package com.amarras;

import java.util.*;

public class Fondeadero {
	private String nombre;
	private Integer amarrasMax, recaudacionTotal;
	private List<Yate> listaYatesAmarrados;
	
	public Fondeadero(String nombre, Integer amarrasMax) {
		this.nombre = nombre;
		this.amarrasMax = amarrasMax;
		this.recaudacionTotal=0;
		listaYatesAmarrados = new ArrayList<>();
	}
		
	public boolean amarrarYate(Yate yate) throws noSePudoAmarrarException {
		//	Amarra el yate. Mensaje si no existe el Yate 
		if ( yate != null && yate.getEstaAmarrado() == false && listaYatesAmarrados.size() < amarrasMax ) {
			yate.setEstaAmarrado(true);
			yate.pagarAmarre(this);
			listaYatesAmarrados.add(yate);
			return true;
		}
		throw new noSePudoAmarrarException("No se pudo amarrar el yate");
	}
	
	public boolean desamarrarYate(Yate yate) {
		//	desamarrarYate(Yate yate): libera la amarra. 
		if ( yate != null && yate.getEstaAmarrado() == true) {
			yate.setEstaAmarrado(false);
			listaYatesAmarrados.remove(yate);
			return true;
		} return false;
	}
	
	public int getCantidadDeYatesAmarrados() {
		//	obtenerCantidadDeYatesAmarrados: devuelve el total de amarras ocupadas. 
		return listaYatesAmarrados.size();
	}
	
	public int getCantidadDeAmarrasDisponibles() {
		//	obtenerCantidadDeAmarrasDisponibles: devuelve el total de amarras libres. 
		return ( this.amarrasMax - listaYatesAmarrados.size());
	}
	public int obtenerPrecioDeAmarre(Yate yate) {
		//	obtenerPrecioDeAmarre(Yate yate): devuelve el importe en PESOS que debe abonar 
		//	por la amarra mensualmente el dueño. El costo mensual estará dado dos 
		//	parámetros: tipo (Motor: $ 10.000 / Vela $ 9000)  
		//	Eslora (hasta 20 mts.: $2.000 y mayores a 20 mts.: $3.000). 
		int importeTotal= 0;
		
		if (yate.getEslora() <= 20.0) {
			importeTotal+=2000;
		}
		else if ( yate.getEslora() > 20.0) {
			importeTotal += 3000;
		}
		
		if ( yate instanceof YateMotor) {
			importeTotal+=10000;
		}
		else if ( yate instanceof YateVela) {
			importeTotal+=9000;
		}
		return importeTotal;
	}
	
	public int getRecaudacionTotal() {
//		obtenerRecaudacionTotal: devuelve el total recaudado por la ocupación de amarras actual
		return this.recaudacionTotal;
	}

	public void aumentarRecaudacionTotal(Integer recaudacionTotal) {
		this.recaudacionTotal += recaudacionTotal;
	}
}
