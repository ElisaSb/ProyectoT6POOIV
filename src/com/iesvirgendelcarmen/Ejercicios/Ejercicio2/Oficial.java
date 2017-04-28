package com.iesvirgendelcarmen.Ejercicios.Ejercicio2;

public class Oficial extends Trabajador {
	private static final double PAGA_DIARIA = 100;
	//atributos
	private String clase;
	//constructor
	public Oficial(String nombre, String apellidos, String clase) {
		super(nombre, apellidos);
		this.clase = clase;
	}
	//metodos
	@Override
	public double obtenerSueldoMensual(int diasTrabajados) {
		return diasTrabajados*PAGA_DIARIA;
	}
	
}
