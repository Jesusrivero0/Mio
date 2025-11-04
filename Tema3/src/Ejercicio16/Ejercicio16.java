package Ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Indica un texto");
		String cad = scanner.nextLine();
		
		String[] arrayCad = cad.split("");
		String[] arrayCad1 = cad.split(" ");
		
		boolean tamano = false;
		Integer tamano1 = 0;
		for (int i = 0; i < arrayCad.length; i++) {
			tamano = arrayCad[i].contains("a");
			if (tamano == true) {
				tamano1 +=1;
			}
		}
		
		Integer tamano2 = arrayCad1.length;
		
		System.out.println("tememos " + tamano1 + " a");
		System.out.println("tenemos " + tamano2 + " palabras");
		
		scanner.close();
	}

}
