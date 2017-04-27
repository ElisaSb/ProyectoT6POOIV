package com.iesvirgendelcarmen.teoria.ejercicio4;

public class Test {

	public static void main(String[] args) {
		InterfazFuncional saludoCastellano = new SaludoCastellano();
		saludoCastellano.saludar("Elisa");
		InterfazFuncional saludoIngles = new SaludoIngles();
		saludoIngles.saludar("Elisa");
		//expresion lambda
		// f(x) = x - 3
	//	InterfazFuncional saludo =   (x) -> saludoCastellano(x)


	}

}
