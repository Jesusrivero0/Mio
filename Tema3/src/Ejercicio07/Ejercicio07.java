package Ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Indica cuantos numeros vas a introducir");
		Integer numero = scanner.nextInt();

		Integer[] arrayNumero = new Integer[numero];
		Integer[] arrayInverso = new Integer[numero];
		for (int i = 0; i < arrayInverso.length; i++) {
			System.out.println("Dime numeros");
			Integer n1 = scanner.nextInt();
			arrayInverso[i] = n1;
		}
		for (int i = arrayInverso.length; i >= 0; i--) {
			System.out.print(arrayInverso[i] + ", ");

		}
		scanner.close();
	}

}
