package com.iesvirgendelcarmen.Ejercicios.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class ListaTrabajador {
	//atributos
	private List<Trabajador> listaTrabajadores = new ArrayList<>();
	//metodos
	public boolean annadirTrabajador(Trabajador t) {
		return listaTrabajadores.add(t);
	}
	//toString
	/*
	@Override
	public String toString() {
		return "ListaTrabajador [listaTrabajadores=" + listaTrabajadores + "]";
	}
	*/
}
