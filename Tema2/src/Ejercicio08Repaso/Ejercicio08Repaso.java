package Ejercicio08Repaso;

import java.util.Scanner;

public class Ejercicio08Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String texto = "";
		do {
			System.out.println("Hola indica un texto");
			texto = scanner.nextLine();

			if (texto.startsWith("hola") && texto.endsWith("hastaluego")) {

				System.out.println("Lo hemos entendido perfectamente");
				String texto2 = texto.substring(5, texto.length() - 11);
				System.out.println(texto2);

			} else {
				System.out.println("no lo entendimos");

			}
		} while (!texto.startsWith("hola") || !texto.endsWith("hastaluego"));

		scanner.close();

	}

}
