package Ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Indica un texto");
		String cad = scanner.nextLine();
		
		cad = cad.toLowerCase();
		String[] arrayCad = cad.split(" ");
		
		for (int i = 1; i < arrayCad.length; i++) {
			String letra = arrayCad[i].substring(0,1).toUpperCase();
			arrayCad[i] = letra+arrayCad[i].substring(1).toLowerCase();
		}
		for (String string : arrayCad) {
			System.out.print(string);
		}
		
		scanner.close();
	}

	
}
