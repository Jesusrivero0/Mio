package Ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Integer total = 0;
		System.out.println("Indica cuantos numeros vas a introducir");
		Integer numero = scanner.nextInt();
		Integer maximo = 0;
		Integer minimo = 0;

		Integer[] arrayNumero = new Integer[numero];

		for (int i = 0; i < arrayNumero.length; i++) {
			System.out.println("Dime numeros");
			Integer n1 = scanner.nextInt();
			arrayNumero[i] = n1;
			total = total + arrayNumero[i];
			if (n1 > maximo) {
				maximo = n1;
			} else if (n1 > minimo) {
				minimo = n1;
			}

		}
		for (int i = arrayNumero.length - 1; i >= 0; i--) {
			if (i == 0) {
				System.out.print(arrayNumero[i]);
			} else {
				System.out.print(arrayNumero[i] + ", ");
			}
			
		}
		System.out.println();
		System.out.println("El maximo es " + maximo);
		System.out.println("El maximo es " + minimo);
		System.out.print("La media es de todos es " + (total / arrayNumero.length));
		scanner.close();
	}

}
