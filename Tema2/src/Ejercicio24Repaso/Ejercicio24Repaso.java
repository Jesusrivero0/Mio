package Ejercicio24Repaso;

import java.util.Scanner;

public class Ejercicio24Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Integer numero = 0;
		Integer total = 0;
		do {
			System.out.println("Indica un numero mayor que 0");
			numero = scanner.nextInt();
			for (int i = 0; i <= numero; i++) {
				if (i % 2 == 1) {
					total = i + total;
				}

			}
			System.out.print("la suma de los impares es de " + total);
		} while (numero < 0);

		scanner.close();
	}

}
