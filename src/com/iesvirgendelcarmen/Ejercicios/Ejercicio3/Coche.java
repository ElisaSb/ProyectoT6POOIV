package com.iesvirgendelcarmen.Ejercicios.Ejercicio3;

public class Coche implements Vehiculo {

	int velocidadCoche = 0;
	int numeroPlazas = 0;
	
	@Override
	public String frenar(int velocidadDisminuir) {
		int velocidadActual = velocidadCoche - velocidadDisminuir;
		if (velocidadActual < 0)
			velocidadActual = 0;
		return "Velocidad actual del coche " + velocidadActual;
	}

	@Override
	public String acelerar(int velocidadAumentar) {
		int velocidadActual = velocidadCoche + velocidadAumentar;
		if (velocidadActual > VELOCIDAD_MAXIMA)
			velocidadActual = VELOCIDAD_MAXIMA;
		return "Velocidad actual del coche " + velocidadActual;
	}

	int obtenerNumeroPlazas(){
		return numeroPlazas;
	}
}
