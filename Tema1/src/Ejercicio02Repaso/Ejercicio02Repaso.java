package Ejercicio02Repaso;

import java.util.Scanner;

public class Ejercicio02Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dame un numeros enteros: ");
		Integer n1 = scanner.nextInt();
		
		System.out.println("Dame un numeros enteros: ");
		Integer n2 = scanner.nextInt();
		
		Integer multiplicacion = n1*n2;
		
		System.out.println(multiplicacion);
		
		scanner.close();
	}

}
