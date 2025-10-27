package Ejercicio26Repaso;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio26Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		Integer aleatorio = random.nextInt(1, 4);
		String respuesta2 = "";
		Integer victorias = 0;
		do {
			System.out.println("Piedra, Papel, Tijeras... un. dos, tres... ya!!");
			String respuesta = scanner.nextLine();

			if (respuesta.equalsIgnoreCase("Piedra") || respuesta.equalsIgnoreCase("Papel")
					|| respuesta.equalsIgnoreCase("tijeras")) {
				if (aleatorio == 1) {
					System.out.println("El programa saco piedra");
					if (respuesta.equalsIgnoreCase("papel")) {
						System.out.println("Ganastes!!");
						victorias = victorias + 1;
					} else if (respuesta.equalsIgnoreCase("tijeras")) {
						System.out.println("Perdistes!!");
						victorias = victorias - 1;
					} else {
						System.out.println("Empate");
					}
				} else if (aleatorio == 2) {
					System.out.println("El programa saco papel");
					if (respuesta.equalsIgnoreCase("tijeras")) {
						System.out.println("Ganastes!!");
						victorias = victorias + 1;
					} else if (respuesta.equalsIgnoreCase("piedra")) {
						System.out.println("Perdistes!!");
						victorias = victorias - 1;
					} else {
						System.out.println("Empate");
					}
				} else if (aleatorio == 3) {
					System.out.println("El programa saco tijeras");
					if (respuesta.equalsIgnoreCase("piedra")) {
						System.out.println("Ganastes!!");
						victorias = victorias + 1;
					} else if (respuesta.equalsIgnoreCase("papel")) {
						System.out.println("Perdistes!!");
						victorias = victorias - 1;
					} else {
						System.out.println("Empate");
					}
					

				}
				System.out.println("¿Desea volver a jugar?");
				respuesta2 = scanner.nextLine();
			} else {
				System.out.println("Deberias escribir papel,piedra o tijeras");
				respuesta2 = "si";
			}

		} while (respuesta2.equalsIgnoreCase("Si"));
		System.out.println("El total de victorias fueron " + victorias);
		scanner.close();
	}
}
