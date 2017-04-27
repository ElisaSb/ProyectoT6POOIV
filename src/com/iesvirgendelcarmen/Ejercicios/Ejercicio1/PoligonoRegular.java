package com.iesvirgendelcarmen.Ejercicios.Ejercicio1;

import javax.management.RuntimeErrorException;

public abstract class PoligonoRegular {
	//atributos
	private String nombrePoligono;
	private int numeroLadosPoligono;
	protected int longitudLadoPoligono;
	//constructor
	public PoligonoRegular(String nombrePoligono, int numeroLadosPoligono, int logitudLadoPoligono) {
		if (numeroLadosPoligono > 2 && logitudLadoPoligono > 0) {
			this.nombrePoligono = nombrePoligono;
			this.numeroLadosPoligono = numeroLadosPoligono;
			this.longitudLadoPoligono = logitudLadoPoligono;
		}
		else 
			throw new RuntimeException("No se puede crear poligono con esos datos");
	}
	//metodos
	public int calcularPerimetroPoligonor() {
		return numeroLadosPoligono*longitudLadoPoligono;
	}
	public abstract double calcularAreaPoligono();
	//toString
	@Override
	public String toString() {
		return "nombrePoligono= " + nombrePoligono + ", numeroLadosPoligono= " + numeroLadosPoligono
				+ ", logitudLadoPoligono= " + longitudLadoPoligono + ", Perimetro= "
				+ calcularPerimetroPoligonor() + ", Area()= " + calcularAreaPoligono() + "\n";
	}
	
}
