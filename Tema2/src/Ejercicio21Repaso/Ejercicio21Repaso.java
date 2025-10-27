package Ejercicio21Repaso;

import java.util.Scanner;

public class Ejercicio21Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Indica un numero que sera n");
		Integer n1 = scanner.nextInt();
		
		for (int i = 0; i < n1; i++) {

			for (int j = 0; j < n1; j++) {
				if (i == j) {
					System.out.print(" * ");
				} else {
					System.out.print(" - ");
				}
			}
			System.out.println();
		}
		scanner.close();
	}
}
