package com.iesvirgendelcarmen.teoria.ejercicio1;

public class Figuras4Lados {
	//atributos
	private int lado1;
	private int lado2;
	private int lado3;
	private int lado4;
	//constructor
	public Figuras4Lados(int lado1, int lado2, int lado3, int lado4) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
	}
	//toString
	@Override
	public String toString() {
		return "Figuras4Lados [lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + ", lado4=" + lado4 + "]";
	}
	
}
