package Ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String username;
		do {
		System.out.println("Indica un username: ");
		 username = scanner.nextLine();
		
			username.trim();
			username.toUpperCase();

			if (username.length() < 10) {
				System.out.println("Error es menor de 10");
			} else if (username.contains(" ")) {
				System.out.println("Error contiene espacio");
			} else {
				System.out.println("CORRECTO!!!");
			}
		} while (username.length() < 10 || username.contains(" "));

		scanner.close();
	}

}
