package com.amarras;

public class YateVela extends Yate{
	private Double alturaMastil;
	private Integer superficieVelicaMayor, superficieTotal;
	
	public YateVela(String nombre, String dueno, Double manga, Double calado, Double eslora, Double peso,
			Integer tripulacion,Double alturaMastil, Integer superficieVelicaMayor,
			Integer superficieTotal) {
		
		super(nombre, dueno, manga, calado, eslora, peso, tripulacion, ePropulsion.VELA);
		this.alturaMastil = alturaMastil;
		this.superficieVelicaMayor = superficieVelicaMayor;
		this.superficieTotal = superficieTotal;
	}

	public Double getAlturaMastil() {
		return alturaMastil;
	}

	public void setAlturaMastil(Double alturaMastil) {
		this.alturaMastil = alturaMastil;
	}

	public Integer getSuperficieVelicaMayor() {
		return superficieVelicaMayor;
	}

	public void setSuperficieVelicaMayor(Integer superficieVelicaMayor) {
		this.superficieVelicaMayor = superficieVelicaMayor;
	}

	public Integer getSuperficieTotal() {
		return superficieTotal;
	}

	public void setSuperficieTotal(Integer superficieTotal) {
		this.superficieTotal = superficieTotal;
	}

	@Override
	public String toString() {
		return super.toString() + ", altura mastil=" + alturaMastil + "m, superficie vélica mayor=" + superficieVelicaMayor
				+ "m2, superficie total(vela mayor y foque)=" + superficieTotal + "m2]";
	}
}
