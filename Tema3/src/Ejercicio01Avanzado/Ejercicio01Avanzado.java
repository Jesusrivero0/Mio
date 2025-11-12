package Ejercicio01Avanzado;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio01Avanzado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Cuantas tiradas quieres hacer");
		Integer tiradas = scanner.nextInt();
		
		Integer[] array = new Integer[10]; 
		for (int i = 1; i <= tiradas; i++) {
			Integer aleatorio1 = random.nextInt(0,7);
			Integer aleatorio2 = random.nextInt(0,7);
			System.out.println("La tirada "  + i + " es: " + (aleatorio1 + aleatorio2));
			
			if(aleatorio1+aleatorio2 == aleatorio1+aleatorio2) {
				array[i] = (aleatorio1+aleatorio2)/100;
				System.out.println(array[i]);
			}
			
		}
		
		scanner.close();
	}

}
