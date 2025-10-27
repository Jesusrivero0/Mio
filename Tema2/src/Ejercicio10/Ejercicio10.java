package Ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String cad1;
		String cad2;
		Integer comparar;
		do {
		System.out.println("Indica una cadena");
		cad1 = scanner.nextLine();
		
		System.out.println("Indica otra cadena");
		cad2 = scanner.nextLine();
		comparar = cad1.compareTo(cad2);
		
		} while(cad1.trim().equals(cad2.trim())  || cad1.isEmpty() || cad2.isEmpty());
			if (comparar < 0) {
				System.out.println(cad1);
				System.out.println(cad2);
			}
			else if (comparar > 0) {
				System.out.println(cad2);
				System.out.println(cad1);
			}
			else {
				System.out.println("Son iguales");
			}
		scanner.close();
	}

}
