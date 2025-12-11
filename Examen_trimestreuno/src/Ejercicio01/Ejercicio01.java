package Ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Dime una palabra");
		String palabra = scanner.nextLine();

		System.out.println("Indica una lista de letras separadas por comas");
		String letra = scanner.nextLine();

		String[] arrayLetra = letra.split(",");
		String[] arrayPalabra = palabra.split("");

		for (int i = 0; i < arrayLetra.length; i++) {
			for (int j = 0; j < arrayPalabra.length; j++) {
				if (arrayPalabra[j].equalsIgnoreCase(arrayLetra[i])) {
					arrayLetra[i] = "*";
					arrayPalabra[j] = arrayLetra[i];
				}

			}

		}
		for (String string : arrayPalabra) {
			System.out.print(string);
		}

		scanner.close();

	}




}
