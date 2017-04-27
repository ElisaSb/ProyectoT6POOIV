package com.iesvirgendelcarmen.Ejercicios.Ejercicio1;

public class TestPoligonoRegular {

	public static void main(String[] args) {
		ListaPoligonoRegular listap = new ListaPoligonoRegular();
		
		PoligonoRegular p1 = new TrianguloEquilatero(10);
		PoligonoRegular p2 = new TrianguloEquilatero(1);
		PoligonoRegular p3 = new TrianguloEquilatero(12);
		PoligonoRegular p4 = new Cuadrado(2);
		PoligonoRegular p5 = new Cuadrado(3);
		PoligonoRegular p6 = new Cuadrado(1);
		PoligonoRegular p7 = new Hexagono(1);
		PoligonoRegular p8 = new Hexagono(6);
		PoligonoRegular p9 = new Hexagono(4);
		
		listap.annadirPoligono(p1);
		listap.annadirPoligono(p2);
		listap.annadirPoligono(p3);
		listap.annadirPoligono(p4);
		listap.annadirPoligono(p5);
		listap.annadirPoligono(p6);
		listap.annadirPoligono(p7);
		listap.annadirPoligono(p8);
		listap.annadirPoligono(p9);
		
		System.out.println(listap);
	}

}
