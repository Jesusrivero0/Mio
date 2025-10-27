package Ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Dime un numero");
		Integer numero = scanner.nextInt();

		Integer[] arrayNumero = new Integer[5];

		for (int i = 0; i < arrayNumero.length; i++) {
			Integer siguiente = numero + i;
			
			arrayNumero[i] = siguiente * siguiente;
		}
		
		for (int i = 0; i < arrayNumero.length; i++) {
			if (i < 4) {
				System.out.print(arrayNumero[i] + ",");
			} else {
				System.out.print(arrayNumero[i]);
			}

		}

		scanner.close();
	}

}
