package com.iesvirgendelcarmen.Ejercicios.Ejercicio2;

public class TestTrabajador {

	public static void main(String[] args) {
		ListaTrabajador lista = new ListaTrabajador();
		
		Trabajador t1 = new Oficial("Carlos", "Aguilar Ortega", "boka");
		Trabajador t2 = new Tecnico("Elisa", "Serrano Blazquez", true);
		
		lista.annadirTrabajador(t1);
		lista.annadirTrabajador(t2);
		
		System.out.println(lista);
		
		
	}

}
