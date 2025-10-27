package Ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Cual es tu altura: ");
		Double altura = scanner.nextDouble();
		
		System.out.println("Cual es tu peso: ");
		Double peso = scanner.nextDouble();
		
		Double imc = peso / (altura * altura);
		
		
		System.out.println("Su IMC es de " + imc);
		
		
		scanner.close();
	}

}
