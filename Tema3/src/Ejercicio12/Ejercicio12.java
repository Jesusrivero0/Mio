package Ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Indica una URL");
		String url = scanner.nextLine();

		String[] arrayCadenasBarras = url.split("//");
		String[] arrayCadenasPuntos = arrayCadenasBarras[1].split("\\.");

		System.out.println(arrayCadenasBarras[0] + "//");

		for (String string : arrayCadenasPuntos) {
			System.out.println(string);
		}
		scanner.close();
	}

}
