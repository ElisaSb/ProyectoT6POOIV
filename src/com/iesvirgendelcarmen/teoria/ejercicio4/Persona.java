package com.iesvirgendelcarmen.teoria.ejercicio4;

public class Persona {
	//atributos
	private String nombreCompleto;
	private String DNI;
	private int edad;
	//constructor
	public Persona(String nombreCompleto, String dNI, int edad) {
		this.nombreCompleto = nombreCompleto;
		DNI = dNI;
		this.edad = edad;
	}
	//getters
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public String getDNI() {
		return DNI;
	}
	public int getEdad() {
		return edad;
	}
	//toString
	@Override
	public String toString() {
		return "Persona [nombreCompleto=" + nombreCompleto + ", DNI=" + DNI + ", edad=" + edad + "]";
	}	
}
