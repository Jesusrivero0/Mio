package Ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		Integer numero;
		Integer suma = 0;

		do {
			System.out.println("Indica numeros por consola (Para parar pon un 0)");
			numero = scanner.nextInt();
			suma = suma + numero;
		} while (numero != 0);

		System.out.println("su suma seria " + suma);
		scanner.close();
	}

}
