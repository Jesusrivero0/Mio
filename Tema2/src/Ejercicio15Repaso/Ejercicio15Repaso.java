package Ejercicio15Repaso;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		Integer aleatorio = random.nextInt(0, 11);
		Integer respuesta = 0;
		Integer vidas = 10;

		do {
			if (vidas < 0) {
				System.out.println("Perdistes");
				break;
			} else {
				System.out.println("Indica numeros hasta acertarlo");
				respuesta = scanner.nextInt();
				vidas = vidas - 1;
			}
		} while (respuesta != aleatorio);
		System.out.println("Acertastes Bien!!! Te quedaron " + vidas + " vidas");

		scanner.close();
	}

}
