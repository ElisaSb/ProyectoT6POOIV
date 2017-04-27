package com.iesvirgendelcarmen.Ejercicios.Ejercicio1;

public class Cuadrado extends PoligonoRegular {
	//contructor
	public Cuadrado(int logitudLadoPoligono) {
		super("Cuadrado", 4, logitudLadoPoligono);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularAreaPoligono() {
		// TODO Auto-generated method stub
		return longitudLadoPoligono*longitudLadoPoligono;
	}

}
