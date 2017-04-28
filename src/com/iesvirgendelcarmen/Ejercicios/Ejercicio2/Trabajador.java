package com.iesvirgendelcarmen.Ejercicios.Ejercicio2;

public abstract class Trabajador {
	//atributos
	private String nombre;
	private String apellidos;
	//constructor
	public Trabajador(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	//metodos
	protected String nombreApellidos() {
		return nombre+" "+apellidos;
	}
	public abstract double obtenerSueldoMensual(int diasTrabajados);
	//toString
	@Override
	public String toString() {
		return "\n nombre= " + nombre + ", apellidos= " + apellidos;
	}
	
}
