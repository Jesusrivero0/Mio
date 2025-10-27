package Ejercicio12Repaso;

import java.util.Scanner;

public class Ejercicio12Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Indica un numero mayor que 0");
		Integer n1 = scanner.nextInt();

		if (n1 > 0) {
			for (int i = 0; i < n1; i++) {
				if (i == 0) {
					System.out.print(" __");
				} else {
					System.out.print("___");
				}

			}
			System.out.println();
			for (int i = 0; i < n1; i++) {
				System.out.print("|");
				for (int j = 0; j < n1; j++) {
					System.out.print("__");
					System.out.print("|");
				}
				System.out.println();
			}
		}
		scanner.close();
	}

}
