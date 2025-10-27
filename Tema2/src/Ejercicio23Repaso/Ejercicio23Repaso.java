package Ejercicio23Repaso;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio23Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Cuantas veces quieras que lancemos el dado");
		Integer nVeces = scanner.nextInt();
		Random random = new Random();
	
		for (int i = 0; i < nVeces; i++) {
			if(i <= nVeces) {
			Integer random2 = random.nextInt(0, 7);
			System.out.print(random2 + ", ");
			}
		}

		scanner.close();
	}

}
