package Ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String cad1;
		Integer comparar;
		String[] arrayPalabra;
		do {
			System.out.println("Indica una cadena");
			cad1 = scanner.nextLine();
			 arrayPalabra = cad1.split(" ");
			comparar = arrayPalabra[0].compareTo(arrayPalabra[1]);

		} while (arrayPalabra[0].trim().equals(arrayPalabra[1].trim()) || arrayPalabra[0].isEmpty() || arrayPalabra[1].isEmpty());
		if (comparar < 0) {
			System.out.println(arrayPalabra[0]);
			System.out.println(arrayPalabra[1]);
		} else if (comparar > 0) {
			System.out.println(arrayPalabra[1]);
			System.out.println(arrayPalabra[0]);
		} else {
			System.out.println("Son iguales");
			
		}
		scanner.close();
	}

}
