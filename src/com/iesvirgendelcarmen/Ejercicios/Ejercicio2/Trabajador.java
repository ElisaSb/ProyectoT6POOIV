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
	public abstract double sueldoMensual(int diasTrabajados);
	//toString
	@Override
	public String toString() {
		return "nombre= " + nombre + ", apellidos= " + apellidos + "]";
	}
	
}
