package Ejercicio3Repaso;

import java.util.Scanner;

public class Ejercicio3Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dame un numeros enteros: ");
		String numero1 = scanner.nextLine();
		Integer n1 = Integer.parseInt(numero1);
		
		System.out.println("Dame un numeros enteros: ");
		String numero2 = scanner.nextLine();
		Integer n2 = Integer.parseInt(numero2);
		
		Integer multiplicacion = n1*n2;
		
		System.out.println(multiplicacion);
		
		scanner.close();
	}

}
