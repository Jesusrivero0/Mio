package Ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String email;
		do {
			System.out.println("Indica su email");
			email = scanner.nextLine();

			if(!email.contains("@")) {
				System.out.println("Le falta el @");
			}
			else if(email.contains("@.")) {
				System.out.println("No puede tener . detras del @");
			}
			else if(email.endsWith(".")) {
				System.out.println("No puede terminar en .");
			}

		} while (!email.contains("@") || email.contains("@.") || email.endsWith("."));
		scanner.close();
	}
}
