package Ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Indica un texto por teclado");
		String texto = scanner.nextLine();
		Integer fin;
		Integer inicio = 0;
		String corte;
		;
		while (true) {
			fin = inicio + 5;

			if (fin < texto.length()) {
				corte = texto.substring(inicio, fin);
				System.out.println(corte);
				inicio = fin;
			} else {
				corte = texto.substring(inicio);
				System.out.println(corte);
				break;
			}

		}
		scanner.close();
	}
}
