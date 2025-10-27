package Ejercicio18;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Indica una palabra");
		String palabra = scanner.nextLine();
		
		String[] arrayPalabra = palabra.split("");
		
		for (String valor : arrayPalabra) {
			System.out.print(valor + " ");
		}
		
		scanner.close();
	}

}
