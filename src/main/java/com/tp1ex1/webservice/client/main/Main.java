package com.tp1ex1.webservice.client.main;

import com.tp1ex1.webservice.client.Calculator;
import com.tp1ex1.webservice.client.CalculatorSoap;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// Créez une instance du service
        CalculatorSoap calculator = new Calculator().getCalculatorSoap();

        // Définissez deux nombres
        int a = 5;
        int b = 3;

        // Appelez les méthodes du service
        int addition = calculator.add(a, b);
        int soustraction = calculator.subtract(a, b);
        int multiplication = calculator.multiply(a, b);
        int division = calculator.divide(a, b);

        // Affichez les résultats
        System.out.println("Addition: " + addition);
        System.out.println("Soustraction: " + soustraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
	}

}
