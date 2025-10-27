package Ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Cual es tu altura: ");
		Double altura = scanner.nextDouble();

		System.out.println("Cual es tu peso: ");
		Double peso = scanner.nextDouble();
		
		if (peso >= 18.5) {
			System.out.println("Ta caniko (te falta puchero de la anguela)");
		} else if (peso >= 18.5 && peso <= 24.9) {
			System.out.println("Peso normal");
		} else if (peso >= 25.0 && peso <= 29.9) {
			System.out.println("Peso superior a lo normal");
		} else if (peso >= 30) {
			System.out.println("Obesidad");
		}

		Double imc = peso / (altura * altura);

		System.out.println("Su IMC es de " + imc);

		scanner.close();
	}

}
