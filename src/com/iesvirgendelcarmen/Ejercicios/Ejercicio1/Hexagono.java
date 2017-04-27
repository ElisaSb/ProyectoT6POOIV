package com.iesvirgendelcarmen.Ejercicios.Ejercicio1;

public class Hexagono extends PoligonoRegular {
	//constructor
	public Hexagono(int logitudLadoPoligono) {
		super("Hexagono", 6, logitudLadoPoligono);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularAreaPoligono() {
		// TODO Auto-generated method stub
		return 3.0*Math.sqrt(3)*Math.pow(longitudLadoPoligono, 2);
	}

}
