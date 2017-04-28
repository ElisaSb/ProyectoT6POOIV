package com.iesvirgendelcarmen.Ejercicios.Ejercicio2;

public class Tecnico extends Trabajador {
	final double PAGA_DIARIA = 200;
	//atributos
	private boolean titulacionSuperior;
	//constructor
	public Tecnico(String nombre, String apellidos, boolean titulacionSuperior) {
		super(nombre, apellidos);
		this.titulacionSuperior = titulacionSuperior;
	}
	//metodos
	@Override
	public double obtenerSueldoMensual(int diasTrabajados) {
		return PAGA_DIARIA*diasTrabajados;
	}
	

}
