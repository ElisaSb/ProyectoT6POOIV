package com.iesvirgendelcarmen.Ejercicios.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class ListaPoligonoRegular {
	
	private List<PoligonoRegular> listaPoligonoRegulares = new ArrayList<>();
	
	public boolean annadirPoligono(PoligonoRegular p){
		return listaPoligonoRegulares.add(p);
	}

	@Override
	public String toString() {
		return listaPoligonoRegulares.toString();
	} 
	
}
