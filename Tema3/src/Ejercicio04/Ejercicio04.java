package Ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Indica cuantos numeros vas a introducir");
		Integer numero = scanner.nextInt();

		Integer[] arrayNumero = new Integer[numero];

		for (int i = 0; i < arrayNumero.length; i++) {
			System.out.println("Dime numeros");
			Integer n1 = scanner.nextInt();
			arrayNumero[i] = n1;

		}
		for (int i = arrayNumero.length - 1; i >= 0; i--) {
			if (i == 0) {
				System.out.print(arrayNumero[i]);
			} else {
				System.out.print(arrayNumero[i] + ", ");
			}

		}
		scanner.close();
	}

}
