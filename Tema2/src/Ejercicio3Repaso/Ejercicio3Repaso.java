package Ejercicio3Repaso;

import java.util.Scanner;

public class Ejercicio3Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Integer respuesta = 0;
		do {
			System.out.println("*** Menu ***");
			System.out.println("1. Abrir");
			System.out.println("2. Guardar");
			System.out.println("3. Modificar");
			System.out.println("4. Salir");
			System.out.println("Indica que opcion quieres");
			respuesta = scanner.nextInt();

			if (respuesta == 1) {
				System.out.println(respuesta);

			} else if (respuesta == 2) {
				System.out.println(respuesta);

			} else if (respuesta == 3) {
				System.out.println(respuesta);

			} else if (respuesta == 4) {
				System.out.println("Bye Bye");
				break;

			}
		} while (respuesta <= 5);

		scanner.close();
	}

}
