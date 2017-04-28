package com.iesvirgendelcarmen.Ejercicios.Ejercicio3;

public class Motocicleta implements Vehiculo {

	int velocidadMotocicleta = 0;
	int numeroPlazas = 5;
	
	@Override
	public String frenar(int velocidadDisminuir) {
		int velocidadActual = velocidadMotocicleta - velocidadDisminuir;
		if (velocidadActual < 0)
			velocidadActual = 0;
		return "Velocidad actual de la motocicleta " + velocidadActual;
	}

	@Override
	public String acelerar(int velocidadAumentar) {
		int velocidadActual = velocidadMotocicleta + velocidadAumentar;
		if (velocidadActual > VELOCIDAD_MAXIMA)
			velocidadActual = VELOCIDAD_MAXIMA;
		return "Velocidad actual de la motocicleta " + velocidadActual;
	}

	int obtenerNumeroPlazas(){
		return numeroPlazas;
	}
}
