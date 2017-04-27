package com.iesvirgendelcarmen.Ejercicios.Ejercicio1;

public class TrianguloEquilatero extends PoligonoRegular {
	//constructor superclase
	public TrianguloEquilatero(int logitudLadoPoligono) {
		super("Triangulo Equilatero", 3, logitudLadoPoligono);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularAreaPoligono() {
		// TODO Auto-generated method stub
		return longitudLadoPoligono / 2.0 * Math.sqrt(5);
	}

}
