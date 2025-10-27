package Ejercicio22Repaso;

import java.util.Scanner;

public class Ejercicio22Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i <= 10; i++) {
			System.out.println("Dele al enter para continuar");
			scanner.nextLine();
			System.out.println(i);
		}
		System.out.println("Completado");
		scanner.close();

	}

}
