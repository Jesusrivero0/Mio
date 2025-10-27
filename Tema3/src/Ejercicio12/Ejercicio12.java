package Ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Indica una URL");
		String url = scanner.nextLine();

		String[] arrayCadenasBarras = url.split("//");
		String[] arrayCadenasPuntos = url.split(".");

		for (int i = 0; i < arrayCadenasBarras.length; i++) {
			System.out.println(arrayCadenasBarras[i]);
		}
		for (int i = 0; i < arrayCadenasPuntos.length; i++) {
			System.out.print(arrayCadenasPuntos[i]);

		}

		scanner.close();
	}

}
