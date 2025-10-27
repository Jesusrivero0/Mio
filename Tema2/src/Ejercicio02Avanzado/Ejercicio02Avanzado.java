package Ejercicio02Avanzado;

import java.util.Scanner;

public class Ejercicio02Avanzado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Cual es el valor de n: ");
		Integer n = scanner.nextInt();
		
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < i; i++) {
					System.out.print("*");
					System.out.println();
				}
				System.out.println("-");
			}

		scanner.close();
	}

}
