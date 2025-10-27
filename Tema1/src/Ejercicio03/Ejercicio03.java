package Ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("¿Cual es tu edad?: ");
		
		Integer edad = scanner.nextInt();
		
		System.out.println("Su edad es " + edad);
		
		scanner.close();
	}

}
