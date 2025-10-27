package Ejercicio16Repaso;

import java.util.Scanner;

public class Ejercicio16Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Indica una palabra");
		String palabra = scanner.nextLine();

		for (int i = 0; i < palabra.length(); i++) {
			String primeraLetra = palabra.substring(i, i+1);
			System.out.println(primeraLetra);
		}

		scanner.close();
	}

}
