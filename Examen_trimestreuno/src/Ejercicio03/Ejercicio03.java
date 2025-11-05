package Ejercicio03;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String cad = "";

		do {
			System.out.println("Indica una frase mayor a 10 o 10");
			cad = scanner.nextLine();
		
			if (cad.length()<= 10) {
				System.out.println("La frase es incorrecta");
				break;
			}
		

		String nuevaCad = cad.replace(" ", "").toLowerCase();
		System.out.println(nuevaCad);

		Integer aleatorio1 = random.nextInt(0, nuevaCad.length());
		Integer aleatorio2 = random.nextInt(0, nuevaCad.length());
		
		if(aleatorio2<aleatorio1) {
			int temp = aleatorio1;
			aleatorio1 = aleatorio2;
			aleatorio2 = temp;
		}

		System.out.println("Numeros generados: " + aleatorio1 + "-" + aleatorio2);

		System.out.println("Subcadena: " + nuevaCad.substring(aleatorio1,aleatorio2));
		} while (cad.length() <= 10);
		scanner.close();
	}

}
