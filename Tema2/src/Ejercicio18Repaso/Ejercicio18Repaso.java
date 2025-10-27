package Ejercicio18Repaso;

import java.util.Scanner;

public class Ejercicio18Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String primeraLetra = "";
		System.out.println("Indica una palabra");
		String palabra = scanner.nextLine();

		for (int i = palabra.length(); i > 0; i--) {
			primeraLetra = palabra.substring(i - 1, i);

		}
		System.out.print(primeraLetra);

		scanner.close();
	}

}
