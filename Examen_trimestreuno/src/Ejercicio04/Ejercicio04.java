package Ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Integer numero = 0;
		String palabra = null;
		do {
			System.out.println("Indique un numero entre 2 y 6");
			numero = scanner.nextInt();
			if (numero >= 6 || numero <= 2) {
				System.out.println("El numero es incorrecto");
			}
		} while (numero >= 6 || numero <= 2);

		for (int i = 0; i < numero; i++) {
			scanner.nextLine();

			Boolean palabraIncorrecta = false;

			while (!palabraIncorrecta) {
				System.out.println("Indica la palabra " + (i + 1));
				palabra = scanner.nextLine();

				if (palabra.length() > 5 || palabra.contains("ca") || palabra.contains("te")) {
					palabra += palabra;
					System.out.println("Palabra valida");
					i++;

				} else {
					System.out.println("Palabra incorrecta");
					palabraIncorrecta = false;

				}
				
			}

		}

		System.out.println(palabra + ", ");

		scanner.close();

	}
}
