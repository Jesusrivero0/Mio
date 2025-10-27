package Ejercicio14Repaso;

import java.util.Scanner;

public class Ejercicio14Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String contraseña = "";
		do {
			System.out.println("Indica una palabra con al menos 8 caracteres: ");
			contraseña = scanner.nextLine();

			contraseña = contraseña.replace("a", "4");

			contraseña = contraseña.replace("e", "3");

			contraseña = contraseña.replace("i", "1");

			contraseña = contraseña.replace("o", "0");

			contraseña = contraseña.replace("t", "7");

			System.out.println(contraseña);
		} while (contraseña.length() < 8);

		scanner.close();

	}

}
