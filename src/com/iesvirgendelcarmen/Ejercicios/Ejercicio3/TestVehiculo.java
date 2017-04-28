package com.iesvirgendelcarmen.Ejercicios.Ejercicio3;

public class TestVehiculo {

	public static void main(String[] args) {
		Vehiculo coche1 = new Coche();
		System.out.println(coche1.acelerar(25));
		System.out.println(coche1.frenar(125));
		System.out.println(coche1.acelerar(225));
		
		Vehiculo moto1 = new Motocicleta();
		System.out.println(moto1.acelerar(85));
		System.out.println(moto1.frenar(11));
		System.out.println(moto1.acelerar(22));
	}
}
