package Ejercicio13Repaso;

import java.util.Scanner;

public class Ejercicio13Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String frase = "";
		String resultado = "";
		do {

			System.out.println("Dime una frase");
			frase = scanner.nextLine();
			resultado += frase + " ";
			
		} while (!frase.equalsIgnoreCase("Fin"));
		resultado = resultado.substring(0,resultado.length() - 4);
		System.out.println(resultado);
		scanner.close();
	}

}
