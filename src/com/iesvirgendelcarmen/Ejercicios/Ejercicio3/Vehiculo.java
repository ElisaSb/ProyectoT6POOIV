package com.iesvirgendelcarmen.Ejercicios.Ejercicio3;

public interface Vehiculo {
	
	//public, static y final
	int VELOCIDAD_MAXIMA = 120;
	
	String frenar(int velocidadDisminuir);
	String acelerar(int velocidadAumentar);
}
