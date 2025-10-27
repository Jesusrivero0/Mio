package Ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		
		
		
		String[] arrayPalabra = new String[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Indica palabras");
			String palabra = scanner.nextLine();
			arrayPalabra[i] = palabra;
		}
		
		for (int i = 0; i < 3; i++) {
			if(i < 2) {
			System.out.print(arrayPalabra[i] + ", ");
			}else {
				System.out.print(arrayPalabra[i]);
			}
			
		}
		scanner.close();
	}

}
