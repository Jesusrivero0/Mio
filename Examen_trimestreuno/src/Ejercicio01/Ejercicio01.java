package Ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Indica una cadena de texto separadas por ,");
		String cad = scanner.nextLine();

		String[] arrayCad = cad.split(",");

		for (int i = 0; i < arrayCad.length-1; i++) {
			for (int j = 0; j < arrayCad.length-1; j++) {
				if(arrayCad[j].compareTo(arrayCad[j]+1) <0) {
					String pal = arrayCad[j];
					
				}
				
			}
		}
		
		

		for (String string : arrayCad) {
			System.out.print(string.toUpperCase() + ",");
		}
		scanner.close();
	}

}
