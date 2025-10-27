package Ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		Integer n1;
		Integer n2;
		do {
		System.out.println("Indica un numero");
		n1 = scanner.nextInt();
		
		System.out.println("Indica otro numero");
		n2 = scanner.nextInt();
		
		}while (n1 != n2);
		
		System.out.println("Un saludo ya son iguales");
		
		scanner.close();
	}

}
